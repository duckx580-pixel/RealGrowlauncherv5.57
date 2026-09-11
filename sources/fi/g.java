package fi;

import java.io.File;
import launcher.powerkuy.growlauncher.NoGrowtopia;
import launcher.powerkuy.growlauncher.api.JavaForNative;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6356i;

    public /* synthetic */ g(int i10) {
        this.f6356i = i10;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f6356i;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 1:
                int i11 = NoGrowtopia.f9859i;
            case 0:
                return oVar;
            default:
                return new File(JavaForNative.getExternalMediaDir(), "ScriptLua");
        }
    }
}
