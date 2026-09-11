package pf;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class r implements CharSequence {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f13429i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13430r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f13431s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public wf.j f13432t;

    public r(int i10, int i11, CharSequence charSequence) {
        Objects.requireNonNull(charSequence);
        this.f13429i = charSequence;
        this.f13430r = i10;
        this.f13431s = i11;
        if (i10 > i11) {
            throw new IllegalArgumentException("start > end");
        }
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 > charSequence.length()) {
            throw new StringIndexOutOfBoundsException(i11);
        }
    }

    public final void a() {
        wf.j jVar = this.f13432t;
        if (jVar != null) {
            if (jVar.w.G != jVar.f19227u || jVar.f19228v) {
                throw new cf.c();
            }
        }
    }

    @Override // java.lang.CharSequence
    public char charAt(int i10) {
        if (i10 < 0 || i10 >= length()) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        a();
        return this.f13429i.charAt(this.f13430r + i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        a();
        return this.f13431s - this.f13430r;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        if (i10 < 0 || i10 >= length()) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 < 0 || i11 >= length()) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        a();
        int i12 = this.f13430r;
        r rVar = new r(i10 + i12, i12 + i11, this.f13429i);
        rVar.f13432t = this.f13432t;
        return rVar;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13429i.subSequence(this.f13430r, this.f13431s).toString();
    }
}
