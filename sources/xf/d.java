package xf;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d implements e {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ThreadPoolExecutor f19704s = new ThreadPoolExecutor(2, Math.max(2, Runtime.getRuntime().availableProcessors()), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(128));

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public uf.c f19705i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public pf.h f19706r;

    public d(uf.c cVar, pf.h hVar) {
        this.f19705i = cVar;
        this.f19706r = hVar;
    }

    public final void t() {
        this.f19705i.getInlayHints();
        List list = Collections.EMPTY_LIST;
    }
}
