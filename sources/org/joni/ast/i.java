package org.joni.ast;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j f13168a;

    @Override // org.joni.ast.j
    public final String getName() {
        return "ROOT";
    }

    @Override // org.joni.ast.j
    public final void setChild(j jVar) {
        jVar.parent = this;
        this.f13168a = jVar;
    }

    @Override // org.joni.ast.j
    public final String toString(int i10) {
        return "\n" + j.pad(this.f13168a, 1);
    }
}
