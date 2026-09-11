package y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y0 f19958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19959b;

    public i0(y0 y0Var, int i10) {
        this.f19958a = y0Var;
        this.f19959b = i10;
    }

    @Override // y.y0
    public final int a(q2.b bVar, q2.l lVar) {
        if (((lVar == q2.l.f13752i ? 4 : 1) & this.f19959b) != 0) {
            return this.f19958a.a(bVar, lVar);
        }
        return 0;
    }

    @Override // y.y0
    public final int b(q2.b bVar, q2.l lVar) {
        if (((lVar == q2.l.f13752i ? 8 : 2) & this.f19959b) != 0) {
            return this.f19958a.b(bVar, lVar);
        }
        return 0;
    }

    @Override // y.y0
    public final int c(q2.b bVar) {
        if ((this.f19959b & 32) != 0) {
            return this.f19958a.c(bVar);
        }
        return 0;
    }

    @Override // y.y0
    public final int d(q2.b bVar) {
        if ((this.f19959b & 16) != 0) {
            return this.f19958a.d(bVar);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i0)) {
            return false;
        }
        i0 i0Var = (i0) obj;
        return kotlin.jvm.internal.l.a(this.f19958a, i0Var.f19958a) && this.f19959b == i0Var.f19959b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f19959b) + (this.f19958a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f19958a);
        sb2.append(" only ");
        StringBuilder sb3 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb4 = new StringBuilder();
        int i10 = this.f19959b;
        int i11 = vd.a.f18646a;
        if ((i10 & i11) == i11) {
            vd.a.I(sb4, "Start");
        }
        int i12 = vd.a.f18648c;
        if ((i10 & i12) == i12) {
            vd.a.I(sb4, "Left");
        }
        if ((i10 & 16) == 16) {
            vd.a.I(sb4, "Top");
        }
        int i13 = vd.a.f18647b;
        if ((i10 & i13) == i13) {
            vd.a.I(sb4, "End");
        }
        int i14 = vd.a.f18649d;
        if ((i10 & i14) == i14) {
            vd.a.I(sb4, "Right");
        }
        if ((i10 & 32) == 32) {
            vd.a.I(sb4, "Bottom");
        }
        String string = sb4.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        sb3.append(string);
        sb3.append(')');
        sb2.append((Object) sb3.toString());
        sb2.append(')');
        return sb2.toString();
    }
}
