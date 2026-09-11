package r3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f14454c;

    public d() {
        super(12);
        this.f14454c = new Object();
    }

    @Override // r3.c
    public final Object a() {
        Object objA;
        synchronized (this.f14454c) {
            objA = super.a();
        }
        return objA;
    }

    @Override // r3.c
    public final boolean c(Object obj) {
        boolean zC;
        synchronized (this.f14454c) {
            zC = super.c(obj);
        }
        return zC;
    }
}
