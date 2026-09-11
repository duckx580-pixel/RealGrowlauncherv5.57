package v5;

import android.content.Context;
import android.os.Build;
import s8.o2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements Runnable {
    public static final String w = androidx.work.p.f("WorkForegroundRunnable");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w5.k f18601i = new w5.k();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Context f18602r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final u5.p f18603s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final androidx.work.o f18604t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final p f18605u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final x5.a f18606v;

    public o(Context context, u5.p pVar, androidx.work.o oVar, p pVar2, n7.e eVar) {
        this.f18602r = context;
        this.f18603s = pVar;
        this.f18604t = oVar;
        this.f18605u = pVar2;
        this.f18606v = eVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.f18603s.f17696q || Build.VERSION.SDK_INT >= 31) {
            this.f18601i.i(null);
            return;
        }
        w5.k kVar = new w5.k();
        n7.e eVar = (n7.e) this.f18606v;
        ((h7.o) eVar.f12174t).execute(new cf.f(13, this, kVar));
        kVar.a(new o2(16, this, kVar, false), (h7.o) eVar.f12174t);
    }
}
