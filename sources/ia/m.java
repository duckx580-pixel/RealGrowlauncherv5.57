package ia;

import android.os.Bundle;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8201i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f8202r;

    public m(n nVar, long j) {
        this.f8202r = nVar;
        this.f8201i = j;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle = new Bundle();
        bundle.putInt("fatal", 1);
        bundle.putLong("timestamp", this.f8201i);
        this.f8202r.f8213k.c(bundle);
        return null;
    }
}
