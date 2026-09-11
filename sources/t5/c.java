package t5;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16683i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Notification f16684r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f16685s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ SystemForegroundService f16686t;

    public c(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f16686t = systemForegroundService;
        this.f16683i = i10;
        this.f16684r = notification;
        this.f16685s = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f16685s;
        Notification notification = this.f16684r;
        int i12 = this.f16683i;
        SystemForegroundService systemForegroundService = this.f16686t;
        if (i10 >= 31) {
            e.a(systemForegroundService, i12, notification, i11);
        } else if (i10 >= 29) {
            d.a(systemForegroundService, i12, notification, i11);
        } else {
            systemForegroundService.startForeground(i12, notification);
        }
    }
}
