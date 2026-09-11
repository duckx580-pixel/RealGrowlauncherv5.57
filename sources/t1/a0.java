package t1;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends v1.b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f16263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ eh.e f16264c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(d0 d0Var, eh.e eVar, String str) {
        super(str);
        this.f16263b = d0Var;
        this.f16264c = eVar;
    }

    @Override // t1.h0
    public final i0 a(j0 j0Var, List list, long j) {
        d0 d0Var = this.f16263b;
        y yVar = d0Var.f16277x;
        yVar.f16342i = j0Var.getLayoutDirection();
        yVar.f16343r = j0Var.a();
        yVar.f16344s = j0Var.S();
        boolean zU = j0Var.U();
        eh.e eVar = this.f16264c;
        if (zU || d0Var.f16271i.f1245s == null) {
            d0Var.f16274t = 0;
            i0 i0Var = (i0) eVar.invoke(yVar, new q2.a(j));
            return new z(i0Var, d0Var, d0Var.f16274t, i0Var, 1);
        }
        d0Var.f16275u = 0;
        i0 i0Var2 = (i0) eVar.invoke(d0Var.f16278y, new q2.a(j));
        return new z(i0Var2, d0Var, d0Var.f16275u, i0Var2, 0);
    }
}
