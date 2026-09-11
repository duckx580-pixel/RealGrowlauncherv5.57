package o0;

import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 implements Iterable, fh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r1 f12568i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f12569r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f12570s;

    public s1(r1 r1Var, int i10, int i11) {
        this.f12568i = r1Var;
        this.f12569r = i10;
        this.f12570s = i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i10;
        ArrayList arrayList;
        int iP;
        r1 r1Var = this.f12568i;
        if (r1Var.w != this.f12570s) {
            throw new ConcurrentModificationException();
        }
        HashMap map = r1Var.f12566y;
        c cVar = null;
        int i11 = this.f12569r;
        if (map != null) {
            if (r1Var.f12564v) {
                p.v("use active SlotWriter to crate an anchor for location instead");
                throw null;
            }
            if (i11 >= 0 && i11 < (i10 = r1Var.f12560r) && (iP = p.P((arrayList = r1Var.f12565x), i11, i10)) >= 0) {
                cVar = (c) arrayList.get(iP);
            }
            if (cVar != null) {
            }
        }
        return new g0(r1Var, i11 + 1, r1Var.f12559i[(i11 * 5) + 3] + i11);
    }
}
