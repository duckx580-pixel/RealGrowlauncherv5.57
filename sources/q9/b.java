package q9;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13805a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f13806b;

    public /* synthetic */ b(p pVar, int i10) {
        this.f13805a = i10;
        this.f13806b = pVar;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z3) {
        switch (this.f13805a) {
            case 0:
                g gVar = (g) this.f13806b;
                gVar.e(g.d(gVar));
                break;
            default:
                o oVar = (o) this.f13806b;
                oVar.f13840a.setEndIconActivated(z3);
                if (!z3) {
                    oVar.h(false);
                    oVar.j = false;
                }
                break;
        }
    }
}
