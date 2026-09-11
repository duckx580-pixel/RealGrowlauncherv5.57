package rk;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import y0.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14890i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f14891r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f14892s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f14893t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f14894u;

    public e(int i10, e eVar, Object obj, e eVar2) {
        this.f14890i = i10;
        this.f14891r = eVar;
        this.f14894u = obj;
        this.f14893t = eVar2;
        e eVar3 = (e) eVar2.f14892s;
        this.f14892s = eVar3;
        eVar3.f14893t = this;
        eVar2.f14892s = this;
    }

    public void a() {
        this.f14893t = (Map.Entry) this.f14894u;
        Iterator it = (Iterator) this.f14892s;
        this.f14894u = it.hasNext() ? (Map.Entry) it.next() : null;
    }

    public boolean hasNext() {
        return ((Map.Entry) this.f14894u) != null;
    }

    public void remove() {
        t tVar = (t) this.f14891r;
        if (tVar.a().f20096d != this.f14890i) {
            throw new ConcurrentModificationException();
        }
        Map.Entry entry = (Map.Entry) this.f14893t;
        if (entry == null) {
            throw new IllegalStateException();
        }
        tVar.remove(entry.getKey());
        this.f14893t = null;
        this.f14890i = tVar.a().f20096d;
    }

    public e() {
        this.f14890i = 0;
        this.f14893t = this;
        this.f14892s = this;
    }

    public e(t tVar, Iterator it) {
        this.f14891r = tVar;
        this.f14892s = it;
        this.f14890i = tVar.a().f20096d;
        a();
    }
}
