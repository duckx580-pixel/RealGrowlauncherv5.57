package x2;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Comparable {
    public int B;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19403i;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public float f19407u;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f19404r = -1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f19405s = -1;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f19406t = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f19408v = false;
    public final float[] w = new float[9];

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final float[] f19409x = new float[9];

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b[] f19410y = new b[16];

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f19411z = 0;
    public int A = 0;

    public f(int i10) {
        this.B = i10;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f19411z;
            if (i10 >= i11) {
                b[] bVarArr = this.f19410y;
                if (i11 >= bVarArr.length) {
                    this.f19410y = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.f19410y;
                int i12 = this.f19411z;
                bVarArr2[i12] = bVar;
                this.f19411z = i12 + 1;
                return;
            }
            if (this.f19410y[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void b(b bVar) {
        int i10 = this.f19411z;
        int i11 = 0;
        while (i11 < i10) {
            if (this.f19410y[i11] == bVar) {
                while (i11 < i10 - 1) {
                    b[] bVarArr = this.f19410y;
                    int i12 = i11 + 1;
                    bVarArr[i11] = bVarArr[i12];
                    i11 = i12;
                }
                this.f19411z--;
                return;
            }
            i11++;
        }
    }

    public final void c() {
        this.B = 5;
        this.f19406t = 0;
        this.f19404r = -1;
        this.f19405s = -1;
        this.f19407u = 0.0f;
        this.f19408v = false;
        int i10 = this.f19411z;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19410y[i11] = null;
        }
        this.f19411z = 0;
        this.A = 0;
        this.f19403i = false;
        Arrays.fill(this.f19409x, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f19404r - ((f) obj).f19404r;
    }

    public final void d(c cVar, float f9) {
        this.f19407u = f9;
        this.f19408v = true;
        int i10 = this.f19411z;
        this.f19405s = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19410y[i11].h(cVar, this, false);
        }
        this.f19411z = 0;
    }

    public final void e(c cVar, b bVar) {
        int i10 = this.f19411z;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f19410y[i11].i(cVar, bVar, false);
        }
        this.f19411z = 0;
    }

    public final String toString() {
        return PredefinedUICustomizationFont.defaultFamily + this.f19404r;
    }
}
