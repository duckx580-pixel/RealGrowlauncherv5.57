package xf;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Comparable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f19746i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ArrayList f19747r;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19746i, ((p) obj).f19746i);
    }
}
