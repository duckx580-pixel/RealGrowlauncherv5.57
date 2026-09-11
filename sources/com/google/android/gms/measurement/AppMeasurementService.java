package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import l4.a;
import s8.a3;
import s8.c1;
import s8.i0;
import s8.o2;
import s8.p2;
import s8.x1;
import s8.y0;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements p2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public u f4108i;

    @Override // s8.p2
    public final boolean a(int i10) {
        return stopSelfResult(i10);
    }

    @Override // s8.p2
    public final void b(Intent intent) {
        SparseArray sparseArray = a.f9799a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = a.f9799a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // s8.p2
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final u d() {
        if (this.f4108i == null) {
            this.f4108i = new u(this);
        }
        return this.f4108i;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        u uVarD = d();
        if (intent == null) {
            uVarD.M().w.b("onBind called with null intent");
            return null;
        }
        uVarD.getClass();
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new c1(a3.O((Service) uVarD.f17063i));
        }
        uVarD.M().f15413z.c("onBind received unknown action", action);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        i0 i0Var = y0.r((Service) d().f17063i, null, null).f15665y;
        y0.k(i0Var);
        i0Var.E.b("Local AppMeasurementService is starting up");
    }

    @Override // android.app.Service
    public final void onDestroy() {
        i0 i0Var = y0.r((Service) d().f17063i, null, null).f15665y;
        y0.k(i0Var);
        i0Var.E.b("Local AppMeasurementService is shutting down");
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        u uVarD = d();
        if (intent == null) {
            uVarD.M().w.b("onRebind called with null intent");
            return;
        }
        uVarD.getClass();
        uVarD.M().E.c("onRebind called. action", intent.getAction());
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i10, int i11) {
        u uVarD = d();
        i0 i0Var = y0.r((Service) uVarD.f17063i, null, null).f15665y;
        y0.k(i0Var);
        if (intent == null) {
            i0Var.f15413z.b("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        i0Var.E.d(Integer.valueOf(i11), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        x1 x1Var = new x1(uVarD, i11, i0Var, intent);
        a3 a3VarO = a3.O((Service) uVarD.f17063i);
        a3VarO.b().B(new o2(0, a3VarO, x1Var));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        u uVarD = d();
        if (intent == null) {
            uVarD.M().w.b("onUnbind called with null intent");
            return true;
        }
        uVarD.getClass();
        uVarD.M().E.c("onUnbind called for intent. action", intent.getAction());
        return true;
    }
}
