package m5;

import a8.h1;
import android.app.ActivityManager;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.BroadcastReceiver;
import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.background.systemjob.SystemJobService;
import androidx.work.v;
import i.h0;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import launcher.powerkuy.growlauncher.R;
import rg.t;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends v {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static p f11606k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static p f11607l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Object f11608m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f11609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.work.b f11610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WorkDatabase f11611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n7.e f11612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f11613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f11614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final mf.a f11615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f11616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public BroadcastReceiver.PendingResult f11617i;
    public final u5.i j;

    static {
        androidx.work.p.f("WorkManagerImpl");
        f11606k = null;
        f11607l = null;
        f11608m = new Object();
    }

    public p(Context context, androidx.work.b bVar, n7.e eVar) {
        x4.i iVar;
        int i10;
        boolean zContainsKey;
        int i11;
        boolean z3 = context.getResources().getBoolean(R.bool.workmanager_test_configuration);
        Context applicationContext = context.getApplicationContext();
        h0 h0Var = (h0) eVar.f12172r;
        kotlin.jvm.internal.l.f("context", applicationContext);
        kotlin.jvm.internal.l.f("queryExecutor", h0Var);
        if (z3) {
            iVar = new x4.i(applicationContext, null);
            iVar.f19448i = true;
        } else {
            if (nh.h.W("androidx.work.workdb")) {
                throw new IllegalArgumentException("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            }
            x4.i iVar2 = new x4.i(applicationContext, "androidx.work.workdb");
            iVar2.f19447h = new com.google.gson.internal.b(7, applicationContext);
            iVar = iVar2;
        }
        ArrayList arrayList = iVar.f19442c;
        iVar.f19445f = h0Var;
        arrayList.add(b.f11570a);
        iVar.a(e.f11575g);
        iVar.a(new h(applicationContext, 2, 3));
        iVar.a(e.f11576h);
        iVar.a(e.f11577i);
        iVar.a(new h(applicationContext, 5, 6));
        iVar.a(e.j);
        iVar.a(e.f11578k);
        iVar.a(e.f11579l);
        iVar.a(new h(applicationContext));
        iVar.a(new h(applicationContext, 10, 11));
        iVar.a(e.f11572d);
        iVar.a(e.f11573e);
        iVar.a(e.f11574f);
        iVar.f19449k = false;
        iVar.f19450l = true;
        LinkedHashSet linkedHashSet = iVar.f19453o;
        Executor executor = iVar.f19445f;
        if (executor == null && iVar.f19446g == null) {
            n.a aVar = n.b.f11831h;
            iVar.f19446g = aVar;
            iVar.f19445f = aVar;
        } else if (executor != null && iVar.f19446g == null) {
            iVar.f19446g = executor;
        } else if (executor == null) {
            iVar.f19445f = iVar.f19446g;
        }
        HashSet hashSet = iVar.f19454p;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Number) it.next()).intValue();
                if (linkedHashSet.contains(Integer.valueOf(iIntValue))) {
                    throw new IllegalArgumentException(k0.g.d(iIntValue, "Inconsistency detected. A Migration was supplied to addMigration(Migration... migrations) that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(int... startVersions). Start version: ").toString());
                }
            }
        }
        b5.b aVar2 = iVar.f19447h;
        aVar2 = aVar2 == null ? new mc.a() : aVar2;
        if (iVar.f19451m > 0) {
            if (iVar.f19441b == null) {
                throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        Context context2 = iVar.f19440a;
        String str = iVar.f19441b;
        u uVar = iVar.f19452n;
        boolean z10 = iVar.f19448i;
        int i12 = iVar.j;
        if (i12 == 0) {
            throw null;
        }
        if (i12 != 1) {
            i10 = i12;
        } else {
            Object systemService = context2.getSystemService("activity");
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type android.app.ActivityManager", systemService);
            i10 = !((ActivityManager) systemService).isLowRamDevice() ? 3 : 2;
        }
        Executor executor2 = iVar.f19445f;
        if (executor2 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        Executor executor3 = iVar.f19446g;
        if (executor3 == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        boolean z11 = iVar.f19449k;
        boolean z12 = iVar.f19450l;
        ArrayList arrayList2 = iVar.f19443d;
        ArrayList arrayList3 = iVar.f19444e;
        x4.b bVar2 = new x4.b(context2, str, aVar2, uVar, arrayList, z10, i10, executor2, executor3, z11, z12, linkedHashSet, arrayList2, arrayList3);
        Package r11 = WorkDatabase.class.getPackage();
        kotlin.jvm.internal.l.c(r11);
        String name = r11.getName();
        String canonicalName = WorkDatabase.class.getCanonicalName();
        kotlin.jvm.internal.l.c(canonicalName);
        kotlin.jvm.internal.l.e("fullPackage", name);
        if (name.length() != 0) {
            canonicalName = canonicalName.substring(name.length() + 1);
            kotlin.jvm.internal.l.e("this as java.lang.String).substring(startIndex)", canonicalName);
        }
        String strReplace = canonicalName.replace('.', '_');
        kotlin.jvm.internal.l.e("replace(...)", strReplace);
        String strConcat = strReplace.concat("_Impl");
        try {
            Class<?> cls = Class.forName(name.length() == 0 ? strConcat : name + '.' + strConcat, true, WorkDatabase.class.getClassLoader());
            kotlin.jvm.internal.l.d("null cannot be cast to non-null type java.lang.Class<T of androidx.room.Room.getGeneratedImplementation>", cls);
            WorkDatabase workDatabase = (WorkDatabase) cls.newInstance();
            x4.f fVar = workDatabase.f2351d;
            LinkedHashMap linkedHashMap = workDatabase.f2354g;
            workDatabase.f2350c = workDatabase.e(bVar2);
            Set<Class> setI = workDatabase.i();
            BitSet bitSet = new BitSet();
            for (Class cls2 : setI) {
                int size = arrayList3.size() - 1;
                if (size >= 0) {
                    do {
                        i11 = size;
                        size = i11 - 1;
                        if (cls2.isAssignableFrom(arrayList3.get(i11).getClass())) {
                            bitSet.set(i11);
                            break;
                        }
                    } while (size >= 0);
                    i11 = -1;
                } else {
                    i11 = -1;
                }
                if (i11 < 0) {
                    throw new IllegalArgumentException(("A required auto migration spec (" + cls2.getCanonicalName() + ") is missing in the database configuration.").toString());
                }
                linkedHashMap.put(cls2, arrayList3.get(i11));
            }
            int size2 = arrayList3.size() - 1;
            if (size2 >= 0) {
                while (true) {
                    int i13 = size2 - 1;
                    if (!bitSet.get(size2)) {
                        throw new IllegalArgumentException("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
                    }
                    if (i13 < 0) {
                        break;
                    } else {
                        size2 = i13;
                    }
                }
            }
            for (y4.a aVar3 : workDatabase.g(linkedHashMap)) {
                int i14 = aVar3.f20163a;
                int i15 = aVar3.f20164b;
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) uVar.f17063i;
                if (linkedHashMap2.containsKey(Integer.valueOf(i14))) {
                    Map map = (Map) linkedHashMap2.get(Integer.valueOf(i14));
                    zContainsKey = (map == null ? t.f14665i : map).containsKey(Integer.valueOf(i15));
                } else {
                    zContainsKey = false;
                }
                if (!zContainsKey) {
                    uVar.B(aVar3);
                }
            }
            workDatabase.h().setWriteAheadLoggingEnabled(bVar2.f19420g == 3);
            workDatabase.f2353f = bVar2.f19418e;
            workDatabase.f2349b = bVar2.f19421h;
            kotlin.jvm.internal.l.f("executor", bVar2.f19422i);
            new ArrayDeque();
            workDatabase.f2352e = bVar2.f19419f;
            Map mapJ = workDatabase.j();
            BitSet bitSet2 = new BitSet();
            for (Map.Entry entry : mapJ.entrySet()) {
                Class cls3 = (Class) entry.getKey();
                for (Class cls4 : (List) entry.getValue()) {
                    int size3 = arrayList2.size() - 1;
                    if (size3 >= 0) {
                        while (true) {
                            int i16 = size3 - 1;
                            if (cls4.isAssignableFrom(arrayList2.get(size3).getClass())) {
                                bitSet2.set(size3);
                                break;
                            } else if (i16 < 0) {
                                break;
                            } else {
                                size3 = i16;
                            }
                        }
                        size3 = -1;
                    } else {
                        size3 = -1;
                    }
                    if (!(size3 >= 0)) {
                        throw new IllegalArgumentException(("A required type converter (" + cls4 + ") for " + cls3.getCanonicalName() + " is missing in the database configuration.").toString());
                    }
                    workDatabase.j.put(cls4, arrayList2.get(size3));
                }
            }
            int size4 = arrayList2.size() - 1;
            if (size4 >= 0) {
                while (true) {
                    int i17 = size4 - 1;
                    if (!bitSet2.get(size4)) {
                        throw new IllegalArgumentException("Unexpected type converter " + arrayList2.get(size4) + ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.");
                    }
                    if (i17 < 0) {
                        break;
                    } else {
                        size4 = i17;
                    }
                }
            }
            Context applicationContext2 = context.getApplicationContext();
            androidx.work.p pVar = new androidx.work.p(bVar.f2321f);
            synchronized (androidx.work.p.f2388b) {
                androidx.work.p.f2389c = pVar;
            }
            kotlin.jvm.internal.l.f("context", applicationContext2);
            Context applicationContext3 = applicationContext2.getApplicationContext();
            kotlin.jvm.internal.l.e("context.applicationContext", applicationContext3);
            s5.a aVar4 = new s5.a(applicationContext3, eVar, 0);
            Context applicationContext4 = applicationContext2.getApplicationContext();
            kotlin.jvm.internal.l.e("context.applicationContext", applicationContext4);
            s5.a aVar5 = new s5.a(applicationContext4, eVar, 1);
            Context applicationContext5 = applicationContext2.getApplicationContext();
            kotlin.jvm.internal.l.e("context.applicationContext", applicationContext5);
            String str2 = s5.h.f15191a;
            s5.g gVar = new s5.g(applicationContext5, eVar);
            Context applicationContext6 = applicationContext2.getApplicationContext();
            kotlin.jvm.internal.l.e("context.applicationContext", applicationContext6);
            s5.a aVar6 = new s5.a(applicationContext6, eVar, 2);
            u5.i iVar3 = new u5.i();
            iVar3.f17666i = aVar4;
            iVar3.f17667r = aVar5;
            iVar3.f17668s = gVar;
            iVar3.f17669t = aVar6;
            this.j = iVar3;
            String str3 = j.f11595a;
            p5.b bVar3 = new p5.b(applicationContext2, this);
            v5.j.a(applicationContext2, SystemJobService.class, true);
            androidx.work.p.d().a(j.f11595a, "Created SystemJobScheduler and enabled SystemJobService");
            List listAsList = Arrays.asList(bVar3, new n5.b(applicationContext2, bVar, iVar3, this));
            g gVar2 = new g(context, bVar, eVar, workDatabase, listAsList);
            Context applicationContext7 = context.getApplicationContext();
            this.f11609a = applicationContext7;
            this.f11610b = bVar;
            this.f11612d = eVar;
            this.f11611c = workDatabase;
            this.f11613e = listAsList;
            this.f11614f = gVar2;
            this.f11615g = new mf.a(28, workDatabase);
            this.f11616h = false;
            if (o.a(applicationContext7)) {
                throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
            }
            this.f11612d.e(new v5.e(applicationContext7, this));
        } catch (ClassNotFoundException unused) {
            throw new RuntimeException("Cannot find implementation for " + WorkDatabase.class.getCanonicalName() + ". " + strConcat + " does not exist");
        } catch (IllegalAccessException unused2) {
            throw new RuntimeException("Cannot access the constructor " + WorkDatabase.class + ".canonicalName");
        } catch (InstantiationException unused3) {
            throw new RuntimeException("Failed to create an instance of " + WorkDatabase.class + ".canonicalName");
        }
    }

    public static p E(Context context) {
        p pVar;
        Object obj = f11608m;
        synchronized (obj) {
            try {
                synchronized (obj) {
                    pVar = f11606k;
                    if (pVar == null) {
                        pVar = f11607l;
                    }
                }
                return pVar;
            } catch (Throwable th2) {
                throw th2;
            } finally {
            }
        }
        if (pVar != null) {
            return pVar;
        }
        context.getApplicationContext();
        throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
    }

    public final void F() {
        synchronized (f11608m) {
            try {
                this.f11616h = true;
                BroadcastReceiver.PendingResult pendingResult = this.f11617i;
                if (pendingResult != null) {
                    pendingResult.finish();
                    this.f11617i = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void G() {
        ArrayList arrayListD;
        String str = p5.b.f13323u;
        Context context = this.f11609a;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler != null && (arrayListD = p5.b.d(context, jobScheduler)) != null && !arrayListD.isEmpty()) {
            Iterator it = arrayListD.iterator();
            while (it.hasNext()) {
                p5.b.b(jobScheduler, ((JobInfo) it.next()).getId());
            }
        }
        WorkDatabase workDatabase = this.f11611c;
        u5.q qVarT = workDatabase.t();
        WorkDatabase_Impl workDatabase_Impl = (WorkDatabase_Impl) qVarT.f17700a;
        workDatabase_Impl.b();
        u5.h hVar = (u5.h) qVarT.f17709k;
        c5.i iVarA = hVar.a();
        workDatabase_Impl.c();
        try {
            iVarA.a();
            workDatabase_Impl.o();
            workDatabase_Impl.k();
            hVar.d(iVarA);
            j.a(this.f11610b, workDatabase, this.f11613e);
        } catch (Throwable th2) {
            workDatabase_Impl.k();
            hVar.d(iVarA);
            throw th2;
        }
    }

    public final void H(k kVar, mf.e eVar) {
        h1 h1Var = new h1(22);
        h1Var.f468r = this;
        h1Var.f469s = kVar;
        h1Var.f470t = eVar;
        this.f11612d.e(h1Var);
    }
}
