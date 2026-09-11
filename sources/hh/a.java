package hh;

import kotlin.jvm.internal.l;
import lh.j;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements c {
    private Object value;

    public a(Object obj) {
        this.value = obj;
    }

    public abstract void afterChange(j jVar, Object obj, Object obj2);

    public boolean beforeChange(j jVar, Object obj, Object obj2) {
        l.f("property", jVar);
        return true;
    }

    @Override // hh.b
    public Object getValue(Object obj, j jVar) {
        l.f("property", jVar);
        return this.value;
    }

    @Override // hh.c
    public void setValue(Object obj, j jVar, Object obj2) {
        l.f("property", jVar);
        Object obj3 = this.value;
        if (beforeChange(jVar, obj3, obj2)) {
            this.value = obj2;
            afterChange(jVar, obj3, obj2);
        }
    }

    public String toString() {
        return "ObservableProperty(value=" + this.value + ')';
    }
}
