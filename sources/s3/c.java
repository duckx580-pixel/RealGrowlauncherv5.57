package s3;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final View.AccessibilityDelegate f15047s = new View.AccessibilityDelegate();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View.AccessibilityDelegate f15048i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a f15049r;

    public c() {
        this(f15047s);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f15048i.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public mf.a d(View view) {
        AccessibilityNodeProvider accessibilityNodeProviderA = b.a(this.f15048i, view);
        if (accessibilityNodeProviderA != null) {
            return new mf.a(24, accessibilityNodeProviderA);
        }
        return null;
    }

    public void h(View view, AccessibilityEvent accessibilityEvent) {
        this.f15048i.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void i(View view, t3.j jVar) {
        this.f15048i.onInitializeAccessibilityNodeInfo(view, jVar.f16430a);
    }

    public void j(View view, AccessibilityEvent accessibilityEvent) {
        this.f15048i.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean k(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f15048i.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean l(View view, int i10, Bundle bundle) {
        boolean zB;
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        boolean z3 = false;
        int i11 = 0;
        while (true) {
            if (i11 >= list.size()) {
                break;
            }
            t3.d dVar = (t3.d) list.get(i11);
            if (dVar.a() == i10) {
                Class cls = dVar.f16426c;
                t3.v vVar = dVar.f16427d;
                if (vVar != null) {
                    if (cls != null) {
                        try {
                            if (cls.getDeclaredConstructor(null).newInstance(null) == null) {
                                throw null;
                            }
                            throw new ClassCastException();
                        } catch (Exception e8) {
                            Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: ".concat(cls.getName()), e8);
                        }
                    }
                    zB = vVar.a(view);
                }
            } else {
                i11++;
            }
        }
        zB = false;
        if (!zB) {
            zB = b.b(this.f15048i, view, i10, bundle);
        }
        if (zB || i10 != R.id.accessibility_action_clickable_span || bundle == null) {
            return zB;
        }
        int i12 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference) sparseArray.get(i12)) != null && (clickableSpan = (ClickableSpan) weakReference.get()) != null) {
            CharSequence text = view.createAccessibilityNodeInfo().getText();
            ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
            int i13 = 0;
            while (true) {
                if (clickableSpanArr == null || i13 >= clickableSpanArr.length) {
                    break;
                }
                if (clickableSpan.equals(clickableSpanArr[i13])) {
                    clickableSpan.onClick(view);
                    z3 = true;
                    break;
                }
                i13++;
            }
        }
        return z3;
    }

    public void m(View view, int i10) {
        this.f15048i.sendAccessibilityEvent(view, i10);
    }

    public void n(View view, AccessibilityEvent accessibilityEvent) {
        this.f15048i.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public c(View.AccessibilityDelegate accessibilityDelegate) {
        this.f15048i = accessibilityDelegate;
        this.f15049r = new a(this);
    }
}
