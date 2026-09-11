package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.q0;
import java.util.Calendar;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4200i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ r f4201r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f4202s;

    public /* synthetic */ i(j jVar, r rVar, int i10) {
        this.f4200i = i10;
        this.f4202s = jVar;
        this.f4201r = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f4200i) {
            case 0:
                j jVar = this.f4202s;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar.f4209r0.getLayoutManager();
                View viewI0 = linearLayoutManager.I0(0, linearLayoutManager.v(), false);
                int iD = (viewI0 == null ? -1 : q0.D(viewI0)) + 1;
                if (iD < jVar.f4209r0.getAdapter().getItemCount()) {
                    Calendar calendarA = v.a(this.f4201r.f4233a.f4185i.f4219i);
                    calendarA.add(2, iD);
                    jVar.I(new n(calendarA));
                }
                break;
            default:
                j jVar2 = this.f4202s;
                int iG0 = ((LinearLayoutManager) jVar2.f4209r0.getLayoutManager()).G0() - 1;
                if (iG0 >= 0) {
                    Calendar calendarA2 = v.a(this.f4201r.f4233a.f4185i.f4219i);
                    calendarA2.add(2, iG0);
                    jVar2.I(new n(calendarA2));
                }
                break;
        }
    }
}
