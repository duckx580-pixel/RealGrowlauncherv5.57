package j$.time.format;

/* JADX INFO: loaded from: classes2.dex */
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f8532a;

    public c(char c10) {
        this.f8532a = c10;
    }

    @Override // j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        sb2.append(this.f8532a);
        return true;
    }

    @Override // j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        if (i10 == charSequence.length()) {
            return ~i10;
        }
        char cCharAt = charSequence.charAt(i10);
        char c10 = this.f8532a;
        return (cCharAt == c10 || (!pVar.f8569b && (Character.toUpperCase(cCharAt) == Character.toUpperCase(c10) || Character.toLowerCase(cCharAt) == Character.toLowerCase(c10)))) ? i10 + 1 : ~i10;
    }

    public final String toString() {
        char c10 = this.f8532a;
        if (c10 == '\'') {
            return "''";
        }
        return "'" + c10 + "'";
    }
}
