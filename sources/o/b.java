package o;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends e implements Iterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f12361i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public c f12362r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f12363s;

    public b(c cVar, c cVar2, int i10) {
        this.f12363s = i10;
        this.f12361i = cVar2;
        this.f12362r = cVar;
    }

    @Override // o.e
    public final void a(c cVar) {
        c cVar2;
        c cVarB = null;
        if (this.f12361i == cVar && cVar == this.f12362r) {
            this.f12362r = null;
            this.f12361i = null;
        }
        c cVar3 = this.f12361i;
        if (cVar3 == cVar) {
            switch (this.f12363s) {
                case 0:
                    cVar2 = cVar3.f12367t;
                    break;
                default:
                    cVar2 = cVar3.f12366s;
                    break;
            }
            this.f12361i = cVar2;
        }
        c cVar4 = this.f12362r;
        if (cVar4 == cVar) {
            c cVar5 = this.f12361i;
            if (cVar4 != cVar5 && cVar5 != null) {
                cVarB = b(cVar4);
            }
            this.f12362r = cVarB;
        }
    }

    public final c b(c cVar) {
        switch (this.f12363s) {
            case 0:
                return cVar.f12366s;
            default:
                return cVar.f12367t;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f12362r != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        c cVar = this.f12362r;
        c cVar2 = this.f12361i;
        this.f12362r = (cVar == cVar2 || cVar2 == null) ? null : b(cVar);
        return cVar;
    }
}
