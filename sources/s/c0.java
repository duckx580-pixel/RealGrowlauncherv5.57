package s;

import t.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14918i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d0 f14919r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(d0 d0Var, int i10) {
        super(1);
        this.f14918i = i10;
        this.f14919r = d0Var;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        t.y yVar;
        t.y yVar2;
        switch (this.f14918i) {
            case 0:
                a1 a1Var = (a1) obj;
                v vVar = v.f14993i;
                v vVar2 = v.f14994r;
                boolean zB = a1Var.b(vVar, vVar2);
                Object obj2 = null;
                d0 d0Var = this.f14919r;
                if (zB) {
                    t tVar = d0Var.H.f14931a.f14981c;
                    if (tVar != null) {
                        obj2 = tVar.f14988c;
                    }
                } else if (a1Var.b(vVar2, v.f14995s)) {
                    t tVar2 = d0Var.I.f14940a.f14981c;
                    if (tVar2 != null) {
                        obj2 = tVar2.f14988c;
                    }
                } else {
                    obj2 = z.f15011d;
                }
                return obj2 == null ? z.f15011d : obj2;
            default:
                a1 a1Var2 = (a1) obj;
                v vVar3 = v.f14993i;
                v vVar4 = v.f14994r;
                boolean zB2 = a1Var2.b(vVar3, vVar4);
                d0 d0Var2 = this.f14919r;
                if (zB2) {
                    n0 n0Var = d0Var2.H.f14931a.f14980b;
                    return (n0Var == null || (yVar2 = n0Var.f14965b) == null) ? z.f15010c : yVar2;
                }
                if (!a1Var2.b(vVar4, v.f14995s)) {
                    return z.f15010c;
                }
                n0 n0Var2 = d0Var2.I.f14940a.f14980b;
                return (n0Var2 == null || (yVar = n0Var2.f14965b) == null) ? z.f15010c : yVar;
        }
    }
}
