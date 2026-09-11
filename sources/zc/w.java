package zc;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int[] f21210a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f21211b = {1, 2, 3, 4};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f21212c = {1, 2};

    public static int[] _values() {
        return (int[]) f21210a.clone();
    }

    public static int[] _values$1() {
        return (int[]) f21211b.clone();
    }

    public static int[] _values$2() {
        return (int[]) f21212c.clone();
    }

    public static final k0 a(int i10) {
        int i11 = f0.f20820a[t.g.c(i10)];
        if (i11 == 1) {
            return k0.f20923h;
        }
        if (i11 == 2) {
            return k0.f20921f;
        }
        if (i11 == 3) {
            return k0.f20924i;
        }
        if (i11 == 4) {
            return k0.f20926l;
        }
        throw new AssertionError();
    }

    public static /* synthetic */ int b(int i10) {
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 5;
        }
        throw null;
    }

    public static /* synthetic */ String c(int i10) {
        switch (i10) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }
}
