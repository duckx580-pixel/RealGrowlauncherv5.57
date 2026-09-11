package h3;

import android.app.Notification;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class t {
    public static Notification a(Notification.Builder builder) {
        return builder.build();
    }

    public static Notification.Builder b(Notification.Builder builder, int i10) {
        return builder.setPriority(i10);
    }

    public static Notification.Builder c(Notification.Builder builder, CharSequence charSequence) {
        return builder.setSubText(charSequence);
    }

    public static Notification.Builder d(Notification.Builder builder, boolean z3) {
        return builder.setUsesChronometer(z3);
    }
}
