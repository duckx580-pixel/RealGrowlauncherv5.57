package pf;

import android.os.Build;
import android.text.DynamicLayout;
import android.text.Editable;
import android.text.Layout;
import android.text.Selection;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.lang.reflect.Field;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final ThreadLocal f13424c = new ThreadLocal();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Editable f13425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DynamicLayout f13426b;

    public p() {
        Editable editableNewEditable = Editable.Factory.getInstance().newEditable(PredefinedUICustomizationFont.defaultFamily);
        this.f13425a = editableNewEditable;
        if (Build.VERSION.SDK_INT > 28) {
            this.f13426b = DynamicLayout.Builder.obtain(editableNewEditable, new TextPaint(), 1073741823).setIncludePad(true).setLineSpacing(0.0f, 0.0f).setTextDirection(TextDirectionHeuristics.FIRSTSTRONG_LTR).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            return;
        }
        DynamicLayout dynamicLayout = new DynamicLayout(editableNewEditable, new TextPaint(), 1073741823, Layout.Alignment.ALIGN_NORMAL, 0.0f, 0.0f, true);
        this.f13426b = dynamicLayout;
        try {
            Field declaredField = Layout.class.getDeclaredField("mTextDir");
            declaredField.setAccessible(true);
            declaredField.set(dynamicLayout, TextDirectionHeuristics.FIRSTSTRONG_LTR);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    public static p a() {
        ThreadLocal threadLocal = f13424c;
        p pVar = (p) threadLocal.get();
        if (pVar != null) {
            return pVar;
        }
        p pVar2 = new p();
        threadLocal.set(pVar2);
        return pVar2;
    }

    public final int b(int i10, i iVar) {
        int iMax = Math.max(0, i10 - 64);
        int i11 = i10 - iMax;
        int iMin = Math.min(iVar.f13401r, i10 + 65);
        Editable editable = this.f13425a;
        editable.append((CharSequence) iVar, iMax, iMin);
        Selection.setSelection(editable, Math.min(i11, editable.length()));
        Selection.moveLeft(editable, this.f13426b);
        int selectionStart = Selection.getSelectionStart(editable);
        editable.clear();
        Selection.removeSelection(editable);
        return selectionStart + iMax;
    }
}
