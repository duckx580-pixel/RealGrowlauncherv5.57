package s3;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f15140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f15141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f15142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f15143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final e0 f15144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g0 f15145f;

    static {
        new AtomicInteger(1);
        f15140a = null;
        f15142c = false;
        f15143d = new int[]{R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
        f15144e = new e0();
        f15145f = new g0();
    }

    public static h1 a(View view) {
        if (f15140a == null) {
            f15140a = new WeakHashMap();
        }
        h1 h1Var = (h1) f15140a.get(view);
        if (h1Var != null) {
            return h1Var;
        }
        h1 h1Var2 = new h1(view);
        f15140a.put(view, h1Var2);
        return h1Var2;
    }

    public static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = y0.f15127d;
        y0 y0Var = (y0) view.getTag(R.id.tag_unhandled_key_event_manager);
        if (y0Var == null) {
            y0Var = new y0();
            y0Var.f15128a = null;
            y0Var.f15129b = null;
            y0Var.f15130c = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, y0Var);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = y0Var.f15128a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = y0.f15127d;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (y0Var.f15128a == null) {
                            y0Var.f15128a = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = y0.f15127d;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                y0Var.f15128a.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    y0Var.f15128a.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View viewA = y0Var.a(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (viewA != null && !KeyEvent.isModifierKey(keyCode)) {
                if (y0Var.f15129b == null) {
                    y0Var.f15129b = new SparseArray();
                }
                y0Var.f15129b.put(keyCode, new WeakReference(viewA));
            }
        }
        return viewA != null;
    }

    public static View.AccessibilityDelegate c(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return t0.a(view);
        }
        if (f15142c) {
            return null;
        }
        if (f15141b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f15141b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f15142c = true;
                return null;
            }
        }
        try {
            Object obj = f15141b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f15142c = true;
            return null;
        }
    }

    public static ArrayList d(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }

    public static String[] e(androidx.appcompat.widget.x xVar) {
        return Build.VERSION.SDK_INT >= 31 ? v0.a(xVar) : (String[]) xVar.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static void f(View view, int i10) {
        Object tag;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            int i11 = Build.VERSION.SDK_INT;
            Object objB = null;
            if (i11 >= 28) {
                tag = s0.b(view);
            } else {
                tag = view.getTag(R.id.tag_accessibility_pane_title);
                if (!CharSequence.class.isInstance(tag)) {
                    tag = null;
                }
            }
            boolean z3 = ((CharSequence) tag) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (l0.a(view) != 0 || z3) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z3 ? 32 : 2048);
                l0.g(accessibilityEventObtain, i10);
                if (z3) {
                    List<CharSequence> text = accessibilityEventObtain.getText();
                    if (i11 >= 28) {
                        objB = s0.b(view);
                    } else {
                        Object tag2 = view.getTag(R.id.tag_accessibility_pane_title);
                        if (CharSequence.class.isInstance(tag2)) {
                            objB = tag2;
                        }
                    }
                    text.add((CharSequence) objB);
                    if (i0.c(view) == 0) {
                        i0.s(view, 1);
                    }
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i10 != 32) {
                if (view.getParent() != null) {
                    try {
                        l0.e(view.getParent(), view, view, i10);
                        return;
                    } catch (AbstractMethodError e8) {
                        Log.e("ViewCompat", view.getParent().getClass().getSimpleName().concat(" does not fully implement ViewParent"), e8);
                        return;
                    }
                }
                return;
            }
            AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
            view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
            accessibilityEventObtain2.setEventType(32);
            l0.g(accessibilityEventObtain2, i10);
            accessibilityEventObtain2.setSource(view);
            view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
            List<CharSequence> text2 = accessibilityEventObtain2.getText();
            if (i11 >= 28) {
                objB = s0.b(view);
            } else {
                Object tag3 = view.getTag(R.id.tag_accessibility_pane_title);
                if (CharSequence.class.isInstance(tag3)) {
                    objB = tag3;
                }
            }
            text2.add((CharSequence) objB);
            accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static i g(View view, i iVar) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + iVar + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return v0.b(view, iVar);
        }
        z zVar = (z) view.getTag(R.id.tag_on_receive_content_listener);
        a0 a0Var = f15144e;
        if (zVar == null) {
            if (view instanceof a0) {
                a0Var = (a0) view;
            }
            return a0Var.a(iVar);
        }
        i iVarA = ((v3.t) zVar).a(view, iVar);
        if (iVarA == null) {
            return null;
        }
        if (view instanceof a0) {
            a0Var = (a0) view;
        }
        return a0Var.a(iVarA);
    }

    public static void h(View view, int i10) {
        ArrayList arrayListD = d(view);
        for (int i11 = 0; i11 < arrayListD.size(); i11++) {
            if (((t3.d) arrayListD.get(i11)).a() == i10) {
                arrayListD.remove(i11);
                return;
            }
        }
    }

    public static void i(View view, t3.d dVar, t3.v vVar) {
        t3.d dVar2 = new t3.d(null, dVar.f16425b, null, vVar, dVar.f16426c);
        View.AccessibilityDelegate accessibilityDelegateC = c(view);
        c cVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof a ? ((a) accessibilityDelegateC).f15040a : new c(accessibilityDelegateC);
        if (cVar == null) {
            cVar = new c();
        }
        k(view, cVar);
        h(view, dVar2.a());
        d(view).add(dVar2);
        f(view, 0);
    }

    public static void j(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            t0.d(view, context, iArr, attributeSet, typedArray, i10, 0);
        }
    }

    public static void k(View view, c cVar) {
        if (cVar == null && (c(view) instanceof a)) {
            cVar = new c();
        }
        if (i0.c(view) == 0) {
            i0.s(view, 1);
        }
        view.setAccessibilityDelegate(cVar == null ? null : cVar.f15049r);
    }

    public static void l(View view, CharSequence charSequence) {
        new f0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).g(view, charSequence);
        g0 g0Var = f15145f;
        if (charSequence == null) {
            g0Var.f15070i.remove(view);
            view.removeOnAttachStateChangeListener(g0Var);
            i0.o(view.getViewTreeObserver(), g0Var);
        } else {
            g0Var.f15070i.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(g0Var);
            if (l0.b(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(g0Var);
            }
        }
    }

    public static void m(View view, y.z zVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            q1.f(view, zVar);
            return;
        }
        PathInterpolator pathInterpolator = n1.f15087d;
        Object tag = view.getTag(R.id.tag_on_apply_window_listener);
        if (zVar == null) {
            view.setTag(R.id.tag_window_insets_animation_callback, null);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            return;
        }
        View.OnApplyWindowInsetsListener m1Var = new m1(view, zVar);
        view.setTag(R.id.tag_window_insets_animation_callback, m1Var);
        if (tag == null) {
            view.setOnApplyWindowInsetsListener(m1Var);
        }
    }
}
