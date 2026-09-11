package qe;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;
import kotlin.jvm.internal.l;
import zd.h;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f13896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedBlockingQueue f13897b;

    public b(e eVar, h hVar) {
        l.f("_original", eVar);
        this.f13896a = eVar;
        this.f13897b = new LinkedBlockingQueue();
    }

    @Override // qe.e
    public final void a(a aVar) {
        d(sb.c.C(aVar));
    }

    @Override // qe.e
    public final String b() {
        return this.f13896a.b();
    }

    @Override // qe.e
    public final void c(re.c cVar) {
        d(sb.c.C(new a("native_webview_render_process_gone", (Object) null, cVar)));
    }

    @Override // qe.e
    public final void d(List list) {
        synchronized (this) {
            this.f13897b.addAll(list);
            if (!TextUtils.isEmpty(this.f13896a.b()) && this.f13897b.size() > 0) {
                ArrayList arrayList = new ArrayList();
                this.f13897b.drainTo(arrayList);
                this.f13896a.d(arrayList);
            }
        }
    }
}
