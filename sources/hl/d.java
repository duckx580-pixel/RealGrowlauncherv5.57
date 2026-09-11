package hl;

import androidx.appcompat.widget.w3;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import dl.e;
import dl.f;
import java.io.IOException;
import java.io.StringReader;
import java.util.Arrays;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringReader f7738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char[] f7739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f7740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f7741d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f7743f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f7742e = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f7744g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f7745h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7746i = 0;
    public int j = 0;

    public d(w3 w3Var, StringReader stringReader) {
        w3Var.getClass();
        this.f7740c = new int[0];
        this.f7741d = 0;
        this.f7738a = stringReader;
        this.f7743f = false;
        this.f7739b = new char[1025];
    }

    public final boolean a(int i10) {
        if (!this.f7743f && this.f7742e + i10 >= this.f7741d) {
            StringReader stringReader = this.f7738a;
            char[] cArr = this.f7739b;
            try {
                int i11 = stringReader.read(cArr);
                if (i11 <= 0) {
                    this.f7743f = true;
                } else {
                    int i12 = this.f7741d;
                    int i13 = this.f7742e;
                    int i14 = i12 - i13;
                    this.f7740c = Arrays.copyOfRange(this.f7740c, i13, i12 + i11);
                    int i15 = i11 - 1;
                    if (Character.isHighSurrogate(cArr[i15])) {
                        if (stringReader.read(cArr, i11, 1) == -1) {
                            throw new e(this.f7744g + i11, cArr[i15], "The last char is HighSurrogate (no LowSurrogate detected).");
                        }
                        i11++;
                    }
                    int iCharCount = 0;
                    while (iCharCount < i11) {
                        int iCodePointAt = Character.codePointAt(cArr, iCharCount);
                        this.f7740c[i14] = iCodePointAt;
                        if ((iCodePointAt < 32 || iCodePointAt > 126) && iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 13 && iCodePointAt != 133 && ((iCodePointAt < 160 || iCodePointAt > 55295) && ((iCodePointAt < 57344 || iCodePointAt > 65533) && (iCodePointAt < 65536 || iCodePointAt > 1114111)))) {
                            throw new e(this.f7744g + i14, iCodePointAt, "special characters are not allowed");
                        }
                        iCharCount += Character.charCount(iCodePointAt);
                        i14++;
                    }
                    this.f7741d = i14;
                    this.f7742e = 0;
                }
            } catch (IOException e8) {
                throw new f(e8);
            }
        }
        return this.f7742e + i10 < this.f7741d;
    }

    public final void b(int i10) {
        for (int i11 = 0; i11 < i10 && a(0); i11++) {
            int[] iArr = this.f7740c;
            int i12 = this.f7742e;
            this.f7742e = i12 + 1;
            int i13 = iArr[i12];
            this.f7744g++;
            this.f7745h++;
            if (yk.b.f20458b.b(i13) || (i13 == 13 && a(0) && this.f7740c[this.f7742e] != 10)) {
                this.f7746i++;
                this.j = 0;
            } else if (i13 != 65279) {
                this.j++;
            }
        }
    }

    public final Optional c() {
        return Optional.of(new dl.d(this.f7746i, this.j, this.f7740c, this.f7742e));
    }

    public final int d() {
        if (a(0)) {
            return this.f7740c[this.f7742e];
        }
        return 0;
    }

    public final int e(int i10) {
        if (a(i10)) {
            return this.f7740c[this.f7742e + i10];
        }
        return 0;
    }

    public final String f(int i10) {
        if (i10 == 0) {
            return PredefinedUICustomizationFont.defaultFamily;
        }
        if (a(i10)) {
            return new String(this.f7740c, this.f7742e, i10);
        }
        int[] iArr = this.f7740c;
        int i11 = this.f7742e;
        return new String(iArr, i11, Math.min(i10, this.f7741d - i11));
    }

    public final String g(int i10) {
        String strF = f(i10);
        this.f7742e += i10;
        this.f7744g += i10;
        this.f7745h += i10;
        this.j += i10;
        return strF;
    }
}
