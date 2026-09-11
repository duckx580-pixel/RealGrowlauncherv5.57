package pi;

import android.content.Context;
import androidx.work.v;
import launcher.powerkuy.growlauncher.api.model.Configuration;
import o0.s0;
import oh.w;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13509i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Configuration f13510r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13511s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f13512t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l(Configuration configuration, Context context, s0 s0Var, ug.c cVar, int i10) {
        super(2, cVar);
        this.f13509i = i10;
        this.f13510r = configuration;
        this.f13511s = context;
        this.f13512t = s0Var;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f13509i) {
            case 0:
                return new l(this.f13510r, this.f13511s, this.f13512t, cVar, 0);
            default:
                return new l(this.f13510r, this.f13511s, this.f13512t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f13509i) {
            case 0:
                l lVar = (l) create(wVar, cVar);
                qg.o oVar = qg.o.f13926a;
                lVar.invokeSuspend(oVar);
                return oVar;
            default:
                l lVar2 = (l) create(wVar, cVar);
                qg.o oVar2 = qg.o.f13926a;
                lVar2.invokeSuspend(oVar2);
                return oVar2;
        }
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        int i10 = this.f13509i;
        qg.o oVar = qg.o.f13926a;
        s0 s0Var = this.f13512t;
        Context context = this.f13511s;
        Configuration configuration = this.f13510r;
        switch (i10) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                v.B(obj);
                int notification_version = configuration.getNotification_version();
                kotlin.jvm.internal.l.f("context", context);
                if (notification_version > context.getSharedPreferences("configuration_cache_pref", 0).getInt("last_notification_version", -1)) {
                    s0Var.setValue(Boolean.TRUE);
                }
                break;
            default:
                vg.a aVar2 = vg.a.f18663i;
                v.B(obj);
                if (configuration.getMinimum_client_version() > context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode) {
                    s0Var.setValue(Boolean.TRUE);
                }
                break;
        }
        return oVar;
    }
}
