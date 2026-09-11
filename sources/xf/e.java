package xf;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface e extends pf.j {
    int a();

    long b(float f9, float f10);

    int c();

    float[] d(int i10, int i11, float[] fArr);

    void f(mf.a aVar);

    l g(int i10, SparseArray sparseArray);

    long h(int i10, int i11);

    int j(int i10);

    int l(int i10);

    void n();

    long o(int i10, int i11);

    int p(int i10);

    j q(int i10);

    default float[] r(int i10, int i11) {
        return d(i10, i11, new float[2]);
    }

    int s();
}
