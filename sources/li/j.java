package li;

import fi.d1;
import fi.j1;
import fi.m1;
import fi.v1;
import fi.w1;
import fi.y1;
import launcher.powerkuy.growlauncher.api.JavaForNative;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9975i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ y1 f9976r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f9977s;

    public /* synthetic */ j(y1 y1Var, m mVar, int i10) {
        this.f9975i = i10;
        this.f9976r = y1Var;
        this.f9977s = mVar;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9975i) {
            case 0:
                m.e(this.f9976r, this.f9977s);
                break;
            case 1:
                m.f(this.f9976r, this.f9977s);
                break;
            case 2:
                this.f9977s.u(this.f9976r);
                break;
            case 3:
                this.f9976r.b().invoke();
                this.f9977s.p();
                break;
            case 4:
                this.f9977s.u(this.f9976r);
                break;
            case 5:
                this.f9976r.b().invoke();
                this.f9977s.p();
                break;
            case 6:
                this.f9977s.u(this.f9976r);
                break;
            case 7:
                y1 y1Var = this.f9976r;
                ((w1) y1Var).g(!r1.e().booleanValue());
                y1Var.b().invoke();
                this.f9977s.p();
                break;
            case 8:
                this.f9977s.u(this.f9976r);
                break;
            case 9:
                this.f9977s.u(this.f9976r);
                break;
            case 10:
                this.f9977s.u(this.f9976r);
                break;
            case 11:
                y1 y1Var2 = this.f9976r;
                m1 m1Var = (m1) y1Var2;
                m1Var.g(m1Var.e());
                y1Var2.b().invoke();
                m1 m1Var2 = (m1) y1Var2;
                this.f9977s.q(m1Var2.a().length() > 0 ? m1Var2.a() : m1Var2.c());
                break;
            case 12:
                m1 m1Var3 = (m1) this.f9976r;
                m mVar = this.f9977s;
                mVar.getClass();
                kotlin.jvm.internal.l.f("item", m1Var3);
                h1 h1Var = mVar.D;
                h1Var.getClass();
                h1Var.k(null, m1Var3);
                h1 h1Var2 = mVar.f9992k;
                Boolean bool = Boolean.TRUE;
                h1Var2.getClass();
                h1Var2.k(null, bool);
                break;
            case 13:
                y1 y1Var3 = this.f9976r;
                String currentItem = JavaForNative.getCurrentItem();
                kotlin.jvm.internal.l.e("getCurrentItem(...)", currentItem);
                ((m1) y1Var3).g(currentItem);
                y1Var3.b().invoke();
                m1 m1Var4 = (m1) y1Var3;
                this.f9977s.q(m1Var4.a().length() > 0 ? m1Var4.a() : m1Var4.c());
                break;
            case 14:
                this.f9977s.u(this.f9976r);
                break;
            default:
                y1 y1Var4 = this.f9976r;
                if (y1Var4 instanceof v1) {
                    v1 v1Var = (v1) y1Var4;
                    v1Var.g(!v1Var.f().booleanValue());
                    v1Var.f6632i.invoke();
                } else if (y1Var4 instanceof w1) {
                    w1 w1Var = (w1) y1Var4;
                    w1Var.g(!w1Var.e().booleanValue());
                    w1Var.f6647f.invoke();
                } else if (y1Var4 instanceof j1) {
                    j1 j1Var = (j1) y1Var4;
                    j1Var.h(!j1Var.g().booleanValue());
                    j1Var.f6424k.invoke();
                } else if (y1Var4 instanceof d1) {
                    ((d1) y1Var4).f6319h.invoke();
                } else {
                    y1Var4.b().invoke();
                }
                this.f9977s.p();
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ j(m mVar, y1 y1Var, int i10) {
        this.f9975i = i10;
        this.f9977s = mVar;
        this.f9976r = y1Var;
    }
}
