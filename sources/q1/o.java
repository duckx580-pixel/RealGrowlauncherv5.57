package q1;

import a8.w0;
import android.view.MotionEvent;
import com.usercentrics.sdk.extensions.TimeExtensionsKt;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13682a = new a(TimeExtensionsKt.MILLIS_PER_SECOND);

    static {
        new a(1007);
        new a(1008);
        new a(1002);
    }

    public static final boolean a(q qVar) {
        return !qVar.f13691h && qVar.f13687d;
    }

    public static final boolean b(q qVar) {
        return (qVar.b() || !qVar.f13691h || qVar.f13687d) ? false : true;
    }

    public static final boolean c(q qVar) {
        return qVar.f13691h && !qVar.f13687d;
    }

    public static final boolean d(q qVar, long j) {
        long j10 = qVar.f13686c;
        float fD = f1.c.d(j10);
        float fE = f1.c.e(j10);
        return fD < 0.0f || fD > ((float) ((int) (j >> 32))) || fE < 0.0f || fE > ((float) ((int) (j & 4294967295L)));
    }

    public static final boolean e(q qVar, long j, long j10) {
        if (qVar.f13692i != 1) {
            return d(qVar, j);
        }
        long j11 = qVar.f13686c;
        float fD = f1.c.d(j11);
        float fE = f1.c.e(j11);
        return fD < (-f1.f.d(j10)) || fD > f1.f.d(j10) + ((float) ((int) (j >> 32))) || fE < (-f1.f.b(j10)) || fE > f1.f.b(j10) + ((float) ((int) (j & 4294967295L)));
    }

    public static final long f(q qVar, boolean z3) {
        return (z3 || !qVar.b()) ? f1.c.f(qVar.f13686c, qVar.f13690g) : f1.c.f5973b;
    }

    public static final void g(g gVar, long j, eh.c cVar, boolean z3) {
        w0 w0Var = gVar.f13673b;
        MotionEvent motionEvent = w0Var != null ? (MotionEvent) ((u5.e) w0Var.f559d).f17655s : null;
        if (motionEvent == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEvent.getAction();
        if (z3) {
            motionEvent.setAction(3);
        }
        motionEvent.offsetLocation(-f1.c.d(j), -f1.c.e(j));
        cVar.invoke(motionEvent);
        motionEvent.offsetLocation(f1.c.d(j), f1.c.e(j));
        motionEvent.setAction(action);
    }
}
