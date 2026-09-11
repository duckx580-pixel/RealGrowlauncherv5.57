package oc;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.o;
import lc.n;
import lc.r;
import qg.k;
import rc.e;
import rc.f;
import u5.s;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile s f12829a;

    static {
        e eVar;
        k kVar = lc.e.f9894g;
        r.c().a();
        r.c().a();
        s sVar = new s();
        synchronized (e.class) {
            try {
                e eVar2 = e.f14636d;
                if (eVar2 == null) {
                    e.f14636d = new e();
                } else {
                    eVar2.f14634a = 0;
                }
                eVar = e.f14636d;
            } finally {
            }
        }
        eVar.f14637c.add(new f("publisher", 1, 1));
        new k8.f().start();
        new Date().getTime();
        new AtomicBoolean();
        new HashSet();
        new HashSet();
        new AtomicBoolean(true);
        new AtomicBoolean(false);
        new AtomicBoolean(false);
        uc.a.a();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        n nVar = new n(16, false);
        nVar.f9915r = new mc.a();
        sVar.f17712i = nVar;
        sVar.f17713r = new o(nVar);
        new HashMap();
        new HashMap();
        f12829a = sVar;
    }
}
