package w2;

import java.util.HashMap;
import t1.j0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f19063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a3.b f19064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q2.b f19065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f19066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public q2.l f19067g;

    public n(j0 j0Var) {
        kotlin.jvm.internal.l.f("density", j0Var);
        HashMap map = new HashMap();
        this.f19061a = map;
        this.f19062b = new HashMap();
        this.f19063c = new HashMap();
        a3.b bVar = new a3.b(this);
        this.f19064d = bVar;
        map.put(0, bVar);
        this.f19065e = j0Var;
        this.f19066f = rk.a.G(0, 0, 15);
    }

    public final a3.b a(Object obj) {
        HashMap map = this.f19061a;
        a3.b bVar = (a3.b) map.get(obj);
        if (bVar == null) {
            bVar = new a3.b(this);
            map.put(obj, bVar);
            bVar.f213a = obj;
        }
        if (bVar instanceof a3.b) {
            return bVar;
        }
        return null;
    }
}
