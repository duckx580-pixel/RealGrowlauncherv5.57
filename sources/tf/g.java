package tf;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f17182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f17183b;

    static {
        if (f17182a != null) {
            return;
        }
        int[] iArr = new int[2048];
        f17183b = iArr;
        f17182a = new int[2048];
        Arrays.fill(iArr, 0);
        Arrays.fill(f17182a, 0);
        for (int i10 = 0; i10 <= 65535; i10++) {
            char c10 = (char) i10;
            if (Character.isJavaIdentifierPart(c10)) {
                int[] iArr2 = f17183b;
                int i11 = i10 / 32;
                iArr2[i11] = iArr2[i11] | (1 << (i10 % 32));
            }
            if (Character.isJavaIdentifierStart(c10)) {
                int[] iArr3 = f17182a;
                int i12 = i10 / 32;
                iArr3[i12] = (1 << (i10 % 32)) | iArr3[i12];
            }
        }
    }

    public static boolean a(int[] iArr, int i10) {
        return (iArr[i10 / 32] & (1 << (i10 % 32))) != 0;
    }
}
