package lc;

import java.lang.Thread;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile u5.e f9902a;

    static {
        u5.e eVar = new u5.e(13, false);
        qg.k kVar = e.f9894g;
        r.c().a();
        eVar.f17654r = mc.a.k();
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        eVar.f17655s = " ";
        h hVar = new h();
        hVar.f9901a = defaultUncaughtExceptionHandler;
        Thread.setDefaultUncaughtExceptionHandler(hVar);
        f9902a = eVar;
    }
}
