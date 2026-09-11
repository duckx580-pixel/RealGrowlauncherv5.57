package zc;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Flushable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f20913i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j3 f20914r = this;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public h f20915s;

    public j3(File file) {
        this.f20913i = file;
        try {
            this.f20915s = new f(new a1(file, new mc.a()));
        } catch (Exception unused) {
            g();
        }
    }

    public final int a() {
        int size;
        synchronized (this.f20914r) {
            try {
                try {
                    size = this.f20915s.size();
                } catch (Exception unused) {
                    g();
                    return 0;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return size;
    }

    public final void c(w0 w0Var) {
        synchronized (this.f20914r) {
            try {
                this.f20915s.add(w0Var);
            } catch (Exception unused) {
                g();
                try {
                    this.f20915s.add(w0Var);
                } catch (Exception unused2) {
                }
            }
        }
    }

    public final w0 e(int i10) {
        w0 w0Var;
        synchronized (this.f20914r) {
            try {
                try {
                    w0Var = (w0) this.f20915s.C(i10);
                } catch (Exception unused) {
                    g();
                    return null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return w0Var;
    }

    public final boolean f() {
        boolean zIsEmpty;
        synchronized (this.f20914r) {
            try {
                try {
                    zIsEmpty = this.f20915s.isEmpty();
                } catch (Exception unused) {
                    g();
                    return true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zIsEmpty;
    }

    @Override // java.io.Flushable
    public final void flush() {
        synchronized (this.f20914r) {
            h hVar = this.f20915s;
            if (hVar instanceof Flushable) {
                try {
                    ((Flushable) hVar).flush();
                } catch (Exception unused) {
                    g();
                }
            }
        }
    }

    public final void g() {
        this.f20913i.delete();
        h hVar = this.f20915s;
        if (hVar instanceof Closeable) {
            try {
                ((Closeable) hVar).close();
            } catch (Exception unused) {
            }
        }
        this.f20915s = new g(new LinkedList());
    }
}
