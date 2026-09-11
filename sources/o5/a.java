package o5;

import android.app.AlarmManager;
import android.app.PendingIntent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static void a(AlarmManager alarmManager, int i10, long j, PendingIntent pendingIntent) {
        alarmManager.setExact(i10, j, pendingIntent);
    }
}
