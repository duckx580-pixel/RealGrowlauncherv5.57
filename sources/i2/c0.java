package i2;

import android.graphics.Typeface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements b0 {
    public static Typeface a(String str, x xVar, int i10) {
        if (i10 == 0 && kotlin.jvm.internal.l.a(xVar, x.f8058u) && (str == null || str.length() == 0)) {
            return Typeface.DEFAULT;
        }
        return Typeface.create(str == null ? Typeface.DEFAULT : Typeface.create(str, 0), xVar.f8062i, i10 == 1);
    }

    @Override // i2.b0
    public final Typeface d(x xVar, int i10) {
        return a(null, xVar, i10);
    }

    @Override // i2.b0
    public final Typeface e(y yVar, x xVar, int i10) {
        return a(yVar.f8063t, xVar, i10);
    }
}
