package rc;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static e f14636d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f14637c;

    public e() {
        this.f14635b = "IronSourceLoggerManager";
        this.f14634a = 0;
        ArrayList arrayList = new ArrayList();
        this.f14637c = arrayList;
        arrayList.add(new f("console", 0, 0));
    }

    public static e d() {
        e eVar;
        synchronized (e.class) {
            try {
                if (f14636d == null) {
                    f14636d = new e();
                }
                eVar = f14636d;
            } finally {
            }
        }
        return eVar;
    }

    @Override // rc.d
    public final void a(int i10, int i11, String str) {
        synchronized (this) {
            if (i11 < this.f14634a) {
                return;
            }
            b(i10, i11, str);
        }
    }

    public final void b(int i10, int i11, String str) {
        for (d dVar : this.f14637c) {
            if (dVar.f14634a <= i11) {
                dVar.a(i10, i11, str);
            }
        }
    }

    public final void c(int i10, ec.c cVar) {
        String strA;
        synchronized (this) {
            if (cVar.f5480c < this.f14634a) {
                return;
            }
            String str = cVar.f5479b;
            if (str == null || str.length() == 0) {
                strA = ec.c.a();
            } else {
                strA = ec.c.a() + " - " + str;
            }
            b(i10, cVar.f5480c, strA);
        }
    }
}
