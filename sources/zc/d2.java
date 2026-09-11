package zc;

import com.usercentrics.sdk.models.api.ApiConstants;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d2 extends q2 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Map f20772f = Collections.unmodifiableMap(new HashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p2 f20773b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p2 f20774c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p2 f20775d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p2 f20776e;

    public d2() {
        b();
        this.f20773b = b();
        p2 p2VarB = b();
        this.f20774c = p2VarB;
        p2VarB.f21054a = new ConcurrentHashMap();
        this.f20775d = b();
        this.f20776e = b();
        p2 p2VarB2 = b();
        HashMap map = new HashMap();
        map.put("placement_request_content_retry_timeout", -1);
        map.put("placement_request_content_retry_backoff", Arrays.asList(0L, 500L, Long.valueOf(ApiConstants.DEFAULT_TIMEOUT_MILLIS), Double.valueOf(2.0d)));
        p2VarB2.f21054a = map;
    }

    public final void e(Map map) {
        Map map2;
        Map map3;
        if (map != null) {
            map2 = (Map) map.get("final");
            map3 = (Map) map.get("default");
        } else {
            map2 = null;
            map3 = null;
        }
        this.f20773b.f21054a = map2;
        this.f20776e.f21054a = map3;
        setChanged();
    }
}
