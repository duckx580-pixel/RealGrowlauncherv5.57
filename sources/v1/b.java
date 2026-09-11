package v1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18362i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ c f18363r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(c cVar, int i10) {
        super(0);
        this.f18362i = i10;
        this.f18363r = cVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f18362i) {
            case 0:
                this.f18363r.I0();
                break;
            default:
                c cVar = this.f18363r;
                a1.l lVar = cVar.D;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer", lVar);
                y.a0 a0Var = (y.a0) lVar;
                a0Var.getClass();
                y.y0 y0Var = (y.y0) cVar.h(y.b1.f19920a);
                y.y0 y0Var2 = a0Var.f19913a;
                a0Var.f19914b.setValue(new y.v(y0Var2, y0Var));
                a0Var.f19915c.setValue(new y.u0(y0Var, y0Var2));
                break;
        }
        return qg.o.f13926a;
    }
}
