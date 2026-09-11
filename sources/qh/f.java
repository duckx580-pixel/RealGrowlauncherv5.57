package qh;

import i2.e0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f13948a = new l(-1, null, null, 0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f13949b = th.a.k(32, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f13950c = th.a.k(10000, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final lc.n f13951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final lc.n f13952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final lc.n f13953f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final lc.n f13954g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final lc.n f13955h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final lc.n f13956i;
    public static final lc.n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final lc.n f13957k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final lc.n f13958l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final lc.n f13959m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final lc.n f13960n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final lc.n f13961o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final lc.n f13962p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final lc.n f13963q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final lc.n f13964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final lc.n f13965s;

    static {
        int i10 = 26;
        f13951d = new lc.n(i10, "BUFFERED");
        f13952e = new lc.n(i10, "SHOULD_BUFFER");
        f13953f = new lc.n(i10, "S_RESUMING_BY_RCV");
        f13954g = new lc.n(i10, "RESUMING_BY_EB");
        f13955h = new lc.n(i10, "POISONED");
        f13956i = new lc.n(i10, "DONE_RCV");
        j = new lc.n(i10, "INTERRUPTED_SEND");
        f13957k = new lc.n(i10, "INTERRUPTED_RCV");
        f13958l = new lc.n(i10, "CHANNEL_CLOSED");
        f13959m = new lc.n(i10, "SUSPEND");
        f13960n = new lc.n(i10, "SUSPEND_NO_WAITER");
        f13961o = new lc.n(i10, "FAILED");
        f13962p = new lc.n(i10, "NO_RECEIVE_RESULT");
        f13963q = new lc.n(i10, "CLOSE_HANDLER_CLOSED");
        f13964r = new lc.n(i10, "CLOSE_HANDLER_INVOKED");
        f13965s = new lc.n(i10, "NO_CLOSE_CAUSE");
    }

    public static final boolean a(oh.e eVar, Object obj, e0 e0Var) {
        lc.n nVarK = eVar.k(obj, e0Var);
        if (nVarK == null) {
            return false;
        }
        eVar.w(nVarK);
        return true;
    }
}
