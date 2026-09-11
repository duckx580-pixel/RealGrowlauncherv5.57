package ui;

import android.widget.Toast;
import androidx.work.v;
import fi.d0;
import oh.w;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18022i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f18023r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ d0 f18024s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(g gVar, d0 d0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f18022i = i10;
        this.f18023r = gVar;
        this.f18024s = d0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f18022i) {
            case 0:
                return new e(this.f18023r, this.f18024s, cVar, 0);
            default:
                return new e(this.f18023r, this.f18024s, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f18022i) {
            case 0:
                e eVar = (e) create(wVar, cVar);
                qg.o oVar = qg.o.f13926a;
                eVar.invokeSuspend(oVar);
                return oVar;
            default:
                e eVar2 = (e) create(wVar, cVar);
                qg.o oVar2 = qg.o.f13926a;
                eVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f18022i;
        qg.o oVar = qg.o.f13926a;
        d0 d0Var = this.f18024s;
        g gVar = this.f18023r;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                v.B(obj);
                h1 h1Var = gVar.f18035g;
                Boolean bool = Boolean.FALSE;
                h1Var.getClass();
                h1Var.k(null, bool);
                Toast.makeText(gVar.e(), "Text saved successfully!", 0).show();
                d0Var.invoke(Boolean.TRUE);
                break;
            default:
                vg.a aVar2 = vg.a.f18663i;
                v.B(obj);
                Toast.makeText(gVar.e(), "Error saving text!", 0).show();
                d0Var.invoke(Boolean.FALSE);
                break;
        }
        return oVar;
    }
}
