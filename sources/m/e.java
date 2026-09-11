package m;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f10257a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f10258b;

    public e(f fVar) {
        this.f10258b = fVar;
        a();
    }

    public final void a() {
        j jVar = this.f10258b.f10261s;
        l lVar = jVar.f10292v;
        if (lVar != null) {
            jVar.i();
            ArrayList arrayList = jVar.j;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((l) arrayList.get(i10)) == lVar) {
                    this.f10257a = i10;
                    return;
                }
            }
        }
        this.f10257a = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final l getItem(int i10) {
        f fVar = this.f10258b;
        j jVar = fVar.f10261s;
        jVar.i();
        ArrayList arrayList = jVar.j;
        fVar.getClass();
        int i11 = this.f10257a;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (l) arrayList.get(i10);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        f fVar = this.f10258b;
        j jVar = fVar.f10261s;
        jVar.i();
        int size = jVar.j.size();
        fVar.getClass();
        return this.f10257a < 0 ? size : size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public final View getView(int i10, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f10258b.f10260r.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((x) view).a(getItem(i10));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
