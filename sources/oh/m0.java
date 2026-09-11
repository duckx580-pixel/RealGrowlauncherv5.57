package oh;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m0 implements Runnable, Comparable, g0 {
    private volatile Object _heap;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f12891i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f12892r = -1;

    public m0(long j) {
        this.f12891i = j;
    }

    public final int a(long j, n0 n0Var, o0 o0Var) {
        synchronized (this) {
            if (this._heap == x.f12931b) {
                return 2;
            }
            synchronized (n0Var) {
                try {
                    m0[] m0VarArr = n0Var.f17236a;
                    m0 m0Var = m0VarArr != null ? m0VarArr[0] : null;
                    if (o0.f12897y.get(o0Var) != 0) {
                        return 1;
                    }
                    if (m0Var == null) {
                        n0Var.f12895c = j;
                    } else {
                        long j10 = m0Var.f12891i;
                        if (j10 - j < 0) {
                            j = j10;
                        }
                        if (j - n0Var.f12895c > 0) {
                            n0Var.f12895c = j;
                        }
                    }
                    long j11 = this.f12891i;
                    long j12 = n0Var.f12895c;
                    if (j11 - j12 < 0) {
                        this.f12891i = j12;
                    }
                    n0Var.a(this);
                    return 0;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final void c(n0 n0Var) {
        if (this._heap == x.f12931b) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this._heap = n0Var;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        long j = this.f12891i - ((m0) obj).f12891i;
        if (j > 0) {
            return 1;
        }
        return j < 0 ? -1 : 0;
    }

    @Override // oh.g0
    public final void dispose() {
        synchronized (this) {
            try {
                Object obj = this._heap;
                lc.n nVar = x.f12931b;
                if (obj == nVar) {
                    return;
                }
                n0 n0Var = obj instanceof n0 ? (n0) obj : null;
                if (n0Var != null) {
                    synchronized (n0Var) {
                        Object obj2 = this._heap;
                        if ((obj2 instanceof th.v ? (th.v) obj2 : null) != null) {
                            n0Var.b(this.f12892r);
                        }
                    }
                }
                this._heap = nVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "Delayed[nanos=" + this.f12891i + ']';
    }
}
