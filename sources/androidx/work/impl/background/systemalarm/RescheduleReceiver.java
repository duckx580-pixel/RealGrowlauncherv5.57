package androidx.work.impl.background.systemalarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class RescheduleReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f2365a = p.f("RescheduleReceiver");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        p.d().a(f2365a, "Received intent " + intent);
        try {
            m5.p pVarE = m5.p.E(context);
            BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
            synchronized (m5.p.f11608m) {
                try {
                    BroadcastReceiver.PendingResult pendingResult = pVarE.f11617i;
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    pVarE.f11617i = pendingResultGoAsync;
                    if (pVarE.f11616h) {
                        pendingResultGoAsync.finish();
                        pVarE.f11617i = null;
                    }
                } finally {
                }
            }
        } catch (IllegalStateException e8) {
            p.d().c(f2365a, "Cannot reschedule jobs. WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e8);
        }
    }
}
