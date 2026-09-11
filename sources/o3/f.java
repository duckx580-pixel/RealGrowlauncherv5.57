package o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f12651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f12652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12653c;

    public final void a(e eVar) {
        synchronized (this) {
            while (this.f12653c) {
                try {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                } finally {
                }
            }
            if (this.f12652b == eVar) {
                return;
            }
            this.f12652b = eVar;
            if (this.f12651a) {
                eVar.onCancel();
            }
        }
    }
}
