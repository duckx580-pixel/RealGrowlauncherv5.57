package pf;

import android.text.GetChars;
import java.nio.CharBuffer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements CharSequence, GetChars {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final char[] f13381i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f13382r;

    public b(char[] cArr, int i10) {
        this.f13381i = cArr;
        this.f13382r = i10;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f13381i[i10];
    }

    @Override // android.text.GetChars
    public final void getChars(int i10, int i11, char[] cArr, int i12) {
        if (i11 > this.f13382r) {
            throw new StringIndexOutOfBoundsException();
        }
        System.arraycopy(this.f13381i, i10, cArr, i12, i11 - i10);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13382r;
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return CharBuffer.wrap(this.f13381i, i10, i11 - i10);
    }
}
