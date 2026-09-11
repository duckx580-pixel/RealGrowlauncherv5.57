package p4;

import androidx.lifecycle.d0;
import androidx.lifecycle.e0;
import androidx.lifecycle.v;
import ka.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final x7.c f13313l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public v f13314m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public b9.b f13315n;

    public b(x7.c cVar) {
        this.f13313l = cVar;
        if (cVar.f19473a != null) {
            throw new IllegalStateException("There is already a listener registered");
        }
        cVar.f19473a = this;
    }

    @Override // androidx.lifecycle.d0
    public final void e() {
        x7.c cVar = this.f13313l;
        cVar.f19474b = true;
        cVar.f19476d = false;
        cVar.f19475c = false;
        cVar.f19481i.drainPermits();
        cVar.a();
        cVar.f19479g = new q4.a(cVar);
        cVar.b();
    }

    @Override // androidx.lifecycle.d0
    public final void f() {
        this.f13313l.f19474b = false;
    }

    @Override // androidx.lifecycle.d0
    public final void h(e0 e0Var) {
        super.h(e0Var);
        this.f13314m = null;
        this.f13315n = null;
    }

    public final void j() {
        v vVar = this.f13314m;
        b9.b bVar = this.f13315n;
        if (vVar == null || bVar == null) {
            return;
        }
        super.h(bVar);
        d(vVar, bVar);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        sb2.append("LoaderInfo{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append(" #0 : ");
        a1.j(this.f13313l, sb2);
        sb2.append("}}");
        return sb2.toString();
    }
}
