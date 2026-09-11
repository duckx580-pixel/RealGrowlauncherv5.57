package androidx.work;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2398a = p.f("WorkerFactory");

    public final o a(Context context, String str, WorkerParameters workerParameters) {
        Class clsAsSubclass;
        String str2 = f2398a;
        o oVar = null;
        try {
            clsAsSubclass = Class.forName(str).asSubclass(o.class);
        } catch (Throwable th2) {
            p.d().c(str2, "Invalid class: " + str, th2);
            clsAsSubclass = null;
        }
        if (clsAsSubclass != null) {
            try {
                oVar = (o) clsAsSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
            } catch (Throwable th3) {
                p.d().c(str2, "Could not instantiate " + str, th3);
            }
        }
        if (oVar == null || !oVar.isUsed()) {
            return oVar;
        }
        throw new IllegalStateException(k0.g.g("WorkerFactory (", getClass().getName(), ") returned an instance of a ListenableWorker (", str, ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker."));
    }
}
