package androidx.appcompat.widget;

import android.database.DataSetObserver;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 extends DataSetObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o2 f921a;

    public l2(o2 o2Var) {
        this.f921a = o2Var;
    }

    @Override // android.database.DataSetObserver
    public final void onChanged() {
        o2 o2Var = this.f921a;
        if (o2Var.O.isShowing()) {
            o2Var.g();
        }
    }

    @Override // android.database.DataSetObserver
    public final void onInvalidated() {
        this.f921a.dismiss();
    }
}
