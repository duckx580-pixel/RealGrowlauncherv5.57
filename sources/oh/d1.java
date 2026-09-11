package oh;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 implements t0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final AtomicIntegerFieldUpdater f12856r = AtomicIntegerFieldUpdater.newUpdater(d1.class, "_isCompleting");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12857s = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_rootCause");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater f12858t = AtomicReferenceFieldUpdater.newUpdater(d1.class, Object.class, "_exceptionsHolder");
    private volatile Object _exceptionsHolder;
    private volatile int _isCompleting = 0;
    private volatile Object _rootCause;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i1 f12859i;

    public d1(i1 i1Var, Throwable th2) {
        this.f12859i = i1Var;
        this._rootCause = th2;
    }

    @Override // oh.t0
    public final boolean a() {
        return c() == null;
    }

    public final void b(Throwable th2) {
        Throwable thC = c();
        if (thC == null) {
            f12857s.set(this, th2);
            return;
        }
        if (th2 == thC) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12858t;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            atomicReferenceFieldUpdater.set(this, th2);
            return;
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof ArrayList) {
                ((ArrayList) obj).add(th2);
                return;
            } else {
                throw new IllegalStateException(("State is " + obj).toString());
            }
        }
        if (th2 == obj) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(th2);
        atomicReferenceFieldUpdater.set(this, arrayList);
    }

    public final Throwable c() {
        return (Throwable) f12857s.get(this);
    }

    @Override // oh.t0
    public final i1 d() {
        return this.f12859i;
    }

    public final boolean e() {
        return c() != null;
    }

    public final boolean f() {
        return f12856r.get(this) != 0;
    }

    public final ArrayList g(Throwable th2) {
        ArrayList arrayList;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f12858t;
        Object obj = atomicReferenceFieldUpdater.get(this);
        if (obj == null) {
            arrayList = new ArrayList(4);
        } else if (obj instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(obj);
            arrayList = arrayList2;
        } else {
            if (!(obj instanceof ArrayList)) {
                throw new IllegalStateException(("State is " + obj).toString());
            }
            arrayList = (ArrayList) obj;
        }
        Throwable thC = c();
        if (thC != null) {
            arrayList.add(0, thC);
        }
        if (th2 != null && !th2.equals(thC)) {
            arrayList.add(th2);
        }
        atomicReferenceFieldUpdater.set(this, x.f12937h);
        return arrayList;
    }

    public final String toString() {
        return "Finishing[cancelling=" + e() + ", completing=" + f() + ", rootCause=" + c() + ", exceptions=" + f12858t.get(this) + ", list=" + this.f12859i + ']';
    }
}
