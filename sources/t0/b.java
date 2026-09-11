package t0;

import java.util.NoSuchElementException;
import k1.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends a implements fh.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f0 f16231s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f16232t;

    public b(f0 f0Var, Object obj, Object obj2) {
        super(obj, obj2);
        this.f16231s = f0Var;
        this.f16232t = obj2;
    }

    @Override // t0.a, java.util.Map.Entry
    public final Object getValue() {
        return this.f16232t;
    }

    @Override // t0.a, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f16232t;
        this.f16232t = obj;
        f fVar = (f) this.f16231s.f9036r;
        e eVar = fVar.f16245t;
        Object obj3 = this.f16229i;
        if (!eVar.containsKey(obj3)) {
            return obj2;
        }
        boolean z3 = fVar.f16238s;
        if (!z3) {
            eVar.put(obj3, obj);
        } else {
            if (!z3) {
                throw new NoSuchElementException();
            }
            l lVar = fVar.f16236i[fVar.f16237r];
            Object obj4 = lVar.f16257i[lVar.f16259s];
            eVar.put(obj3, obj);
            fVar.c(obj4 != null ? obj4.hashCode() : 0, eVar.f16241s, obj4, 0);
        }
        fVar.w = eVar.f16243u;
        return obj2;
    }
}
