package t6;

import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends TimerTask {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16746i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16747r;

    public c1(Thread thread) {
        this.f16747r = thread;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        switch (this.f16746i) {
            case 0:
                ((Thread) this.f16747r).interrupt();
                break;
            default:
                ((xcrash.f) this.f16747r).c();
                break;
        }
    }

    public c1(xcrash.f fVar) {
        this.f16747r = fVar;
    }
}
