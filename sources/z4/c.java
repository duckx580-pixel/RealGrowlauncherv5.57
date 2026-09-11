package z4;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f20598i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f20599r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final String f20600s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f20601t;

    public c(String str, int i10, int i11, String str2) {
        this.f20598i = i10;
        this.f20599r = i11;
        this.f20600s = str;
        this.f20601t = str2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        c cVar = (c) obj;
        l.f("other", cVar);
        int i10 = this.f20598i - cVar.f20598i;
        return i10 == 0 ? this.f20599r - cVar.f20599r : i10;
    }
}
