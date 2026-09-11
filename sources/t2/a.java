package t2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16358i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ eh.a f16359r;

    public /* synthetic */ a(eh.a aVar, int i10) {
        this.f16358i = i10;
        this.f16359r = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16358i) {
            case 0:
                this.f16359r.invoke();
                break;
            case 1:
                this.f16359r.invoke();
                break;
            case 2:
                this.f16359r.invoke();
                break;
            default:
                this.f16359r.invoke();
                break;
        }
    }
}
