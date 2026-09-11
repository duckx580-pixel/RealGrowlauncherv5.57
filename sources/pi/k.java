package pi;

import androidx.work.v;
import launcher.powerkuy.growlauncher.luamanager.LuaManager;
import o0.s0;
import oh.w;
import w1.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f13507i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f13508r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z3, s0 s0Var, ug.c cVar) {
        super(2, cVar);
        this.f13507i = z3;
        this.f13508r = s0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new k(this.f13507i, this.f13508r, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        k kVar = (k) create((w) obj, (ug.c) obj2);
        qg.o oVar = qg.o.f13926a;
        kVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        LuaManager luaManager;
        a1 a1Var;
        vg.a aVar = vg.a.f18663i;
        v.B(obj);
        if (!((Boolean) this.f13508r.getValue()).booleanValue()) {
            LuaManager luaManager2 = LuaManager.w;
            if (luaManager2 != null && (a1Var = luaManager2.f9876u) != null) {
                try {
                    a1Var.setVisibility(0);
                } catch (Exception e8) {
                    e8.printStackTrace();
                }
            }
        } else if (!this.f13507i && (luaManager = LuaManager.w) != null) {
            luaManager.a();
        }
        return qg.o.f13926a;
    }
}
