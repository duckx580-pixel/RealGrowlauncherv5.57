package v8;

import a8.q;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executor;
import s8.o2;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements e, d, b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f18632i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Executor f18633r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f18634s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f18635t;

    public /* synthetic */ k(Executor executor, Object obj, l lVar, int i10) {
        this.f18632i = i10;
        this.f18633r = executor;
        this.f18635t = obj;
        this.f18634s = lVar;
    }

    public final void a(Task task) {
        switch (this.f18632i) {
            case 0:
                this.f18633r.execute(new o2(17, this, task, false));
                return;
            case 1:
                this.f18633r.execute(new q(27, this, task));
                return;
            case 2:
                if (((l) task).f18639d) {
                    synchronized (this.f18635t) {
                        break;
                    }
                    this.f18633r.execute(new q(28, this));
                    return;
                }
                return;
            case 3:
                synchronized (this.f18635t) {
                    break;
                }
                this.f18633r.execute(new o2(18, this, task, false));
                return;
            case 4:
                if (task.e() || ((l) task).f18639d) {
                    return;
                }
                synchronized (this.f18635t) {
                    break;
                }
                this.f18633r.execute(new o2(19, this, task, false));
                return;
            case 5:
                if (task.e()) {
                    synchronized (this.f18635t) {
                        break;
                    }
                    this.f18633r.execute(new o2(20, this, task, false));
                    return;
                }
                return;
            default:
                this.f18633r.execute(new o2(21, this, task, false));
                return;
        }
    }

    @Override // v8.e
    public void f(Object obj) {
        switch (this.f18632i) {
            case 1:
                ((l) this.f18634s).j(obj);
                break;
            default:
                ((l) this.f18634s).j(obj);
                break;
        }
    }

    @Override // v8.b
    public void r() {
        switch (this.f18632i) {
            case 1:
                ((l) this.f18634s).k();
                break;
            default:
                ((l) this.f18634s).k();
                break;
        }
    }

    @Override // v8.d
    public void y(Exception exc) {
        switch (this.f18632i) {
            case 1:
                ((l) this.f18634s).i(exc);
                break;
            default:
                ((l) this.f18634s).i(exc);
                break;
        }
    }

    public k(Executor executor, b bVar) {
        this.f18632i = 2;
        this.f18635t = new Object();
        this.f18633r = executor;
        this.f18634s = bVar;
    }

    public k(Executor executor, c cVar) {
        this.f18632i = 3;
        this.f18635t = new Object();
        this.f18633r = executor;
        this.f18634s = cVar;
    }

    public k(Executor executor, d dVar) {
        this.f18632i = 4;
        this.f18635t = new Object();
        this.f18633r = executor;
        this.f18634s = dVar;
    }

    public k(Executor executor, e eVar) {
        this.f18632i = 5;
        this.f18635t = new Object();
        this.f18633r = executor;
        this.f18634s = eVar;
    }
}
