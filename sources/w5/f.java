package w5;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k f19085i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final v9.a f19086r;

    public f(k kVar, v9.a aVar) {
        this.f19085i = kVar;
        this.f19086r = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f19085i.f19093i != this) {
            return;
        }
        if (i.f19092v.l(this.f19085i, this, i.f(this.f19086r))) {
            i.c(this.f19085i);
        }
    }
}
