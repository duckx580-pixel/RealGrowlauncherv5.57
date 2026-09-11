package al;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f632b;

    public /* synthetic */ a(int i10, Object obj) {
        this.f631a = i10;
        this.f632b = obj;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f631a) {
            case 0:
                el.c cVar = (el.c) this.f632b;
                return new dl.a(null, Optional.empty(), "could not determine a constructor for the tag " + cVar.f5560b, cVar.f5559a, null);
            case 1:
                return new ArrayList((List) this.f632b);
            case 2:
                return new HashMap((Map) this.f632b);
            default:
                return this.f632b;
        }
    }
}
