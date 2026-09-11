package d2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p f4876b = new p(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f4877a;

    public p() {
        this.f4877a = true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            return this.f4877a == ((p) obj).f4877a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f4877a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f4877a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public p(boolean z3) {
        this.f4877a = z3;
    }
}
