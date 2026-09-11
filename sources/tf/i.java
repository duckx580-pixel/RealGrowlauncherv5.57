package tf;

import l5.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o f17187a;

    static {
        o oVar = new o();
        oVar.f9810i = null;
        f17187a = oVar;
    }

    public static float[] a(int i10) {
        float[] fArr;
        o oVar = f17187a;
        synchronized (oVar) {
            fArr = (float[]) oVar.f9810i;
            oVar.f9810i = null;
        }
        return (fArr == null || fArr.length < i10) ? new float[i10] : fArr;
    }

    public static void b(float[] fArr) {
        o oVar = f17187a;
        if (fArr.length > 1000) {
            return;
        }
        synchronized (oVar) {
            oVar.f9810i = fArr;
        }
    }
}
