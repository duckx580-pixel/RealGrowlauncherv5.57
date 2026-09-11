package t0;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractMap implements r0.c, Map, fh.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c f16239i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v0.b f16240r = new v0.b();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k f16241s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16242t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f16243u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f16244v;

    public e(c cVar) {
        this.f16239i = cVar;
        this.f16241s = cVar.f16234i;
        this.f16244v = cVar.f16235r;
    }

    @Override // r0.c
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c build() {
        k kVar = this.f16241s;
        c cVar = this.f16239i;
        if (kVar != cVar.f16234i) {
            this.f16240r = new v0.b();
            cVar = new c(this.f16241s, this.f16244v);
        }
        this.f16239i = cVar;
        return cVar;
    }

    public final void b(int i10) {
        this.f16244v = i10;
        this.f16243u++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f16241s = k.f16252e;
        b(0);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        return this.f16241s.d(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return new g(0, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object get(Object obj) {
        return this.f16241s.g(obj != null ? obj.hashCode() : 0, 0, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return new g(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.f16242t = null;
        this.f16241s = this.f16241s.l(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        return this.f16242t;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        c cVarBuild = null;
        c cVar = map instanceof c ? (c) map : null;
        if (cVar == null) {
            e eVar = map instanceof e ? (e) map : null;
            if (eVar != null) {
                cVarBuild = eVar.build();
            }
        } else {
            cVarBuild = cVar;
        }
        if (cVarBuild == null) {
            super.putAll(map);
            return;
        }
        v0.a aVar = new v0.a();
        aVar.f18352a = 0;
        int i10 = this.f16244v;
        k kVar = this.f16241s;
        k kVar2 = cVarBuild.f16234i;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>", kVar2);
        this.f16241s = kVar.m(kVar2, 0, aVar, this);
        int i11 = (cVarBuild.f16235r + i10) - aVar.f18352a;
        if (i10 != i11) {
            b(i11);
        }
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        int i10 = this.f16244v;
        k kVarO = this.f16241s.o(obj != null ? obj.hashCode() : 0, obj, obj2, 0, this);
        if (kVarO == null) {
            kVarO = k.f16252e;
        }
        this.f16241s = kVarO;
        return i10 != this.f16244v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.f16244v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        return new sg.h(1, this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Object remove(Object obj) {
        this.f16242t = null;
        k kVarN = this.f16241s.n(obj != null ? obj.hashCode() : 0, obj, 0, this);
        if (kVarN == null) {
            kVarN = k.f16252e;
        }
        this.f16241s = kVarN;
        return this.f16242t;
    }
}
