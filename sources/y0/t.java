package y0;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements y, Map, fh.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public s f20097i = new s(t0.c.f16233s);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final n f20098r = new n(this, 0);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final n f20099s = new n(this, 1);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final n f20100t = new n(this, 2);

    public final s a() {
        s sVar = this.f20097i;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar);
        return (s) m.s(sVar, this);
    }

    @Override // y0.y
    public final a0 b() {
        return this.f20097i;
    }

    @Override // java.util.Map
    public final void clear() {
        g gVarJ;
        s sVar = this.f20097i;
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar);
        s sVar2 = (s) m.i(sVar);
        t0.c cVar = t0.c.f16233s;
        if (cVar != sVar2.f20095c) {
            s sVar3 = this.f20097i;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar3);
            synchronized (m.f20078b) {
                gVarJ = m.j();
                s sVar4 = (s) m.v(sVar3, this, gVarJ);
                synchronized (r.f20094b) {
                    sVar4.f20095c = cVar;
                    sVar4.f20096d++;
                }
            }
            m.m(gVarJ, this);
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return a().f20095c.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return a().f20095c.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.f20098r;
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return a().f20095c.get(obj);
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return a().f20095c.isEmpty();
    }

    @Override // y0.y
    public final void j(a0 a0Var) {
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", a0Var);
        this.f20097i = (s) a0Var;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.f20099s;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        r0.d dVar;
        int i10;
        Object objPut;
        g gVarJ;
        boolean z3;
        do {
            Object obj3 = r.f20094b;
            synchronized (obj3) {
                s sVar = this.f20097i;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar);
                s sVar2 = (s) m.i(sVar);
                dVar = sVar2.f20095c;
                i10 = sVar2.f20096d;
            }
            kotlin.jvm.internal.l.c(dVar);
            t0.e eVar = (t0.e) dVar.builder();
            objPut = eVar.put(obj, obj2);
            r0.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.l.a(dVarBuild, dVar)) {
                break;
            }
            s sVar3 = this.f20097i;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar3);
            synchronized (m.f20078b) {
                gVarJ = m.j();
                s sVar4 = (s) m.v(sVar3, this, gVarJ);
                synchronized (obj3) {
                    int i11 = sVar4.f20096d;
                    if (i11 == i10) {
                        sVar4.f20095c = dVarBuild;
                        sVar4.f20096d = i11 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            m.m(gVarJ, this);
        } while (!z3);
        return objPut;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        r0.d dVar;
        int i10;
        g gVarJ;
        boolean z3;
        do {
            Object obj = r.f20094b;
            synchronized (obj) {
                s sVar = this.f20097i;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar);
                s sVar2 = (s) m.i(sVar);
                dVar = sVar2.f20095c;
                i10 = sVar2.f20096d;
            }
            kotlin.jvm.internal.l.c(dVar);
            t0.e eVar = (t0.e) dVar.builder();
            eVar.putAll(map);
            r0.d dVarBuild = eVar.build();
            if (kotlin.jvm.internal.l.a(dVarBuild, dVar)) {
                return;
            }
            s sVar3 = this.f20097i;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar3);
            synchronized (m.f20078b) {
                gVarJ = m.j();
                s sVar4 = (s) m.v(sVar3, this, gVarJ);
                synchronized (obj) {
                    int i11 = sVar4.f20096d;
                    if (i11 == i10) {
                        sVar4.f20095c = dVarBuild;
                        sVar4.f20096d = i11 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            m.m(gVarJ, this);
        } while (!z3);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        r0.d dVar;
        int i10;
        Object objRemove;
        g gVarJ;
        boolean z3;
        do {
            Object obj2 = r.f20094b;
            synchronized (obj2) {
                s sVar = this.f20097i;
                kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar);
                s sVar2 = (s) m.i(sVar);
                dVar = sVar2.f20095c;
                i10 = sVar2.f20096d;
            }
            kotlin.jvm.internal.l.c(dVar);
            r0.c cVarBuilder = dVar.builder();
            objRemove = cVarBuilder.remove(obj);
            r0.d dVarBuild = cVarBuilder.build();
            if (kotlin.jvm.internal.l.a(dVarBuild, dVar)) {
                break;
            }
            s sVar3 = this.f20097i;
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>", sVar3);
            synchronized (m.f20078b) {
                gVarJ = m.j();
                s sVar4 = (s) m.v(sVar3, this, gVarJ);
                synchronized (obj2) {
                    int i11 = sVar4.f20096d;
                    if (i11 == i10) {
                        sVar4.f20095c = dVarBuild;
                        sVar4.f20096d = i11 + 1;
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                }
            }
            m.m(gVarJ, this);
        } while (!z3);
        return objRemove;
    }

    @Override // java.util.Map
    public final int size() {
        return a().f20095c.size();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.f20100t;
    }
}
