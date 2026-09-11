package t5;

import android.app.Notification;
import android.app.Service;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static void a(Service service, int i10, Notification notification, int i11) {
        service.startForeground(i10, notification, i11);
    }
}
