package uf;

import android.graphics.Paint;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f17895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f17896b;

    static {
        int[] iArr = new int[cg.b.values().length];
        f17896b = iArr;
        try {
            iArr[3] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f17896b[1] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f17896b[2] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        int[] iArr2 = new int[Paint.Align.values().length];
        f17895a = iArr2;
        try {
            iArr2[Paint.Align.LEFT.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            f17895a[Paint.Align.RIGHT.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            f17895a[Paint.Align.CENTER.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
    }
}
