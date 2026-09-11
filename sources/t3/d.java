package t3;

import android.R;
import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final d f16413e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final d f16414f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f16415g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f16416h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f16417i;
    public static final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final d f16418k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final d f16419l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final d f16420m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final d f16421n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final d f16422o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final d f16423p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f16425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Class f16426c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v f16427d;

    static {
        new d(1, (String) null);
        new d(2, (String) null);
        new d(4, (String) null);
        new d(8, (String) null);
        f16413e = new d(16, (String) null);
        new d(32, (String) null);
        f16414f = new d(64, (String) null);
        f16415g = new d(128, (String) null);
        new d(256, o.class);
        new d(512, o.class);
        new d(1024, p.class);
        new d(2048, p.class);
        f16416h = new d(4096, (String) null);
        f16417i = new d(8192, (String) null);
        new d(16384, (String) null);
        new d(32768, (String) null);
        new d(65536, (String) null);
        new d(131072, t.class);
        j = new d(262144, (String) null);
        f16418k = new d(524288, (String) null);
        f16419l = new d(1048576, (String) null);
        new d(2097152, u.class);
        int i10 = Build.VERSION.SDK_INT;
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, R.id.accessibilityActionShowOnScreen, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, R.id.accessibilityActionScrollToPosition, null, null, r.class);
        f16420m = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, R.id.accessibilityActionScrollUp, null, null, null);
        f16421n = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, R.id.accessibilityActionScrollLeft, null, null, null);
        f16422o = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, R.id.accessibilityActionScrollDown, null, null, null);
        f16423p = new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, R.id.accessibilityActionScrollRight, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null, R.id.accessibilityActionPageUp, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null, R.id.accessibilityActionPageDown, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null, R.id.accessibilityActionPageLeft, null, null, null);
        new d(i10 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null, R.id.accessibilityActionPageRight, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, R.id.accessibilityActionContextClick, null, null, null);
        new d(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, R.id.accessibilityActionSetProgress, null, null, s.class);
        new d(i10 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null, R.id.accessibilityActionMoveWindow, null, null, q.class);
        new d(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null, R.id.accessibilityActionShowTooltip, null, null, null);
        new d(i10 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null, R.id.accessibilityActionHideTooltip, null, null, null);
        new d(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null, R.id.accessibilityActionPressAndHold, null, null, null);
        new d(i10 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null, R.id.accessibilityActionImeEnter, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START : null, R.id.accessibilityActionDragStart, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP : null, R.id.accessibilityActionDragDrop, null, null, null);
        new d(i10 >= 32 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL : null, R.id.accessibilityActionDragCancel, null, null, null);
        new d(i10 >= 33 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS : null, R.id.accessibilityActionShowTextSuggestions, null, null, null);
        new d(i10 >= 34 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION : null, R.id.accessibilityActionScrollInDirection, null, null, null);
    }

    public d(int i10, String str) {
        this(null, i10, str, null, null);
    }

    public final int a() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.f16424a).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof d)) {
            return false;
        }
        Object obj2 = ((d) obj).f16424a;
        Object obj3 = this.f16424a;
        return obj3 == null ? obj2 == null : obj3.equals(obj2);
    }

    public final int hashCode() {
        Object obj = this.f16424a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AccessibilityActionCompat: ");
        String strD = j.d(this.f16425b);
        if (strD.equals("ACTION_UNKNOWN")) {
            Object obj = this.f16424a;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                strD = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb2.append(strD);
        return sb2.toString();
    }

    public d(int i10, Class cls) {
        this(null, i10, null, null, cls);
    }

    public d(Object obj, int i10, CharSequence charSequence, v vVar, Class cls) {
        this.f16425b = i10;
        this.f16427d = vVar;
        if (obj == null) {
            this.f16424a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
        } else {
            this.f16424a = obj;
        }
        this.f16426c = cls;
    }
}
