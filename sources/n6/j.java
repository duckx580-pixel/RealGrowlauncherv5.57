package n6;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f12148a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c6.h f12149b;

    @Override // n6.g
    public boolean a(k6.f fVar) {
        ud.a aVar = fVar.f9266a;
        if ((aVar instanceof k6.a ? ((k6.a) aVar).f9255i : Integer.MAX_VALUE) <= 100) {
            return false;
        }
        ud.a aVar2 = fVar.f9267b;
        return (aVar2 instanceof k6.a ? ((k6.a) aVar2).f9255i : Integer.MAX_VALUE) > 100;
    }

    @Override // n6.g
    public boolean b() {
        boolean z3;
        synchronized (f.f12137a) {
            try {
                int i10 = f.f12139c;
                f.f12139c = i10 + 1;
                if (i10 >= 30 || SystemClock.uptimeMillis() > f.f12140d + ((long) 30000)) {
                    f.f12139c = 0;
                    f.f12140d = SystemClock.uptimeMillis();
                    String[] list = f.f12138b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    f.f12141e = list.length < 800;
                }
                z3 = f.f12141e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3;
    }
}
