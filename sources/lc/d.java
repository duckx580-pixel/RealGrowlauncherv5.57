package lc;

import hd.c0;
import hd.d0;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONObject;
import rg.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.jvm.internal.m implements eh.a {
    public static final d A;
    public static final d B;
    public static final d C;
    public static final d D;
    public static final d E;
    public static final d F;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final d f9885r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final d f9886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final d f9887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final d f9888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final d f9889v;
    public static final d w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final d f9890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final d f9891y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final d f9892z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f9893i;

    static {
        int i10 = 0;
        f9885r = new d(i10, 0);
        f9886s = new d(i10, 1);
        f9887t = new d(i10, 2);
        f9888u = new d(i10, 3);
        f9889v = new d(i10, 4);
        w = new d(i10, 5);
        f9890x = new d(i10, 6);
        f9891y = new d(i10, 7);
        f9892z = new d(i10, 8);
        A = new d(i10, 9);
        B = new d(i10, 10);
        C = new d(i10, 11);
        D = new d(i10, 12);
        E = new d(i10, 13);
        F = new d(i10, 14);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i10, int i11) {
        super(i10);
        this.f9893i = i11;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f9893i) {
            case 0:
                return new e();
            case 1:
                cb.f fVar = new cb.f(10);
                y.G(new qg.g(oc.a.REWARDED_VIDEO, new AtomicBoolean(false)), new qg.g(oc.a.INTERSTITIAL, new AtomicBoolean(false)), new qg.g(oc.a.BANNER, new AtomicBoolean(false)));
                return fVar;
            case 2:
                new ReentrantReadWriteLock();
                b8.l lVar = new b8.l();
                new LinkedHashMap();
                return lVar;
            case 3:
                mc.a.k().getClass();
                kotlin.jvm.internal.l.e("getInstance().applicationContext", null);
                kotlin.jvm.internal.l.f("context", null);
                throw null;
            case 4:
                return new p();
            case 5:
                c0 c0Var = new c0(9);
                new JSONObject();
                return c0Var;
            case 6:
                return new c();
            case 7:
                mc.a.k().getClass();
                kotlin.jvm.internal.l.e("getInstance().applicationContext", null);
                kotlin.jvm.internal.l.f("context", null);
                throw null;
            case 8:
                return new g();
            case 9:
                return new d0();
            case 10:
                return new t();
            case 11:
                n9.e eVar = new n9.e(9);
                new HashMap();
                new HashMap();
                return eVar;
            case 12:
                return new k();
            case 13:
                zd.h hVar = new zd.h();
                new LinkedHashMap();
                qg.k kVar = e.f9894g;
                r.c().a();
                new ReentrantReadWriteLock();
                return hVar;
            default:
                return new c0(10);
        }
    }
}
