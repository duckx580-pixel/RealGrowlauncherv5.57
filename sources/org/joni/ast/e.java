package org.joni.ast;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f13149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13150c;

    public e(int i10, boolean z3, boolean z10) {
        super(2);
        this.f13148a = i10;
        this.f13149b = z3;
        this.f13150c = z10;
    }

    @Override // org.joni.ast.j
    public final String getName() {
        return "Character Type";
    }

    @Override // org.joni.ast.j
    public final String toString(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("\n  ctype: " + this.f13148a);
        sb2.append(", not: " + this.f13149b);
        sb2.append(", ascii: " + this.f13150c);
        return sb2.toString();
    }
}
