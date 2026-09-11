package i;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.h1;
import java.lang.reflect.Constructor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Class[] f7809b = {Context.class, AttributeSet.class};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f7810c = {R.attr.onClick};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f7811d = {R.attr.accessibilityHeading};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f7812e = {R.attr.accessibilityPaneTitle};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f7813f = {R.attr.screenReaderFocusable};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f7814g = {"android.widget.", "android.view.", "android.webkit."};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final q.x f7815h = new q.x(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f7816a = new Object[2];

    public androidx.appcompat.widget.q a(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.q(context, attributeSet);
    }

    public androidx.appcompat.widget.s b(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.s(context, attributeSet, launcher.powerkuy.growlauncher.R.attr.buttonStyle);
    }

    public androidx.appcompat.widget.t c(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.t(context, attributeSet, launcher.powerkuy.growlauncher.R.attr.checkboxStyle);
    }

    public androidx.appcompat.widget.f0 d(Context context, AttributeSet attributeSet) {
        return new androidx.appcompat.widget.f0(context, attributeSet);
    }

    public h1 e(Context context, AttributeSet attributeSet) {
        return new h1(context, attributeSet);
    }

    public final View f(Context context, String str, String str2) {
        String strConcat;
        q.x xVar = f7815h;
        Constructor constructor = (Constructor) xVar.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    strConcat = str2.concat(str);
                } catch (Exception unused) {
                    return null;
                }
            } else {
                strConcat = str;
            }
            constructor = Class.forName(strConcat, false, context.getClassLoader()).asSubclass(View.class).getConstructor(f7809b);
            xVar.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.f7816a);
    }
}
