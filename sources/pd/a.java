package pd;

import android.support.v4.media.session.b;
import hd.g;
import ie.c;
import kotlin.jvm.internal.l;
import oh.s;
import oh.t;
import oh.u;
import oh.v;
import oh.x;
import qe.e;
import th.d;
import ug.f;
import ug.h;

/* JADX INFO: loaded from: classes.dex */
public final class a implements u {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cd.a f13370i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final t f13371r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final d f13372s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final e f13373t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final g f13374u;

    public a(s sVar, cd.a aVar, g gVar, e eVar) {
        l.f("ioDispatcher", sVar);
        l.f("alternativeFlowReader", aVar);
        l.f("sendDiagnosticEvent", gVar);
        l.f("sdkMetricsSender", eVar);
        this.f13370i = aVar;
        this.f13374u = gVar;
        this.f13373t = eVar;
        d dVarA = x.a(sVar);
        this.f13372s = new d(dVarA.f17200i.e(new v("SDKErrorHandler")));
        this.f13371r = t.f12917i;
    }

    @Override // ug.h
    public final h e(h hVar) {
        return b.s(this, hVar);
    }

    @Override // oh.u
    public final void g(Throwable th2, h hVar) {
        l.f("context", hVar);
        l.f("exception", th2);
        StackTraceElement stackTraceElement = th2.getStackTrace()[0];
        String fileName = stackTraceElement != null ? stackTraceElement.getFileName() : null;
        if (fileName == null) {
            fileName = "unknown";
        }
        StackTraceElement stackTraceElement2 = th2.getStackTrace()[0];
        int lineNumber = stackTraceElement2 != null ? stackTraceElement2.getLineNumber() : 0;
        String str = th2 instanceof NullPointerException ? "native_exception_npe" : th2 instanceof OutOfMemoryError ? "native_exception_oom" : th2 instanceof IllegalStateException ? "native_exception_ise" : th2 instanceof SecurityException ? "native_exception_se" : th2 instanceof RuntimeException ? "native_exception_re" : "native_exception";
        boolean zU = this.f13370i.u();
        String str2 = fileName + '_' + lineNumber;
        c.b("Unity Ads SDK encountered an exception: " + str2);
        if (zU) {
            x.s(this.f13372s, null, 0, new androidx.work.e(this, str, str2, (ug.c) null), 3);
        } else {
            this.f13373t.a(new qe.a(4, str, str2));
        }
    }

    @Override // ug.f
    public final ug.g getKey() {
        return this.f13371r;
    }

    @Override // ug.h
    public final f i(ug.g gVar) {
        return b.i(this, gVar);
    }

    @Override // ug.h
    public final Object n(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ug.h
    public final h u(ug.g gVar) {
        return b.r(this, gVar);
    }
}
