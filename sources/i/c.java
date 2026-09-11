package i;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ g f7789i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f7790r;

    public c(d dVar, g gVar) {
        this.f7790r = dVar;
        this.f7789i = gVar;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j) {
        d dVar = this.f7790r;
        DialogInterface.OnClickListener onClickListener = dVar.j;
        g gVar = this.f7789i;
        onClickListener.onClick(gVar.f7818b, i10);
        if (dVar.f7802l) {
            return;
        }
        gVar.f7818b.dismiss();
    }
}
