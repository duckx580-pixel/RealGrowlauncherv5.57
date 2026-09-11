package androidx.lifecycle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public o f1936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t f1937b;

    public final void a(v vVar, n nVar) {
        o oVarA = nVar.a();
        o oVar = this.f1936a;
        kotlin.jvm.internal.l.f("state1", oVar);
        if (oVarA.compareTo(oVar) < 0) {
            oVar = oVarA;
        }
        this.f1936a = oVar;
        this.f1937b.c(vVar, nVar);
        this.f1936a = oVarA;
    }
}
