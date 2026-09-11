package t4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final t f16628d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f16629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f16630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f16631c;

    static {
        r rVar = r.f16616c;
        f16628d = new t(rVar, rVar, rVar);
    }

    public t(s sVar, s sVar2, s sVar3) {
        this.f16629a = sVar;
        this.f16630b = sVar2;
        this.f16631c = sVar3;
    }

    public static t a(t tVar, int i10) {
        int i11 = i10 & 1;
        s sVar = r.f16616c;
        s sVar2 = i11 != 0 ? tVar.f16629a : sVar;
        s sVar3 = (i10 & 2) != 0 ? tVar.f16630b : sVar;
        if ((i10 & 4) != 0) {
            sVar = tVar.f16631c;
        }
        return new t(sVar2, sVar3, sVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.l.a(this.f16629a, tVar.f16629a) && kotlin.jvm.internal.l.a(this.f16630b, tVar.f16630b) && kotlin.jvm.internal.l.a(this.f16631c, tVar.f16631c);
    }

    public final int hashCode() {
        return this.f16631c.hashCode() + ((this.f16630b.hashCode() + (this.f16629a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.f16629a + ", prepend=" + this.f16630b + ", append=" + this.f16631c + ')';
    }
}
