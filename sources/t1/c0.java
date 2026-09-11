package t1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d0 f16269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16270b;

    public c0(d0 d0Var, Object obj) {
        this.f16269a = d0Var;
        this.f16270b = obj;
    }

    @Override // t1.x0
    public final int a() {
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) this.f16269a.f16279z.get(this.f16270b);
        if (aVar != null) {
            return ((q0.c) aVar.m()).f13638i.f13646s;
        }
        return 0;
    }

    @Override // t1.x0
    public final void b(long j, int i10) {
        d0 d0Var = this.f16269a;
        androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) d0Var.f16279z.get(this.f16270b);
        if (aVar == null || !aVar.C()) {
            return;
        }
        int i11 = ((q0.c) aVar.m()).f13638i.f13646s;
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException("Index (" + i10 + ") is out of bound of [0, " + i11 + ')');
        }
        if (aVar.D()) {
            throw new IllegalArgumentException("Pre-measure called on node that is not placed");
        }
        androidx.compose.ui.node.a aVar2 = d0Var.f16271i;
        aVar2.B = true;
        ((w1.t) v1.f.z(aVar)).t((androidx.compose.ui.node.a) ((q0.c) aVar.m()).get(i10), j);
        aVar2.B = false;
    }

    @Override // t1.x0
    public final void dispose() {
        d0 d0Var = this.f16269a;
        androidx.compose.ui.node.a aVar = d0Var.f16271i;
        d0Var.d();
        androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) d0Var.f16279z.remove(this.f16270b);
        if (aVar2 != null) {
            if (d0Var.E <= 0) {
                throw new IllegalStateException("No pre-composed items to dispose");
            }
            int iK = ((q0.c) aVar.o()).f13638i.k(aVar2);
            int i10 = ((q0.c) aVar.o()).f13638i.f13646s;
            int i11 = d0Var.E;
            if (iK < i10 - i11) {
                throw new IllegalStateException("Item is not in pre-composed item range");
            }
            d0Var.D++;
            d0Var.E = i11 - 1;
            int i12 = (((q0.c) aVar.o()).f13638i.f13646s - d0Var.E) - d0Var.D;
            aVar.B = true;
            aVar.G(iK, i12, 1);
            aVar.B = false;
            d0Var.c(i12);
        }
    }
}
