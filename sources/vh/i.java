package vh;

import oh.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends h {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Runnable f18697s;

    public i(Runnable runnable, long j, k8.j jVar) {
        super(j, jVar);
        this.f18697s = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f18697s.run();
        } finally {
            this.f18696r.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f18697s;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(x.l(runnable));
        sb2.append(", ");
        sb2.append(this.f18695i);
        sb2.append(", ");
        sb2.append(this.f18696r);
        sb2.append(']');
        return sb2.toString();
    }
}
