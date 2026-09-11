package o;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends e implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f12368i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f12369r = true;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f12370s;

    public d(f fVar) {
        this.f12370s = fVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2 = this.f12368i;
        if (cVar == cVar2) {
            c cVar3 = cVar2.f12367t;
            this.f12368i = cVar3;
            this.f12369r = cVar3 == null;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f12369r) {
            return this.f12370s.f12371i != null;
        }
        c cVar = this.f12368i;
        return (cVar == null || cVar.f12366s == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f12369r) {
            this.f12369r = false;
            this.f12368i = this.f12370s.f12371i;
        } else {
            c cVar = this.f12368i;
            this.f12368i = cVar != null ? cVar.f12366s : null;
        }
        return this.f12368i;
    }
}
