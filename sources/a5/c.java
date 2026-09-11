package a5;

import androidx.lifecycle.n;
import androidx.lifecycle.t;
import androidx.lifecycle.v;
import kotlin.jvm.internal.l;
import r4.a0;
import r4.k;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f358i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f359r;

    public /* synthetic */ c(int i10, Object obj) {
        this.f358i = i10;
        this.f359r = obj;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, n nVar) {
        switch (this.f358i) {
            case 0:
                f fVar = (f) this.f359r;
                l.f("this$0", fVar);
                if (nVar == n.ON_START) {
                    fVar.f365f = true;
                } else if (nVar == n.ON_STOP) {
                    fVar.f365f = false;
                }
                break;
            default:
                a0 a0Var = (a0) this.f359r;
                a0Var.f14471r = nVar.a();
                if (a0Var.f14457c != null) {
                    for (k kVar : a0Var.f14461g) {
                        kVar.getClass();
                        kVar.f14519t = nVar.a();
                        kVar.c();
                    }
                }
                break;
        }
    }
}
