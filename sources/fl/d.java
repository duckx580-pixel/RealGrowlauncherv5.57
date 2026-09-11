package fl;

import cl.g;
import cl.i;
import cl.j;
import java.util.Optional;
import jl.k;
import t.m1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f6788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f6789c;

    public /* synthetic */ d(e eVar, boolean z3, int i10) {
        this.f6787a = i10;
        this.f6789c = eVar;
        this.f6788b = z3;
    }

    @Override // fl.f
    public final g a() {
        switch (this.f6787a) {
            case 0:
                e eVar = this.f6789c;
                m1 m1Var = eVar.f6794t;
                m1 m1Var2 = eVar.f6793s;
                hl.b bVar = eVar.f6791i;
                boolean zC = bVar.c(20);
                boolean z3 = this.f6788b;
                if (zC) {
                    eVar.f6796v = Optional.of(new d(eVar, z3, 0));
                    return e.b(eVar, (jl.e) bVar.next());
                }
                if (!bVar.c(11)) {
                    if (!z3) {
                        if (!bVar.c(10)) {
                            k kVarO = bVar.o();
                            throw new dl.a("while parsing a flow mapping", (Optional) m1Var.a(), "expected ',' or '}', but got ".concat(gb.e.y(kVarO.a())), kVarO.f8961a, null);
                        }
                        bVar.next();
                        if (bVar.c(20)) {
                            eVar.f6796v = Optional.of(new d(eVar, true, 0));
                            return e.b(eVar, (jl.e) bVar.next());
                        }
                    }
                    if (bVar.c(15)) {
                        k next = bVar.next();
                        if (bVar.d(21, 10, 11)) {
                            eVar.f6796v = Optional.of(new a(eVar, 12));
                            return e.a(eVar, next.f8962b);
                        }
                        m1Var2.b(new a(eVar, 12));
                        return eVar.e(false, false);
                    }
                    if (!bVar.c(11)) {
                        m1Var2.b(new a(eVar, 10));
                        return eVar.e(false, false);
                    }
                }
                k next2 = bVar.next();
                i iVar = new i(next2.f8961a, next2.f8962b, 0);
                if (bVar.c(20)) {
                    eVar.f6796v = Optional.of(new a(eVar, 9));
                } else {
                    eVar.f6796v = Optional.of((f) m1Var2.a());
                }
                return iVar;
            default:
                e eVar2 = this.f6789c;
                m1 m1Var3 = eVar2.f6793s;
                m1 m1Var4 = eVar2.f6794t;
                hl.b bVar2 = eVar2.f6791i;
                boolean zC2 = bVar2.c(20);
                boolean z10 = this.f6788b;
                if (zC2) {
                    eVar2.f6796v = Optional.of(new d(eVar2, z10, 1));
                    return e.b(eVar2, (jl.e) bVar2.next());
                }
                if (!bVar2.c(13)) {
                    if (!z10) {
                        if (!bVar2.c(10)) {
                            k kVarO2 = bVar2.o();
                            throw new dl.a("while parsing a flow sequence", (Optional) m1Var4.a(), "expected ',' or ']', but got ".concat(gb.e.y(kVarO2.a())), kVarO2.f8961a, null);
                        }
                        bVar2.next();
                        if (bVar2.c(20)) {
                            eVar2.f6796v = Optional.of(new d(eVar2, true, 1));
                            return e.b(eVar2, (jl.e) bVar2.next());
                        }
                    }
                    if (bVar2.c(15)) {
                        k kVarO3 = bVar2.o();
                        j jVar = new j(Optional.empty(), Optional.empty(), true, 1, kVarO3.f8961a, kVarO3.f8962b);
                        eVar2.f6796v = Optional.of(new a(eVar2, 14));
                        return jVar;
                    }
                    if (!bVar2.c(13)) {
                        m1Var3.b(new d(eVar2, false, 1));
                        return eVar2.e(false, false);
                    }
                }
                k next3 = bVar2.next();
                i iVar2 = new i(next3.f8961a, next3.f8962b, 1);
                if (bVar2.c(20)) {
                    eVar2.f6796v = Optional.of(new a(eVar2, 9));
                } else {
                    eVar2.f6796v = Optional.of((f) m1Var3.a());
                }
                return iVar2;
        }
    }
}
