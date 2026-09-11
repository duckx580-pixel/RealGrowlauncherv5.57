package fi;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import launcher.powerkuy.growlauncher.api.JavaForNative;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g0 implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6357i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f6358r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o0.s0 f6359s;

    public /* synthetic */ g0(o0.s0 s0Var, o0.s0 s0Var2, int i10) {
        this.f6357i = i10;
        this.f6358r = s0Var;
        this.f6359s = s0Var2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f6357i) {
            case 0:
                this.f6358r.setValue(Boolean.FALSE);
                this.f6359s.setValue(Boolean.TRUE);
                break;
            case 1:
                this.f6358r.setValue(Boolean.FALSE);
                this.f6359s.setValue(JavaForNative.getSafeGameVersion());
                break;
            case 2:
                this.f6358r.setValue(PredefinedUICustomizationFont.defaultFamily);
                this.f6359s.setValue(Boolean.TRUE);
                break;
            default:
                this.f6358r.setValue(Boolean.FALSE);
                this.f6359s.setValue(PredefinedUICustomizationFont.defaultFamily);
                break;
        }
        return qg.o.f13926a;
    }
}
