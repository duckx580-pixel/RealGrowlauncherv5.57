package s8;

import android.content.SharedPreferences;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15542a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f15543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Serializable f15544c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Serializable f15545d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e1 f15546e;

    public /* synthetic */ q0(a3 a3Var) {
        this.f15546e = a3Var;
    }

    public boolean a(long j, com.google.android.gms.internal.measurement.i2 i2Var) {
        a3 a3Var = (a3) this.f15546e;
        if (((ArrayList) this.f15545d) == null) {
            this.f15545d = new ArrayList();
        }
        if (((ArrayList) this.f15544c) == null) {
            this.f15544c = new ArrayList();
        }
        if (((ArrayList) this.f15545d).isEmpty() || ((((com.google.android.gms.internal.measurement.i2) ((ArrayList) this.f15545d).get(0)).o() / 1000) / 60) / 60 == ((i2Var.o() / 1000) / 60) / 60) {
            long jC = this.f15542a + ((long) i2Var.c());
            a3Var.K();
            if (jC < Math.max(0, ((Integer) z.f15683i.a(null)).intValue())) {
                this.f15542a = jC;
                ((ArrayList) this.f15545d).add(i2Var);
                ((ArrayList) this.f15544c).add(Long.valueOf(j));
                int size = ((ArrayList) this.f15545d).size();
                a3Var.K();
                if (size < Math.max(1, ((Integer) z.j.a(null)).intValue())) {
                    return true;
                }
            }
        }
        return false;
    }

    public void b() {
        r0 r0Var = (r0) this.f15546e;
        r0Var.t();
        ((y0) r0Var.f3470r).D.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor editorEdit = r0Var.x().edit();
        editorEdit.remove((String) this.f15544c);
        editorEdit.remove((String) this.f15545d);
        editorEdit.putLong((String) this.f15543b, jCurrentTimeMillis);
        editorEdit.apply();
    }

    public /* synthetic */ q0(r0 r0Var, long j) {
        this.f15546e = r0Var;
        b8.a0.e("health_monitor");
        b8.a0.b(j > 0);
        this.f15543b = "health_monitor:start";
        this.f15544c = "health_monitor:count";
        this.f15545d = "health_monitor:value";
        this.f15542a = j;
    }
}
