package o;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends f {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final HashMap f12360u = new HashMap();

    @Override // o.f
    public final c b(Object obj) {
        return (c) this.f12360u.get(obj);
    }

    @Override // o.f
    public final Object d(Object obj) {
        Object objD = super.d(obj);
        this.f12360u.remove(obj);
        return objD;
    }
}
