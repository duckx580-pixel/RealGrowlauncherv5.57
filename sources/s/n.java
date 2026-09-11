package s;

import t.c1;
import t.f1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14962i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f1 f14963r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(f1 f1Var, int i10) {
        super(0);
        this.f14962i = i10;
        this.f14963r = f1Var;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f14962i) {
            case 0:
                f1 f1Var = this.f14963r;
                Object objB = f1Var.b();
                v vVar = v.f14995s;
                return Boolean.valueOf(objB == vVar && f1Var.f16078c.getValue() == vVar);
            default:
                f1 f1Var2 = this.f14963r;
                y0.q qVar = f1Var2.f16083h;
                int size = qVar.size();
                long jMax = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    jMax = Math.max(jMax, ((c1) qVar.get(i10)).b().f16220h);
                }
                y0.q qVar2 = f1Var2.f16084i;
                int size2 = qVar2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    jMax = Math.max(jMax, ((Number) ((f1) qVar2.get(i11)).f16085k.getValue()).longValue());
                }
                return Long.valueOf(jMax);
        }
    }
}
