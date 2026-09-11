package k1;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import o0.n0;
import o0.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f9013b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f9014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f9015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f9016e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public kotlin.jvm.internal.m f9017f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final z0 f9018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g1.l f9019h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final z0 f9020i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9021k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9022l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d0 f9023m;

    public e0(c cVar) {
        this.f9013b = cVar;
        cVar.f8981i = new d0(this, 0);
        this.f9014c = PredefinedUICustomizationFont.defaultFamily;
        this.f9015d = true;
        this.f9016e = new a();
        this.f9017f = g.f9038s;
        n0 n0Var = n0.f12510u;
        this.f9018g = o0.p.I(null, n0Var);
        this.f9020i = o0.p.I(new f1.f(f1.f.f5991b), n0Var);
        this.j = f1.f.f5992c;
        this.f9021k = 1.0f;
        this.f9022l = 1.0f;
        this.f9023m = new d0(this, 1);
    }

    @Override // k1.c0
    public final void a(i1.d dVar) {
        e(dVar, 1.0f, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void e(i1.d r34, float r35, g1.l r36) {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k1.e0.e(i1.d, float, g1.l):void");
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.f9014c);
        sb2.append("\n\tviewportWidth: ");
        z0 z0Var = this.f9020i;
        sb2.append(f1.f.d(((f1.f) z0Var.getValue()).f5994a));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(f1.f.b(((f1.f) z0Var.getValue()).f5994a));
        sb2.append("\n");
        String string = sb2.toString();
        kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string);
        return string;
    }
}
