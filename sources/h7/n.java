package h7;

import android.os.Process;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7640i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Runnable f7641r;

    public /* synthetic */ n(Runnable runnable, int i10) {
        this.f7640i = i10;
        this.f7641r = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f7640i) {
            case 0:
                try {
                    this.f7641r.run();
                } catch (Exception e8) {
                    u5.f.n("Executor", "Background execution failure.", e8);
                    return;
                }
                break;
            case 1:
                Process.setThreadPriority(0);
                this.f7641r.run();
                break;
            default:
                try {
                    this.f7641r.run();
                } catch (Exception e10) {
                    w9.a.m("SfeWrpRnnble", "Error running operation", e10);
                    return;
                }
                break;
        }
    }
}
