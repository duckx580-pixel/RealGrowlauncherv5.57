package y0;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Map.Entry, fh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f20121i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f20122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ x f20123s;

    public w(x xVar) {
        this.f20123s = xVar;
        Map.Entry entry = (Map.Entry) xVar.f14893t;
        kotlin.jvm.internal.l.c(entry);
        this.f20121i = entry.getKey();
        Map.Entry entry2 = (Map.Entry) xVar.f14893t;
        kotlin.jvm.internal.l.c(entry2);
        this.f20122r = entry2.getValue();
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20121i;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20122r;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        x xVar = this.f20123s;
        if (((t) xVar.f14891r).a().f20096d != xVar.f14890i) {
            throw new ConcurrentModificationException();
        }
        Object obj2 = this.f20122r;
        ((t) xVar.f14891r).put(this.f20121i, obj);
        this.f20122r = obj;
        return obj2;
    }
}
