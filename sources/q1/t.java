package q1;

import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13709i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ u f13710r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(u uVar, int i10) {
        super(1);
        this.f13709i = i10;
        this.f13710r = uVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f13709i) {
            case 0:
                MotionEvent motionEvent = (MotionEvent) obj;
                v vVar = this.f13710r.f13711a;
                if (vVar != null) {
                    vVar.invoke(motionEvent);
                    return qg.o.f13926a;
                }
                kotlin.jvm.internal.l.l("onTouchEvent");
                throw null;
            default:
                MotionEvent motionEvent2 = (MotionEvent) obj;
                v vVar2 = this.f13710r.f13711a;
                if (vVar2 != null) {
                    vVar2.invoke(motionEvent2);
                    return qg.o.f13926a;
                }
                kotlin.jvm.internal.l.l("onTouchEvent");
                throw null;
        }
    }
}
