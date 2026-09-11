package k1;

import android.graphics.Path;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g1.p f9049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9050c = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f9051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f9052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f9053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public g1.p f9054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f9055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f9056i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f9057k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f9058l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f9059m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f9060n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f9061o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f9062p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public i1.h f9063q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final g1.i f9064r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public g1.i f9065s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f9066t;

    public h() {
        int i10 = h0.f9067a;
        this.f9051d = rg.s.f14664i;
        this.f9052e = 1.0f;
        this.f9055h = 0;
        this.f9056i = 0;
        this.j = 4.0f;
        this.f9058l = 1.0f;
        this.f9060n = true;
        this.f9061o = true;
        g1.i iVarG = g1.f0.g();
        this.f9064r = iVarG;
        this.f9065s = iVarG;
        this.f9066t = android.support.v4.media.session.b.p(qg.e.f13909r, g.f9037r);
    }

    @Override // k1.c0
    public final void a(i1.d dVar) {
        i1.d dVar2;
        i1.h hVar;
        if (this.f9060n) {
            b.d(this.f9051d, this.f9064r);
            e();
        } else if (this.f9062p) {
            e();
        }
        this.f9060n = false;
        this.f9062p = false;
        g1.p pVar = this.f9049b;
        if (pVar != null) {
            dVar2 = dVar;
            i1.d.b0(dVar2, this.f9065s, pVar, this.f9050c, null, 56);
        } else {
            dVar2 = dVar;
        }
        g1.p pVar2 = this.f9054g;
        if (pVar2 != null) {
            i1.h hVar2 = this.f9063q;
            if (this.f9061o || hVar2 == null) {
                i1.h hVar3 = new i1.h(this.f9053f, this.j, this.f9055h, this.f9056i, 16);
                this.f9063q = hVar3;
                this.f9061o = false;
                hVar = hVar3;
            } else {
                hVar = hVar2;
            }
            i1.d.b0(dVar2, this.f9065s, pVar2, this.f9052e, hVar, 48);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, qg.d] */
    public final void e() {
        float f9 = this.f9057k;
        g1.i iVar = this.f9064r;
        if (f9 == 0.0f && this.f9058l == 1.0f) {
            this.f9065s = iVar;
            return;
        }
        if (kotlin.jvm.internal.l.a(this.f9065s, iVar)) {
            this.f9065s = g1.f0.g();
        } else {
            Path.FillType fillType = this.f9065s.f6883a.getFillType();
            Path.FillType fillType2 = Path.FillType.EVEN_ODD;
            boolean z3 = fillType == fillType2;
            this.f9065s.f6883a.rewind();
            Path path = this.f9065s.f6883a;
            if (!z3) {
                fillType2 = Path.FillType.WINDING;
            }
            path.setFillType(fillType2);
        }
        ?? r02 = this.f9066t;
        ((g1.j) r02.getValue()).f6888a.setPath(iVar != null ? iVar.f6883a : null, false);
        float length = ((g1.j) r02.getValue()).f6888a.getLength();
        float f10 = this.f9057k;
        float f11 = this.f9059m;
        float f12 = ((f10 + f11) % 1.0f) * length;
        float f13 = ((this.f9058l + f11) % 1.0f) * length;
        if (f12 <= f13) {
            ((g1.j) r02.getValue()).a(f12, f13, this.f9065s);
        } else {
            ((g1.j) r02.getValue()).a(f12, length, this.f9065s);
            ((g1.j) r02.getValue()).a(0.0f, f13, this.f9065s);
        }
    }

    public final String toString() {
        return this.f9064r.toString();
    }
}
