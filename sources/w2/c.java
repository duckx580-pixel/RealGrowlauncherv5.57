package w2;

import a0.f0;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ e f19023i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ f0 f19024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f19025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ float f19026t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(e eVar, f0 f0Var, g gVar, float f9) {
        super(1);
        this.f19023i = eVar;
        this.f19024r = f0Var;
        this.f19025s = gVar;
        this.f19026t = f9;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        n nVar = (n) obj;
        kotlin.jvm.internal.l.f("state", nVar);
        a3.b bVarA = nVar.a(this.f19023i.f19032a);
        eh.e[] eVarArr = e.f19031i[this.f19024r.f59r];
        g gVar = this.f19025s;
        eh.e eVar = eVarArr[gVar.f19045b];
        kotlin.jvm.internal.l.e("this", bVarA);
        a3.b bVar = (a3.b) eVar.invoke(bVarA, gVar.f19044a);
        int iE0 = bVar.f214b.f19065e.e0(this.f19026t);
        int i10 = bVar.F;
        if (i10 != 0) {
            int iC = t.g.c(i10);
            if (iC != 17) {
                switch (iC) {
                    case 0:
                    case 1:
                        bVar.f215c = iE0;
                        break;
                    case 2:
                    case 3:
                        bVar.f216d = iE0;
                        break;
                    case 4:
                    case 5:
                        bVar.f217e = iE0;
                        break;
                    case 6:
                    case 7:
                        bVar.f218f = iE0;
                        break;
                    case 8:
                    case 9:
                        bVar.f219g = iE0;
                        break;
                    case 10:
                    case 11:
                        bVar.f220h = iE0;
                        break;
                    case 12:
                    case 13:
                    case 14:
                        bVar.f221i = iE0;
                        break;
                }
            } else {
                bVar.f235y = iE0;
            }
        } else {
            bVar.f215c = iE0;
            bVar.f216d = iE0;
            bVar.f217e = iE0;
            bVar.f218f = iE0;
            bVar.f219g = iE0;
            bVar.f220h = iE0;
        }
        return o.f13926a;
    }
}
