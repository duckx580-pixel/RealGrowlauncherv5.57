package w1;

import android.graphics.Matrix;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kotlin.jvm.internal.m f18863a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Matrix f18864b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Matrix f18865c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float[] f18866d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float[] f18867e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18868f = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f18869g = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f18870h = true;

    /* JADX WARN: Multi-variable type inference failed */
    public n1(eh.e eVar) {
        this.f18863a = (kotlin.jvm.internal.m) eVar;
    }

    public final float[] a(Object obj) {
        float[] fArrA = this.f18867e;
        if (fArrA == null) {
            fArrA = g1.b0.a();
            this.f18867e = fArrA;
        }
        if (this.f18869g) {
            this.f18870h = f0.t(b(obj), fArrA);
            this.f18869g = false;
        }
        if (this.f18870h) {
            return fArrA;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [eh.e, kotlin.jvm.internal.m] */
    public final float[] b(Object obj) {
        float[] fArrA = this.f18866d;
        if (fArrA == null) {
            fArrA = g1.b0.a();
            this.f18866d = fArrA;
        }
        if (!this.f18868f) {
            return fArrA;
        }
        Matrix matrix = this.f18864b;
        if (matrix == null) {
            matrix = new Matrix();
            this.f18864b = matrix;
        }
        this.f18863a.invoke(obj, matrix);
        Matrix matrix2 = this.f18865c;
        if (matrix2 == null || !matrix.equals(matrix2)) {
            g1.f0.o(matrix, fArrA);
            this.f18864b = matrix2;
            this.f18865c = matrix;
        }
        this.f18868f = false;
        return fArrA;
    }

    public final void c() {
        this.f18868f = true;
        this.f18869g = true;
    }
}
