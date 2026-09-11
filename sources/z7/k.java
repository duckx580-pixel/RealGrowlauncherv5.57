package z7;

import android.os.Looper;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Set f20670i = Collections.newSetFromMap(new WeakHashMap());

    public abstract void a();

    public abstract a8.d b(a8.d dVar);

    public abstract Looper c();

    public boolean d(x7.c cVar) {
        throw new UnsupportedOperationException();
    }

    public void e() {
        throw new UnsupportedOperationException();
    }
}
