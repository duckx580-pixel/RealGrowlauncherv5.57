package i8;

import android.content.Context;
import cb.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f8112b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public i f8113a;

    static {
        b bVar = new b();
        bVar.f8113a = null;
        f8112b = bVar;
    }

    public static i a(Context context) {
        i iVar;
        b bVar = f8112b;
        synchronized (bVar) {
            try {
                if (bVar.f8113a == null) {
                    if (context.getApplicationContext() != null) {
                        context = context.getApplicationContext();
                    }
                    bVar.f8113a = new i(context);
                }
                iVar = bVar.f8113a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }
}
