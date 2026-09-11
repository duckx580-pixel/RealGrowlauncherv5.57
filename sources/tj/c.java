package tj;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f17337d = new a(0, 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Pattern f17338e = Pattern.compile("\\b(comment|string|regex|meta\\.embedded)\\b");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f17339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.e f17340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentHashMap f17341c = new ConcurrentHashMap();

    public c(int i10, Map map) {
        this.f17339a = new a(i10, 8);
        this.f17340b = new u5.e(map == null ? Collections.EMPTY_MAP : map);
    }
}
