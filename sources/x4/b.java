package x4;

import android.content.Context;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import t6.u;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f19414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f19415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b5.b f19416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u f19417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f19418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f19420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Executor f19421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Executor f19422i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f19423k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f19424l;

    public b(Context context, String str, b5.b bVar, u uVar, List list, boolean z3, int i10, Executor executor, Executor executor2, boolean z10, boolean z11, Set set, List list2, List list3) {
        kotlin.jvm.internal.l.f("migrationContainer", uVar);
        k0.g.s(i10, "journalMode");
        kotlin.jvm.internal.l.f("queryExecutor", executor);
        kotlin.jvm.internal.l.f("transactionExecutor", executor2);
        kotlin.jvm.internal.l.f("typeConverters", list2);
        kotlin.jvm.internal.l.f("autoMigrationSpecs", list3);
        this.f19414a = context;
        this.f19415b = str;
        this.f19416c = bVar;
        this.f19417d = uVar;
        this.f19418e = list;
        this.f19419f = z3;
        this.f19420g = i10;
        this.f19421h = executor;
        this.f19422i = executor2;
        this.j = z10;
        this.f19423k = z11;
        this.f19424l = set;
    }
}
