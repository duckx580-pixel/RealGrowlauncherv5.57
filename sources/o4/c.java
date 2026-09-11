package o4;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f12662a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12663b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f12664c = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f12665d;

    public static void a(AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                g.w(autoCloseable);
            } catch (Exception e8) {
                throw new RuntimeException(e8);
            }
        }
    }
}
