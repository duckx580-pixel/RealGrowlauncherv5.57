package h3;

import android.app.NotificationManager;
import android.content.Context;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final NotificationManager f7503a;

    static {
        new HashSet();
    }

    public f0(Context context) {
        this.f7503a = (NotificationManager) context.getSystemService("notification");
    }
}
