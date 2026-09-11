package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.p;
import java.util.Arrays;
import java.util.HashMap;
import m5.d;
import m5.g;
import m5.k;
import mf.e;
import p5.c;
import u5.j;
import u5.s;
import v5.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements d {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final String f2369t = p.f("SystemJobService");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public m5.p f2370i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final HashMap f2371r = new HashMap();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final s f2372s = new s(12);

    public static j a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new j(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // m5.d
    public final void b(j jVar, boolean z3) {
        JobParameters jobParameters;
        p.d().a(f2369t, jVar.f17670a + " executed on JobScheduler");
        synchronized (this.f2371r) {
            jobParameters = (JobParameters) this.f2371r.remove(jVar);
        }
        this.f2372s.o(jVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z3);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            m5.p pVarE = m5.p.E(getApplicationContext());
            this.f2370i = pVarE;
            pVarE.f11614f.a(this);
        } catch (IllegalStateException unused) {
            if (!Application.class.equals(getApplication().getClass())) {
                throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
            }
            p.d().g(f2369t, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        m5.p pVar = this.f2370i;
        if (pVar != null) {
            pVar.f11614f.e(this);
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        if (this.f2370i == null) {
            p.d().a(f2369t, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            p.d().b(f2369t, "WorkSpec id not found!");
            return false;
        }
        synchronized (this.f2371r) {
            try {
                if (this.f2371r.containsKey(jVarA)) {
                    p.d().a(f2369t, "Job is already being executed by SystemJobService: " + jVarA);
                    return false;
                }
                p.d().a(f2369t, "onStartJob for " + jVarA);
                this.f2371r.put(jVarA, jobParameters);
                int i10 = Build.VERSION.SDK_INT;
                e eVar = new e(6);
                if (c.b(jobParameters) != null) {
                    eVar.f11710s = Arrays.asList(c.b(jobParameters));
                }
                if (c.a(jobParameters) != null) {
                    eVar.f11709r = Arrays.asList(c.a(jobParameters));
                }
                if (i10 >= 28) {
                    eVar.f11711t = p5.d.a(jobParameters);
                }
                this.f2370i.H(this.f2372s.r(jVarA), eVar);
                return true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        if (this.f2370i == null) {
            p.d().a(f2369t, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        j jVarA = a(jobParameters);
        if (jVarA == null) {
            p.d().b(f2369t, "WorkSpec id not found!");
            return false;
        }
        p.d().a(f2369t, "onStopJob for " + jVarA);
        synchronized (this.f2371r) {
            this.f2371r.remove(jVarA);
        }
        k kVarO = this.f2372s.o(jVarA);
        if (kVarO != null) {
            m5.p pVar = this.f2370i;
            pVar.f11612d.e(new l(pVar, kVarO, false));
        }
        g gVar = this.f2370i.f11614f;
        String str = jVarA.f17670a;
        synchronized (gVar.B) {
            zContains = gVar.f11592z.contains(str);
        }
        return !zContains;
    }
}
