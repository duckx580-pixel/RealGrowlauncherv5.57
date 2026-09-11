package l0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ViewGroup {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f9764i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f9765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ArrayList f9766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u5.s f9767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f9768u;

    public k(Context context) {
        super(context);
        this.f9764i = 5;
        ArrayList arrayList = new ArrayList();
        this.f9765r = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f9766s = arrayList2;
        this.f9767t = new u5.s(10);
        setClipChildren(false);
        l lVar = new l(context);
        addView(lVar);
        arrayList.add(lVar);
        arrayList2.add(lVar);
        this.f9768u = 1;
        setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
    }
}
