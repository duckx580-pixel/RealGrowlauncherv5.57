package x0;

import java.util.Map;
import o0.e2;
import t.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f19354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19355b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f19356c;

    public f(g gVar, Object obj) {
        this.f19354a = obj;
        Map map = (Map) gVar.f19358a.get(obj);
        q0 q0Var = new q0(20, gVar);
        e2 e2Var = l.f19367a;
        this.f19356c = new k(map, q0Var);
    }
}
