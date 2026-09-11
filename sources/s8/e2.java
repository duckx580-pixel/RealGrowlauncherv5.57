package s8;

import android.content.Context;
import java.io.File;
import zc.j3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e2 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15317i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f15318r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f15319s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15320t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Object f15321u;

    public e2(File file) {
        this.f15317i = 5;
        j3 j3Var = new j3(file);
        this.f15318r = j3Var;
        this.f15320t = j3Var;
        j3Var.a();
        new Thread(this, "5Rocks").start();
    }

    public void a() {
        if (((zc.c0) this.f15321u) == null || ((j3) this.f15318r).f()) {
            return;
        }
        c(true);
    }

    public void b(long j) {
        if (j > 0) {
            synchronized (((j3) this.f15320t)) {
                this.f15319s = false;
                ((j3) this.f15320t).wait(j);
            }
            return;
        }
        synchronized (((j3) this.f15320t)) {
            try {
                this.f15319s = false;
                if (((zc.c0) this.f15321u) == null || ((j3) this.f15318r).f()) {
                    ((j3) this.f15320t).wait();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void c(boolean z3) {
        synchronized (((j3) this.f15320t)) {
            this.f15319s = z3;
            ((j3) this.f15320t).notify();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:207:0x0138, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00eb A[LOOP:2: B:48:0x00be->B:61:0x00eb, LOOP_END] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            Method dump skipped, instruction units count: 972
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: s8.e2.run():void");
    }

    public /* synthetic */ e2(l2 l2Var, g3 g3Var, boolean z3, c8.a aVar, int i10) {
        this.f15317i = i10;
        this.f15320t = l2Var;
        this.f15318r = g3Var;
        this.f15319s = z3;
        this.f15321u = aVar;
    }

    public e2(yc.d dVar, Context context, yc.u uVar, boolean z3) {
        this.f15317i = 3;
        this.f15320t = dVar;
        this.f15318r = context;
        this.f15321u = uVar;
        this.f15319s = z3;
    }

    public e2(zc.q0 q0Var) {
        this.f15317i = 4;
        this.f15318r = q0Var;
        this.f15320t = new i.y(2, this);
    }
}
