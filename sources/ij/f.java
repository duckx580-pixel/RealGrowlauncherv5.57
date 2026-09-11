package ij;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final oj.j f8320a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f8321b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f8322c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f8323d;

    static {
        oj.j jVar = oj.j.f13087t;
        f8320a = cb.f.h("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        f8321b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        f8322c = new String[64];
        String[] strArr = new String[256];
        for (int i10 = 0; i10 < 256; i10++) {
            String binaryString = Integer.toBinaryString(i10);
            kotlin.jvm.internal.l.e("Integer.toBinaryString(it)", binaryString);
            String strReplace = cj.a.h("%8s", binaryString).replace(' ', '0');
            kotlin.jvm.internal.l.e("replace(...)", strReplace);
            strArr[i10] = strReplace;
        }
        f8323d = strArr;
        String[] strArr2 = f8322c;
        strArr2[0] = PredefinedUICustomizationFont.defaultFamily;
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        int i11 = iArr[0];
        strArr2[i11 | 8] = kotlin.jvm.internal.l.k(strArr2[i11], "|PADDED");
        strArr2[4] = "END_HEADERS";
        strArr2[32] = "PRIORITY";
        strArr2[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i12 = 0; i12 < 3; i12++) {
            int i13 = iArr2[i12];
            int i14 = iArr[0];
            String[] strArr3 = f8322c;
            int i15 = i14 | i13;
            strArr3[i15] = strArr3[i14] + "|" + strArr3[i13];
            StringBuilder sb2 = new StringBuilder();
            sb2.append(strArr3[i14]);
            sb2.append("|");
            strArr3[i15 | 8] = k0.g.l(sb2, strArr3[i13], "|PADDED");
        }
        int length = f8322c.length;
        for (int i16 = 0; i16 < length; i16++) {
            String[] strArr4 = f8322c;
            if (strArr4[i16] == null) {
                strArr4[i16] = f8323d[i16];
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String a(int r4, int r5, int r6, int r7, boolean r8) {
        /*
            java.lang.String[] r0 = ij.f.f8321b
            int r1 = r0.length
            if (r6 >= r1) goto L8
            r0 = r0[r6]
            goto L16
        L8:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r1 = "0x%02x"
            java.lang.String r0 = cj.a.h(r1, r0)
        L16:
            if (r7 != 0) goto L1b
            java.lang.String r6 = ""
            goto L69
        L1b:
            r1 = 2
            java.lang.String[] r2 = ij.f.f8323d
            if (r6 == r1) goto L67
            r1 = 3
            if (r6 == r1) goto L67
            r1 = 4
            if (r6 == r1) goto L5e
            r1 = 6
            if (r6 == r1) goto L5e
            r1 = 7
            if (r6 == r1) goto L67
            r1 = 8
            if (r6 == r1) goto L67
            java.lang.String[] r1 = ij.f.f8322c
            int r3 = r1.length
            if (r7 >= r3) goto L3b
            r1 = r1[r7]
            kotlin.jvm.internal.l.c(r1)
            goto L3d
        L3b:
            r1 = r2[r7]
        L3d:
            r2 = 5
            if (r6 != r2) goto L4d
            r2 = r7 & 4
            if (r2 == 0) goto L4d
            java.lang.String r6 = "HEADERS"
            java.lang.String r7 = "PUSH_PROMISE"
            java.lang.String r6 = nh.o.H(r1, r6, r7)
            goto L69
        L4d:
            if (r6 != 0) goto L5c
            r6 = r7 & 32
            if (r6 == 0) goto L5c
            java.lang.String r6 = "PRIORITY"
            java.lang.String r7 = "COMPRESSED"
            java.lang.String r6 = nh.o.H(r1, r6, r7)
            goto L69
        L5c:
            r6 = r1
            goto L69
        L5e:
            r6 = 1
            if (r7 != r6) goto L64
            java.lang.String r6 = "ACK"
            goto L69
        L64:
            r6 = r2[r7]
            goto L69
        L67:
            r6 = r2[r7]
        L69:
            if (r8 == 0) goto L6e
            java.lang.String r7 = "<<"
            goto L70
        L6e:
            java.lang.String r7 = ">>"
        L70:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object[] r4 = new java.lang.Object[]{r7, r4, r5, r0, r6}
            java.lang.String r5 = "%s 0x%08x %5d %-13s %s"
            java.lang.String r4 = cj.a.h(r5, r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ij.f.a(int, int, int, int, boolean):java.lang.String");
    }
}
