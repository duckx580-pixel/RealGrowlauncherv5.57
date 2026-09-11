package org.joni.ast;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f13151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13152b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13153c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f13154d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public g f13155e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public af.a f13156f;

    public f(int i10, int i11, int i12, byte[] bArr) {
        super(10);
        this.f13151a = bArr;
        this.f13152b = i10;
        this.f13153c = i11;
        this.f13154d = i12;
    }

    @Override // org.joni.ast.j
    public final String getName() {
        return "Call";
    }

    @Override // org.joni.ast.j
    public final void setChild(j jVar) {
        this.f13155e = (g) jVar;
    }

    @Override // org.joni.ast.l, org.joni.ast.j
    public final String toString(int i10) {
        StringBuilder sb2 = new StringBuilder(super.toString(0));
        int i11 = this.f13153c;
        int i12 = this.f13152b;
        sb2.append("\n  name: ".concat(new String(this.f13151a, i12, i11 - i12)));
        sb2.append(", groupNum: " + this.f13154d);
        sb2.append("\n  unsetAddrList: " + j.pad(this.f13156f, 1));
        sb2.append("\n  target: " + j.pad(this.f13155e.getAddressName(), 1));
        return sb2.toString();
    }
}
