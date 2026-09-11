package q;

import androidx.datastore.preferences.protobuf.i1;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends x implements Map {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i1 f13564t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b f13565u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public d f13566v;

    public e() {
        super(0);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        i1 i1Var = this.f13564t;
        if (i1Var != null) {
            return i1Var;
        }
        i1 i1Var2 = new i1(2, this);
        this.f13564t = i1Var2;
        return i1Var2;
    }

    public final boolean k(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Map
    public final Set keySet() {
        b bVar = this.f13565u;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.f13565u = bVar2;
        return bVar2;
    }

    public final boolean l(Collection collection) {
        int i10 = this.f13628s;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i10 != this.f13628s;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        b(map.size() + this.f13628s);
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        d dVar = this.f13566v;
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(this);
        this.f13566v = dVar2;
        return dVar2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(x xVar) {
        super(0);
        int i10 = xVar.f13628s;
        b(this.f13628s + i10);
        if (this.f13628s != 0) {
            for (int i11 = 0; i11 < i10; i11++) {
                put(xVar.g(i11), xVar.j(i11));
            }
        } else if (i10 > 0) {
            rg.k.r0(0, 0, i10, xVar.f13626i, this.f13626i);
            rg.k.t0(xVar.f13627r, this.f13627r, 0, 0, i10 << 1);
            this.f13628s = i10;
        }
    }
}
