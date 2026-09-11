package t6;

import android.content.Context;
import android.os.Process;
import android.view.ViewConfiguration;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements t0 {
    public static final int K = (int) TimeUnit.SECONDS.toMillis(30);
    public ExecutorService A;
    public ScheduledExecutorService B;
    public j0 C;
    public mf.a D;
    public u5.c E;
    public l3 F;
    public t2 G;
    public mc.a H;
    public al.h I;
    public com.google.android.gms.internal.measurement.j3 J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x f17033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public u5.i f17034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public x1 f17035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r0 f17036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public q1 f17037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f17038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l5.o f17039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public l5.o f17040h;
    public q3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public u5.n f17042k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public n7.e f17043l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public androidx.appcompat.widget.w3 f17044m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n7.e f17045n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public b0 f17046o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public b2 f17047p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u5.s f17048q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a0 f17049r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j4 f17050s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g1 f17051t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public z3 f17052u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b f17053v;
    public p2 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public b f17054x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public e3 f17056z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17041i = null;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u f17055y = new u();

    public final k0 A() {
        u5.s sVarK = k();
        a0 a0VarA = a();
        s6.j jVarB = s6.j.b();
        q1 q1VarD = d();
        z3 z3VarZ = z();
        c();
        return new k0(sVarK, a0VarA, jVarB, q1VarD, z3VarZ);
    }

    public final b B() {
        b bVar;
        synchronized (this) {
            try {
                if (this.f17054x == null) {
                    b bVar2 = new b();
                    bVar2.f16716t = new ArrayList();
                    bVar2.f16715s = new ArrayList();
                    bVar2.f16714r = this;
                    this.f17054x = bVar2;
                }
                bVar = this.f17054x;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bVar;
    }

    public final u5.i C() {
        u5.i iVar;
        synchronized (this) {
            try {
                if (this.f17034b == null) {
                    this.f17034b = new u5.i(b(), q());
                }
                iVar = this.f17034b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iVar;
    }

    public final b D() {
        ScheduledExecutorService scheduledExecutorService;
        if (this.f17053v == null) {
            synchronized (this) {
                try {
                    if (this.B == null) {
                        qg.k kVar = z.f17134a;
                        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor();
                        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, scheduledExecutorServiceNewSingleThreadScheduledExecutor);
                        this.B = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
                    }
                    scheduledExecutorService = this.B;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b bVarB = B();
            if (this.j == null) {
                this.j = new q3();
            }
            q3 q3Var = this.j;
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, scheduledExecutorService);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, bVarB);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, q3Var);
            b bVar = new b();
            bVar.f16713i = scheduledExecutorService;
            bVar.f16714r = bVarB;
            bVar.f16716t = q3Var;
            this.f17053v = bVar;
        }
        return this.f17053v;
    }

    public final a0 a() {
        a0 a0Var;
        synchronized (this) {
            try {
                if (this.f17049r == null) {
                    u uVarB = b();
                    b0 b0VarQ = q();
                    if (this.I == null) {
                        this.I = new al.h(10, false);
                    }
                    this.f17049r = new a0(uVarB, b0VarQ, this.I, y());
                }
                a0Var = this.f17049r;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return a0Var;
    }

    public final u b() {
        u uVar;
        synchronized (this) {
            uVar = this.f17055y;
        }
        return uVar;
    }

    public final x1 c() {
        x1 x1Var;
        synchronized (this) {
            try {
                if (this.f17035c == null) {
                    this.f17035c = new x1(b(), new w1());
                }
                x1Var = this.f17035c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return x1Var;
    }

    public final q1 d() {
        q1 q1Var;
        synchronized (this) {
            try {
                if (this.f17037e == null) {
                    this.f17037e = new q1(a(), q());
                }
                q1Var = this.f17037e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return q1Var;
    }

    public final u5.c e() {
        u5.c cVar;
        synchronized (this) {
            try {
                if (this.E == null) {
                    this.E = new u5.c(this);
                }
                cVar = this.E;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    public final n7.e f() {
        if (this.f17043l == null) {
            Context context = (Context) this.f17055y.f17063i;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            x7.h hVar = new x7.h(context, s6.j.b());
            if (this.I == null) {
                this.I = new al.h(10, false);
            }
            this.f17043l = new n7.e(hVar, this.I, s6.j.b());
        }
        return this.f17043l;
    }

    public final void g() {
        try {
            a0 a0VarA = a();
            u uVarB = b();
            x1 x1VarC = c();
            try {
                HashMap map = p3.f16988m;
                Object declaredConstructor = map.get(-362937351);
                if (declaredConstructor == null) {
                    declaredConstructor = ((Class) p3.b((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31028), ViewConfiguration.getMaximumDrawingCacheSize() >> 24, (Process.myPid() >> 22) + 37)).getDeclaredConstructor(a0.class, u.class, x1.class);
                    map.put(-362937351, declaredConstructor);
                }
                if (((Constructor) declaredConstructor).newInstance(a0VarA, uVarB, x1VarC) == null) {
                } else {
                    throw new ClassCastException();
                }
            } catch (Throwable th2) {
                Throwable cause = th2.getCause();
                if (cause == null) {
                    throw th2;
                }
                throw cause;
            }
        } catch (Throwable th3) {
            s6.h.f15212b.d(3, th3.getMessage() != null ? th3.getMessage() : PredefinedUICustomizationFont.defaultFamily, th3, false, false);
        }
    }

    public final r0 h() {
        r0 r0Var;
        synchronized (this) {
            try {
                if (this.f17036d == null) {
                    this.f17036d = new r0(this);
                }
                r0Var = this.f17036d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return r0Var;
    }

    public final u5.n i() {
        if (this.f17042k == null) {
            u5.n nVar = new u5.n();
            nVar.f17677c = this;
            this.f17042k = nVar;
        }
        return this.f17042k;
    }

    public final h j() {
        if (this.I == null) {
            this.I = new al.h(10, false);
        }
        return new h(this.I, b(), c());
    }

    public final u5.s k() {
        u5.s sVar;
        synchronized (this) {
            try {
                if (this.f17048q == null) {
                    this.f17048q = new u5.s(new k8.j(K), y());
                }
                sVar = this.f17048q;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return sVar;
    }

    public final f3 l() {
        if (h3.a() && this.f17056z == null) {
            this.f17056z = new e3(a(), e());
        }
        return this.f17056z;
    }

    public final l3 m() {
        l3 l3Var;
        synchronized (this) {
            try {
                if (this.F == null) {
                    this.F = new l3(a(), q());
                }
                l3Var = this.F;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return l3Var;
    }

    public final b2 n() {
        b2 b2Var;
        synchronized (this) {
            try {
                if (this.f17047p == null) {
                    y1 y1Var = new y1(q());
                    a2 a2Var = new a2(a(), y1Var);
                    c2 c2Var = new c2();
                    a0 a0VarA = a();
                    x1 x1VarC = c();
                    u5.s sVarK = k();
                    a0 a0VarA2 = a();
                    s6.j jVarB = s6.j.b();
                    q1 q1VarD = d();
                    z3 z3VarZ = z();
                    c();
                    this.f17047p = new b2(c2Var, a0VarA, x1VarC, y1Var, new k0(sVarK, a0VarA2, jVarB, q1VarD, z3VarZ), a2Var, s());
                }
                b2Var = this.f17047p;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b2Var;
    }

    public final n7.e o() {
        n7.e eVar;
        synchronized (this) {
            try {
                if (this.f17045n == null) {
                    this.f17045n = new n7.e(this);
                }
                eVar = this.f17045n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eVar;
    }

    public final p2 p() {
        v2 v2Var;
        String str;
        ExecutorService executorService;
        if (this.w == null) {
            if (this.f17041i == null) {
                new hd.d0().i();
                this.f17041i = "android_native";
            }
            String str2 = this.f17041i;
            Context context = (Context) this.f17055y.f17063i;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            if (this.D == null) {
                mf.a aVar = new mf.a(26, false);
                aVar.f11698r = new w6.a();
                this.D = aVar;
            }
            mf.a aVar2 = this.D;
            if (this.G == null) {
                this.G = new t2();
            }
            t2 t2Var = this.G;
            if (this.f17050s == null) {
                Context context2 = (Context) this.f17055y.f17063i;
                if (context2 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                synchronized (this) {
                    try {
                        if (this.A == null) {
                            Object value = z.f17134a.getValue();
                            kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, value);
                            this.A = (ExecutorService) value;
                        }
                        executorService = this.A;
                    } finally {
                    }
                }
                this.f17050s = new j4(context2, executorService);
            }
            j4 j4Var = this.f17050s;
            if (this.f17040h == null) {
                l5.o oVar = new l5.o();
                oVar.f9810i = new LinkedHashMap();
                this.f17040h = oVar;
            }
            l5.o oVar2 = this.f17040h;
            l3 l3VarM = m();
            b0 b0VarQ = q();
            a0 a0VarA = a();
            if (this.J == null) {
                Context context3 = (Context) this.f17055y.f17063i;
                if (context3 == null) {
                    throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
                }
                this.J = new com.google.android.gms.internal.measurement.j3(context3, 19);
            }
            com.google.android.gms.internal.measurement.j3 j3Var = this.J;
            x1 x1VarC = c();
            u uVarB = b();
            synchronized (this) {
                try {
                    if (this.f17038f == null) {
                        this.f17038f = new v2(b(), a());
                    }
                    v2Var = this.f17038f;
                } finally {
                }
            }
            if (this.I == null) {
                str = str2;
                this.I = new al.h(10, false);
            } else {
                str = str2;
            }
            this.w = new p2(str, context, aVar2, t2Var, j4Var, oVar2, l3VarM, b0VarQ, a0VarA, j3Var, x1VarC, uVarB, v2Var, this.I);
        }
        return this.w;
    }

    public final b0 q() {
        if (this.f17046o == null) {
            this.f17046o = new b0(new kb.c(new q(this)));
        }
        return this.f17046o;
    }

    public final l0 r() {
        j0 j0Var;
        synchronized (this) {
            try {
                if (this.C == null) {
                    this.C = new j0(this);
                }
                j0Var = this.C;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j0Var;
    }

    public final g1 s() {
        g1 g1Var;
        synchronized (this) {
            try {
                if (this.f17051t == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 6, 60L, TimeUnit.SECONDS, new r(), new s());
                    threadPoolExecutor.setRejectedExecutionHandler(new p());
                    this.f17051t = new g1(threadPoolExecutor);
                }
                g1Var = this.f17051t;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return g1Var;
    }

    public final mc.a t() {
        mc.a aVar;
        synchronized (this) {
            try {
                if (this.H == null) {
                    kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b());
                    this.H = new mc.a();
                }
                aVar = this.H;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return aVar;
    }

    public final d4 u() {
        ExecutorService executorService;
        if (this.f17050s == null) {
            Context context = (Context) this.f17055y.f17063i;
            if (context == null) {
                throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
            }
            synchronized (this) {
                try {
                    if (this.A == null) {
                        Object value = z.f17134a.getValue();
                        kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, value);
                        this.A = (ExecutorService) value;
                    }
                    executorService = this.A;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f17050s = new j4(context, executorService);
        }
        return this.f17050s;
    }

    public final al.h v() {
        if (this.I == null) {
            this.I = new al.h(10, false);
        }
        return this.I;
    }

    public final androidx.appcompat.widget.w3 w() {
        if (this.f17044m == null) {
            b0 b0VarQ = q();
            u uVarB = b();
            a0 a0VarA = a();
            ExecutorService executorServiceY = y();
            p2 p2VarP = p();
            x1 x1VarC = c();
            g1 g1VarS = s();
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, b0VarQ);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, uVarB);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0VarA);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, executorServiceY);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, p2VarP);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, x1VarC);
            kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, g1VarS);
            androidx.appcompat.widget.w3 w3Var = new androidx.appcompat.widget.w3();
            w3Var.f1068v = b0VarQ;
            w3Var.f1063i = uVarB;
            w3Var.f1066t = a0VarA;
            w3Var.w = executorServiceY;
            w3Var.f1067u = p2VarP;
            w3Var.f1065s = x1VarC;
            w3Var.f1064r = g1VarS;
            this.f17044m = w3Var;
        }
        return this.f17044m;
    }

    public final ScheduledExecutorService x() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (this) {
            try {
                if (this.B == null) {
                    qg.k kVar = z.f17134a;
                    ScheduledExecutorService scheduledExecutorServiceNewScheduledThreadPool = Executors.newScheduledThreadPool(1);
                    kotlin.jvm.internal.l.e(PredefinedUICustomizationFont.defaultFamily, scheduledExecutorServiceNewScheduledThreadPool);
                    this.B = scheduledExecutorServiceNewScheduledThreadPool;
                }
                scheduledExecutorService = this.B;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return scheduledExecutorService;
    }

    public final ExecutorService y() {
        x xVar;
        synchronized (this) {
            try {
                if (this.f17033a == null) {
                    qg.k kVar = z.f17134a;
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    x xVar2 = new x(new SynchronousQueue());
                    xVar2.allowCoreThreadTimeOut(true);
                    this.f17033a = xVar2;
                }
                xVar = this.f17033a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public final z3 z() {
        z3 z3Var;
        synchronized (this) {
            try {
                if (this.f17052u == null) {
                    a0 a0VarA = a();
                    kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, a0VarA);
                    this.f17052u = new z3(a0VarA);
                }
                z3Var = this.f17052u;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3Var;
    }
}
