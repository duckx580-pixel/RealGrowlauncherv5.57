package k2;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9220i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Runnable f9221r;

    public /* synthetic */ z(Runnable runnable, int i10) {
        this.f9220i = i10;
        this.f9221r = runnable;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.f9220i) {
            case 0:
                this.f9221r.run();
                break;
            default:
                this.f9221r.run();
                break;
        }
    }
}
