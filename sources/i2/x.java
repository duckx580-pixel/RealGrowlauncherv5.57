package i2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements Comparable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final x f8055r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final x f8056s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final x f8057t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final x f8058u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final x f8059v;
    public static final x w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final x f8060x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final x f8061y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f8062i;

    static {
        x xVar = new x(100);
        x xVar2 = new x(200);
        x xVar3 = new x(300);
        x xVar4 = new x(400);
        f8055r = xVar4;
        x xVar5 = new x(500);
        f8056s = xVar5;
        x xVar6 = new x(600);
        f8057t = xVar6;
        x xVar7 = new x(700);
        x xVar8 = new x(800);
        x xVar9 = new x(900);
        f8058u = xVar4;
        f8059v = xVar5;
        w = xVar6;
        f8060x = xVar7;
        f8061y = xVar8;
        sb.c.D(xVar, xVar2, xVar3, xVar4, xVar5, xVar6, xVar7, xVar8, xVar9);
    }

    public x(int i10) {
        this.f8062i = i10;
        if (1 > i10 || i10 >= 1001) {
            throw new IllegalArgumentException(k0.g.d(i10, "Font weight can be in range [1, 1000]. Current value: ").toString());
        }
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(x xVar) {
        return kotlin.jvm.internal.l.g(this.f8062i, xVar.f8062i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            return this.f8062i == ((x) obj).f8062i;
        }
        return false;
    }

    public final int hashCode() {
        return this.f8062i;
    }

    public final String toString() {
        return s.h0.g(new StringBuilder("FontWeight(weight="), this.f8062i, ')');
    }
}
