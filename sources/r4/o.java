package r4;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14539i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a0 f14540r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(a0 a0Var, int i10) {
        super(0);
        this.f14539i = i10;
        this.f14540r = a0Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14539i) {
            case 0:
                a0 a0Var = this.f14540r;
                Context context = a0Var.f14455a;
                j0 j0Var = a0Var.f14475v;
                kotlin.jvm.internal.l.f("context", context);
                kotlin.jvm.internal.l.f("navigatorProvider", j0Var);
                return new b0();
            default:
                this.f14540r.i();
                return qg.o.f13926a;
        }
    }
}
