package a1;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f190a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f191b;

    public f(n nVar, n nVar2) {
        this.f190a = nVar;
        this.f191b = nVar2;
    }

    @Override // a1.n
    public final Object a(Object obj, eh.e eVar) {
        return this.f191b.a(this.f190a.a(obj, eVar), eVar);
    }

    @Override // a1.n
    public final boolean e(eh.c cVar) {
        return this.f190a.e(cVar) && this.f191b.e(cVar);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.l.a(this.f190a, fVar.f190a) && kotlin.jvm.internal.l.a(this.f191b, fVar.f191b);
    }

    public final int hashCode() {
        return (this.f191b.hashCode() * 31) + this.f190a.hashCode();
    }

    public final String toString() {
        return k0.g.k(new StringBuilder("["), (String) a(PredefinedUICustomizationFont.defaultFamily, e.f189i), ']');
    }
}
