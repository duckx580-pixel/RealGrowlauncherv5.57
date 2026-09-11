package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f16470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f16472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t f16473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f16474e;

    public e(s sVar, s sVar2, s sVar3, t tVar, t tVar2) {
        kotlin.jvm.internal.l.f("refresh", sVar);
        kotlin.jvm.internal.l.f("prepend", sVar2);
        kotlin.jvm.internal.l.f("append", sVar3);
        kotlin.jvm.internal.l.f("source", tVar);
        this.f16470a = sVar;
        this.f16471b = sVar2;
        this.f16472c = sVar3;
        this.f16473d = tVar;
        this.f16474e = tVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!e.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.l.d("null cannot be cast to non-null type androidx.paging.CombinedLoadStates", obj);
        e eVar = (e) obj;
        return kotlin.jvm.internal.l.a(this.f16470a, eVar.f16470a) && kotlin.jvm.internal.l.a(this.f16471b, eVar.f16471b) && kotlin.jvm.internal.l.a(this.f16472c, eVar.f16472c) && kotlin.jvm.internal.l.a(this.f16473d, eVar.f16473d) && kotlin.jvm.internal.l.a(this.f16474e, eVar.f16474e);
    }

    public final int hashCode() {
        int iHashCode = (this.f16473d.hashCode() + ((this.f16472c.hashCode() + ((this.f16471b.hashCode() + (this.f16470a.hashCode() * 31)) * 31)) * 31)) * 31;
        t tVar = this.f16474e;
        return iHashCode + (tVar != null ? tVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.f16470a + ", prepend=" + this.f16471b + ", append=" + this.f16472c + ", source=" + this.f16473d + ", mediator=" + this.f16474e + ')';
    }
}
