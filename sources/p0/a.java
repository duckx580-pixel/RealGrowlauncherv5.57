package p0;

import java.util.ArrayList;
import ka.a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o0.o f13185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public l5.o f13186b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13187c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f13190f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13191g;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13195l;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bk.c f13188d = new bk.c(1, (byte) 0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13189e = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final bj.n f13192h = new bj.n(2);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13193i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13194k = -1;

    public a(o0.o oVar, l5.o oVar2) {
        this.f13185a = oVar;
        this.f13186b = oVar2;
    }

    public final void a() {
        bj.n nVar = this.f13192h;
        if (nVar.f3166a.isEmpty()) {
            this.f13191g++;
        } else {
            nVar.f3166a.remove(r0.size() - 1);
        }
    }

    public final void b() {
        int i10;
        a aVar = this;
        int i11 = aVar.f13191g;
        int i12 = 0;
        if (i11 > 0) {
            a0 a0Var = (a0) aVar.f13186b.f9810i;
            x xVar = x.f13230c;
            int i13 = xVar.f13233b;
            a0Var.h(xVar);
            a1.E(a0Var, 0, i11);
            int i14 = a0Var.f13202g;
            int i15 = xVar.f13232a;
            i10 = 1;
            if (i14 != a0.a(a0Var, i15) || a0Var.f13203h != a0.a(a0Var, i13)) {
                StringBuilder sb2 = new StringBuilder();
                int i16 = 0;
                while (i16 < i15) {
                    int i17 = i15;
                    if (((1 << i16) & a0Var.f13202g) != 0) {
                        if (i12 > 0) {
                            sb2.append(", ");
                        }
                        sb2.append(xVar.b(i16));
                        i12++;
                    }
                    i16++;
                    i15 = i17;
                }
                String string = sb2.toString();
                StringBuilder sbN = k0.g.n(string, "StringBuilder().apply(builderAction).toString()");
                int i18 = 0;
                int i19 = 0;
                while (i19 < i13) {
                    int i20 = i13;
                    if (((1 << i19) & a0Var.f13203h) != 0) {
                        if (i12 > 0) {
                            sbN.append(", ");
                        }
                        sbN.append(xVar.c(i19));
                        i18++;
                    }
                    i19++;
                    i13 = i20;
                }
                String string2 = sbN.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                StringBuilder sb3 = new StringBuilder("Error while pushing ");
                sb3.append(xVar);
                sb3.append(". Not all arguments were provided. Missing ");
                k0.g.x(sb3, i12, " int arguments (", string, ") and ");
                throw new IllegalStateException(k0.g.j(sb3, i18, " object arguments (", string2, ").").toString());
            }
            aVar.f13191g = 0;
        } else {
            i10 = 1;
            aVar = this;
        }
        bj.n nVar = aVar.f13192h;
        ArrayList arrayList = nVar.f3166a;
        ArrayList arrayList2 = nVar.f3166a;
        if (arrayList.isEmpty()) {
            return;
        }
        l5.o oVar = aVar.f13186b;
        int size = arrayList2.size();
        Object[] objArr = new Object[size];
        for (int i21 = 0; i21 < size; i21++) {
            objArr[i21] = arrayList2.get(i21);
        }
        oVar.getClass();
        if (size != 0) {
            a0 a0Var2 = (a0) oVar.f9810i;
            e eVar = e.f13208c;
            int i22 = eVar.f13233b;
            int i23 = eVar.f13232a;
            a0Var2.h(eVar);
            a1.G(a0Var2, 0, objArr);
            if (a0Var2.f13202g != a0.a(a0Var2, i23) || a0Var2.f13203h != a0.a(a0Var2, i22)) {
                StringBuilder sb4 = new StringBuilder();
                int i24 = 0;
                for (int i25 = 0; i25 < i23; i25++) {
                    if (((i10 << i25) & a0Var2.f13202g) != 0) {
                        if (i24 > 0) {
                            sb4.append(", ");
                        }
                        sb4.append(eVar.b(i25));
                        i24++;
                    }
                }
                String string3 = sb4.toString();
                StringBuilder sbN2 = k0.g.n(string3, "StringBuilder().apply(builderAction).toString()");
                int i26 = 0;
                int i27 = 0;
                while (i26 < i22) {
                    int i28 = i22;
                    if (((i10 << i26) & a0Var2.f13203h) != 0) {
                        if (i24 > 0) {
                            sbN2.append(", ");
                        }
                        sbN2.append(eVar.c(i26));
                        i27++;
                    }
                    i26++;
                    i22 = i28;
                }
                String string4 = sbN2.toString();
                kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
                StringBuilder sb5 = new StringBuilder("Error while pushing ");
                sb5.append(eVar);
                sb5.append(". Not all arguments were provided. Missing ");
                k0.g.x(sb5, i24, " int arguments (", string3, ") and ");
                throw new IllegalStateException(k0.g.j(sb5, i27, " object arguments (", string4, ").").toString());
            }
        }
        arrayList2.clear();
    }

    public final void c() {
        int i10 = this.f13195l;
        if (i10 > 0) {
            int i11 = this.f13193i;
            if (i11 >= 0) {
                b();
                a0 a0Var = (a0) this.f13186b.f9810i;
                r rVar = r.f13224c;
                int i12 = rVar.f13233b;
                a0Var.h(rVar);
                a1.E(a0Var, 0, i11);
                a1.E(a0Var, 1, i10);
                int i13 = a0Var.f13202g;
                int i14 = rVar.f13232a;
                if (i13 != a0.a(a0Var, i14) || a0Var.f13203h != a0.a(a0Var, i12)) {
                    StringBuilder sb2 = new StringBuilder();
                    int i15 = 0;
                    int i16 = 0;
                    while (i16 < i14) {
                        int i17 = i14;
                        if (((1 << i16) & a0Var.f13202g) != 0) {
                            if (i15 > 0) {
                                sb2.append(", ");
                            }
                            sb2.append(rVar.b(i16));
                            i15++;
                        }
                        i16++;
                        i14 = i17;
                    }
                    String string = sb2.toString();
                    StringBuilder sbN = k0.g.n(string, "StringBuilder().apply(builderAction).toString()");
                    int i18 = 0;
                    int i19 = 0;
                    while (i19 < i12) {
                        int i20 = i12;
                        if (((1 << i19) & a0Var.f13203h) != 0) {
                            if (i15 > 0) {
                                sbN.append(", ");
                            }
                            sbN.append(rVar.c(i19));
                            i18++;
                        }
                        i19++;
                        i12 = i20;
                    }
                    String string2 = sbN.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
                    StringBuilder sb3 = new StringBuilder("Error while pushing ");
                    sb3.append(rVar);
                    sb3.append(". Not all arguments were provided. Missing ");
                    k0.g.x(sb3, i15, " int arguments (", string, ") and ");
                    throw new IllegalStateException(k0.g.j(sb3, i18, " object arguments (", string2, ").").toString());
                }
                this.f13193i = -1;
            } else {
                int i21 = this.f13194k;
                int i22 = this.j;
                b();
                a0 a0Var2 = (a0) this.f13186b.f9810i;
                o oVar = o.f13221c;
                int i23 = oVar.f13233b;
                a0Var2.h(oVar);
                a1.E(a0Var2, 1, i21);
                a1.E(a0Var2, 0, i22);
                a1.E(a0Var2, 2, i10);
                int i24 = a0Var2.f13202g;
                int i25 = oVar.f13232a;
                if (i24 != a0.a(a0Var2, i25) || a0Var2.f13203h != a0.a(a0Var2, i23)) {
                    int i26 = 0;
                    StringBuilder sb4 = new StringBuilder();
                    for (int i27 = 0; i27 < i25; i27++) {
                        if (((1 << i27) & a0Var2.f13202g) != 0) {
                            if (i26 > 0) {
                                sb4.append(", ");
                            }
                            sb4.append(oVar.b(i27));
                            i26++;
                        }
                    }
                    String string3 = sb4.toString();
                    StringBuilder sbN2 = k0.g.n(string3, "StringBuilder().apply(builderAction).toString()");
                    int i28 = 0;
                    int i29 = 0;
                    while (i28 < i23) {
                        int i30 = i23;
                        if (((1 << i28) & a0Var2.f13203h) != 0) {
                            if (i26 > 0) {
                                sbN2.append(", ");
                            }
                            sbN2.append(oVar.c(i28));
                            i29++;
                        }
                        i28++;
                        i23 = i30;
                    }
                    String string4 = sbN2.toString();
                    kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string4);
                    StringBuilder sb5 = new StringBuilder("Error while pushing ");
                    sb5.append(oVar);
                    sb5.append(". Not all arguments were provided. Missing ");
                    k0.g.x(sb5, i26, " int arguments (", string3, ") and ");
                    throw new IllegalStateException(k0.g.j(sb5, i29, " object arguments (", string4, ").").toString());
                }
                this.j = -1;
                this.f13194k = -1;
            }
            this.f13195l = 0;
        }
    }

    public final void d(boolean z3) {
        o0.o oVar = this.f13185a;
        int i10 = z3 ? oVar.F.f12554h : oVar.F.f12551e;
        int i11 = i10 - this.f13190f;
        if (i11 < 0) {
            o0.p.v("Tried to seek backward");
            throw null;
        }
        if (i11 > 0) {
            a0 a0Var = (a0) this.f13186b.f9810i;
            c cVar = c.f13206c;
            int i12 = cVar.f13233b;
            a0Var.h(cVar);
            a1.E(a0Var, 0, i11);
            int i13 = a0Var.f13202g;
            int i14 = cVar.f13232a;
            if (i13 == a0.a(a0Var, i14) && a0Var.f13203h == a0.a(a0Var, i12)) {
                this.f13190f = i10;
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            int i15 = 0;
            for (int i16 = 0; i16 < i14; i16++) {
                if (((1 << i16) & a0Var.f13202g) != 0) {
                    if (i15 > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(cVar.b(i16));
                    i15++;
                }
            }
            String string = sb2.toString();
            StringBuilder sbN = k0.g.n(string, "StringBuilder().apply(builderAction).toString()");
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                if (((1 << i18) & a0Var.f13203h) != 0) {
                    if (i15 > 0) {
                        sbN.append(", ");
                    }
                    sbN.append(cVar.c(i18));
                    i17++;
                }
            }
            String string2 = sbN.toString();
            kotlin.jvm.internal.l.e("StringBuilder().apply(builderAction).toString()", string2);
            StringBuilder sb3 = new StringBuilder("Error while pushing ");
            sb3.append(cVar);
            sb3.append(". Not all arguments were provided. Missing ");
            k0.g.x(sb3, i15, " int arguments (", string, ") and ");
            throw new IllegalStateException(k0.g.j(sb3, i17, " object arguments (", string2, ").").toString());
        }
    }

    public final void e(int i10, int i11) {
        if (i11 > 0) {
            if (i10 < 0) {
                o0.p.v(("Invalid remove index " + i10).toString());
                throw null;
            }
            if (this.f13193i == i10) {
                this.f13195l += i11;
                return;
            }
            c();
            this.f13193i = i10;
            this.f13195l = i11;
        }
    }
}
