package yc;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public final class r implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20410i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f20411r;

    public /* synthetic */ r(Context context, int i10) {
        this.f20410i = i10;
        this.f20411r = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th2;
        z6.c cVarA;
        int i10;
        switch (this.f20410i) {
            case 0:
                try {
                    s.f20412i = new s(this.f20411r);
                    break;
                } catch (Exception e8) {
                    s sVar = s.f20412i;
                    c0.a(5, "TJEventOptimizer", e8.getMessage());
                }
                s.f20413r.countDown();
                return;
            default:
                Context context = this.f20411r;
                a7.a aVar = a7.a.f393i;
                Context applicationContext = context.getApplicationContext();
                synchronized (a7.a.class) {
                    try {
                        if ((applicationContext instanceof Application) && a7.a.f393i == null) {
                            a7.a aVar2 = new a7.a();
                            a7.a.f393i = aVar2;
                            ((Application) applicationContext).registerActivityLifecycleCallbacks(aVar2);
                        }
                    } finally {
                    }
                    break;
                }
                synchronized (z6.d.class) {
                    int i11 = 0;
                    th2 = null;
                    while (true) {
                        if (i11 < 3) {
                            try {
                                cVarA = z6.d.a(false, this.f20411r);
                            } finally {
                                if (i11 != i10) {
                                    try {
                                    } catch (Throwable th3) {
                                    }
                                }
                            }
                        } else {
                            cVarA = null;
                        }
                    }
                    break;
                }
                if (th2 != null) {
                    Log.e("FBAudienceNetwork", "Can't load Audience Network Dex. Please, check that audience_network.dex is inside of assets folder.", th2);
                } else if (cVarA != null) {
                    cVarA.i();
                    throw null;
                }
                z6.d.f20640b.set(false);
                return;
        }
    }
}
