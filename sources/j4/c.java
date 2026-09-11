package j4;

import android.util.Log;
import androidx.fragment.app.j0;
import androidx.fragment.app.r;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f8777a = b.f8776a;

    public static b a(r rVar) {
        while (rVar != null) {
            if (rVar.I != null && rVar.A) {
                rVar.j();
            }
            rVar = rVar.K;
        }
        return f8777a;
    }

    public static void b(a aVar) {
        if (j0.G(3)) {
            Log.d("FragmentManager", "StrictMode violation in ".concat(aVar.f8775i.getClass().getName()), aVar);
        }
    }

    public static final void c(r rVar, String str) {
        l.f("previousFragmentId", str);
        b(new a(rVar, "Attempting to reuse fragment " + rVar + " with previous ID " + str));
        a(rVar).getClass();
    }
}
