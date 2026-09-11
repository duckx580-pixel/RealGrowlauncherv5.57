package tf;

import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f17179b = new WeakHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f17180a;

    public e(String str) {
        this.f17180a = str;
    }

    public static synchronized e a(String str) {
        e eVar;
        WeakHashMap weakHashMap = f17179b;
        eVar = (e) weakHashMap.get(str);
        if (eVar == null) {
            eVar = new e(str);
            weakHashMap.put(str, eVar);
        }
        return eVar;
    }
}
