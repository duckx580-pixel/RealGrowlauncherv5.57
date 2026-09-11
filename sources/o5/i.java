package o5;

import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import h7.o;
import java.util.ArrayList;
import java.util.Iterator;
import u5.j;
import u5.s;
import v5.m;
import v5.t;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements m5.d {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f12689z = p.f("SystemAlarmDispatcher");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f12690i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final x5.a f12691r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final t f12692s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final m5.g f12693t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final m5.p f12694u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c f12695v;
    public final ArrayList w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Intent f12696x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public SystemAlarmService f12697y;

    public i(SystemAlarmService systemAlarmService) {
        Context applicationContext = systemAlarmService.getApplicationContext();
        this.f12690i = applicationContext;
        this.f12695v = new c(applicationContext, new s(12));
        m5.p pVarE = m5.p.E(systemAlarmService);
        this.f12694u = pVarE;
        this.f12692s = new t(pVarE.f11610b.f2320e);
        m5.g gVar = pVarE.f11614f;
        this.f12693t = gVar;
        this.f12691r = pVarE.f11612d;
        gVar.a(this);
        this.w = new ArrayList();
        this.f12696x = null;
    }

    public static void c() {
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    public final void a(int i10, Intent intent) {
        p pVarD = p.d();
        String str = f12689z;
        pVarD.a(str, "Adding command " + intent + " (" + i10 + ")");
        c();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            p.d().g(str, "Unknown command. Ignoring");
            return;
        }
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            c();
            synchronized (this.w) {
                try {
                    Iterator it = this.w.iterator();
                    while (it.hasNext()) {
                        if ("ACTION_CONSTRAINTS_CHANGED".equals(((Intent) it.next()).getAction())) {
                            return;
                        }
                    }
                } finally {
                }
            }
        }
        intent.putExtra("KEY_START_ID", i10);
        synchronized (this.w) {
            try {
                boolean zIsEmpty = this.w.isEmpty();
                this.w.add(intent);
                if (zIsEmpty) {
                    d();
                }
            } finally {
            }
        }
    }

    @Override // m5.d
    public final void b(j jVar, boolean z3) {
        o oVar = (o) ((n7.e) this.f12691r).f12174t;
        String str = c.f12667u;
        Intent intent = new Intent(this.f12690i, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z3);
        c.d(intent, jVar);
        oVar.execute(new androidx.activity.g(this, intent, 0, 4));
    }

    public final void d() {
        c();
        PowerManager.WakeLock wakeLockA = m.a(this.f12690i, "ProcessCommand");
        try {
            wakeLockA.acquire();
            this.f12694u.f11612d.e(new h(this, 0));
        } finally {
            wakeLockA.release();
        }
    }
}
