package oa;

import android.util.Log;
import da.o;
import h7.k;
import h7.p;
import i.u;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import ka.w;
import mf.e;
import n7.c;
import n7.d;
import u5.i;
import x7.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f12808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f12809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f12810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f12811d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayBlockingQueue f12812e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ThreadPoolExecutor f12813f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f12814g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h f12815h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12816i;
    public long j;

    public b(i iVar, pa.b bVar, h hVar) {
        double d10 = bVar.f13362d;
        double d11 = bVar.f13363e;
        long j = ((long) bVar.f13364f) * 1000;
        this.f12808a = d10;
        this.f12809b = d11;
        this.f12810c = j;
        this.f12814g = iVar;
        this.f12815h = hVar;
        int i10 = (int) d10;
        this.f12811d = i10;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i10);
        this.f12812e = arrayBlockingQueue;
        this.f12813f = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.f12816i = 0;
        this.j = 0L;
    }

    public final int a() {
        if (this.j == 0) {
            this.j = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.j) / this.f12810c);
        int iMin = this.f12812e.size() == this.f12811d ? Math.min(100, this.f12816i + iCurrentTimeMillis) : Math.max(0, this.f12816i - iCurrentTimeMillis);
        if (this.f12816i != iMin) {
            this.f12816i = iMin;
            this.j = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(ia.a aVar, v8.h hVar) {
        String str = "Sending report through Google DataTransport: " + aVar.f8171b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        w wVar = aVar.f8170a;
        final o oVar = new o(4, hVar, aVar);
        i iVar = this.f12814g;
        p pVar = (p) iVar.f17669t;
        h7.i iVar2 = (h7.i) iVar.f17666i;
        if (((u) iVar.f17668s) == null) {
            throw new NullPointerException("Null transformer");
        }
        e7.a aVar2 = (e7.a) iVar.f17667r;
        d dVar = pVar.f7647c;
        e eVarA = h7.i.a();
        eVarA.S(iVar2.f7628a);
        eVarA.f11711t = e7.b.f5416s;
        eVarA.f11710s = iVar2.f7629b;
        final h7.i iVarJ = eVarA.j();
        al.h hVar2 = new al.h(4, false);
        hVar2.f638b = new HashMap();
        hVar2.f642f = Long.valueOf(pVar.f7645a.a());
        hVar2.f643g = Long.valueOf(pVar.f7646b.a());
        hVar2.f639c = "FIREBASE_CRASHLYTICS_REPORT";
        a.f12803b.getClass();
        hVar2.f641e = new k(aVar2, la.a.f9848a.a(wVar).getBytes(Charset.forName("UTF-8")));
        hVar2.f640d = null;
        final h7.h hVarG = hVar2.g();
        final c cVar = (c) dVar;
        cVar.f12167b.execute(new Runnable() { // from class: n7.a
            @Override // java.lang.Runnable
            public final void run() {
                h7.i iVar3 = iVarJ;
                String str2 = iVar3.f7628a;
                o oVar2 = oVar;
                v8.h hVar3 = (v8.h) oVar2.f5017r;
                h7.h hVar4 = hVarG;
                c cVar2 = cVar;
                cVar2.getClass();
                Logger logger = c.f12165f;
                try {
                    i7.e eVarA2 = cVar2.f12168c.a(str2);
                    if (eVarA2 != null) {
                        ((p7.h) cVar2.f12170e).g(new b(cVar2, iVar3, ((f7.b) eVarA2).a(hVar4), 0));
                        hVar3.b((ia.a) oVar2.f5018s);
                        return;
                    }
                    String str3 = "Transport backend '" + str2 + "' is not registered";
                    logger.warning(str3);
                    hVar3.a(new IllegalArgumentException(str3));
                } catch (Exception e8) {
                    logger.warning("Error scheduling event " + e8.getMessage());
                    hVar3.a(e8);
                }
            }
        });
    }
}
