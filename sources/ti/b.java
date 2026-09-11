package ti;

import android.view.WindowManager;
import launcher.powerkuy.growlauncher.luamanager.LuaManager;
import w1.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17247i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ LuaManager f17248r;

    public /* synthetic */ b(LuaManager luaManager, int i10) {
        this.f17247i = 3;
        this.f17248r = luaManager;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f17247i;
        qg.o oVar = qg.o.f13926a;
        LuaManager luaManager = this.f17248r;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                LuaManager luaManager2 = LuaManager.w;
                if ((iIntValue & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    a.e(luaManager, oVar2, 0);
                }
                return oVar;
            case 1:
                int iIntValue2 = ((Integer) obj).intValue();
                int iIntValue3 = ((Integer) obj2).intValue();
                WindowManager.LayoutParams layoutParams = luaManager.f9877v;
                if (layoutParams == null) {
                    kotlin.jvm.internal.l.l("params");
                    throw null;
                }
                layoutParams.width = iIntValue2;
                layoutParams.height = iIntValue3;
                WindowManager windowManager = luaManager.f9875t;
                if (windowManager == null) {
                    kotlin.jvm.internal.l.l("windowManager");
                    throw null;
                }
                a1 a1Var = luaManager.f9876u;
                if (a1Var != null) {
                    windowManager.updateViewLayout(a1Var, layoutParams);
                    return oVar;
                }
                kotlin.jvm.internal.l.l("composeView");
                throw null;
            case 2:
                int iIntValue4 = ((Integer) obj).intValue();
                int iIntValue5 = ((Integer) obj2).intValue();
                WindowManager.LayoutParams layoutParams2 = luaManager.f9877v;
                if (layoutParams2 == null) {
                    kotlin.jvm.internal.l.l("params");
                    throw null;
                }
                layoutParams2.x = iIntValue4;
                layoutParams2.y = iIntValue5;
                WindowManager windowManager2 = luaManager.f9875t;
                if (windowManager2 == null) {
                    kotlin.jvm.internal.l.l("windowManager");
                    throw null;
                }
                a1 a1Var2 = luaManager.f9876u;
                if (a1Var2 != null) {
                    windowManager2.updateViewLayout(a1Var2, layoutParams2);
                    return oVar;
                }
                kotlin.jvm.internal.l.l("composeView");
                throw null;
            default:
                ((Integer) obj2).getClass();
                a.e(luaManager, (o0.o) obj, o0.p.S(1));
                return oVar;
        }
    }

    public /* synthetic */ b(LuaManager luaManager, int i10, byte b4) {
        this.f17247i = i10;
        this.f17248r = luaManager;
    }
}
