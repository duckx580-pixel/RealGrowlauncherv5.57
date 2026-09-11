package m;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f10265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10266b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f10267c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f10268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final LayoutInflater f10269e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f10270f;

    public g(j jVar, LayoutInflater layoutInflater, boolean z3, int i10) {
        this.f10268d = z3;
        this.f10269e = layoutInflater;
        this.f10265a = jVar;
        this.f10270f = i10;
        a();
    }

    public final void a() {
        j jVar = this.f10265a;
        l lVar = jVar.f10292v;
        if (lVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((l) arrayList.get(i10)) == lVar) {
                    this.f10266b = i10;
                    return;
                }
            }
        }
        this.f10266b = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l getItem(int i10) {
        ArrayList arrayListL;
        boolean z3 = this.f10268d;
        j jVar = this.f10265a;
        if (z3) {
            jVar.i();
            arrayListL = jVar.j;
        } else {
            arrayListL = jVar.l();
        }
        int i11 = this.f10266b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (l) arrayListL.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList arrayListL;
        boolean z3 = this.f10268d;
        j jVar = this.f10265a;
        if (z3) {
            jVar.i();
            arrayListL = jVar.j;
        } else {
            arrayListL = jVar.l();
        }
        return this.f10266b < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        boolean z3 = false;
        if (view == null) {
            view = this.f10269e.inflate(this.f10270f, viewGroup, false);
        }
        int i11 = getItem(i10).f10298b;
        int i12 = i10 - 1;
        int i13 = i12 >= 0 ? getItem(i12).f10298b : i11;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f10265a.m() && i11 != i13) {
            z3 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z3);
        x xVar = (x) view;
        if (this.f10267c) {
            listMenuItemView.setForceShowIcon(true);
        }
        xVar.a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
