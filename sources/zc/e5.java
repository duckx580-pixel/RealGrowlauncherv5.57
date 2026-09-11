package zc;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'D' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes.dex */
public final class e5 {
    public static final e5 A;
    public static final e5 B;
    public static final e5 C;
    public static final e5 D;
    public static final e5 E;
    public static final e5 F;
    public static final e5 G;
    public static final e5[] H;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final e5 f20806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final e5 f20807t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final e5 f20808u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final e5 f20809v;
    public static final e5 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final e5 f20810x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final e5 f20811y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final e5 f20812z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e5 f20813i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final e5 f20814r;

    /* JADX INFO: Fake field, exist only in values array */
    e5 EF4;

    static {
        e5 e5Var = new e5("UNSPECIFIED", 0);
        f20806s = e5Var;
        e5 e5Var2 = new e5("PORTRAIT", 1);
        f20807t = e5Var2;
        e5 e5Var3 = new e5("LANDSCAPE", 2);
        f20808u = e5Var3;
        e5 e5Var4 = new e5("SQUARE", 3);
        e5 e5Var5 = new e5("NATURAL_PORTRAIT", 4, e5Var2);
        f20809v = e5Var5;
        e5 e5Var6 = new e5("RIGHT_LANDSCAPE", 5, e5Var3, e5Var5);
        w = e5Var6;
        e5 e5Var7 = new e5("REVERSE_PORTRAIT", 6, e5Var2, e5Var5);
        f20810x = e5Var7;
        e5 e5Var8 = new e5("LEFT_LANDSCAPE", 7, e5Var3, e5Var5);
        f20811y = e5Var8;
        e5 e5Var9 = new e5("NATURAL_LANDSCAPE", 8, e5Var3);
        f20812z = e5Var9;
        e5 e5Var10 = new e5("RIGHT_PORTRAIT", 9, e5Var2, e5Var9);
        A = e5Var10;
        e5 e5Var11 = new e5("REVERSE_LANDSCAPE", 10, e5Var3, e5Var9);
        B = e5Var11;
        e5 e5Var12 = new e5("LEFT_PORTRAIT", 11, e5Var2, e5Var9);
        C = e5Var12;
        e5 e5Var13 = new e5("NATURAL_SQUARE", 12, e5Var4);
        D = e5Var13;
        e5 e5Var14 = new e5("RIGHT_SQUARE", 13, e5Var4, e5Var13);
        E = e5Var14;
        e5 e5Var15 = new e5("REVERSE_SQUARE", 14, e5Var4, e5Var13);
        F = e5Var15;
        e5 e5Var16 = new e5("LEFT_SQUARE", 15, e5Var4, e5Var13);
        G = e5Var16;
        H = new e5[]{e5Var, e5Var2, e5Var3, e5Var4, e5Var5, e5Var6, e5Var7, e5Var8, e5Var9, e5Var10, e5Var11, e5Var12, e5Var13, e5Var14, e5Var15, e5Var16};
    }

    public e5(String str, int i10) {
        this.f20813i = this;
        this.f20814r = null;
    }

    public static e5 valueOf(String str) {
        return (e5) Enum.valueOf(e5.class, str);
    }

    public static e5[] values() {
        return (e5[]) H.clone();
    }

    public e5(String str, int i10, e5 e5Var) {
        this.f20813i = e5Var;
        this.f20814r = this;
    }

    public e5(String str, int i10, e5 e5Var, e5 e5Var2) {
        this.f20813i = e5Var;
        this.f20814r = e5Var2;
    }
}
