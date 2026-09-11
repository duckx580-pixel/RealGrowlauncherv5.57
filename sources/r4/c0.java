package r4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f14486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f14488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f14489d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f14490e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f14491f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f14492g;

    public c0(boolean z3, boolean z10, int i10, boolean z11, boolean z12, int i11, int i12) {
        this.f14486a = z3;
        this.f14487b = z10;
        this.f14488c = i10;
        this.f14489d = z11;
        this.f14490e = z12;
        this.f14491f = i11;
        this.f14492g = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f14486a == c0Var.f14486a && this.f14487b == c0Var.f14487b && this.f14488c == c0Var.f14488c && this.f14489d == c0Var.f14489d && this.f14490e == c0Var.f14490e && this.f14491f == c0Var.f14491f && this.f14492g == c0Var.f14492g;
    }

    public final int hashCode() {
        return ((((((((((((((((this.f14486a ? 1 : 0) * 31) + (this.f14487b ? 1 : 0)) * 31) + this.f14488c) * 961) + (this.f14489d ? 1 : 0)) * 31) + (this.f14490e ? 1 : 0)) * 31) + this.f14491f) * 31) + this.f14492g) * 31) - 1) * 31) - 1;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(c0.class.getSimpleName());
        sb2.append("(");
        if (this.f14486a) {
            sb2.append("launchSingleTop ");
        }
        if (this.f14487b) {
            sb2.append("restoreState ");
        }
        int i10 = this.f14492g;
        int i11 = this.f14491f;
        if (i11 != -1 || i10 != -1) {
            sb2.append("anim(enterAnim=0x");
            sb2.append(Integer.toHexString(i11));
            sb2.append(" exitAnim=0x");
            sb2.append(Integer.toHexString(i10));
            sb2.append(" popEnterAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(" popExitAnim=0x");
            sb2.append(Integer.toHexString(-1));
            sb2.append(")");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("sb.toString()", string);
        return string;
    }
}
