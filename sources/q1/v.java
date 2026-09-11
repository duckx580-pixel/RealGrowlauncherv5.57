package q1;

import android.view.MotionEvent;
import v1.y0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13715i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t2.n f13716r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(t2.n nVar, int i10) {
        super(1);
        this.f13715i = i10;
        this.f13716r = nVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        switch (this.f13715i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                int actionMasked = motionEvent.getActionMasked();
                t2.n nVar = this.f13716r;
                switch (actionMasked) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        zDispatchTouchEvent = nVar.dispatchTouchEvent(motionEvent);
                        break;
                    default:
                        zDispatchTouchEvent = nVar.dispatchGenericMotionEvent(motionEvent);
                        break;
                }
                return Boolean.valueOf(zDispatchTouchEvent);
            default:
                y0 y0Var = (y0) obj;
                w1.t tVar = y0Var instanceof w1.t ? (w1.t) y0Var : null;
                t2.n nVar2 = this.f13716r;
                if (tVar != null) {
                    a0.r rVar = new a0.r(22, tVar, nVar2);
                    q0.f fVar = tVar.D0;
                    if (!fVar.i(rVar)) {
                        fVar.b(rVar);
                    }
                }
                nVar2.removeAllViewsInLayout();
                return qg.o.f13926a;
        }
    }
}
