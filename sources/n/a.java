package n;

import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f11829i;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f11829i) {
            case 0:
                b.H().f11832f.f11834g.execute(runnable);
                break;
            default:
                runnable.run();
                break;
        }
    }
}
