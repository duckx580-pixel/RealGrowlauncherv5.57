package ui;

import d2.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18044i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ g f18045r;

    public /* synthetic */ i(g gVar, int i10) {
        this.f18044i = i10;
        this.f18045r = gVar;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        long jC;
        int i10 = this.f18044i;
        qg.o oVar = qg.o.f13926a;
        g gVar = this.f18045r;
        switch (i10) {
            case 0:
                String str = (String) obj;
                kotlin.jvm.internal.l.f("it", str);
                k2.u uVar = (k2.u) gVar.f18031c.getValue();
                long j = uVar.f9197b;
                int i11 = w.f4917c;
                int i12 = (int) (j >> 32);
                String string = nh.h.e0(uVar.f9196a.f4836i, i12, (int) (j & 4294967295L), str).toString();
                int length = str.length() + i12;
                int iHashCode = str.hashCode();
                if (iHashCode == 1088 ? str.equals("\"\"") : iHashCode == 1248 ? str.equals("''") : iHashCode == 1281 ? str.equals("()") : iHashCode == 2914 ? str.equals("[]") : iHashCode == 3938 && str.equals("{}")) {
                    int i13 = i12 + 1;
                    jC = t6.k.c(i13, i13);
                } else {
                    jC = t6.k.c(length, length);
                }
                gVar.f(new k2.u(4, jC, string));
                break;
            default:
                k2.u uVar2 = (k2.u) obj;
                kotlin.jvm.internal.l.f("it", uVar2);
                gVar.f(uVar2);
                break;
        }
        return oVar;
    }
}
