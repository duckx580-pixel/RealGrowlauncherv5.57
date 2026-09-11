package si;

import eh.e;
import fe.u0;
import fi.w;
import kotlin.jvm.internal.l;
import launcher.powerkuy.growlauncher.login.LoginActivity;
import li.f;
import m0.n4;
import oh.x;
import qg.o;
import th.d;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15853i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f15854r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f15855s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ LoginActivity f15856t;

    public /* synthetic */ c(d dVar, f fVar, LoginActivity loginActivity, int i10) {
        this.f15853i = i10;
        this.f15854r = dVar;
        this.f15855s = fVar;
        this.f15856t = loginActivity;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f15853i;
        o oVar = o.f13926a;
        d dVar = this.f15854r;
        switch (i10) {
            case 0:
                o0.o oVar2 = (o0.o) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i11 = LoginActivity.f9871i;
                if ((3 & iIntValue) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    n4.a(androidx.compose.foundation.layout.c.f1184c, null, null, null, null, 0, 0L, 0L, null, w0.f.b(oVar2, 935073429, new w(dVar, this.f15855s, this.f15856t, 7)), oVar2, 805306374, 510);
                }
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                int i12 = LoginActivity.f9871i;
                l.f("discord_id", str);
                l.f("password", str2);
                x.s(dVar, null, 0, new u0(this.f15855s, str, str2, this.f15856t, (ug.c) null, 6), 3);
                break;
        }
        return oVar;
    }
}
