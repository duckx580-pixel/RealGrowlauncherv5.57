package com.google.gson.internal;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f4460a;

    static {
        int i10;
        String property = System.getProperty("java.version");
        try {
            String[] strArrSplit = property.split("[._]", 3);
            i10 = Integer.parseInt(strArrSplit[0]);
            if (i10 == 1 && strArrSplit.length > 1) {
                i10 = Integer.parseInt(strArrSplit[1]);
            }
        } catch (NumberFormatException unused) {
            i10 = -1;
        }
        if (i10 == -1) {
            try {
                StringBuilder sb2 = new StringBuilder();
                for (int i11 = 0; i11 < property.length(); i11++) {
                    char cCharAt = property.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        break;
                    }
                    sb2.append(cCharAt);
                }
                i10 = Integer.parseInt(sb2.toString());
            } catch (NumberFormatException unused2) {
                i10 = -1;
            }
        }
        if (i10 == -1) {
            i10 = 6;
        }
        f4460a = i10;
    }
}
