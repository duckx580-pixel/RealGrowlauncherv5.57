package n7;

import android.app.Activity;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ClipDescription;
import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PersistableBundle;
import android.preference.PreferenceManager;
import android.util.Base64;
import android.util.Log;
import cl.g;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService;
import com.rtsoft.growtopia.R;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import h7.o;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.zip.Adler32;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import org.json.JSONObject;
import p7.h;
import rg.y;
import rh.h1;
import rh.r0;
import rh.w0;
import s.h0;
import s6.j;
import s8.x1;
import t4.p;
import t4.q;
import t4.r;
import t4.s;
import t4.t;
import t4.u;
import t6.a0;
import t6.c4;
import t6.h4;
import t6.m3;
import t6.n3;
import t6.q3;
import t6.u1;
import u3.f;
import v1.y0;
import we.w;
import x0.i;
import x0.k;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class e implements k7.b, f, i, x5.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12171i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Object f12172r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Object f12173s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f12174t;

    public /* synthetic */ e(int i10, boolean z3) {
        this.f12171i = i10;
    }

    public static final t4.e f(e eVar, t4.e eVar2, t tVar, t tVar2) {
        s sVar;
        s sVar2;
        s sVar3;
        eVar.getClass();
        s sVar4 = r.f16616c;
        if (eVar2 == null || (sVar = eVar2.f16470a) == null) {
            sVar = sVar4;
        }
        s sVar5 = tVar.f16629a;
        s sVarK = k(sVar, sVar5, sVar5, tVar2 != null ? tVar2.f16629a : null);
        if (eVar2 == null || (sVar2 = eVar2.f16471b) == null) {
            sVar2 = sVar4;
        }
        s sVarK2 = k(sVar2, sVar5, tVar.f16630b, tVar2 != null ? tVar2.f16630b : null);
        if (eVar2 != null && (sVar3 = eVar2.f16472c) != null) {
            sVar4 = sVar3;
        }
        return new t4.e(sVarK, sVarK2, k(sVar4, sVar5, tVar.f16631c, tVar2 != null ? tVar2.f16631c : null), tVar, tVar2);
    }

    public static void h(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        StringBuilder sbH = h0.h(str, ": EGL error: 0x");
        sbH.append(Integer.toHexString(iEglGetError));
        throw new RuntimeException(sbH.toString());
    }

    public static s k(s sVar, s sVar2, s sVar3, s sVar4) {
        return sVar4 == null ? sVar3 : sVar instanceof q ? (((sVar2 instanceof r) && (sVar4 instanceof r)) || (sVar4 instanceof p)) ? sVar4 : sVar : sVar4;
    }

    public void A() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f12174t;
        if (eGLDisplay != EGL14.EGL_NO_DISPLAY) {
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            EGL14.eglDestroyContext((EGLDisplay) this.f12174t, (EGLContext) this.f12173s);
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f12174t);
        }
        this.f12174t = EGL14.EGL_NO_DISPLAY;
        this.f12173s = EGL14.EGL_NO_CONTEXT;
        this.f12172r = null;
    }

    public void B(Iterable iterable) {
        l.f("workSpecs", iterable);
        synchronized (this.f12174t) {
            try {
                for (r5.b bVar : (r5.b[]) this.f12173s) {
                    if (bVar.f14593e != null) {
                        bVar.f14593e = null;
                        bVar.d(null, bVar.f14592d);
                    }
                }
                for (r5.b bVar2 : (r5.b[]) this.f12173s) {
                    bVar2.c(iterable);
                }
                for (r5.b bVar3 : (r5.b[]) this.f12173s) {
                    if (bVar3.f14593e != this) {
                        bVar3.f14593e = this;
                        bVar3.d(this, bVar3.f14592d);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void C() {
        synchronized (this.f12174t) {
            for (r5.b bVar : (r5.b[]) this.f12173s) {
                ArrayList arrayList = bVar.f14590b;
                if (!arrayList.isEmpty()) {
                    arrayList.clear();
                    bVar.f14589a.d(bVar);
                }
            }
        }
    }

    public void D(Runnable runnable) {
        uf.c cVar = (uf.c) ((WeakReference) this.f12172r).get();
        if (cVar == null) {
            return;
        }
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            cVar.b0(runnable);
        }
    }

    public void E(h7.i iVar, int i10, boolean z3) {
        o7.b bVar = (o7.b) this.f12174t;
        Context context = (Context) this.f12172r;
        ComponentName componentName = new ComponentName(context, (Class<?>) JobInfoSchedulerService.class);
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Adler32 adler32 = new Adler32();
        adler32.update(context.getPackageName().getBytes(Charset.forName("UTF-8")));
        String str = iVar.f7628a;
        String str2 = iVar.f7628a;
        adler32.update(str.getBytes(Charset.forName("UTF-8")));
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
        e7.b bVar2 = iVar.f7630c;
        adler32.update(byteBufferAllocate.putInt(s7.a.a(bVar2)).array());
        byte[] bArr = iVar.f7629b;
        if (bArr != null) {
            adler32.update(bArr);
        }
        int value = (int) adler32.getValue();
        if (!z3) {
            Iterator<JobInfo> it = jobScheduler.getAllPendingJobs().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                JobInfo next = it.next();
                int i11 = next.getExtras().getInt("attemptNumber");
                if (next.getId() == value) {
                    if (i11 >= i10) {
                        u5.f.m("JobInfoScheduler", "Upload for context %s is already scheduled. Returning...", iVar);
                        return;
                    }
                }
            }
        }
        Cursor cursorRawQuery = ((h) ((p7.d) this.f12173s)).a().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{str2, String.valueOf(s7.a.a(bVar2))});
        try {
            Long lValueOf = cursorRawQuery.moveToNext() ? Long.valueOf(cursorRawQuery.getLong(0)) : 0L;
            cursorRawQuery.close();
            long jLongValue = lValueOf.longValue();
            JobInfo.Builder builder = new JobInfo.Builder(value, componentName);
            builder.setMinimumLatency(bVar.a(bVar2, jLongValue, i10));
            Set set = ((o7.c) bVar.f12773b.get(bVar2)).f12776c;
            if (set.contains(o7.d.f12777i)) {
                builder.setRequiredNetworkType(2);
            } else {
                builder.setRequiredNetworkType(1);
            }
            if (set.contains(o7.d.f12779s)) {
                builder.setRequiresCharging(true);
            }
            if (set.contains(o7.d.f12778r)) {
                builder.setRequiresDeviceIdle(true);
            }
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putInt("attemptNumber", i10);
            persistableBundle.putString("backendName", str2);
            persistableBundle.putInt("priority", s7.a.a(bVar2));
            if (bArr != null) {
                persistableBundle.putString("extras", Base64.encodeToString(bArr, 0));
            }
            builder.setExtras(persistableBundle);
            Object[] objArr = {iVar, Integer.valueOf(value), Long.valueOf(bVar.a(bVar2, jLongValue, i10)), lValueOf, Integer.valueOf(i10)};
            String strS = u5.f.s("JobInfoScheduler");
            if (Log.isLoggable(strS, 3)) {
                Log.d(strS, String.format("Scheduling upload for context %s with jobId=%d in %dms(Backend next call timestamp %d). Attempt %d", objArr));
            }
            jobScheduler.schedule(builder.build());
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    public void F(Object obj) {
        long id2 = Thread.currentThread().getId();
        if (id2 == o0.b.f12386a) {
            this.f12174t = obj;
            return;
        }
        synchronized (this.f12173s) {
            w0.e eVar = (w0.e) ((AtomicReference) this.f12172r).get();
            int iA = eVar.a(id2);
            if (iA < 0) {
                ((AtomicReference) this.f12172r).set(eVar.b(id2, obj));
            } else {
                eVar.f18735c[iA] = obj;
            }
        }
    }

    public void G(t tVar) {
        l.f("states", tVar);
        this.f12172r = tVar.f16629a;
        this.f12174t = tVar.f16631c;
        this.f12173s = tVar.f16630b;
    }

    public void H(u uVar, s sVar) {
        l.f("type", uVar);
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            this.f12172r = sVar;
        } else if (iOrdinal == 1) {
            this.f12173s = sVar;
        } else {
            if (iOrdinal != 2) {
                throw new a2.d();
            }
            this.f12174t = sVar;
        }
    }

    public t I() {
        return new t((s) this.f12172r, (s) this.f12173s, (s) this.f12174t);
    }

    public void J() {
        LinkedHashMap linkedHashMap = ((k) this.f12172r).f19366c;
        String str = (String) this.f12173s;
        List list = (List) linkedHashMap.remove(str);
        if (list != null) {
            list.remove((m) this.f12174t);
        }
        if (list == null || list.isEmpty()) {
            return;
        }
        linkedHashMap.put(str, list);
    }

    public void K() {
        ArrayList arrayList = (ArrayList) this.f12173s;
        if (arrayList.isEmpty()) {
            throw new IllegalStateException("empty stack");
        }
        this.f12174t = arrayList.remove(arrayList.size() - 1);
    }

    @Override // u3.f
    public Uri a() {
        return (Uri) this.f12172r;
    }

    @Override // u3.f
    public Uri c() {
        return (Uri) this.f12174t;
    }

    @Override // u3.f
    public Object d() {
        return null;
    }

    public void finalize() throws Throwable {
        switch (this.f12171i) {
            case 1:
                if (((EGLDisplay) this.f12174t) != EGL14.EGL_NO_DISPLAY) {
                    A();
                }
                break;
            default:
                super.finalize();
                break;
        }
    }

    public boolean g(String str) {
        r5.b bVar;
        boolean z3;
        l.f("workSpecId", str);
        synchronized (this.f12174t) {
            try {
                r5.b[] bVarArr = (r5.b[]) this.f12173s;
                int length = bVarArr.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        bVar = null;
                        break;
                    }
                    bVar = bVarArr[i10];
                    bVar.getClass();
                    Object obj = bVar.f14592d;
                    if (obj != null && bVar.b(obj) && bVar.f14591c.contains(str)) {
                        break;
                    }
                    i10++;
                }
                if (bVar != null) {
                    androidx.work.p.d().a(q5.c.f13799a, "Work " + str + " constrained by " + bVar.getClass().getSimpleName());
                }
                z3 = bVar == null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z3;
    }

    @Override // pg.a
    public Object get() {
        switch (this.f12171i) {
            case 0:
                return new e((Context) ((pg.a) this.f12172r).get(), (p7.d) ((pg.a) this.f12173s).get(), (o7.b) ((cb.f) this.f12174t).get(), 4);
            default:
                if (Thread.currentThread().getId() == o0.b.f12386a) {
                    return this.f12174t;
                }
                w0.e eVar = (w0.e) ((AtomicReference) this.f12172r).get();
                int iA = eVar.a(Thread.currentThread().getId());
                if (iA >= 0) {
                    return eVar.f18735c[iA];
                }
                return null;
        }
    }

    @Override // u3.f
    public ClipDescription getDescription() {
        return (ClipDescription) this.f12173s;
    }

    public void i() {
        ((ArrayList) this.f12173s).clear();
        this.f12174t = this.f12172r;
        ((androidx.compose.ui.node.a) this.f12172r).J();
    }

    public void j() {
        xk.a aVar = (xk.a) this.f12172r;
        while (true) {
            g gVarF = aVar.f19905i.f();
            if (gVarF == null || gVarF.a() != 2) {
                return;
            }
            cl.e eVar = (cl.e) gVarF;
            for (int i10 : (int[]) this.f12173s) {
                if (eVar.f3603c == i10) {
                    break;
                }
            }
            return;
            ((ArrayList) this.f12174t).add(new xk.b((cl.e) aVar.f19905i.next()));
        }
    }

    public List l() {
        try {
            return (ArrayList) this.f12174t;
        } finally {
            this.f12174t = new ArrayList();
        }
    }

    public void m(eh.c cVar) {
        Object value;
        t4.e eVar;
        h1 h1Var = (h1) this.f12173s;
        do {
            value = h1Var.getValue();
            t4.e eVar2 = (t4.e) value;
            eVar = (t4.e) cVar.invoke(eVar2);
            if (l.a(eVar2, eVar)) {
                return;
            }
        } while (!h1Var.i(value, eVar));
        if (eVar != null) {
            Iterator it = ((CopyOnWriteArrayList) this.f12172r).iterator();
            while (it.hasNext()) {
                ((eh.c) it.next()).invoke(eVar);
            }
        }
    }

    public void n(Object obj) {
        ((ArrayList) this.f12173s).add(this.f12174t);
        this.f12174t = obj;
    }

    public void o(l7.a aVar, ByteArrayOutputStream byteArrayOutputStream) {
        HashMap map = (HashMap) this.f12172r;
        ya.e eVar = new ya.e(byteArrayOutputStream, map, (HashMap) this.f12173s, (va.d) this.f12174t);
        va.d dVar = (va.d) map.get(l7.a.class);
        if (dVar != null) {
            dVar.a(aVar, eVar);
        } else {
            throw new va.b("No encoder for " + l7.a.class);
        }
    }

    public s p(u uVar) {
        l.f("loadType", uVar);
        int iOrdinal = uVar.ordinal();
        if (iOrdinal == 0) {
            return (s) this.f12172r;
        }
        if (iOrdinal == 1) {
            return (s) this.f12173s;
        }
        if (iOrdinal == 2) {
            return (s) this.f12174t;
        }
        throw new a2.d();
    }

    public EGLConfig q(int i10) {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig((EGLDisplay) this.f12174t, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, i10 >= 3 ? 68 : 4, 12344, 0, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        return null;
    }

    public void r(HashMap map, t6.h1 h1Var) {
        String string;
        j jVar = (j) this.f12173s;
        l.f(PredefinedUICustomizationFont.defaultFamily, map);
        l.f(PredefinedUICustomizationFont.defaultFamily, h1Var);
        x7.h hVar = (x7.h) this.f12174t;
        u1 u1Var = null;
        if (Boolean.parseBoolean(((j) hVar.f19488r).c("enableTCFDataCollection"))) {
            try {
                SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences((Context) hVar.f19489s);
                int i10 = defaultSharedPreferences.getInt("IABTCF_gdprApplies", -1);
                u1Var = new u1(defaultSharedPreferences.getInt("IABTCF_PolicyVersion", -1), i10, defaultSharedPreferences.getInt("IABTCF_CmpSdkID", -1), defaultSharedPreferences.getInt("IABTCF_CmpSdkVersion", -1), (i10 != 1 || (string = defaultSharedPreferences.getString("IABTCF_TCString", PredefinedUICustomizationFont.defaultFamily)) == null) ? PredefinedUICustomizationFont.defaultFamily : string);
            } catch (Exception e8) {
                m3.g(s6.h.f15212b, 31, "TCF data collection exception", e8, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            }
        }
        s6.i iVar = (s6.i) ((al.h) this.f12172r).f639c;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iVar != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            linkedHashMap2.put("gdpr_applies", iVar.f15218d);
            linkedHashMap2.put("ad_user_data_enabled", iVar.f15217c);
            linkedHashMap2.put("ad_personalization_enabled", iVar.f15216b);
            linkedHashMap2.put("ad_storage_enabled", iVar.f15215a);
            linkedHashMap.put("manual", linkedHashMap2);
        }
        if (u1Var != null) {
            boolean z3 = iVar != null;
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            linkedHashMap3.put("policy_version", Integer.valueOf(u1Var.f17065b));
            linkedHashMap3.put("cmp_sdk_id", Integer.valueOf(u1Var.f17064a));
            linkedHashMap3.put("cmp_sdk_version", Integer.valueOf(u1Var.f17068e));
            if (z3) {
                linkedHashMap3.put("gdpr_applies", -1);
                linkedHashMap3.put("tcstring", PredefinedUICustomizationFont.defaultFamily);
            } else {
                linkedHashMap3.put("gdpr_applies", Integer.valueOf(u1Var.f17066c));
                linkedHashMap3.put("tcstring", u1Var.f17067d);
            }
            linkedHashMap.put("tcf", linkedHashMap3);
        }
        if (!linkedHashMap.isEmpty()) {
            map.put("consent_data", linkedHashMap);
        }
        if (h1Var != t6.h1.CONVERSION || jVar.c("enableTCFDataCollection") == null) {
            return;
        }
        Map mapE = t6.f.E(map);
        l.e(PredefinedUICustomizationFont.defaultFamily, mapE);
        mapE.put("api", y.F(new qg.g("enableTCFDataCollection", jVar.c("enableTCFDataCollection"))));
    }

    public Object s() {
        return this.f12174t;
    }

    public boolean t(Map map, String... strArr) {
        a0 a0Var = (a0) this.f12174t;
        if (map == null || map.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (!map.containsKey(str)) {
                return false;
            }
        }
        String str2 = (String) map.remove("sig");
        if (str2 == null) {
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new JSONObject(map));
        sb2.append("version: 6.17.5 (build 366)");
        return jj.d.s(sb2.toString(), t6.k.p(a0Var.f16702f)).equals(str2);
    }

    public String toString() {
        switch (this.f12171i) {
            case 6:
                String str = (String) this.f12174t;
                String str2 = (String) this.f12173s;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.f12172r;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                String string = sb2.toString();
                l.e("sb.toString()", string);
                return string;
            default:
                return super.toString();
        }
    }

    public uf.y u(char c10) {
        e eVar;
        uf.y yVar = (uf.y) ((HashMap) this.f12172r).get(Character.valueOf(c10));
        return (yVar != null || (eVar = (e) this.f12174t) == null) ? yVar : eVar.u(c10);
    }

    public List v(char c10) {
        e eVar;
        List arrayList = (List) ((HashMap) this.f12173s).get(Character.valueOf(c10));
        if (arrayList == null && (eVar = (e) this.f12174t) != null) {
            arrayList = new ArrayList(eVar.v(c10));
        }
        return arrayList == null ? Collections.EMPTY_LIST : arrayList;
    }

    public void w() {
        y0 y0Var = ((androidx.compose.ui.node.a) this.f12172r).f1250y;
        if (y0Var != null) {
            ((w1.t) y0Var).v();
        }
    }

    public void x(int i10) {
        di.h hVar = (di.h) this.f12172r;
        h4 h4Var = (h4) this.f12174t;
        HashMap map = h4Var.f16993e;
        Context context = (Context) this.f12173s;
        map.put("api_ver", Long.valueOf(c4.a(context, "com.xiaomi.mipicks")));
        map.put("api_ver_name", c4.f(context, "com.xiaomi.mipicks"));
        if (i10 == -1) {
            s6.h.f15212b.o(11, "XiaomiInstallReferrer SERVICE_DISCONNECTED");
            map.put("response", "SERVICE_DISCONNECTED");
        } else if (i10 == 0) {
            map.put("response", "OK");
            try {
                s6.h hVar2 = s6.h.f15212b;
                hVar2.b(11, "XiaomiInstallReferrer connected");
                if (hVar.D()) {
                    Bundle bundle = hVar.u().f13331a;
                    String string = bundle.getString("install_referrer");
                    if (string != null) {
                        map.put("referrer", string);
                    }
                    map.put("click_ts", Long.valueOf(bundle.getLong("referrer_click_timestamp_seconds")));
                    map.put("install_begin_ts", Long.valueOf(bundle.getLong("install_begin_timestamp_seconds")));
                    HashMap map2 = new HashMap();
                    map2.put("click_server_ts", Long.valueOf(bundle.getLong("referrer_click_timestamp_server_seconds")));
                    map2.put("install_begin_server_ts", Long.valueOf(bundle.getLong("install_begin_timestamp_server_seconds")));
                    map2.put("install_version", bundle.getString("install_version"));
                    map.put("xiaomi_custom", map2);
                } else {
                    hVar2.o(11, "XiaomiReferrerClient: XiaomiInstallReferrer is not ready");
                }
            } catch (Throwable th2) {
                s6.h hVar3 = s6.h.f15212b;
                StringBuilder sb2 = new StringBuilder("Failed to get Xiaomi install referrer: ");
                sb2.append(th2.getMessage());
                hVar3.o(11, sb2.toString());
            }
        } else if (i10 == 1) {
            map.put("response", "SERVICE_UNAVAILABLE");
            s6.h.f15212b.o(11, "XiaomiInstallReferrer not supported");
        } else if (i10 == 2) {
            s6.h.f15212b.o(11, "XiaomiInstallReferrer FEATURE_NOT_SUPPORTED");
            map.put("response", "FEATURE_NOT_SUPPORTED");
        } else if (i10 == 3) {
            s6.h.f15212b.o(11, "XiaomiInstallReferrer DEVELOPER_ERROR");
            map.put("response", "DEVELOPER_ERROR");
        } else if (i10 != 4) {
            s6.h.f15212b.o(11, "responseCode not found.");
        } else {
            s6.h.f15212b.o(11, "XiaomiInstallReferrer DEVELOPER_ERROR");
            map.put("response", "PERMISSION_ERROR");
        }
        s6.h.f15212b.b(11, "Xiaomi Install Referrer collected locally");
        h4Var.b();
        hVar.f5125s = 3;
        if (((p6.a) hVar.f5127u) != null) {
            jj.d.w("Unbinding from service.");
            Context context2 = (Context) hVar.f5124r;
            p6.a aVar = (p6.a) hVar.f5127u;
            l.c(aVar);
            context2.unbindService(aVar);
            hVar.f5127u = null;
        }
        hVar.f5126t = null;
    }

    public void y(int i10) {
        ((n3) this.f12172r).f16939h.execute(new x1(this, (di.h) this.f12174t, (Context) this.f12173s, i10));
    }

    public void z(char c10, uf.y yVar) {
        ((HashMap) this.f12172r).put(Character.valueOf(c10), yVar);
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i10) {
        this.f12171i = i10;
        this.f12172r = obj;
        this.f12173s = obj2;
        this.f12174t = obj3;
    }

    public e(String str, Boolean bool) {
        this.f12171i = 12;
        this.f12174t = str;
        this.f12172r = bool;
    }

    public e(Activity activity, q3 q3Var) {
        this.f12171i = 14;
        String str = PredefinedUICustomizationFont.defaultFamily;
        l.f(PredefinedUICustomizationFont.defaultFamily, q3Var);
        this.f12174t = activity.getIntent();
        Uri referrer = activity.getIntent() == null ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        this.f12173s = string != null ? string : str;
        String str2 = q3Var.f17003a;
        q3Var.f17003a = null;
        this.f12172r = (str2 == null || str2.length() == 0) ? q3.a(activity) : str2;
    }

    public e(t6.t tVar) {
        this.f12171i = 7;
        this.f12172r = tVar;
        this.f12174t = tVar.a();
        this.f12173s = tVar.s();
    }

    public e(x7.h hVar, al.h hVar2, j jVar) {
        this.f12171i = 13;
        l.f(PredefinedUICustomizationFont.defaultFamily, hVar2);
        l.f(PredefinedUICustomizationFont.defaultFamily, jVar);
        this.f12174t = hVar;
        this.f12172r = hVar2;
        this.f12173s = jVar;
    }

    @Override // u3.f
    public void b() {
    }

    public e(ExecutorService executorService) {
        this.f12171i = 23;
        this.f12173s = new Handler(Looper.getMainLooper());
        this.f12174t = new o(4, this);
        this.f12172r = new i.h0(executorService);
    }

    public e(fl.e eVar, int[] iArr) {
        this.f12171i = 24;
        this.f12172r = new xk.a(eVar);
        this.f12173s = iArr;
        this.f12174t = new ArrayList();
    }

    public e(int i10) {
        this.f12171i = i10;
        switch (i10) {
            case 10:
                this.f12172r = new CopyOnWriteArrayList();
                h1 h1VarC = w0.c(null);
                this.f12173s = h1VarC;
                this.f12174t = new r0(h1VarC);
                break;
            case 11:
                r rVar = r.f16616c;
                this.f12172r = rVar;
                this.f12173s = rVar;
                this.f12174t = rVar;
                break;
            default:
                this.f12172r = new AtomicReference(w0.f.f18736a);
                this.f12173s = new Object();
                break;
        }
    }

    public e(uf.c cVar) {
        this.f12171i = 18;
        this.f12172r = new WeakReference(cVar);
        cVar.o0(w.class, new com.google.gson.internal.b(16, this));
    }

    public e(uf.w wVar) {
        this.f12171i = 19;
        this.f12172r = new HashMap();
        this.f12173s = new HashMap();
        this.f12174t = wVar;
    }

    public e(u5.i iVar, q5.b bVar) {
        this.f12171i = 5;
        l.f("trackers", iVar);
        s5.e eVar = (s5.e) iVar.f17666i;
        l.f("tracker", eVar);
        r5.a aVar = new r5.a(eVar, 0);
        s5.a aVar2 = (s5.a) iVar.f17667r;
        l.f("tracker", aVar2);
        r5.a aVar3 = new r5.a(aVar2, 1);
        s5.e eVar2 = (s5.e) iVar.f17669t;
        l.f("tracker", eVar2);
        r5.a aVar4 = new r5.a(eVar2, 4);
        s5.e eVar3 = (s5.e) iVar.f17668s;
        l.f("tracker", eVar3);
        r5.a aVar5 = new r5.a(eVar3, 2);
        l.f("tracker", eVar3);
        r5.a aVar6 = new r5.a(eVar3, 3);
        l.f("tracker", eVar3);
        r5.d dVar = new r5.d(eVar3);
        l.f("tracker", eVar3);
        r5.b[] bVarArr = {aVar, aVar3, aVar4, aVar5, aVar6, dVar, new r5.c(eVar3)};
        this.f12172r = bVar;
        this.f12173s = bVarArr;
        this.f12174t = new Object();
    }

    public e(n3 n3Var, di.h hVar, Context context) {
        this.f12171i = 15;
        this.f12172r = n3Var;
        this.f12174t = hVar;
        this.f12173s = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(k kVar, String str, eh.a aVar) {
        this.f12171i = 21;
        this.f12172r = kVar;
        this.f12173s = str;
        this.f12174t = (m) aVar;
    }

    public e(Context context) {
        this.f12171i = 26;
        this.f12172r = context.getApplicationContext();
        this.f12173s = n6.d.f12133a;
        this.f12174t = new n6.h();
    }

    public e(androidx.compose.ui.node.a aVar) {
        this.f12171i = 20;
        this.f12172r = aVar;
        this.f12173s = new ArrayList();
        this.f12174t = aVar;
    }

    public e(Matcher matcher, CharSequence charSequence) {
        this.f12171i = 2;
        l.f("input", charSequence);
        this.f12172r = matcher;
        this.f12173s = new nh.f(0, this);
    }
}
