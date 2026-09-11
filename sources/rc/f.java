package rc;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicReference;
import lc.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f14638c;

    public f(String str, int i10, int i11) {
        this.f14638c = i11;
        this.f14635b = str;
        this.f14634a = i10;
    }

    @Override // rc.d
    public final void a(int i10, int i11, String str) {
        Object objValueOf;
        switch (this.f14638c) {
            case 0:
                StringBuilder sb2 = new StringBuilder("UIThread: ");
                sb2.append(Looper.getMainLooper() == Looper.myLooper());
                sb2.append(" ");
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder("Activity: ");
                mc.a.k().getClass();
                AtomicReference atomicReference = l.f9906a;
                WeakReference weakReference = (WeakReference) atomicReference.get();
                if ((weakReference != null ? (Activity) weakReference.get() : null) != null) {
                    mc.a.k().getClass();
                    WeakReference weakReference2 = (WeakReference) atomicReference.get();
                    objValueOf = Integer.valueOf((weakReference2 != null ? (Activity) weakReference2.get() : null).hashCode());
                } else {
                    objValueOf = Boolean.FALSE;
                }
                sb3.append(objValueOf);
                sb3.append(" ");
                String string2 = sb3.toString();
                if (i11 == 0) {
                    Log.v("ironSourceSDK: ".concat(c.a(i10)), string + string2 + str);
                    break;
                } else if (i11 == 1) {
                    Log.i("ironSourceSDK: ".concat(c.a(i10)), str);
                    break;
                } else if (i11 == 2) {
                    Log.w("ironSourceSDK: ".concat(c.a(i10)), str);
                    break;
                } else if (i11 == 3) {
                    Log.e("ironSourceSDK: ".concat(c.a(i10)), str);
                    break;
                }
                break;
            default:
                ac.b bVar = new ac.b(this, str, i10, i11);
                Handler handler = nc.b.f12285a.f9916i;
                if (handler != null) {
                    handler.postDelayed(bVar, 0L);
                }
                break;
        }
    }
}
