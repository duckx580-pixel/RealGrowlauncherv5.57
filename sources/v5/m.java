package v5;

import android.content.Context;
import android.os.PowerManager;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f18598a;

    static {
        String strF = androidx.work.p.f("WakeLocks");
        kotlin.jvm.internal.l.e("tagWithPrefix(\"WakeLocks\")", strF);
        f18598a = strF;
    }

    public static final PowerManager.WakeLock a(Context context, String str) {
        kotlin.jvm.internal.l.f("context", context);
        kotlin.jvm.internal.l.f("tag", str);
        Object systemService = context.getApplicationContext().getSystemService("power");
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.os.PowerManager", systemService);
        String strConcat = "WorkManager: ".concat(str);
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) systemService).newWakeLock(1, strConcat);
        synchronized (n.f18599a) {
        }
        kotlin.jvm.internal.l.e("wakeLock", wakeLockNewWakeLock);
        return wakeLockNewWakeLock;
    }
}
