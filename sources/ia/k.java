package ia;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f8193i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f8194r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ n f8195s;

    public k(n nVar, long j, String str) {
        this.f8195s = nVar;
        this.f8193i = j;
        this.f8194r = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        n nVar = this.f8195s;
        s sVar = nVar.f8215m;
        if (sVar != null && sVar.f8247e.get()) {
            return null;
        }
        ((ja.a) nVar.f8212i.f8876r).h(this.f8193i, this.f8194r);
        return null;
    }
}
