package ll;

import java.util.concurrent.CompletableFuture;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends CompletableFuture {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final s f10114i;

    public g(s sVar) {
        this.f10114i = sVar;
    }

    @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
    public final boolean cancel(boolean z3) {
        if (z3) {
            this.f10114i.cancel();
        }
        return super.cancel(z3);
    }
}
