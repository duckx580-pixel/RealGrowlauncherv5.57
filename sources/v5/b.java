package v5;

import a8.w;
import androidx.work.impl.WorkDatabase;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m5.p f18578s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ UUID f18579t;

    public b(m5.p pVar, UUID uuid) {
        this.f18578s = pVar;
        this.f18579t = uuid;
    }

    @Override // a8.w
    public final void b() {
        m5.p pVar = this.f18578s;
        WorkDatabase workDatabase = pVar.f11611c;
        workDatabase.c();
        try {
            w.a(pVar, this.f18579t.toString());
            workDatabase.o();
            workDatabase.k();
            m5.j.a(pVar.f11610b, pVar.f11611c, pVar.f11613e);
        } catch (Throwable th2) {
            workDatabase.k();
            throw th2;
        }
    }
}
