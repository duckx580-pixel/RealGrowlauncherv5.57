package fi;

import launcher.powerkuy.growlauncher.AssestReader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6248i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AssestReader f6249r;

    public /* synthetic */ a(AssestReader assestReader, int i10) {
        this.f6248i = i10;
        this.f6249r = assestReader;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6248i;
        qg.o oVar = qg.o.f13926a;
        AssestReader assestReader = this.f6249r;
        o0.o oVar2 = (o0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i11 = AssestReader.f9854i;
                if ((iIntValue & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    zi.b.a(w0.f.b(oVar2, 143131107, new a(assestReader, 1)), oVar2, 6);
                }
                break;
            default:
                int i12 = AssestReader.f9854i;
                if ((iIntValue & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    oVar2.U(5004770);
                    boolean zH = oVar2.h(assestReader);
                    Object objL = oVar2.L();
                    if (zH || objL == o0.k.f12458a) {
                        objL = new b(0, assestReader);
                        oVar2.g0(objL);
                    }
                    oVar2.r(false);
                    s.f((eh.c) objL, oVar2, 0);
                }
                break;
        }
        return oVar;
    }
}
