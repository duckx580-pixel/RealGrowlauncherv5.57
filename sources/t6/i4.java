package t6;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i4 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16856i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j4 f16857r;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f16856i) {
            case 0:
                j4 j4Var = this.f16857r;
                synchronized (j4Var.f16889i) {
                    j4Var.j.post(new i4(j4Var, 1));
                    break;
                }
                return;
            case 1:
                j4 j4Var2 = this.f16857r;
                HashMap map = j4Var2.f16885e;
                try {
                    if (!map.isEmpty()) {
                        for (g4 g4Var : map.values()) {
                            j4Var2.f16883c.unregisterListener(g4Var);
                            g4Var.a(j4Var2.f16882b, true);
                        }
                    }
                    break;
                } catch (Throwable th2) {
                    s6.h.u("error while unregistering listeners", th2);
                }
                j4Var2.f16886f = false;
                return;
            case 2:
                j4 j4Var3 = this.f16857r;
                SensorManager sensorManager = j4Var3.f16883c;
                HashMap map2 = j4Var3.f16885e;
                try {
                    for (Sensor sensor : sensorManager.getSensorList(-1)) {
                        int type = sensor.getType();
                        if (type >= 0 && j4.f16880l.get(type)) {
                            g4 g4Var2 = new g4(sensor, j4Var3.f16884d);
                            if (!map2.containsKey(g4Var2)) {
                                map2.put(g4Var2, g4Var2);
                            }
                            sensorManager.registerListener((SensorEventListener) map2.get(g4Var2), sensor, 1, j4Var3.j);
                        }
                        break;
                    }
                } catch (Throwable th3) {
                    s6.h.u("registerListeners error", th3);
                }
                j4Var3.f16886f = true;
                return;
            case 3:
                synchronized (this.f16857r.f16889i) {
                    j4 j4Var4 = this.f16857r;
                    j4Var4.j.post(new i4(j4Var4, 2));
                    j4 j4Var5 = this.f16857r;
                    j4Var5.j.postDelayed(j4Var5.f16887g, 150L);
                    this.f16857r.f16881a = true;
                    break;
                }
                return;
            default:
                synchronized (this.f16857r.f16889i) {
                    try {
                        j4 j4Var6 = this.f16857r;
                        if (j4Var6.f16881a) {
                            j4Var6.j.removeCallbacks(j4Var6.f16888h);
                            j4 j4Var7 = this.f16857r;
                            j4Var7.j.removeCallbacks(j4Var7.f16887g);
                            j4 j4Var8 = this.f16857r;
                            j4Var8.j.post(new i4(j4Var8, 1));
                            this.f16857r.f16881a = false;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                    break;
                }
                return;
        }
    }

    public /* synthetic */ i4(j4 j4Var, int i10) {
        this.f16856i = i10;
        this.f16857r = j4Var;
    }
}
