package p0;

import java.util.ArrayList;
import o0.h1;
import o0.n1;
import o0.u1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends z {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final k f13214d = new k(1, 2, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f13215e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final k f13216f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f13217c;

    static {
        int i10 = 1;
        f13215e = new k(i10, i10, 1);
        f13216f = new k(i10, i10, 2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i10, int i11, int i12) {
        super(i10, i11);
        this.f13217c = i12;
    }

    @Override // p0.z
    public final void a(androidx.datastore.preferences.protobuf.i iVar, n7.e eVar, u1 u1Var, mf.c cVar) {
        switch (this.f13217c) {
            case 0:
                Object objInvoke = ((eh.a) iVar.g(0)).invoke();
                o0.c cVar2 = (o0.c) iVar.g(1);
                iVar.f(0);
                cVar2.getClass();
                u1Var.I(u1Var.c(cVar2), objInvoke);
                eVar.getClass();
                eVar.n(objInvoke);
                break;
            case 1:
                o0.c cVar3 = (o0.c) iVar.g(0);
                int iF = iVar.f(0);
                eVar.K();
                cVar3.getClass();
                Object objU = u1Var.u(u1Var.c(cVar3));
                eVar.getClass();
                ((androidx.compose.ui.node.a) eVar.f12174t).v(iF, (androidx.compose.ui.node.a) objU);
                break;
            default:
                Object objG = iVar.g(0);
                int iF2 = iVar.f(0);
                if (objG instanceof n1) {
                    ((ArrayList) cVar.f11701i).add(((n1) objG).f12512a);
                }
                Object objA = u1Var.A(u1Var.f12604r, iF2, objG);
                if (objA instanceof n1) {
                    ((ArrayList) cVar.f11703s).add(((n1) objA).f12512a);
                } else if (objA instanceof h1) {
                    h1 h1Var = (h1) objA;
                    o0.t tVar = h1Var.f12433b;
                    if (tVar != null) {
                        tVar.u();
                    }
                    h1Var.f12433b = null;
                    h1Var.f12437f = null;
                    h1Var.f12438g = null;
                }
                break;
        }
    }

    @Override // p0.z
    public final String b(int i10) {
        switch (this.f13217c) {
            case 0:
                if (i10 != 0) {
                    break;
                }
                break;
            case 1:
                if (i10 != 0) {
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    break;
                }
                break;
        }
        return super.b(i10);
    }

    @Override // p0.z
    public final String c(int i10) {
        switch (this.f13217c) {
            case 0:
                if (i10 != 0) {
                    if (i10 != 1) {
                        break;
                    }
                }
                break;
            case 1:
                if (i10 != 0) {
                    break;
                }
                break;
            default:
                if (i10 != 0) {
                    break;
                }
                break;
        }
        return super.c(i10);
    }
}
