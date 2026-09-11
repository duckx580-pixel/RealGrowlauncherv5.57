package li;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import launcher.powerkuy.growlauncher.api.model.ResponseConfiguration;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9954i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f9955r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ f f9956s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Context f9957t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(f fVar, Context context, ug.c cVar, int i10) {
        super(2, cVar);
        this.f9954i = i10;
        this.f9956s = fVar;
        this.f9957t = context;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f9954i) {
            case 0:
                return new d(this.f9956s, this.f9957t, cVar, 0);
            default:
                return new d(this.f9956s, this.f9957t, cVar, 1);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f9954i) {
        }
        return ((d) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws PackageManager.NameNotFoundException {
        switch (this.f9954i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f9955r;
                f fVar = this.f9956s;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    this.f9955r = 1;
                    obj = fVar.e(this);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                ResponseConfiguration responseConfiguration = (ResponseConfiguration) obj;
                if (responseConfiguration.getSuccess()) {
                    fVar.f9963d.j(responseConfiguration.getConfiguration());
                    Context context = this.f9957t;
                    long jD = ki.a.d(context);
                    SharedPreferences sharedPreferences = context.getSharedPreferences("configuration_cache_pref", 0);
                    kotlin.jvm.internal.l.e("getSharedPreferences(...)", sharedPreferences);
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong("last_config_version", jD);
                    editorEdit.apply();
                }
                return qg.o.f13926a;
            default:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f9955r;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    this.f9955r = 1;
                    obj = this.f9956s.f(this);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                long jLongValue = ((Number) obj).longValue();
                if (jLongValue != 0) {
                    Context context2 = this.f9957t;
                    kotlin.jvm.internal.l.f("context", context2);
                    SharedPreferences sharedPreferences2 = context2.getSharedPreferences("user_pref", 0);
                    kotlin.jvm.internal.l.e("getSharedPreferences(...)", sharedPreferences2);
                    SharedPreferences.Editor editorEdit2 = sharedPreferences2.edit();
                    editorEdit2.putLong("discord_id", jLongValue);
                    editorEdit2.apply();
                }
                return qg.o.f13926a;
        }
    }
}
