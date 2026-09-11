package t5;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.Service;
import android.util.Log;
import androidx.work.impl.foreground.SystemForegroundService;
import androidx.work.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static void a(Service service, int i10, Notification notification, int i11) {
        try {
            service.startForeground(i10, notification, i11);
        } catch (ForegroundServiceStartNotAllowedException e8) {
            p pVarD = p.d();
            String str = SystemForegroundService.f2374v;
            if (pVarD.f2390a <= 5) {
                Log.w(str, "Unable to start foreground service", e8);
            }
        }
    }
}
