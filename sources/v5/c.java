package v5;

import a8.w;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m5.p f18580s;

    public c(m5.p pVar) {
        this.f18580s = pVar;
    }

    @Override // a8.w
    public final void b() {
        m5.p pVar = this.f18580s;
        WorkDatabase workDatabase = pVar.f11611c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().g().iterator();
            while (it.hasNext()) {
                w.a(pVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
        } catch (Throwable th2) {
            workDatabase.k();
            throw th2;
        }
    }
}
