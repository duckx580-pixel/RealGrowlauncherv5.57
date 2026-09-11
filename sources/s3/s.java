package s3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f15104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f15105b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f15106c = new HashMap();

    public s(Runnable runnable) {
        this.f15104a = runnable;
    }

    public final boolean a() {
        Iterator it = this.f15105b.iterator();
        while (it.hasNext()) {
            if (((androidx.fragment.app.c0) ((u) it.next())).f1671a.o()) {
                return true;
            }
        }
        return false;
    }

    public final void b(u uVar) {
        this.f15105b.remove(uVar);
        r rVar = (r) this.f15106c.remove(uVar);
        if (rVar != null) {
            rVar.f15099a.c(rVar.f15100b);
            rVar.f15100b = null;
        }
        this.f15104a.run();
    }
}
