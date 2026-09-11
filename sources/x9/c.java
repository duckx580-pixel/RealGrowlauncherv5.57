package x9;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a1;
import com.google.android.gms.internal.measurement.b1;
import com.google.android.gms.internal.measurement.g0;
import com.google.android.gms.internal.measurement.i1;
import com.google.android.gms.internal.measurement.t0;
import com.google.android.gms.internal.measurement.u0;
import com.google.android.gms.internal.measurement.v0;
import com.google.android.gms.internal.measurement.x0;
import com.google.android.gms.internal.measurement.y0;
import com.usercentrics.sdk.models.api.ApiConstants;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import s8.w1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i1 f19508a;

    public c(i1 i1Var) {
        this.f19508a = i1Var;
    }

    @Override // s8.w1
    public final String a() {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new a1(i1Var, g0Var, 1));
        return (String) g0.y(g0Var.x(50L), String.class);
    }

    @Override // s8.w1
    public final List b(String str, String str2) {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new v0(i1Var, str, str2, g0Var));
        List list = (List) g0.y(g0Var.x(ApiConstants.MINIMUM_TIMEOUT_MILLIS), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // s8.w1
    public final Map c(String str, String str2, boolean z3) {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new b1(i1Var, str, str2, z3, g0Var));
        Bundle bundleX = g0Var.x(ApiConstants.MINIMUM_TIMEOUT_MILLIS);
        if (bundleX == null || bundleX.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleX.size());
        for (String str3 : bundleX.keySet()) {
            Object obj = bundleX.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    @Override // s8.w1
    public final String d() {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new a1(i1Var, g0Var, 4));
        return (String) g0.y(g0Var.x(500L), String.class);
    }

    @Override // s8.w1
    public final void e(Bundle bundle) {
        i1 i1Var = this.f19508a;
        i1Var.b(new t0(i1Var, bundle, 0));
    }

    @Override // s8.w1
    public final void f(String str, String str2, Bundle bundle) {
        i1 i1Var = this.f19508a;
        i1Var.b(new u0(i1Var, str, str2, bundle, 1));
    }

    @Override // s8.w1
    public final void g(String str) {
        i1 i1Var = this.f19508a;
        i1Var.b(new y0(i1Var, str, 0));
    }

    @Override // s8.w1
    public final void h(String str, String str2, Bundle bundle) {
        i1 i1Var = this.f19508a;
        i1Var.b(new u0(i1Var, str, str2, bundle, 0));
    }

    @Override // s8.w1
    public final void i(String str) {
        i1 i1Var = this.f19508a;
        i1Var.b(new y0(i1Var, str, 1));
    }

    @Override // s8.w1
    public final int j(String str) {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new x0(i1Var, str, g0Var, 1));
        Integer num = (Integer) g0.y(g0Var.x(ApiConstants.DEFAULT_TIMEOUT_MILLIS), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // s8.w1
    public final String k() {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new a1(i1Var, g0Var, 3));
        return (String) g0.y(g0Var.x(500L), String.class);
    }

    @Override // s8.w1
    public final long l() {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new a1(i1Var, g0Var, 2));
        Long l10 = (Long) g0.y(g0Var.x(500L), Long.class);
        if (l10 != null) {
            return l10.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i10 = i1Var.f3821d + 1;
        i1Var.f3821d = i10;
        return jNextLong + ((long) i10);
    }

    @Override // s8.w1
    public final String m() {
        g0 g0Var = new g0();
        i1 i1Var = this.f19508a;
        i1Var.b(new a1(i1Var, g0Var, 0));
        return (String) g0.y(g0Var.x(500L), String.class);
    }
}
