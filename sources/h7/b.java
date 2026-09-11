package h7;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f7607a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final va.c f7608b;

    static {
        ya.a aVar = new ya.a(1);
        HashMap map = new HashMap();
        map.put(ya.d.class, aVar);
        f7608b = new va.c("storageMetrics", Collections.unmodifiableMap(new HashMap(map)));
    }

    @Override // va.a
    public final void a(Object obj, Object obj2) {
        ((va.e) obj2).f(f7608b, ((l7.b) obj).f9825a);
    }
}
