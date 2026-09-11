package xf;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f19697i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f19698r;

    public a(d dVar, c cVar) {
        this.f19698r = dVar;
        this.f19697i = cVar;
    }

    public abstract Object a();

    public boolean b() {
        return this.f19698r.f19705i != null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (b()) {
            this.f19697i.a(a());
        } else {
            c cVar = this.f19697i;
            synchronized (cVar) {
                cVar.f19703e++;
                cVar.a(null);
            }
        }
    }
}
