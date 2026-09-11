package mh;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i f11724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f11725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.c f11726c;

    public f(i iVar, boolean z3, eh.c cVar) {
        this.f11724a = iVar;
        this.f11725b = z3;
        this.f11726c = cVar;
    }

    @Override // mh.i
    public final Iterator iterator() {
        return new bh.h(this);
    }
}
