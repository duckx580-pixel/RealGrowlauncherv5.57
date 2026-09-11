package zc;

import java.io.IOException;
import java.io.StringWriter;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final StringWriter f21008a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f21009b;

    public n() {
        StringWriter stringWriter = new StringWriter();
        this.f21008a = stringWriter;
        this.f21009b = new y(stringWriter);
    }

    public static String b(Map map) {
        n nVar = new n();
        try {
            nVar.f21009b.c(map);
            return nVar.toString();
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    @Override // zc.q
    public final void a(StringWriter stringWriter) {
        try {
            this.f21009b.f21284i.flush();
            stringWriter.write(this.f21008a.toString());
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void c(long j) {
        try {
            y yVar = this.f21009b;
            yVar.i(false);
            yVar.f21284i.write(Long.toString(j));
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void d(Number number) {
        try {
            this.f21009b.a(number);
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void e(String str) {
        try {
            this.f21009b.e(str);
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void f(String str) {
        try {
            y yVar = this.f21009b;
            if (str == null) {
                yVar.o();
            } else {
                yVar.i(false);
                yVar.m(str);
            }
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void g() {
        try {
            y yVar = this.f21009b;
            v vVar = v.f21165s;
            yVar.i(true);
            yVar.f21285r.add(vVar);
            yVar.f21284i.write("{");
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final void h() {
        try {
            this.f21009b.h(v.f21165s, v.f21167u, "}");
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }

    public final String toString() {
        try {
            this.f21009b.f21284i.flush();
            return this.f21008a.toString();
        } catch (IOException e8) {
            i3.c(e8);
            throw null;
        }
    }
}
