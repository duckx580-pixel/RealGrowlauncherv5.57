package fi;

import launcher.powerkuy.growlauncher.LuaManager;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6669i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LuaManager f6670r;

    public /* synthetic */ z(LuaManager luaManager, int i10) {
        this.f6669i = i10;
        this.f6670r = luaManager;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f6669i;
        qg.o oVar = qg.o.f13926a;
        LuaManager luaManager = this.f6670r;
        o0.o oVar2 = (o0.o) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i10) {
            case 0:
                int i11 = LuaManager.f9857i;
                if ((iIntValue & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    zi.b.a(w0.f.b(oVar2, 1208086979, new z(luaManager, 1)), oVar2, 6);
                }
                break;
            default:
                int i12 = LuaManager.f9857i;
                if ((iIntValue & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    oVar2.U(5004770);
                    boolean zH = oVar2.h(luaManager);
                    Object objL = oVar2.L();
                    if (zH || objL == o0.k.f12458a) {
                        objL = new androidx.activity.c(2, luaManager);
                        oVar2.g0(objL);
                    }
                    oVar2.r(false);
                    s.d((eh.a) objL, null, oVar2, 0);
                }
                break;
        }
        return oVar;
    }
}
