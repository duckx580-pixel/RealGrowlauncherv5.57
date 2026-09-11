package sk;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import f0.c2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends cd.c {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f15990s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f15991t;

    public v(int i10, int i11) {
        this.f15990s = i10;
        this.f15991t = i11;
    }

    public final Object clone() {
        v vVar = new v(this.f15990s, this.f15991t);
        c2 c2Var = (c2) this.f3470r;
        if (c2Var != null) {
            vVar.f3470r = c2Var.g();
        }
        return vVar;
    }

    @Override // cd.c
    public final void l() {
        this.f15991t = -1;
        this.f15990s = -1;
    }

    @Override // cd.c
    public final int n(int i10) {
        if (i10 == 0) {
            return this.f15990s;
        }
        throw new IndexOutOfBoundsException(k0.g.d(i10, PredefinedUICustomizationFont.defaultFamily));
    }

    @Override // cd.c
    public final int o(int i10) {
        if (i10 == 0) {
            return this.f15991t;
        }
        throw new IndexOutOfBoundsException(k0.g.d(i10, PredefinedUICustomizationFont.defaultFamily));
    }

    @Override // cd.c
    public final int p() {
        return 1;
    }

    @Override // cd.c
    public final int r(int i10, int i11) {
        if (i10 != 0) {
            throw new IndexOutOfBoundsException(k0.g.d(i10, PredefinedUICustomizationFont.defaultFamily));
        }
        this.f15990s = i11;
        return i11;
    }

    @Override // cd.c
    public final int s(int i10, int i11) {
        if (i10 != 0) {
            throw new IndexOutOfBoundsException(k0.g.d(i10, PredefinedUICustomizationFont.defaultFamily));
        }
        this.f15991t = i11;
        return i11;
    }
}
