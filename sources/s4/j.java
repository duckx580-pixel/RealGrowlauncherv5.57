package s4;

import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements t {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f15156i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ List f15157r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ r4.k f15158s;

    public j(List list, r4.k kVar, boolean z3) {
        this.f15156i = z3;
        this.f15157r = list;
        this.f15158s = kVar;
    }

    @Override // androidx.lifecycle.t
    public final void c(v vVar, androidx.lifecycle.n nVar) {
        boolean z3 = this.f15156i;
        r4.k kVar = this.f15158s;
        List list = this.f15157r;
        if (z3 && !list.contains(kVar)) {
            list.add(kVar);
        }
        if (nVar == androidx.lifecycle.n.ON_START && !list.contains(kVar)) {
            list.add(kVar);
        }
        if (nVar == androidx.lifecycle.n.ON_STOP) {
            list.remove(kVar);
        }
    }
}
