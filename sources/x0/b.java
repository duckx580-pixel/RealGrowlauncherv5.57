package x0;

import com.google.android.gms.internal.measurement.j3;
import o0.m1;
import o0.n0;
import y0.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements m1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public j3 f19342i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j f19343r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f19344s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f19345t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object[] f19346u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i f19347v;
    public final p1.g w = new p1.g(23, this);

    public b(j3 j3Var, j jVar, String str, Object obj, Object[] objArr) {
        this.f19342i = j3Var;
        this.f19343r = jVar;
        this.f19344s = str;
        this.f19345t = obj;
        this.f19346u = objArr;
    }

    @Override // o0.m1
    public final void a() {
        i iVar = this.f19347v;
        if (iVar != null) {
            ((n7.e) iVar).J();
        }
    }

    public final void b() {
        String str;
        j jVar = this.f19343r;
        if (this.f19347v != null) {
            throw new IllegalArgumentException(("entry(" + this.f19347v + ") is not null").toString());
        }
        if (jVar != null) {
            p1.g gVar = this.w;
            Object objInvoke = gVar.invoke();
            if (objInvoke == null || jVar.a(objInvoke)) {
                this.f19347v = jVar.d(this.f19344s, gVar);
                return;
            }
            if (objInvoke instanceof o) {
                o oVar = (o) objInvoke;
                if (oVar.c() == n0.f12508s || oVar.c() == n0.f12510u || oVar.c() == n0.f12509t) {
                    str = "MutableState containing " + oVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                } else {
                    str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                }
            } else {
                str = objInvoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
            }
            throw new IllegalArgumentException(str);
        }
    }

    @Override // o0.m1
    public final void d() {
        i iVar = this.f19347v;
        if (iVar != null) {
            ((n7.e) iVar).J();
        }
    }

    @Override // o0.m1
    public final void h() {
        b();
    }
}
