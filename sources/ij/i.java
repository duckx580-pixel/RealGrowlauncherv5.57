package ij;

import fi.n0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends ej.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0 f8326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f8327g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(String str, n0 n0Var, Object obj, int i10) {
        super(str, true);
        this.f8325e = i10;
        this.f8326f = n0Var;
        this.f8327g = obj;
    }

    @Override // ej.a
    public final long a() {
        long jA;
        int i10;
        v[] vVarArr;
        v[] vVarArr2;
        switch (this.f8325e) {
            case 0:
                n nVar = (n) this.f8326f.f6483r;
                nVar.f8342i.a(nVar, (z) ((kotlin.jvm.internal.x) this.f8327g).f9667i);
                return -1L;
            case 1:
                try {
                    ((n) this.f8326f.f6483r).f8342i.b((v) this.f8327g);
                    break;
                } catch (IOException e8) {
                    jj.n nVar2 = jj.n.f8941a;
                    jj.n nVar3 = jj.n.f8941a;
                    String str = "Http2Connection.Listener failure for " + ((n) this.f8326f.f6483r).f8344s;
                    nVar3.getClass();
                    jj.n.i(4, str, e8);
                    try {
                        ((v) this.f8327g).c(2, e8);
                        break;
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                n0 n0Var = this.f8326f;
                z zVar = (z) this.f8327g;
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                synchronized (((n) n0Var.f6483r).M) {
                    synchronized (((n) n0Var.f6483r)) {
                        try {
                            z zVar2 = ((n) n0Var.f6483r).G;
                            z zVar3 = new z();
                            zVar3.b(zVar2);
                            zVar3.b(zVar);
                            xVar.f9667i = zVar3;
                            jA = ((long) zVar3.a()) - ((long) zVar2.a());
                            i10 = 0;
                            if (jA == 0 || ((n) n0Var.f6483r).f8343r.isEmpty()) {
                                vVarArr = null;
                            } else {
                                Object[] array = ((n) n0Var.f6483r).f8343r.values().toArray(new v[0]);
                                if (array == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                                }
                                vVarArr = (v[]) array;
                            }
                            vVarArr2 = vVarArr;
                            n nVar4 = (n) n0Var.f6483r;
                            z zVar4 = (z) xVar.f9667i;
                            kotlin.jvm.internal.l.f("<set-?>", zVar4);
                            nVar4.G = zVar4;
                            ((n) n0Var.f6483r).f8350z.c(new i(((n) n0Var.f6483r).f8344s + " onSettings", n0Var, xVar, i10), 0L);
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    try {
                        ((n) n0Var.f6483r).M.a((z) xVar.f9667i);
                    } catch (IOException e10) {
                        ((n) n0Var.f6483r).a(2, 2, e10);
                    }
                    break;
                }
                v[] vVarArr3 = vVarArr2;
                if (vVarArr3 != null) {
                    int length = vVarArr3.length;
                    while (i10 < length) {
                        v vVar = vVarArr3[i10];
                        synchronized (vVar) {
                            vVar.f8383d += jA;
                            if (jA > 0) {
                                vVar.notifyAll();
                            }
                        }
                        i10++;
                    }
                }
                return -1L;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(String str, v vVar, n0 n0Var) {
        super(str, true);
        this.f8325e = 1;
        this.f8327g = vVar;
        this.f8326f = n0Var;
    }
}
