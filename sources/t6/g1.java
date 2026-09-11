package t6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.Timer;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 {
    public final ThreadPoolExecutor j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ExecutorService f16814g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Timer f16816i = new Timer(true);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CopyOnWriteArrayList f16815h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CopyOnWriteArraySet f16808a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Set f16811d = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentSkipListSet f16809b = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConcurrentSkipListSet f16810c = new ConcurrentSkipListSet();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f16812e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Set f16813f = Collections.newSetFromMap(new ConcurrentHashMap());

    public g1(ThreadPoolExecutor threadPoolExecutor) {
        this.j = threadPoolExecutor;
    }

    public final void a(ConcurrentSkipListSet concurrentSkipListSet) {
        d1 d1Var = (d1) concurrentSkipListSet.pollFirst();
        this.f16808a.add(d1Var.f16763x);
        Iterator it = this.f16815h.iterator();
        while (it.hasNext()) {
            ((i1) it.next()).b(d1Var);
        }
    }

    public final void b() {
        synchronized (this.f16809b) {
            try {
                Iterator it = this.f16810c.iterator();
                boolean z3 = false;
                while (it.hasNext()) {
                    d1 d1Var = (d1) it.next();
                    if (this.f16808a.containsAll(d1Var.f16757i)) {
                        it.remove();
                        this.f16809b.add(d1Var);
                        z3 = true;
                    }
                }
                if (z3) {
                    this.j.submit(new f1(this));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
