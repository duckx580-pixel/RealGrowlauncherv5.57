package s6;

import java.util.Set;
import rg.q;
import t6.m3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15193i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m3[] f15194r;

    public /* synthetic */ a(m3[] m3VarArr, int i10) {
        this.f15193i = i10;
        this.f15194r = m3VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f15193i) {
            case 0:
                ((Set) h.f15214d.getValue()).removeAll(rg.k.M0(this.f15194r));
                break;
            default:
                q.T((Set) h.f15214d.getValue(), this.f15194r);
                break;
        }
    }
}
