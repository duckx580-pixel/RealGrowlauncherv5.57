package nc;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import lc.q;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f12285a;

    static {
        new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("IronSourceInitiatorHandler");
        handlerThread.start();
        new Handler(handlerThread.getLooper());
        q qVar = new q("mediationBackground");
        qVar.start();
        qVar.f9916i = new Handler(qVar.getLooper());
        q qVar2 = new q("adapterBackground");
        qVar2.start();
        qVar2.f9916i = new Handler(qVar2.getLooper());
        q qVar3 = new q("publisher-callbacks");
        qVar3.start();
        qVar3.f9916i = new Handler(qVar3.getLooper());
        f12285a = qVar3;
        android.support.v4.media.session.b.q(a.f12282r);
        android.support.v4.media.session.b.q(a.f12283s);
    }
}
