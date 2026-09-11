package w1;

import android.os.SystemClock;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18930i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f18931r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, int i10) {
        super(0);
        this.f18930i = i10;
        this.f18931r = tVar;
    }

    @Override // eh.a
    public final Object invoke() {
        int actionMasked;
        switch (this.f18930i) {
            case 0:
                t tVar = this.f18931r;
                MotionEvent motionEvent = tVar.A0;
                if (motionEvent != null && ((actionMasked = motionEvent.getActionMasked()) == 7 || actionMasked == 9)) {
                    tVar.B0 = SystemClock.uptimeMillis();
                    tVar.post(tVar.E0);
                }
                return qg.o.f13926a;
            default:
                return this.f18931r.get_viewTreeOwners();
        }
    }
}
