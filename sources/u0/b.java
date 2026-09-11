package u0;

import java.util.Iterator;
import mh.g;
import r0.e;
import rg.h;
import t0.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends h implements e {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f17547t;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f17548i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f17549r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c f17550s;

    static {
        v0.b bVar = v0.b.f18353a;
        f17547t = new b(bVar, bVar, c.f16233s);
    }

    public b(Object obj, Object obj2, c cVar) {
        this.f17548i = obj;
        this.f17549r = obj2;
        this.f17550s = cVar;
    }

    @Override // rg.a
    public final int b() {
        c cVar = this.f17550s;
        cVar.getClass();
        return cVar.f16235r;
    }

    @Override // rg.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f17550s.containsKey(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new g(this.f17548i, this.f17550s);
    }
}
