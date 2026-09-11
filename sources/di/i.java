package di;

import a0.j0;
import androidx.lifecycle.p0;
import launcher.powerkuy.growlauncher.ScriptHubWebActivity;
import oh.x;
import t4.c0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i extends kotlin.jvm.internal.j implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5128i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(int i10, Object obj, Class cls, String str, String str2, int i11, int i12) {
        super(i10, i11, cls, obj, str, str2);
        this.f5128i = i12;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f5128i;
        qg.o oVar = qg.o.f13926a;
        switch (i10) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                ScriptHubWebActivity scriptHubWebActivity = (ScriptHubWebActivity) this.receiver;
                int i11 = ScriptHubWebActivity.f9860v;
                scriptHubWebActivity.d(false);
                scriptHubWebActivity.f9863s.setValue(Boolean.FALSE);
                x.s(p0.h(scriptHubWebActivity), null, 0, new j0(4, scriptHubWebActivity, (ug.c) null), 3);
                break;
            case 3:
                ((c0) this.receiver).f16459c.H(Boolean.TRUE);
                break;
            case 4:
                ((c0) this.receiver).f16459c.H(Boolean.FALSE);
                break;
            default:
                ((c0) this.receiver).f16459c.H(Boolean.FALSE);
                break;
        }
        return oVar;
    }
}
