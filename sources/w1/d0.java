package w1;

import android.view.accessibility.AccessibilityEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18784i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ e0 f18785r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d0(e0 e0Var, int i10) {
        super(1);
        this.f18784i = i10;
        this.f18785r = e0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f18784i) {
            case 0:
                e0 e0Var = this.f18785r;
                return Boolean.valueOf(e0Var.f18793t.getParent().requestSendAccessibilityEvent(e0Var.f18793t, (AccessibilityEvent) obj));
            default:
                x1 x1Var = (x1) obj;
                if (x1Var.f18991r.contains(x1Var)) {
                    e0 e0Var2 = this.f18785r;
                    e0Var2.f18793t.getSnapshotObserver().a(x1Var, e0Var2.f18791e0, new a0.r(23, x1Var, e0Var2));
                }
                return qg.o.f13926a;
        }
    }
}
