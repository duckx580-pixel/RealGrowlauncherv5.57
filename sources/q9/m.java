package q9;

import android.view.MotionEvent;
import android.view.View;
import android.widget.AutoCompleteTextView;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m implements View.OnTouchListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ AutoCompleteTextView f13825i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o f13826r;

    public m(o oVar, AutoCompleteTextView autoCompleteTextView) {
        this.f13826r = oVar;
        this.f13825i = autoCompleteTextView;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            o oVar = this.f13826r;
            long j = jCurrentTimeMillis - oVar.f13834l;
            if (j < 0 || j > 300) {
                oVar.j = false;
            }
            o.d(oVar, this.f13825i);
            oVar.j = true;
            oVar.f13834l = System.currentTimeMillis();
        }
        return false;
    }
}
