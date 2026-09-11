package x4;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19441b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Executor f19445f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f19446g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public com.google.gson.internal.b f19447h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f19448i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f19450l;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public HashSet f19454p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f19442c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f19443d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayList f19444e = new ArrayList();
    public final int j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f19449k = true;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f19451m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final u f19452n = new u(28);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final LinkedHashSet f19453o = new LinkedHashSet();

    public i(Context context, String str) {
        this.f19440a = context;
        this.f19441b = str;
    }

    public final void a(y4.a... aVarArr) {
        if (this.f19454p == null) {
            this.f19454p = new HashSet();
        }
        for (y4.a aVar : aVarArr) {
            HashSet hashSet = this.f19454p;
            kotlin.jvm.internal.l.c(hashSet);
            hashSet.add(Integer.valueOf(aVar.f20163a));
            HashSet hashSet2 = this.f19454p;
            kotlin.jvm.internal.l.c(hashSet2);
            hashSet2.add(Integer.valueOf(aVar.f20164b));
        }
        this.f19452n.B((y4.a[]) Arrays.copyOf(aVarArr, aVarArr.length));
    }
}
