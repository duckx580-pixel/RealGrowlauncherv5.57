package t0;

import java.util.Iterator;
import java.util.Map;
import k1.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends rg.g {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16248i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e f16249r;

    public /* synthetic */ g(int i10, e eVar) {
        this.f16248i = i10;
        this.f16249r = eVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.f16248i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // rg.g
    public final int b() {
        switch (this.f16248i) {
            case 0:
                e eVar = this.f16249r;
                eVar.getClass();
                return eVar.f16244v;
            default:
                e eVar2 = this.f16249r;
                eVar2.getClass();
                return eVar2.f16244v;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.f16248i) {
            case 0:
                this.f16249r.clear();
                break;
            default:
                this.f16249r.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.f16248i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                e eVar = this.f16249r;
                Object obj2 = eVar.get(key);
                return obj2 != null ? obj2.equals(entry.getValue()) : entry.getValue() == null && eVar.containsKey(entry.getKey());
            default:
                return this.f16249r.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.f16248i) {
            case 0:
                return new f0(this.f16249r);
            default:
                l[] lVarArr = new l[8];
                for (int i10 = 0; i10 < 8; i10++) {
                    lVarArr[i10] = new m(1);
                }
                return new h(this.f16249r, lVarArr);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.f16248i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                return this.f16249r.remove(entry.getKey(), entry.getValue());
            default:
                e eVar = this.f16249r;
                if (!eVar.containsKey(obj)) {
                    return false;
                }
                eVar.remove(obj);
                return true;
        }
    }
}
