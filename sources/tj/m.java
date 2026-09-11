package tj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements sj.b {
    public static final m j = new m(null, ek.m.f5553b, 0, 0, false, null, null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f17377a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f17378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f17380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ek.m f17381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f17382f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f17383g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final af.a f17384h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final af.a f17385i;

    public m(m mVar, ek.m mVar2, int i10, int i11, boolean z3, String str, af.a aVar, af.a aVar2) {
        this.f17380d = mVar;
        this.f17381e = mVar2;
        this.f17379c = mVar != null ? 1 + mVar.f17379c : 1;
        this.f17377a = i10;
        this.f17378b = i11;
        this.f17382f = z3;
        this.f17383g = str;
        this.f17384h = aVar;
        this.f17385i = aVar2;
    }

    public final void a(ArrayList arrayList) {
        m mVar = this.f17380d;
        if (mVar != null) {
            mVar.a(arrayList);
        }
        arrayList.add("(" + this.f17381e + ", " + this.f17384h + ", " + this.f17385i + ")");
    }

    public final m b(af.a aVar) {
        if (Objects.equals(this.f17385i, aVar)) {
            return this;
        }
        int i10 = this.f17377a;
        int i11 = this.f17378b;
        m mVar = this.f17380d;
        mVar.getClass();
        return new m(mVar, this.f17381e, i10, i11, this.f17382f, this.f17383g, this.f17384h, aVar);
    }

    public final m c(String str) {
        String str2 = this.f17383g;
        if (str2 != null && str2.equals(str)) {
            return this;
        }
        return new m(this.f17380d, this.f17381e, this.f17377a, this.f17378b, this.f17382f, str, this.f17384h, this.f17385i);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this == mVar) {
                return true;
            }
            m mVar2 = this;
            for (m mVar3 = mVar; mVar2 != mVar3 && (mVar2 != null || mVar3 != null); mVar3 = mVar3.f17380d) {
                if (mVar2 == null || mVar3 == null || mVar2.f17379c != mVar3.f17379c || !Objects.equals(mVar2.f17381e, mVar3.f17381e) || !Objects.equals(mVar2.f17383g, mVar3.f17383g)) {
                    break;
                }
                mVar2 = mVar2.f17380d;
            }
            af.a aVar = this.f17385i;
            for (af.a aVar2 = mVar.f17385i; aVar != aVar2; aVar2 = (af.a) aVar2.f597c) {
                if (aVar == null && aVar2 == null) {
                    return true;
                }
                if (aVar != null && aVar2 != null && aVar.f596b == aVar2.f596b && Objects.equals((String) ((x7.h) aVar.f598d).f19489s, (String) ((x7.h) aVar2.f598d).f19489s)) {
                    aVar = (af.a) aVar.f597c;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((Objects.hashCode(this.f17381e) + ((Objects.hashCode(this.f17380d) + ((Objects.hashCode(this.f17383g) + ((Objects.hashCode(this.f17385i) + 31) * 31)) * 31)) * 31)) * 31) + this.f17379c;
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList();
        a(arrayList);
        StringBuilder sb2 = new StringBuilder("[");
        StringBuilder sb3 = new StringBuilder();
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            while (true) {
                sb3.append((CharSequence) it.next());
                if (!it.hasNext()) {
                    break;
                }
                sb3.append((CharSequence) ", ");
            }
        }
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }
}
