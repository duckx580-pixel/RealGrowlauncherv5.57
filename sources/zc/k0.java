package zc;

/* JADX INFO: loaded from: classes.dex */
public abstract class k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final h0 f20919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final h0 f20920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h0 f20921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final h0 f20922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h0 f20923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final h0 f20924i;
    public static final h0 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final h0 f20925k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final h0 f20926l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f20927a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i0 f20928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20929c;

    static {
        int i10 = 1;
        f20919d = new h0(i10, 4, Boolean.class);
        Class<Integer> cls = Integer.class;
        f20920e = new h0(i10, 8, cls);
        f20921f = new h0(4, 0, cls);
        Class<Long> cls2 = Long.class;
        f20922g = new h0(i10, 1, cls2);
        f20923h = new h0(i10, 2, cls2);
        int i11 = 2;
        f20924i = new h0(i11, 3, cls2);
        j = new h0(i11, 5, Double.class);
        int i12 = 3;
        f20925k = new h0(i12, 6, String.class);
        f20926l = new h0(i12, 7, p4.class);
    }

    public k0(int i10, Class cls) {
        this.f20929c = i10;
        this.f20927a = cls;
    }

    public int a(int i10, Object obj) {
        int iB = b(obj);
        if (this.f20929c == 3) {
            iB += m0.a(iB);
        }
        return m0.a(i10 << 3) + iB;
    }

    public abstract int b(Object obj);

    public abstract Object c(l0 l0Var);

    public final k0 d() {
        i0 i0Var = this.f20928b;
        if (i0Var != null) {
            return i0Var;
        }
        i0 i0Var2 = new i0(this, this.f20929c);
        this.f20928b = i0Var2;
        return i0Var2;
    }

    public void e(m0 m0Var, int i10, Object obj) {
        int i11 = this.f20929c;
        m0Var.d((i10 << 3) | w.b(i11));
        if (i11 == 3) {
            m0Var.d(b(obj));
        }
        f(m0Var, obj);
    }

    public abstract void f(m0 m0Var, Object obj);
}
