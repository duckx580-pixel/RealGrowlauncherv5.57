package ll;

import java.util.ArrayList;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final char[] f10118l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final Pattern f10119m = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10120a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bj.q f10121b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f10122c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public bj.p f10123d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final mf.c f10124e = new mf.c(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final bj.n f10125f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public bj.s f10126g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f10127h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mf.e f10128i;
    public final u5.s j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public bj.a0 f10129k;

    public h0(String str, bj.q qVar, String str2, bj.o oVar, bj.s sVar, boolean z3, boolean z10, boolean z11) {
        this.f10120a = str;
        this.f10121b = qVar;
        this.f10122c = str2;
        this.f10126g = sVar;
        this.f10127h = z3;
        if (oVar != null) {
            this.f10125f = oVar.k();
        } else {
            this.f10125f = new bj.n(0);
        }
        if (z10) {
            this.j = new u5.s(4);
            return;
        }
        if (z11) {
            mf.e eVar = new mf.e(8);
            this.f10128i = eVar;
            bj.s sVar2 = bj.u.f3194f;
            kotlin.jvm.internal.l.f("type", sVar2);
            if (sVar2.f3189b.equals("multipart")) {
                eVar.f11711t = sVar2;
            } else {
                throw new IllegalArgumentException(("multipart != " + sVar2).toString());
            }
        }
    }

    public final void a(String str, String str2, boolean z3) {
        u5.s sVar = this.j;
        if (z3) {
            sVar.getClass();
            kotlin.jvm.internal.l.f("name", str);
            ((ArrayList) sVar.f17712i).add(bj.b.b(0, 0, 83, str, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true));
            ((ArrayList) sVar.f17713r).add(bj.b.b(0, 0, 83, str2, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", true));
            return;
        }
        sVar.getClass();
        kotlin.jvm.internal.l.f("name", str);
        ((ArrayList) sVar.f17712i).add(bj.b.b(0, 0, 91, str, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false));
        ((ArrayList) sVar.f17713r).add(bj.b.b(0, 0, 91, str2, " !\"#$&'()+,/:;<=>?@[\\]^`{|}~", false));
    }

    public final void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f10125f.a(str, str2);
            return;
        }
        try {
            Pattern pattern = bj.s.f3186d;
            this.f10126g = o1.c.s(str2);
        } catch (IllegalArgumentException e8) {
            throw new IllegalArgumentException(android.support.v4.media.session.a.m("Malformed content type: ", str2), e8);
        }
    }

    public final void c(bj.o oVar, bj.a0 a0Var) {
        mf.e eVar = this.f10128i;
        eVar.getClass();
        kotlin.jvm.internal.l.f("body", a0Var);
        if (oVar.b("Content-Type") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Type");
        }
        if (oVar.b("Content-Length") != null) {
            throw new IllegalArgumentException("Unexpected header: Content-Length");
        }
        ((ArrayList) eVar.f11709r).add(new bj.t(oVar, a0Var));
    }

    public final void d(String str, String str2, boolean z3) {
        String str3 = this.f10122c;
        if (str3 != null) {
            bj.q qVar = this.f10121b;
            bj.p pVarF = qVar.f(str3);
            this.f10123d = pVarF;
            if (pVarF == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + qVar + ", Relative: " + this.f10122c);
            }
            this.f10122c = null;
        }
        if (z3) {
            bj.p pVar = this.f10123d;
            pVar.getClass();
            kotlin.jvm.internal.l.f("encodedName", str);
            if (pVar.f3174g == null) {
                pVar.f3174g = new ArrayList();
            }
            ArrayList arrayList = pVar.f3174g;
            kotlin.jvm.internal.l.c(arrayList);
            arrayList.add(bj.b.b(0, 0, 211, str, " \"'<>#&=", true));
            ArrayList arrayList2 = pVar.f3174g;
            kotlin.jvm.internal.l.c(arrayList2);
            arrayList2.add(str2 != null ? bj.b.b(0, 0, 211, str2, " \"'<>#&=", true) : null);
            return;
        }
        bj.p pVar2 = this.f10123d;
        pVar2.getClass();
        kotlin.jvm.internal.l.f("name", str);
        if (pVar2.f3174g == null) {
            pVar2.f3174g = new ArrayList();
        }
        ArrayList arrayList3 = pVar2.f3174g;
        kotlin.jvm.internal.l.c(arrayList3);
        arrayList3.add(bj.b.b(0, 0, 219, str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true));
        ArrayList arrayList4 = pVar2.f3174g;
        kotlin.jvm.internal.l.c(arrayList4);
        arrayList4.add(str2 != null ? bj.b.b(0, 0, 219, str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", true) : null);
    }
}
