package o5;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import ja.k;
import kotlin.jvm.internal.l;
import lc.n;
import u5.j;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f12666a = p.f("Alarms");

    public static void a(Context context, j jVar, int i10) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        String str = c.f12667u;
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        c.d(intent, jVar);
        PendingIntent service = PendingIntent.getService(context, i10, intent, 603979776);
        if (service == null || alarmManager == null) {
            return;
        }
        p.d().a(f12666a, "Cancelling existing alarm with (workSpecId, systemId) (" + jVar + ", " + i10 + ")");
        alarmManager.cancel(service);
    }

    public static void b(Context context, WorkDatabase workDatabase, j jVar, long j) {
        u5.i iVarP = workDatabase.p();
        u5.g gVarJ = iVarP.j(jVar);
        if (gVarJ != null) {
            int i10 = gVarJ.f17664c;
            a(context, jVar, i10);
            AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
            String str = c.f12667u;
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_DELAY_MET");
            c.d(intent, jVar);
            PendingIntent service = PendingIntent.getService(context, i10, intent, 201326592);
            if (alarmManager != null) {
                a.a(alarmManager, 0, j, service);
                return;
            }
            return;
        }
        Object objN = workDatabase.n(new k(2, new n(workDatabase)));
        l.e("workDatabase.runInTransa…ANAGER_ID_KEY)\n        })", objN);
        int iIntValue = ((Number) objN).intValue();
        iVarP.l(new u5.g(jVar.f17670a, jVar.f17671b, iIntValue));
        AlarmManager alarmManager2 = (AlarmManager) context.getSystemService("alarm");
        String str2 = c.f12667u;
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_DELAY_MET");
        c.d(intent2, jVar);
        PendingIntent service2 = PendingIntent.getService(context, iIntValue, intent2, 201326592);
        if (alarmManager2 != null) {
            a.a(alarmManager2, 0, j, service2);
        }
    }
}
