package t6;

import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f16914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a0 f16915f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f16917h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap f16910a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap f16916g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConcurrentHashMap f16918i = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f16911b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f16912c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f16913d = 0;

    public l3(a0 a0Var, b0 b0Var) {
        this.f16917h = b0Var;
        this.f16915f = a0Var;
    }

    public final boolean a() {
        return this.f16915f.f16702f.i(0, "appsFlyerCount") == 0;
    }

    public final Map b(String str) {
        Map map = Collections.EMPTY_MAP;
        String strG = this.f16917h.g(str);
        if (strG != null) {
            try {
                return android.support.v4.media.session.b.l(new JSONObject(strG));
            } catch (Exception e8) {
                s6.h.t("Error while parsing cached json data", e8);
            }
        }
        return map;
    }

    public final void c() {
        this.f16912c = System.currentTimeMillis();
        if (a()) {
            long j = this.f16911b;
            if (j == 0) {
                s6.h.v("Metrics: init ts is missing");
                return;
            }
            Long lValueOf = Long.valueOf(this.f16912c - j);
            ConcurrentHashMap concurrentHashMap = this.f16910a;
            concurrentHashMap.put("init_to_fg", lValueOf);
            this.f16917h.j("first_launch", new JSONObject(concurrentHashMap).toString());
        }
    }

    public final void d(j3 j3Var) {
        if (a()) {
            String string = j3Var.toString();
            ConcurrentHashMap concurrentHashMap = this.f16910a;
            concurrentHashMap.put("start_with", string);
            this.f16917h.j("first_launch", new JSONObject(concurrentHashMap).toString());
        }
    }
}
