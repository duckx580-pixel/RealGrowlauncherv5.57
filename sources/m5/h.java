package m5;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends y4.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11593c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f11594d;

    public h(Context context, int i10, int i11) {
        super(i10, i11);
        this.f11594d = context;
    }

    @Override // y4.a
    public final void a(c5.c cVar) {
        switch (this.f11593c) {
            case 0:
                if (this.f20164b >= 10) {
                    cVar.i(new Object[]{"reschedule_needed", 1});
                    return;
                } else {
                    this.f11594d.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
                    return;
                }
            default:
                cVar.h("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
                Context context = this.f11594d;
                SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
                if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
                    long j = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
                    long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
                    cVar.a();
                    try {
                        cVar.i(new Object[]{"last_cancel_all_time_ms", Long.valueOf(j)});
                        cVar.i(new Object[]{"reschedule_needed", Long.valueOf(j10)});
                        sharedPreferences.edit().clear().apply();
                        cVar.u();
                    } finally {
                    }
                }
                SharedPreferences sharedPreferences2 = context.getSharedPreferences("androidx.work.util.id", 0);
                if (sharedPreferences2.contains("next_job_scheduler_id") || sharedPreferences2.contains("next_job_scheduler_id")) {
                    int i10 = sharedPreferences2.getInt("next_job_scheduler_id", 0);
                    int i11 = sharedPreferences2.getInt("next_alarm_manager_id", 0);
                    cVar.a();
                    try {
                        cVar.i(new Object[]{"next_job_scheduler_id", Integer.valueOf(i10)});
                        cVar.i(new Object[]{"next_alarm_manager_id", Integer.valueOf(i11)});
                        sharedPreferences2.edit().clear().apply();
                        cVar.u();
                        return;
                    } finally {
                    }
                }
                return;
        }
    }

    public h(Context context) {
        super(9, 10);
        this.f11594d = context;
    }
}
