package g1;

import android.graphics.ColorSpace;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements h1.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6919a;

    public static /* bridge */ /* synthetic */ ColorSpace d(Object obj) {
        return (ColorSpace) obj;
    }

    @Override // h1.h
    public double a(double d10) {
        double d11;
        switch (this.f6919a) {
            case 26:
                double dPow = d10 < 0.0d ? -d10 : d10;
                if (dPow >= 0.0031308049535603718d) {
                    dPow = Math.pow(dPow, 0.4166666666666667d) - 0.05213270142180095d;
                    d11 = 0.9478672985781991d;
                } else {
                    d11 = 0.07739938080495357d;
                }
                return Math.copySign(dPow / d11, d10);
            case 27:
                double d12 = d10 < 0.0d ? -d10 : d10;
                return Math.copySign(d12 >= 0.04045d ? Math.pow((0.9478672985781991d * d12) + 0.05213270142180095d, 2.4d) : d12 * 0.07739938080495357d, d10);
            default:
                return d10;
        }
    }
}
