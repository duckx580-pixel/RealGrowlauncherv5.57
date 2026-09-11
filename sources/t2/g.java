package t2;

import android.os.Parcelable;
import android.util.SparseArray;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16378i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ n f16379r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(n nVar, int i10) {
        super(0);
        this.f16378i = i10;
        this.f16379r = nVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f16378i) {
            case 0:
                this.f16379r.getLayoutNode().x();
                break;
            case 1:
                n nVar = this.f16379r;
                if (nVar.f16384u && nVar.isAttachedToWindow()) {
                    nVar.getSnapshotObserver().a(nVar, b.f16360r, nVar.getUpdate());
                }
                break;
            case 2:
                SparseArray<Parcelable> sparseArray = new SparseArray<>();
                this.f16379r.M.saveHierarchyState(sparseArray);
                break;
            case 3:
                n nVar2 = this.f16379r;
                nVar2.getReleaseBlock().invoke(nVar2.M);
                n.l(nVar2);
                break;
            case 4:
                n nVar3 = this.f16379r;
                nVar3.getResetBlock().invoke(nVar3.M);
                break;
            default:
                n nVar4 = this.f16379r;
                nVar4.getUpdateBlock().invoke(nVar4.M);
                break;
        }
        return o.f13926a;
    }
}
