package uf;

import android.widget.OverScroller;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final OverScroller f17930b;

    public o(c cVar) {
        this.f17930b = new OverScroller(cVar.getContext());
        this.f17929a = cVar;
    }

    public final void a() {
        OverScroller overScroller = this.f17930b;
        int currX = overScroller.getCurrX();
        c cVar = this.f17929a;
        cVar.setScrollX(currX);
        cVar.setScrollY(overScroller.getCurrY());
    }

    public final void b(int i10, int i11, int i12, int i13, int i14) {
        this.f17930b.startScroll(i10, i11, i12, i13, i14);
        a();
    }
}
