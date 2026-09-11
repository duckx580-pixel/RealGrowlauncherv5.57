package fi;

import launcher.powerkuy.growlauncher.manager.SavedLuaActive;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6519i;

    @Override // eh.c
    public final Object invoke(Object obj) {
        SavedLuaActive savedLuaActive = (SavedLuaActive) obj;
        String str = s0.j;
        kotlin.jvm.internal.l.f("it", savedLuaActive);
        return Boolean.valueOf(savedLuaActive.getHash() == this.f6519i);
    }
}
