package bi;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z extends q0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final boolean f3047l;

    public z(String str, a0 a0Var) {
        super(str, a0Var, 1);
        this.f3047l = true;
    }

    @Override // bi.q0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof z) {
            zh.g gVar = (zh.g) obj;
            if (this.f3011a.equals(gVar.a())) {
                z zVar = (z) obj;
                if (zVar.f3047l && Arrays.equals((zh.g[]) this.j.getValue(), (zh.g[]) zVar.j.getValue())) {
                    int iF = gVar.f();
                    int i10 = this.f3013c;
                    if (i10 == iF) {
                        if (i10 <= 0) {
                            return true;
                        }
                        int i11 = 0;
                        while (true) {
                            int i12 = i11 + 1;
                            if (!kotlin.jvm.internal.l.a(i(i11).a(), gVar.i(i11).a()) || !kotlin.jvm.internal.l.a(i(i11).e(), gVar.i(i11).e())) {
                                break;
                            }
                            if (i12 >= i10) {
                                return true;
                            }
                            i11 = i12;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // bi.q0
    public final int hashCode() {
        return super.hashCode() * 31;
    }

    @Override // bi.q0, zh.g
    public final boolean isInline() {
        return this.f3047l;
    }
}
