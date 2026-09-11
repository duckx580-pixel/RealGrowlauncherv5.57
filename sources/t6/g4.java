package t6;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Looper;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g4 implements SensorEventListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f16825i;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ExecutorService f16828t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public long f16829u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final String f16830v;
    public double w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final int f16831x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final int f16832y;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final float[][] f16827s = new float[2][];

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long[] f16826r = new long[2];

    public g4(Sensor sensor, ExecutorService executorService) {
        int type = sensor.getType();
        this.f16831x = type;
        String name = sensor.getName();
        String str = PredefinedUICustomizationFont.defaultFamily;
        name = name == null ? PredefinedUICustomizationFont.defaultFamily : name;
        this.f16830v = name;
        String vendor = sensor.getVendor();
        str = vendor != null ? vendor : str;
        this.f16825i = str;
        this.f16832y = ((((type + 31) * 31) + name.hashCode()) * 31) + str.hashCode();
        this.f16828t = executorService;
    }

    public static double c(float[] fArr, float[] fArr2) {
        int iMin = Math.min(fArr.length, fArr2.length);
        double dPow = 0.0d;
        for (int i10 = 0; i10 < iMin; i10++) {
            dPow += StrictMath.pow(fArr[i10] - fArr2[i10], 2.0d);
        }
        return Math.sqrt(dPow);
    }

    public final void a(ConcurrentHashMap concurrentHashMap, boolean z3) {
        float[][] fArr = this.f16827s;
        if (fArr[0] == null) {
            if (concurrentHashMap.containsKey(this)) {
                return;
            }
            concurrentHashMap.put(this, d());
            return;
        }
        concurrentHashMap.put(this, d());
        if (z3) {
            int length = fArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                fArr[i10] = null;
            }
            long[] jArr = this.f16826r;
            int length2 = jArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                jArr[i11] = 0;
            }
            this.w = 0.0d;
            this.f16829u = 0L;
        }
    }

    public final void b(SensorEvent sensorEvent) {
        long j = sensorEvent.timestamp;
        float[] fArr = sensorEvent.values;
        long jCurrentTimeMillis = System.currentTimeMillis();
        float[][] fArr2 = this.f16827s;
        float[] fArr3 = fArr2[0];
        long[] jArr = this.f16826r;
        if (fArr3 == null) {
            fArr2[0] = Arrays.copyOf(fArr, fArr.length);
            jArr[0] = jCurrentTimeMillis;
            return;
        }
        float[] fArr4 = fArr2[1];
        if (fArr4 == null) {
            float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
            fArr2[1] = fArrCopyOf;
            jArr[1] = jCurrentTimeMillis;
            this.w = c(fArr3, fArrCopyOf);
            return;
        }
        if (50000000 <= j - this.f16829u) {
            this.f16829u = j;
            if (Arrays.equals(fArr4, fArr)) {
                jArr[1] = jCurrentTimeMillis;
                return;
            }
            double dC = c(fArr3, fArr);
            if (dC > this.w) {
                fArr2[1] = Arrays.copyOf(fArr, fArr.length);
                jArr[1] = jCurrentTimeMillis;
                this.w = dC;
            }
        }
    }

    public final ConcurrentHashMap d() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(7);
        concurrentHashMap.put("sT", Integer.valueOf(this.f16831x));
        concurrentHashMap.put("sN", this.f16830v);
        concurrentHashMap.put("sV", this.f16825i);
        float[][] fArr = this.f16827s;
        float[] fArr2 = fArr[0];
        if (fArr2 != null) {
            ArrayList arrayList = new ArrayList(fArr2.length);
            for (float f9 : fArr2) {
                arrayList.add(Float.valueOf(f9));
            }
            concurrentHashMap.put("sVS", arrayList);
        }
        float[] fArr3 = fArr[1];
        if (fArr3 != null) {
            ArrayList arrayList2 = new ArrayList(fArr3.length);
            for (float f10 : fArr3) {
                arrayList2.add(Float.valueOf(f10));
            }
            concurrentHashMap.put("sVE", arrayList2);
        }
        return concurrentHashMap;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof g4) {
            g4 g4Var = (g4) obj;
            int i10 = g4Var.f16831x;
            String str = g4Var.f16830v;
            String str2 = g4Var.f16825i;
            if (this.f16831x == i10 && this.f16830v.equals(str) && this.f16825i.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f16832y;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            b(sensorEvent);
        } else {
            this.f16828t.execute(new s8.o2(8, this, sensorEvent));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i10) {
    }
}
