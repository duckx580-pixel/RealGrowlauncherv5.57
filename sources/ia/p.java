package ia;

import android.util.Log;
import java.io.File;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8221i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ q f8222r;

    public /* synthetic */ p(q qVar, int i10) {
        this.f8221i = i10;
        this.f8222r = qVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8221i) {
            case 0:
                try {
                    u5.s sVar = this.f8222r.f8227e;
                    na.b bVar = (na.b) sVar.f17713r;
                    String str = (String) sVar.f17712i;
                    bVar.getClass();
                    boolean zDelete = new File(bVar.f12277b, str).delete();
                    if (!zDelete) {
                        Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
                    }
                    return Boolean.valueOf(zDelete);
                } catch (Exception e8) {
                    Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e8);
                    return Boolean.FALSE;
                }
            default:
                n nVar = this.f8222r.f8230h;
                u5.s sVar2 = nVar.f8206c;
                na.b bVar2 = (na.b) sVar2.f17713r;
                String str2 = (String) sVar2.f17712i;
                bVar2.getClass();
                boolean z3 = true;
                if (new File(bVar2.f12277b, str2).exists()) {
                    if (Log.isLoggable("FirebaseCrashlytics", 2)) {
                        Log.v("FirebaseCrashlytics", "Found previous crash marker.", null);
                    }
                    na.b bVar3 = (na.b) sVar2.f17713r;
                    bVar3.getClass();
                    new File(bVar3.f12277b, str2).delete();
                } else {
                    String strF = nVar.f();
                    if (strF == null || !nVar.j.c(strF)) {
                        z3 = false;
                    }
                }
                return Boolean.valueOf(z3);
        }
    }
}
