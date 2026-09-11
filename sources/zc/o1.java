package zc;

import android.app.Application;
import android.util.Log;
import com.tapjoy.TJPlacement;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: loaded from: classes.dex */
public final class o1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f21029i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f21030r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f21031s;

    public /* synthetic */ o1(int i10, Object obj, Object obj2) {
        this.f21029i = i10;
        this.f21031s = obj;
        this.f21030r = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        TJPlacement tJPlacement;
        yc.v vVar;
        switch (this.f21029i) {
            case 0:
                CountDownLatch countDownLatch = (CountDownLatch) this.f21030r;
                try {
                    try {
                        ((p1) this.f21031s).f21051a = (Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", null).invoke(null, null);
                        break;
                    } catch (Exception e8) {
                        yc.c0.a(5, "Tapjoy.ActivityTracker", Log.getStackTraceString(e8));
                        break;
                    }
                    return;
                } finally {
                    countDownLatch.countDown();
                }
            default:
                zd.h hVar = ((z2) this.f21031s).f21309a;
                String str = (String) this.f21030r;
                hVar.getClass();
                j jVar = yc.a.f20242a;
                synchronized (jVar) {
                    tJPlacement = (TJPlacement) jVar.get(str);
                    break;
                }
                if (tJPlacement == null || (vVar = tJPlacement.f4727a) == null) {
                    return;
                }
                vVar.onContentShow(tJPlacement);
                return;
        }
    }
}
