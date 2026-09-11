package y9;

import b8.a0;
import java.util.concurrent.ConcurrentHashMap;
import u5.s;
import x7.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile b f20218c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mf.a f20219a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f20220b;

    public b(mf.a aVar) {
        a0.h(aVar);
        this.f20219a = aVar;
        this.f20220b = new ConcurrentHashMap();
    }

    public final d a(String str, s sVar) {
        if (!z9.b.f20678c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.f20220b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                mf.a aVar = this.f20219a;
                Object hVar = zEquals ? new h(aVar, sVar) : ("crash".equals(str) || "clx".equals(str)) ? new xa.c(aVar, sVar) : null;
                if (hVar != null) {
                    concurrentHashMap.put(str, hVar);
                    return new d();
                }
            }
        }
        return null;
    }
}
