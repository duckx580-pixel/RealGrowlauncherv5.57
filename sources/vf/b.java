package vf;

import android.view.View;
import android.widget.PopupWindow;
import pf.l;
import uf.c;
import we.v;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public int A;
    public int B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final PopupWindow f18654i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c f18655r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f18656s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f18657t = new int[2];

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final boolean f18658u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f18659v;
    public final boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c f18660x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f18661y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f18662z;

    public b(c cVar, int i10) {
        this.f18655r = cVar;
        this.f18656s = i10;
        this.f18660x = cVar;
        PopupWindow popupWindow = new PopupWindow();
        this.f18654i = popupWindow;
        popupWindow.setElevation(cVar.getDpUnit() * 8.0f);
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: vf.a
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
                b bVar = this.f18653a;
                if (bVar.f18654i.isShowing()) {
                    bVar.a(false);
                }
            }
        };
        com.google.gson.internal.b bVar = new com.google.gson.internal.b(18, this);
        if (!this.f18659v) {
            cVar.o0(v.class, bVar);
            this.f18659v = true;
        }
        if (c(8) && !this.w) {
            cVar.addOnLayoutChangeListener(onLayoutChangeListener);
            this.w = true;
        }
        this.f18658u = true;
    }

    public final void a(boolean z3) {
        int i10;
        int offsetY;
        PopupWindow popupWindow = this.f18654i;
        if (z3 || popupWindow.isShowing()) {
            boolean zC = c(1);
            c cVar = this.f18655r;
            int offsetX = this.A - (zC ? cVar.getOffsetX() : this.f18661y);
            if (zC) {
                i10 = this.B;
                offsetY = cVar.getOffsetY();
            } else {
                i10 = this.B;
                offsetY = this.f18662z;
            }
            int iMax = i10 - offsetY;
            int iMax2 = this.C + offsetX;
            int iMax3 = this.D + iMax;
            if (!c(2)) {
                offsetX = Math.max(0, Math.min(offsetX, cVar.getWidth()));
                iMax2 = Math.max(0, Math.min(iMax2, cVar.getWidth()));
                iMax = Math.max(0, Math.min(iMax, cVar.getHeight()));
                iMax3 = Math.max(0, Math.min(iMax3, cVar.getHeight()));
                if (iMax >= iMax3 || offsetX >= iMax2) {
                    b();
                    return;
                }
            }
            if (c(8)) {
                try {
                    l cursor = cVar.getCursor();
                    if (cursor != null) {
                        pf.c cVar2 = cursor.f13407c;
                        int i11 = cVar2.f13384b;
                        int i12 = cVar2.f13385c;
                        float fU = (cVar.U() + cVar.f17847z.r(i11, i12)[1]) - cVar.getOffsetX();
                        float offsetY2 = cVar.f17847z.r(i11, i12)[0] - cVar.getOffsetY();
                        if (!Float.isNaN(fU) && !Float.isNaN(offsetY2)) {
                            float fMax = Math.max(1.0f, cVar.getInsertSelectionWidth()) + fU;
                            float rowHeight = cVar.getRowHeight() + offsetY2;
                            if (fU < iMax2 && fMax > offsetX && offsetY2 < iMax3 && rowHeight > iMax) {
                                b();
                                return;
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
            int[] iArr = this.f18657t;
            cVar.getLocationInWindow(iArr);
            int i13 = iMax2 - offsetX;
            int i14 = iMax3 - iMax;
            int i15 = offsetX + iArr[0];
            int i16 = iMax + iArr[1];
            if (popupWindow.isShowing()) {
                popupWindow.update(i15, i16, i13, i14);
            } else if (z3) {
                popupWindow.setHeight(i14);
                popupWindow.setWidth(i13);
                popupWindow.showAtLocation(this.f18660x, 8388659, i15, i16);
            }
        }
    }

    public void b() {
        PopupWindow popupWindow = this.f18654i;
        if (popupWindow.isShowing()) {
            popupWindow.dismiss();
        }
    }

    public final boolean c(int i10) {
        if (Integer.bitCount(i10) == 1) {
            return (i10 & this.f18656s) != 0;
        }
        throw new IllegalArgumentException("Not a valid feature integer");
    }
}
