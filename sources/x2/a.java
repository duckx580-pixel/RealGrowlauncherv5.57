package x2;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Arrays;
import k0.g;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f19370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n7.e f19371c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f19369a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19372d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int[] f19373e = new int[8];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f19374f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float[] f19375g = new float[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f19376h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19377i = -1;
    public boolean j = false;

    public a(b bVar, n7.e eVar) {
        this.f19370b = bVar;
        this.f19371c = eVar;
    }

    public final void a(f fVar, float f9, boolean z3) {
        if (f9 <= -0.001f || f9 >= 0.001f) {
            int i10 = this.f19376h;
            b bVar = this.f19370b;
            if (i10 == -1) {
                this.f19376h = 0;
                this.f19375g[0] = f9;
                this.f19373e[0] = fVar.f19404r;
                this.f19374f[0] = -1;
                fVar.A++;
                fVar.a(bVar);
                this.f19369a++;
                if (this.j) {
                    return;
                }
                int i11 = this.f19377i + 1;
                this.f19377i = i11;
                int[] iArr = this.f19373e;
                if (i11 >= iArr.length) {
                    this.j = true;
                    this.f19377i = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f19369a; i13++) {
                int i14 = this.f19373e[i10];
                int i15 = fVar.f19404r;
                if (i14 == i15) {
                    float[] fArr = this.f19375g;
                    float f10 = fArr[i10] + f9;
                    if (f10 > -0.001f && f10 < 0.001f) {
                        f10 = 0.0f;
                    }
                    fArr[i10] = f10;
                    if (f10 == 0.0f) {
                        if (i10 == this.f19376h) {
                            this.f19376h = this.f19374f[i10];
                        } else {
                            int[] iArr2 = this.f19374f;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z3) {
                            fVar.b(bVar);
                        }
                        if (this.j) {
                            this.f19377i = i10;
                        }
                        fVar.A--;
                        this.f19369a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f19374f[i10];
            }
            int length = this.f19377i;
            int i16 = length + 1;
            if (this.j) {
                int[] iArr3 = this.f19373e;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f19373e;
            if (length >= iArr4.length && this.f19369a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f19373e;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f19373e;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f19372d * 2;
                this.f19372d = i18;
                this.j = false;
                this.f19377i = length - 1;
                this.f19375g = Arrays.copyOf(this.f19375g, i18);
                this.f19373e = Arrays.copyOf(this.f19373e, this.f19372d);
                this.f19374f = Arrays.copyOf(this.f19374f, this.f19372d);
            }
            this.f19373e[length] = fVar.f19404r;
            this.f19375g[length] = f9;
            if (i12 != -1) {
                int[] iArr7 = this.f19374f;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f19374f[length] = this.f19376h;
                this.f19376h = length;
            }
            fVar.A++;
            fVar.a(bVar);
            this.f19369a++;
            if (!this.j) {
                this.f19377i++;
            }
            int i19 = this.f19377i;
            int[] iArr8 = this.f19373e;
            if (i19 >= iArr8.length) {
                this.j = true;
                this.f19377i = iArr8.length - 1;
            }
        }
    }

    public final void b() {
        int i10 = this.f19376h;
        for (int i11 = 0; i10 != -1 && i11 < this.f19369a; i11++) {
            f fVar = ((f[]) this.f19371c.f12174t)[this.f19373e[i10]];
            if (fVar != null) {
                fVar.b(this.f19370b);
            }
            i10 = this.f19374f[i10];
        }
        this.f19376h = -1;
        this.f19377i = -1;
        this.j = false;
        this.f19369a = 0;
    }

    public final float c(f fVar) {
        int i10 = this.f19376h;
        for (int i11 = 0; i10 != -1 && i11 < this.f19369a; i11++) {
            if (this.f19373e[i10] == fVar.f19404r) {
                return this.f19375g[i10];
            }
            i10 = this.f19374f[i10];
        }
        return 0.0f;
    }

    public final int d() {
        return this.f19369a;
    }

    public final f e(int i10) {
        int i11 = this.f19376h;
        for (int i12 = 0; i11 != -1 && i12 < this.f19369a; i12++) {
            if (i12 == i10) {
                return ((f[]) this.f19371c.f12174t)[this.f19373e[i11]];
            }
            i11 = this.f19374f[i11];
        }
        return null;
    }

    public final float f(int i10) {
        int i11 = this.f19376h;
        for (int i12 = 0; i11 != -1 && i12 < this.f19369a; i12++) {
            if (i12 == i10) {
                return this.f19375g[i11];
            }
            i11 = this.f19374f[i11];
        }
        return 0.0f;
    }

    public final void g(f fVar, float f9) {
        if (f9 == 0.0f) {
            h(fVar, true);
            return;
        }
        int i10 = this.f19376h;
        b bVar = this.f19370b;
        if (i10 == -1) {
            this.f19376h = 0;
            this.f19375g[0] = f9;
            this.f19373e[0] = fVar.f19404r;
            this.f19374f[0] = -1;
            fVar.A++;
            fVar.a(bVar);
            this.f19369a++;
            if (this.j) {
                return;
            }
            int i11 = this.f19377i + 1;
            this.f19377i = i11;
            int[] iArr = this.f19373e;
            if (i11 >= iArr.length) {
                this.j = true;
                this.f19377i = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f19369a; i13++) {
            int i14 = this.f19373e[i10];
            int i15 = fVar.f19404r;
            if (i14 == i15) {
                this.f19375g[i10] = f9;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f19374f[i10];
        }
        int length = this.f19377i;
        int i16 = length + 1;
        if (this.j) {
            int[] iArr2 = this.f19373e;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f19373e;
        if (length >= iArr3.length && this.f19369a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f19373e;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f19373e;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f19372d * 2;
            this.f19372d = i18;
            this.j = false;
            this.f19377i = length - 1;
            this.f19375g = Arrays.copyOf(this.f19375g, i18);
            this.f19373e = Arrays.copyOf(this.f19373e, this.f19372d);
            this.f19374f = Arrays.copyOf(this.f19374f, this.f19372d);
        }
        this.f19373e[length] = fVar.f19404r;
        this.f19375g[length] = f9;
        if (i12 != -1) {
            int[] iArr6 = this.f19374f;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f19374f[length] = this.f19376h;
            this.f19376h = length;
        }
        fVar.A++;
        fVar.a(bVar);
        int i19 = this.f19369a + 1;
        this.f19369a = i19;
        if (!this.j) {
            this.f19377i++;
        }
        int[] iArr7 = this.f19373e;
        if (i19 >= iArr7.length) {
            this.j = true;
        }
        if (this.f19377i >= iArr7.length) {
            this.j = true;
            this.f19377i = iArr7.length - 1;
        }
    }

    public final float h(f fVar, boolean z3) {
        int i10 = this.f19376h;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f19369a) {
            if (this.f19373e[i10] == fVar.f19404r) {
                if (i10 == this.f19376h) {
                    this.f19376h = this.f19374f[i10];
                } else {
                    int[] iArr = this.f19374f;
                    iArr[i12] = iArr[i10];
                }
                if (z3) {
                    fVar.b(this.f19370b);
                }
                fVar.A--;
                this.f19369a--;
                this.f19373e[i10] = -1;
                if (this.j) {
                    this.f19377i = i10;
                }
                return this.f19375g[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f19374f[i10];
        }
        return 0.0f;
    }

    public final String toString() {
        int i10 = this.f19376h;
        String string = PredefinedUICustomizationFont.defaultFamily;
        for (int i11 = 0; i10 != -1 && i11 < this.f19369a; i11++) {
            StringBuilder sbM = g.m(h0.e(string, " -> "));
            sbM.append(this.f19375g[i10]);
            sbM.append(" : ");
            StringBuilder sbM2 = g.m(sbM.toString());
            sbM2.append(((f[]) this.f19371c.f12174t)[this.f19373e[i10]]);
            string = sbM2.toString();
            i10 = this.f19374f[i10];
        }
        return string;
    }
}
