package x4;

import androidx.work.impl.WorkDatabase;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f19463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f19464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qg.k f19465c;

    public l(WorkDatabase workDatabase) {
        kotlin.jvm.internal.l.f("database", workDatabase);
        this.f19463a = workDatabase;
        this.f19464b = new AtomicBoolean(false);
        this.f19465c = android.support.v4.media.session.b.q(new p1.g(24, this));
    }

    public final c5.i a() {
        this.f19463a.a();
        return this.f19464b.compareAndSet(false, true) ? (c5.i) this.f19465c.getValue() : b();
    }

    public final c5.i b() {
        String strC = c();
        WorkDatabase workDatabase = this.f19463a;
        workDatabase.getClass();
        workDatabase.a();
        workDatabase.b();
        return workDatabase.h().E().e(strC);
    }

    public abstract String c();

    public final void d(c5.i iVar) {
        kotlin.jvm.internal.l.f("statement", iVar);
        if (iVar == ((c5.i) this.f19465c.getValue())) {
            this.f19464b.set(false);
        }
    }
}
