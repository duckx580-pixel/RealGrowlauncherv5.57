package pf;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13384b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13385c;

    public c(int i10, int i11, int i12) {
        this.f13383a = i12;
        this.f13384b = i10;
        this.f13385c = i11;
    }

    public final c a() {
        c cVar = new c();
        cVar.f13383a = this.f13383a;
        cVar.f13384b = this.f13384b;
        cVar.f13385c = this.f13385c;
        return cVar;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            if (cVar.f13385c == this.f13385c && cVar.f13384b == this.f13384b && cVar.f13383a == this.f13383a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f13383a), Integer.valueOf(this.f13384b), Integer.valueOf(this.f13385c));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharPosition(line = ");
        sb2.append(this.f13384b);
        sb2.append(",column = ");
        sb2.append(this.f13385c);
        sb2.append(",index = ");
        return k0.g.i(sb2, this.f13383a, ")");
    }
}
