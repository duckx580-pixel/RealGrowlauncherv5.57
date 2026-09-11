package k1;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import g1.m0;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f9005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f9006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f9007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f9008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f9009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f9010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f9011i;
    public final d j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f9012k;

    public e(String str, float f9, float f10, float f11, float f12, long j, int i10, boolean z3, int i11) {
        str = (i11 & 1) != 0 ? PredefinedUICustomizationFont.defaultFamily : str;
        long j10 = (i11 & 32) != 0 ? g1.t.f6916n : j;
        int i12 = (i11 & 64) != 0 ? 5 : i10;
        boolean z10 = (i11 & 128) != 0 ? false : z3;
        this.f9003a = str;
        this.f9004b = f9;
        this.f9005c = f10;
        this.f9006d = f11;
        this.f9007e = f12;
        this.f9008f = j10;
        this.f9009g = i12;
        this.f9010h = z10;
        ArrayList arrayList = new ArrayList();
        this.f9011i = arrayList;
        d dVar = new d(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, null, 1023);
        this.j = dVar;
        arrayList.add(dVar);
    }

    public static void a(e eVar, ArrayList arrayList, int i10, m0 m0Var) {
        eVar.c();
        ((d) k0.g.b(1, eVar.f9011i)).j.add(new k0(PredefinedUICustomizationFont.defaultFamily, arrayList, i10, m0Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, 0.0f, 1.0f, 0.0f));
    }

    public final f b() {
        c();
        while (true) {
            ArrayList arrayList = this.f9011i;
            if (arrayList.size() <= 1) {
                d dVar = this.j;
                f fVar = new f(this.f9003a, this.f9004b, this.f9005c, this.f9006d, this.f9007e, new g0(dVar.f8992a, dVar.f8993b, dVar.f8994c, dVar.f8995d, dVar.f8996e, dVar.f8997f, dVar.f8998g, dVar.f8999h, dVar.f9000i, dVar.j), this.f9008f, this.f9009g, this.f9010h);
                this.f9012k = true;
                return fVar;
            }
            c();
            d dVar2 = (d) arrayList.remove(arrayList.size() - 1);
            ((d) k0.g.b(1, arrayList)).j.add(new g0(dVar2.f8992a, dVar2.f8993b, dVar2.f8994c, dVar2.f8995d, dVar2.f8996e, dVar2.f8997f, dVar2.f8998g, dVar2.f8999h, dVar2.f9000i, dVar2.j));
        }
    }

    public final void c() {
        if (this.f9012k) {
            throw new IllegalStateException("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
    }
}
