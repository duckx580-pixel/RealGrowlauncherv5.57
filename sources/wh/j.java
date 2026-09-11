package wh;

import lc.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n f19275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n f19276c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final n f19277d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final n f19278e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f19274a = th.a.k(100, 12, "kotlinx.coroutines.semaphore.maxSpinCycles");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19279f = th.a.k(16, 12, "kotlinx.coroutines.semaphore.segmentSize");

    static {
        int i10 = 26;
        f19275b = new n(i10, "PERMIT");
        f19276c = new n(i10, "TAKEN");
        f19277d = new n(i10, "BROKEN");
        f19278e = new n(i10, "CANCELLED");
    }
}
