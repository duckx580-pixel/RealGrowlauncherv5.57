package y0;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends rk.e implements Iterator, fh.a {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f20124v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(t tVar, Iterator it, int i10) {
        super(tVar, it);
        this.f20124v = i10;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f20124v) {
            case 0:
                a();
                if (((Map.Entry) this.f14893t) != null) {
                    return new w(this);
                }
                throw new IllegalStateException();
            case 1:
                Map.Entry entry = (Map.Entry) this.f14894u;
                if (entry == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry.getKey();
            default:
                Map.Entry entry2 = (Map.Entry) this.f14894u;
                if (entry2 == null) {
                    throw new IllegalStateException();
                }
                a();
                return entry2.getValue();
        }
    }
}
