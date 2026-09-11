package uf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17931i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f17932r;

    public /* synthetic */ q(s sVar, int i10) {
        this.f17931i = i10;
        this.f17932r = sVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f17931i) {
            case 0:
                long jCurrentTimeMillis = System.currentTimeMillis();
                s sVar = this.f17932r;
                if (jCurrentTimeMillis - sVar.f17955p >= 3500) {
                    sVar.f17941a.invalidate();
                }
                break;
            default:
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                s sVar2 = this.f17932r;
                if (jCurrentTimeMillis2 - sVar2.f17954o >= 3000) {
                    sVar2.f17941a.invalidate();
                }
                break;
        }
    }
}
