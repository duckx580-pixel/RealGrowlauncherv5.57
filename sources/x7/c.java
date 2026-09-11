package x7;

import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Semaphore;
import java.util.concurrent.ThreadPoolExecutor;
import ka.a1;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p4.b f19473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f19474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f19475c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19476d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f19477e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Executor f19478f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile q4.a f19479g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile q4.a f19480h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Semaphore f19481i;
    public final Set j;

    public c(SignInHubActivity signInHubActivity, Set set) {
        ThreadPoolExecutor threadPoolExecutor = q4.a.f13783x;
        this.f19474b = false;
        this.f19475c = false;
        this.f19476d = true;
        this.f19477e = false;
        signInHubActivity.getApplicationContext();
        this.f19478f = threadPoolExecutor;
        this.f19481i = new Semaphore(0);
        this.j = set;
    }

    public final void a() {
        if (this.f19479g != null) {
            if (!this.f19474b) {
                this.f19477e = true;
            }
            if (this.f19480h != null) {
                this.f19479g.getClass();
                this.f19479g = null;
                return;
            }
            this.f19479g.getClass();
            q4.a aVar = this.f19479g;
            aVar.f13789t.set(true);
            if (aVar.f13787r.cancel(false)) {
                this.f19480h = this.f19479g;
            }
            this.f19479g = null;
        }
    }

    public final void b() {
        if (this.f19480h != null || this.f19479g == null) {
            return;
        }
        this.f19479g.getClass();
        q4.a aVar = this.f19479g;
        Executor executor = this.f19478f;
        if (aVar.f13788s == 1) {
            aVar.f13788s = 2;
            aVar.f13786i.getClass();
            executor.execute(aVar.f13787r);
        } else {
            int iC = t.g.c(aVar.f13788s);
            if (iC == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
            if (iC == 2) {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            throw new IllegalStateException("We should never reach this state");
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(64);
        a1.j(this, sb2);
        sb2.append(" id=");
        sb2.append(0);
        sb2.append("}");
        return sb2.toString();
    }
}
