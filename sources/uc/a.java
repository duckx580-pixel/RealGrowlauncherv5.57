package uc;

import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import rc.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f17737a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f17738b = null;

    public static String a() {
        String str;
        synchronized (a.class) {
            try {
                if (f17737a.compareAndSet(false, true)) {
                    f17738b = UUID.randomUUID().toString();
                }
                str = f17738b;
            } finally {
            }
        }
        return str;
    }

    public static void b(String str) {
        synchronized (a.class) {
            try {
                e.d().a(6, 0, "automation_log:" + Long.toString(System.currentTimeMillis()) + " text: " + str);
            } finally {
            }
        }
    }
}
