package n9;

import android.graphics.Matrix;
import android.graphics.Path;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f12261a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f12262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f12263c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f12264d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f12265e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f12266f = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f12267g = new ArrayList();

    public u() {
        d(0.0f, 270.0f, 0.0f);
    }

    public final void a(float f9) {
        float f10 = this.f12264d;
        if (f10 == f9) {
            return;
        }
        float f11 = ((f9 - f10) + 360.0f) % 360.0f;
        if (f11 > 180.0f) {
            return;
        }
        float f12 = this.f12262b;
        float f13 = this.f12263c;
        q qVar = new q(f12, f13, f12, f13);
        qVar.f12255f = this.f12264d;
        qVar.f12256g = f11;
        this.f12267g.add(new o(qVar));
        this.f12264d = f9;
    }

    public final void b(Matrix matrix, Path path) {
        ArrayList arrayList = this.f12266f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((s) arrayList.get(i10)).a(matrix, path);
        }
    }

    public final void c(float f9, float f10) {
        r rVar = new r();
        rVar.f12257b = f9;
        rVar.f12258c = f10;
        this.f12266f.add(rVar);
        p pVar = new p(rVar, this.f12262b, this.f12263c);
        float fB = pVar.b() + 270.0f;
        float fB2 = pVar.b() + 270.0f;
        a(fB);
        this.f12267g.add(pVar);
        this.f12264d = fB2;
        this.f12262b = f9;
        this.f12263c = f10;
    }

    public final void d(float f9, float f10, float f11) {
        this.f12261a = f9;
        this.f12262b = 0.0f;
        this.f12263c = f9;
        this.f12264d = f10;
        this.f12265e = (f10 + f11) % 360.0f;
        this.f12266f.clear();
        this.f12267g.clear();
    }
}
