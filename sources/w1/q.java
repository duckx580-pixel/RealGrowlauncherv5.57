package w1;

import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18889i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t f18890r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(t tVar, int i10) {
        super(1);
        this.f18889i = i10;
        this.f18890r = tVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        e1.b bVar;
        switch (this.f18889i) {
            case 0:
                eh.a aVar = (eh.a) obj;
                q0.f fVar = this.f18890r.D0;
                if (!fVar.i(aVar)) {
                    fVar.b(aVar);
                }
                return qg.o.f13926a;
            case 1:
                KeyEvent keyEvent = ((o1.b) obj).f12644a;
                long jD = w9.a.d(keyEvent.getKeyCode());
                if (o1.a.a(jD, o1.a.f12637h)) {
                    bVar = new e1.b(keyEvent.isShiftPressed() ? 2 : 1);
                } else if (o1.a.a(jD, o1.a.f12635f)) {
                    bVar = new e1.b(4);
                } else if (o1.a.a(jD, o1.a.f12634e)) {
                    bVar = new e1.b(3);
                } else {
                    if (o1.a.a(jD, o1.a.f12632c) ? true : o1.a.a(jD, o1.a.f12639k)) {
                        bVar = new e1.b(5);
                    } else {
                        if (o1.a.a(jD, o1.a.f12633d) ? true : o1.a.a(jD, o1.a.f12640l)) {
                            bVar = new e1.b(6);
                        } else {
                            if (o1.a.a(jD, o1.a.f12636g) ? true : o1.a.a(jD, o1.a.f12638i) ? true : o1.a.a(jD, o1.a.f12641m)) {
                                bVar = new e1.b(7);
                            } else {
                                bVar = o1.a.a(jD, o1.a.f12631b) ? true : o1.a.a(jD, o1.a.j) ? new e1.b(8) : null;
                            }
                        }
                    }
                }
                if (bVar != null) {
                    if (o1.c.z(keyEvent) == 2) {
                        return Boolean.valueOf(((e1.e) this.f18890r.getFocusOwner()).b(bVar.f5186a));
                    }
                }
                return Boolean.FALSE;
            default:
                eh.a aVar2 = (eh.a) obj;
                t tVar = this.f18890r;
                Handler handler = tVar.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    aVar2.invoke();
                } else {
                    Handler handler2 = tVar.getHandler();
                    if (handler2 != null) {
                        handler2.post(new t2.a(aVar2, 3));
                    }
                }
                return qg.o.f13926a;
        }
    }
}
