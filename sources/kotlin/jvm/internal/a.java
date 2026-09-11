package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements h, Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Object f9648i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f9649r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f9650s = 2;

    public a(Object obj) {
        this.f9648i = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f9649r == aVar.f9649r && this.f9650s == aVar.f9650s && this.f9648i.equals(aVar.f9648i) && a6.j.class.equals(a6.j.class);
    }

    @Override // kotlin.jvm.internal.h
    public final int getArity() {
        return 2;
    }

    public final int hashCode() {
        return ((((((((((a6.j.class.hashCode() + (this.f9648i.hashCode() * 31)) * 31) - 584535736) * 31) + 1554688608) * 31) + (this.f9649r ? 1231 : 1237)) * 31) + 2) * 31) + this.f9650s;
    }

    public final String toString() {
        y.f9668a.getClass();
        return z.a(this);
    }
}
