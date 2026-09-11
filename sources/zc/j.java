package zc;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class j extends AbstractMap {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f20907i = new HashMap();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final a0 f20908r = new a0();

    public final void a() {
        while (true) {
            z zVarA = this.f20908r.a();
            if (zVarA == null) {
                return;
            } else {
                this.f20907i.remove(zVarA.f21302a);
            }
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f20907i.clear();
        while (this.f20908r.a() != null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        a();
        return this.f20907i.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        a();
        Iterator it = this.f20907i.values().iterator();
        while (it.hasNext()) {
            if (obj.equals(((z) it.next()).get())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        a();
        z zVar = (z) this.f20907i.get(obj);
        if (zVar != null) {
            return zVar.get();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        a();
        return this.f20907i.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        a();
        z zVar = (z) this.f20907i.put(obj, new z(obj, obj2, this.f20908r));
        if (zVar != null) {
            return zVar.get();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        a();
        z zVar = (z) this.f20907i.remove(obj);
        if (zVar != null) {
            return zVar.get();
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        a();
        return this.f20907i.size();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        a();
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        a();
        throw new UnsupportedOperationException();
    }
}
