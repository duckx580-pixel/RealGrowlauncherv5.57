package w1;

import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements Choreographer.FrameCallback, Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ q0 f18886i;

    public p0(q0 q0Var) {
        this.f18886i = q0Var;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        this.f18886i.f18892t.removeCallbacks(this);
        q0.c0(this.f18886i);
        q0 q0Var = this.f18886i;
        synchronized (q0Var.f18893u) {
            if (q0Var.f18897z) {
                q0Var.f18897z = false;
                ArrayList arrayList = q0Var.w;
                q0Var.w = q0Var.f18895x;
                q0Var.f18895x = arrayList;
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((Choreographer.FrameCallback) arrayList.get(i10)).doFrame(j);
                }
                arrayList.clear();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        q0.c0(this.f18886i);
        q0 q0Var = this.f18886i;
        synchronized (q0Var.f18893u) {
            if (q0Var.w.isEmpty()) {
                q0Var.f18891s.removeFrameCallback(this);
                q0Var.f18897z = false;
            }
        }
    }
}
