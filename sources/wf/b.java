package wf;

import android.widget.ListView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u5.i f19200i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f19201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f19202s;

    public /* synthetic */ b(u5.i iVar, int i10, int i11) {
        this.f19200i = iVar;
        this.f19201r = i10;
        this.f19202s = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u5.i iVar = this.f19200i;
        iVar.getClass();
        int i10 = this.f19201r;
        int i11 = this.f19202s;
        if (i10 == 0 && i11 == 0) {
            ((ListView) iVar.f17666i).setSelectionFromTop(0, 0);
            return;
        }
        while (((ListView) iVar.f17666i).getFirstVisiblePosition() + 1 > i10 && ((ListView) iVar.f17666i).canScrollList(-1)) {
            iVar.m(i11 / 2);
        }
        while (((ListView) iVar.f17666i).getLastVisiblePosition() - 1 < i10 && ((ListView) iVar.f17666i).canScrollList(1)) {
            iVar.m((-i11) / 2);
        }
    }
}
