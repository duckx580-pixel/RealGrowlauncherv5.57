package w0;

import o0.d2;
import o0.f1;
import t0.k;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends t0.e {
    public d w;

    @Override // t0.e, r0.c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d build() {
        k kVar = this.f16241s;
        d dVar = this.w;
        if (kVar != dVar.f16234i) {
            this.f16240r = new v0.b();
            dVar = new d(this.f16241s, this.f16244v);
        }
        this.w = dVar;
        return dVar;
    }

    @Override // t0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof f1) {
            return super.containsKey((f1) obj);
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof d2) {
            return super.containsValue((d2) obj);
        }
        return false;
    }

    @Override // t0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof f1) {
            return (d2) super.get((f1) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        return !(obj instanceof f1) ? obj2 : (d2) super.getOrDefault((f1) obj, (d2) obj2);
    }

    @Override // t0.e, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof f1) {
            return (d2) super.remove((f1) obj);
        }
        return null;
    }
}
