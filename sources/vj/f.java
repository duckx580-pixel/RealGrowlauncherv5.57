package vj;

import java.util.Collection;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f18721i;

    public f(g gVar) {
        this.f18721i = gVar;
    }

    @Override // vj.j, vj.d
    public final c a() {
        return this.f18721i.a();
    }

    @Override // vj.j, vj.d
    public final Collection b() {
        return (Collection) this.f18721i.get("patterns");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vj.j, vj.d
    public final String getName() {
        return (String) this.f18721i.get("name");
    }
}
