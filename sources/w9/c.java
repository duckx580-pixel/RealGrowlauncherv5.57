package w9;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f19142a = new AtomicReference();

    @Override // a8.b
    public final void a(boolean z3) {
        synchronized (f.f19146k) {
            try {
                for (f fVar : new ArrayList(f.f19148m.values())) {
                    if (fVar.f19153e.get()) {
                        Log.d("FirebaseApp", "Notifying background state change listeners.");
                        Iterator it = fVar.f19157i.iterator();
                        while (it.hasNext()) {
                            f fVar2 = ((b) it.next()).f19141a;
                            if (!z3) {
                                ((cb.e) fVar2.f19156h.get()).b();
                            }
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
