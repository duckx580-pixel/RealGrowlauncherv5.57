package z7;

import a8.o0;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import b8.a0;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.internal.measurement.f0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20649a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f20651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f20652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a8.a f20653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Looper f20654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f20655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o0 f20656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cb.f f20657i;
    public final a8.f j;

    public g(Context context, Activity activity, d dVar, a aVar, f fVar) {
        a0.i("Null context is not permitted.", context);
        a0.i("Api must not be null.", dVar);
        a0.i("Settings must not be null; use Settings.DEFAULT_SETTINGS instead.", fVar);
        this.f20649a = context.getApplicationContext();
        String str = null;
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                str = (String) Context.class.getMethod("getAttributionTag", null).invoke(context, null);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        this.f20650b = str;
        this.f20651c = dVar;
        this.f20652d = aVar;
        this.f20654f = fVar.f20648b;
        a8.a aVar2 = new a8.a(dVar, aVar, str);
        this.f20653e = aVar2;
        this.f20656h = new o0(this);
        a8.f fVarE = a8.f.e(this.f20649a);
        this.j = fVarE;
        this.f20655g = fVarE.f439h.getAndIncrement();
        this.f20657i = fVar.f20647a;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            a8.h hVarC = LifecycleCallback.c(new a8.g(activity));
            a8.n nVar = (a8.n) hVarC.a(a8.n.class, "ConnectionlessLifecycleHelper");
            if (nVar == null) {
                Object obj = y7.d.f20178c;
                nVar = new a8.n(hVarC, fVarE);
            }
            nVar.f518v.add(aVar2);
            fVarE.a(nVar);
        }
        f0 f0Var = fVarE.f444n;
        f0Var.sendMessage(f0Var.obtainMessage(7, this));
    }

    public final mf.e a() {
        mf.e eVar = new mf.e(7, false);
        Set set = Collections.EMPTY_SET;
        if (((q.f) eVar.f11709r) == null) {
            eVar.f11709r = new q.f(0);
        }
        ((q.f) eVar.f11709r).addAll(set);
        Context context = this.f20649a;
        eVar.f11711t = context.getClass().getName();
        eVar.f11710s = context.getPackageName();
        return eVar;
    }
}
