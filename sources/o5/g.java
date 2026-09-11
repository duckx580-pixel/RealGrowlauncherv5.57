package o5;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.p;
import h7.o;
import i.h0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import m5.k;
import u5.j;
import v5.m;
import v5.r;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements q5.b, r {
    public static final String C = p.f("DelayMetCommandHandler");
    public boolean A;
    public final k B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Context f12678i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12679r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j f12680s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final i f12681t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final n7.e f12682u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Object f12683v;
    public int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h0 f12684x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o f12685y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PowerManager.WakeLock f12686z;

    public g(Context context, int i10, i iVar, k kVar) {
        this.f12678i = context;
        this.f12679r = i10;
        this.f12681t = iVar;
        this.f12680s = kVar.f11596a;
        this.B = kVar;
        u5.i iVar2 = iVar.f12694u.j;
        n7.e eVar = (n7.e) iVar.f12691r;
        this.f12684x = (h0) eVar.f12172r;
        this.f12685y = (o) eVar.f12174t;
        this.f12682u = new n7.e(iVar2, this);
        this.A = false;
        this.w = 0;
        this.f12683v = new Object();
    }

    public static void a(g gVar) {
        int i10 = gVar.f12679r;
        o oVar = gVar.f12685y;
        Context context = gVar.f12678i;
        i iVar = gVar.f12681t;
        j jVar = gVar.f12680s;
        String str = jVar.f17670a;
        int i11 = gVar.w;
        String str2 = C;
        if (i11 >= 2) {
            p.d().a(str2, "Already stopped work for " + str);
            return;
        }
        gVar.w = 2;
        p.d().a(str2, "Stopping work for WorkSpec " + str);
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        c.d(intent, jVar);
        oVar.execute(new androidx.activity.g(iVar, intent, i10, 4));
        if (!iVar.f12693t.d(str)) {
            p.d().a(str2, "Processor does not have WorkSpec " + str + ". No need to reschedule");
            return;
        }
        p.d().a(str2, "WorkSpec " + str + " needs to be rescheduled");
        Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent2.setAction("ACTION_SCHEDULE_WORK");
        c.d(intent2, jVar);
        oVar.execute(new androidx.activity.g(iVar, intent2, i10, 4));
    }

    public final void b() {
        synchronized (this.f12683v) {
            try {
                this.f12682u.C();
                this.f12681t.f12692s.a(this.f12680s);
                PowerManager.WakeLock wakeLock = this.f12686z;
                if (wakeLock != null && wakeLock.isHeld()) {
                    p.d().a(C, "Releasing wakelock " + this.f12686z + "for WorkSpec " + this.f12680s);
                    this.f12686z.release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void c() throws Throwable {
        String str = this.f12680s.f17670a;
        StringBuilder sbH = s.h0.h(str, " (");
        sbH.append(this.f12679r);
        sbH.append(")");
        this.f12686z = m.a(this.f12678i, sbH.toString());
        p pVarD = p.d();
        String str2 = "Acquiring wakelock " + this.f12686z + "for WorkSpec " + str;
        String str3 = C;
        pVarD.a(str3, str2);
        this.f12686z.acquire();
        u5.p pVarH = this.f12681t.f12694u.f11611c.t().h(str);
        if (pVarH == null) {
            this.f12684x.execute(new f(this, 0));
            return;
        }
        boolean zB = pVarH.b();
        this.A = zB;
        if (zB) {
            this.f12682u.B(Collections.singletonList(pVarH));
            return;
        }
        p.d().a(str3, "No constraints for " + str);
        e(Collections.singletonList(pVarH));
    }

    @Override // q5.b
    public final void d(ArrayList arrayList) {
        this.f12684x.execute(new f(this, 0));
    }

    @Override // q5.b
    public final void e(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (vd.a.o((u5.p) it.next()).equals(this.f12680s)) {
                this.f12684x.execute(new f(this, 1));
                return;
            }
        }
    }

    public final void f(boolean z3) {
        p pVarD = p.d();
        StringBuilder sb2 = new StringBuilder("onExecuted ");
        j jVar = this.f12680s;
        sb2.append(jVar);
        sb2.append(", ");
        sb2.append(z3);
        pVarD.a(C, sb2.toString());
        b();
        int i10 = this.f12679r;
        i iVar = this.f12681t;
        o oVar = this.f12685y;
        Context context = this.f12678i;
        if (z3) {
            Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent.setAction("ACTION_SCHEDULE_WORK");
            c.d(intent, jVar);
            oVar.execute(new androidx.activity.g(iVar, intent, i10, 4));
        }
        if (this.A) {
            Intent intent2 = new Intent(context, (Class<?>) SystemAlarmService.class);
            intent2.setAction("ACTION_CONSTRAINTS_CHANGED");
            oVar.execute(new androidx.activity.g(iVar, intent2, i10, 4));
        }
    }
}
