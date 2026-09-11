package k2;

import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y implements Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Choreographer f9219i;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f9219i.postFrameCallback(new z(runnable, 0));
    }
}
