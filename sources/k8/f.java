package k8;

import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9284i = 1;

    public /* synthetic */ f() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        switch (this.f9284i) {
            case 0:
                Process.setThreadPriority(19);
                synchronized (this) {
                    while (true) {
                        try {
                            wait();
                        } catch (InterruptedException unused) {
                            return;
                        }
                    }
                }
                break;
            case 1:
                Looper.prepare();
                new Handler();
                Looper.loop();
                return;
        }
        while (true) {
            try {
                ReentrantLock reentrantLock2 = oj.d.f13067h;
                reentrantLock = oj.d.f13067h;
                reentrantLock.lock();
            } catch (InterruptedException unused2) {
            }
            try {
                oj.d dVarN = b8.l.n();
                if (dVarN == oj.d.f13070l) {
                    oj.d.f13070l = null;
                    reentrantLock.unlock();
                    return;
                } else {
                    reentrantLock.unlock();
                    if (dVarN != null) {
                        dVarN.j();
                    }
                }
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }
    }

    public /* synthetic */ f(String str) {
        super(str);
    }

    public /* synthetic */ f(ThreadGroup threadGroup, String str) {
        super(threadGroup, str);
    }
}
