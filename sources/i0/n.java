package i0;

import android.graphics.Matrix;
import android.graphics.Path;
import e2.t;
import t1.p0;
import t1.q0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f7963i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f7964r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f7965s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ int f7966t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(int i10, q0 q0Var, int i11, int i12) {
        super(1);
        this.f7963i = i12;
        this.f7964r = i10;
        this.f7965s = q0Var;
        this.f7966t = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f7963i) {
            case 0:
                kotlin.jvm.internal.l.f("$this$layout", (p0) obj);
                p0.c((q0) this.f7965s, gh.a.z((this.f7964r - r7.f16308i) / 2.0f), gh.a.z((this.f7966t - r7.f16309r) / 2.0f), 0.0f);
                return qg.o.f13926a;
            case 1:
                kotlin.jvm.internal.l.f("$this$layout", (p0) obj);
                p0.c((q0) this.f7965s, gh.a.z((this.f7964r - r7.f16308i) / 2.0f), gh.a.z((this.f7966t - r7.f16309r) / 2.0f), 0.0f);
                return qg.o.f13926a;
            case 2:
                p0.d((p0) obj, (q0) this.f7965s, this.f7964r, this.f7966t);
                return qg.o.f13926a;
            default:
                d2.k kVar = (d2.k) obj;
                g1.i iVar = (g1.i) this.f7965s;
                d2.a aVar = kVar.f4855a;
                int iA = kVar.a(this.f7964r);
                int iA2 = kVar.a(this.f7966t);
                CharSequence charSequence = aVar.f4820e;
                if (iA < 0 || iA > iA2 || iA2 > charSequence.length()) {
                    StringBuilder sbO = android.support.v4.media.session.a.o("start(", iA, ") or end(", iA2, ") is out of range [0..");
                    sbO.append(charSequence.length());
                    sbO.append("], or start > end!");
                    throw new IllegalArgumentException(sbO.toString().toString());
                }
                Path path = new Path();
                t tVar = aVar.f4819d;
                tVar.f5263c.getSelectionPath(iA, iA2, path);
                int i10 = tVar.f5265e;
                if (i10 != 0 && !path.isEmpty()) {
                    path.offset(0.0f, i10);
                }
                long jB = vd.a.b(0.0f, kVar.f4860f);
                Matrix matrix = new Matrix();
                matrix.setTranslate(f1.c.d(jB), f1.c.e(jB));
                path.transform(matrix);
                long j = f1.c.f5973b;
                iVar.f6883a.addPath(path, f1.c.d(j), f1.c.e(j));
                return qg.o.f13926a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, int i10, int i11, int i12) {
        super(1);
        this.f7963i = i12;
        this.f7965s = obj;
        this.f7964r = i10;
        this.f7966t = i11;
    }
}
