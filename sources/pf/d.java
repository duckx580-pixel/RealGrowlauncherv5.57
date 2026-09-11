package pf;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements CharacterIterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CharSequence f13386i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13387r;

    public d(CharSequence charSequence) {
        this.f13386i = charSequence;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        d dVar = new d(this.f13386i);
        dVar.f13387r = this.f13387r;
        return dVar;
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f13387r;
        CharSequence charSequence = this.f13386i;
        if (i10 == charSequence.length()) {
            return (char) 65535;
        }
        return charSequence.charAt(this.f13387r);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f13387r = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f13386i.length();
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f13387r;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int length = this.f13386i.length() - 1;
        this.f13387r = length;
        if (length < 0) {
            this.f13387r = 0;
        }
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        this.f13387r++;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f13387r - 1;
        this.f13387r = i10;
        if (i10 < 0) {
            this.f13387r = 0;
        }
        return current();
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        this.f13387r = i10;
        return current();
    }
}
