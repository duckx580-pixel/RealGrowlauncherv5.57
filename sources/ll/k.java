package ll;

import com.google.android.gms.internal.measurement.j3;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f10163i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f10164r;

    public k(Executor executor, c cVar) {
        this.f10163i = executor;
        this.f10164r = cVar;
    }

    @Override // ll.c
    public final boolean F() {
        return this.f10164r.F();
    }

    @Override // ll.c
    public final al.h W() {
        return this.f10164r.W();
    }

    @Override // ll.c
    public final void cancel() {
        this.f10164r.cancel();
    }

    @Override // ll.c
    public final void n(f fVar) {
        this.f10164r.n(new j3(this, fVar, 14));
    }

    @Override // ll.c
    public final c clone() {
        return new k(this.f10163i, this.f10164r.clone());
    }
}
