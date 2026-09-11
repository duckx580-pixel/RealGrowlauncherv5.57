package fg;

import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6239i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ io.mychips.nativesdk.view.a f6240r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Exception f6241s;

    public /* synthetic */ b(io.mychips.nativesdk.view.a aVar, Exception exc, int i10) {
        this.f6239i = i10;
        this.f6240r = aVar;
        this.f6241s = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f6239i) {
            case 0:
                try {
                    this.f6240r.onError(this.f6241s);
                } catch (Exception e8) {
                    Log.w("MCOfferwallSDK", "Exception thrown in onError callback", e8);
                    return;
                }
                break;
            default:
                try {
                    this.f6240r.onError(this.f6241s);
                } catch (Exception e10) {
                    Log.w("MCOfferwallSDK", "Exception thrown in onError callback", e10);
                }
                break;
        }
    }
}
