package s5;

import android.content.Context;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import h7.o;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import kotlin.jvm.internal.l;
import t6.c4;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f15185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f15186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15187e;

    public e(Context context, n7.e eVar) {
        this.f15184b = eVar;
        Context applicationContext = context.getApplicationContext();
        l.e("context.applicationContext", applicationContext);
        this.f15183a = applicationContext;
        this.f15185c = new Object();
        this.f15187e = new LinkedHashSet();
    }

    public boolean a() {
        Context context = this.f15183a;
        try {
            ProviderInfo providerInfoResolveContentProvider = context.getPackageManager().resolveContentProvider((String) this.f15186d, 128);
            if (providerInfoResolveContentProvider != null) {
                if (Arrays.asList((String[]) this.f15185c).contains(c4.b(context.getPackageManager(), ((PackageItemInfo) providerInfoResolveContentProvider).packageName))) {
                    return true;
                }
            }
            return false;
        } catch (PackageManager.NameNotFoundException | NoSuchAlgorithmException | CertificateException e8) {
            s6.h.s(e8.getMessage(), e8, false, true);
            return false;
        }
    }

    public abstract Object b();

    public abstract Object c();

    public void d(r5.b bVar) {
        l.f("listener", bVar);
        synchronized (this.f15185c) {
            if (((LinkedHashSet) this.f15187e).remove(bVar) && ((LinkedHashSet) this.f15187e).isEmpty()) {
                g();
            }
        }
    }

    public void e(Object obj) {
        synchronized (this.f15185c) {
            Object obj2 = this.f15186d;
            if (obj2 == null || !obj2.equals(obj)) {
                this.f15186d = obj;
                ((o) ((n7.e) this.f15184b).f12174t).execute(new cf.f(11, rg.l.x0((LinkedHashSet) this.f15187e), this));
            }
        }
    }

    public abstract void f();

    public abstract void g();

    public e(Context context, Executor executor, String str, String... strArr) {
        ia.g gVar = new ia.g();
        gVar.f8183r = this;
        this.f15187e = new FutureTask(gVar);
        this.f15183a = context;
        this.f15186d = str;
        this.f15185c = strArr;
        this.f15184b = executor;
    }
}
