package androidx.lifecycle;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4.c f1935a = new o4.c();

    public final void a(String str, AutoCloseable autoCloseable) {
        AutoCloseable autoCloseable2;
        o4.c cVar = this.f1935a;
        if (cVar != null) {
            if (cVar.f12665d) {
                o4.c.a(autoCloseable);
                return;
            }
            synchronized (cVar.f12662a) {
                autoCloseable2 = (AutoCloseable) cVar.f12663b.put(str, autoCloseable);
            }
            o4.c.a(autoCloseable2);
        }
    }

    public final void b() {
        o4.c cVar = this.f1935a;
        if (cVar != null && !cVar.f12665d) {
            cVar.f12665d = true;
            synchronized (cVar.f12662a) {
                try {
                    Iterator it = cVar.f12663b.values().iterator();
                    while (it.hasNext()) {
                        o4.c.a((AutoCloseable) it.next());
                    }
                    Iterator it2 = cVar.f12664c.iterator();
                    while (it2.hasNext()) {
                        o4.c.a((AutoCloseable) it2.next());
                    }
                    cVar.f12664c.clear();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        d();
    }

    public final AutoCloseable c(String str) {
        AutoCloseable autoCloseable;
        o4.c cVar = this.f1935a;
        if (cVar == null) {
            return null;
        }
        synchronized (cVar.f12662a) {
            autoCloseable = (AutoCloseable) cVar.f12663b.get(str);
        }
        return autoCloseable;
    }

    public void d() {
    }
}
