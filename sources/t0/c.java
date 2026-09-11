package t0;

import a0.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class c extends rg.e implements r0.d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final c f16233s = new c(k.f16252e, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f16234i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f16235r;

    public c(k kVar, int i10) {
        this.f16234i = kVar;
        this.f16235r = i10;
    }

    @Override // r0.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public e builder() {
        return new e(this);
    }

    public final c b(Object obj, u0.a aVar) {
        f0 f0VarU = this.f16234i.u(obj, obj != null ? obj.hashCode() : 0, aVar, 0);
        return f0VarU == null ? this : new c((k) f0VarU.f60s, this.f16235r + f0VarU.f59r);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f16234i.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f16234i.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }
}
