package pf;

import android.text.GetChars;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements CharSequence, GetChars, Cloneable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char[] f13400i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13401r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13402s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public o f13403t;

    public i(i iVar) {
        this(iVar.f13401r + 16);
        int i10 = iVar.f13401r;
        this.f13401r = i10;
        this.f13402s = iVar.f13402s;
        this.f13403t = iVar.f13403t;
        System.arraycopy(iVar.f13400i, 0, this.f13400i, 0, i10);
    }

    public final void a(int i10) {
        if (i10 < 0 || i10 > this.f13401r) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "index = ", ", length = ");
            sbN.append(this.f13401r);
            throw new StringIndexOutOfBoundsException(sbN.toString());
        }
    }

    public final void b(int i10, int i11) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        int i12 = this.f13401r;
        if (i11 > i12) {
            i11 = i12;
        }
        if (i10 > i11) {
            throw new StringIndexOutOfBoundsException();
        }
        int i13 = i11 - i10;
        if (i13 > 0) {
            for (int i14 = i10; i14 < i11; i14++) {
                if (xd.c.j(this.f13400i[i14])) {
                    this.f13402s--;
                }
            }
            char[] cArr = this.f13400i;
            System.arraycopy(cArr, i10 + i13, cArr, i10, this.f13401r - i11);
            this.f13401r -= i13;
        }
    }

    public final void c(int i10) {
        char[] cArr = this.f13400i;
        if (cArr.length < i10) {
            char[] cArr2 = new char[cArr.length * 2 < i10 ? i10 + 2 : cArr.length * 2];
            System.arraycopy(cArr, 0, cArr2, 0, this.f13401r);
            this.f13400i = cArr2;
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        if (i10 < this.f13401r) {
            return this.f13400i[i10];
        }
        if (d().f13423r > 0) {
            return d().f13422i.charAt(i10 - this.f13401r);
        }
        return '\n';
    }

    public final o d() {
        o oVar = this.f13403t;
        return oVar == null ? o.NONE : oVar;
    }

    public final void e(int i10, int i11, int i12, CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "null";
        }
        if (i10 < 0 || i10 > this.f13401r) {
            throw new IndexOutOfBoundsException(k0.g.d(i10, "dstOffset "));
        }
        if (i11 < 0 || i12 < 0 || i11 > i12 || i12 > charSequence.length()) {
            StringBuilder sbO = android.support.v4.media.session.a.o("start ", i11, ", end ", i12, ", s.length() ");
            sbO.append(charSequence.length());
            throw new IndexOutOfBoundsException(sbO.toString());
        }
        int i13 = i12 - i11;
        c(this.f13401r + i13);
        char[] cArr = this.f13400i;
        System.arraycopy(cArr, i10, cArr, i10 + i13, this.f13401r - i10);
        while (i11 < i12) {
            char cCharAt = charSequence.charAt(i11);
            int i14 = i10 + 1;
            this.f13400i[i10] = cCharAt;
            if (xd.c.j(cCharAt)) {
                this.f13402s++;
            }
            i11++;
            i10 = i14;
        }
        this.f13401r += i13;
    }

    @Override // java.lang.CharSequence
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public final i subSequence(int i10, int i11) {
        a(i10);
        a(i11);
        if (i11 < i10) {
            throw new StringIndexOutOfBoundsException("start is greater than end");
        }
        int i12 = i11 - i10;
        char[] cArr = new char[i12 + 16];
        System.arraycopy(this.f13400i, i10, cArr, 0, i12);
        i iVar = new i();
        iVar.f13400i = cArr;
        iVar.f13401r = i12;
        if (this.f13402s > 0) {
            for (int i13 = 0; i13 < iVar.f13401r; i13++) {
                if (xd.c.j(cArr[i13])) {
                    iVar.f13402s++;
                }
            }
        }
        return iVar;
    }

    @Override // android.text.GetChars
    public final void getChars(int i10, int i11, char[] cArr, int i12) {
        if (i10 < 0) {
            throw new StringIndexOutOfBoundsException(i10);
        }
        if (i11 < 0 || i11 > this.f13401r) {
            throw new StringIndexOutOfBoundsException(i11);
        }
        if (i10 > i11) {
            throw new StringIndexOutOfBoundsException("srcBegin > srcEnd");
        }
        System.arraycopy(this.f13400i, i10, cArr, i12, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13401r;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return new String(this.f13400i, 0, this.f13401r);
    }

    public i(int i10) {
        this.f13401r = 0;
        this.f13400i = new char[i10];
    }

    public i(Object obj) {
        this.f13401r = 0;
        this.f13400i = new char[32];
    }
}
