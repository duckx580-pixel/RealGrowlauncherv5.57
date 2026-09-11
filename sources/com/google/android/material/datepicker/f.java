package com.google.android.material.datepicker;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.c1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends LinearLayoutManager {
    public final /* synthetic */ int E;
    public final /* synthetic */ j F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, int i10, int i11) {
        super(i10);
        this.F = jVar;
        this.E = i11;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.q0
    public final void t0(RecyclerView recyclerView, int i10) {
        t tVar = new t(recyclerView.getContext());
        tVar.f2276a = i10;
        u0(tVar);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void w0(c1 c1Var, int[] iArr) {
        int i10 = this.E;
        j jVar = this.F;
        if (i10 == 0) {
            iArr[0] = jVar.f4209r0.getWidth();
            iArr[1] = jVar.f4209r0.getWidth();
        } else {
            iArr[0] = jVar.f4209r0.getHeight();
            iArr[1] = jVar.f4209r0.getHeight();
        }
    }
}
