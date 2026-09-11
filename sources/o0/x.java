package o0;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12615i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ oh.f f12616r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ eh.c f12617s;

    public x(eh.c cVar, oh.f fVar) {
        this.f12616r = fVar;
        this.f12617s = cVar;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        Object objI;
        Object objI2;
        int i10 = this.f12615i;
        eh.c cVar = this.f12617s;
        oh.f fVar = this.f12616r;
        switch (i10) {
            case 0:
                y yVar = y.f12620i;
                try {
                    objI2 = cVar.invoke(Long.valueOf(j));
                } catch (Throwable th2) {
                    objI2 = androidx.work.v.i(th2);
                }
                fVar.resumeWith(objI2);
                break;
            default:
                try {
                    objI = cVar.invoke(Long.valueOf(j));
                } catch (Throwable th3) {
                    objI = androidx.work.v.i(th3);
                }
                fVar.resumeWith(objI);
                break;
        }
    }

    public x(oh.f fVar, b1 b1Var, eh.c cVar) {
        this.f12616r = fVar;
        this.f12617s = cVar;
    }
}
