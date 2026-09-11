package oh;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h0 f12887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.c f12888c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f12889d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f12890e;

    public m(Object obj, h0 h0Var, eh.c cVar, Object obj2, Throwable th2) {
        this.f12886a = obj;
        this.f12887b = h0Var;
        this.f12888c = cVar;
        this.f12889d = obj2;
        this.f12890e = th2;
    }

    public static m a(m mVar, h0 h0Var, CancellationException cancellationException, int i10) {
        Object obj = mVar.f12886a;
        if ((i10 & 2) != 0) {
            h0Var = mVar.f12887b;
        }
        h0 h0Var2 = h0Var;
        eh.c cVar = mVar.f12888c;
        Object obj2 = mVar.f12889d;
        Throwable th2 = cancellationException;
        if ((i10 & 16) != 0) {
            th2 = mVar.f12890e;
        }
        return new m(obj, h0Var2, cVar, obj2, th2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return kotlin.jvm.internal.l.a(this.f12886a, mVar.f12886a) && kotlin.jvm.internal.l.a(this.f12887b, mVar.f12887b) && kotlin.jvm.internal.l.a(this.f12888c, mVar.f12888c) && kotlin.jvm.internal.l.a(this.f12889d, mVar.f12889d) && kotlin.jvm.internal.l.a(this.f12890e, mVar.f12890e);
    }

    public final int hashCode() {
        Object obj = this.f12886a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        h0 h0Var = this.f12887b;
        int iHashCode2 = (iHashCode + (h0Var == null ? 0 : h0Var.hashCode())) * 31;
        eh.c cVar = this.f12888c;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        Object obj2 = this.f12889d;
        int iHashCode4 = (iHashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f12890e;
        return iHashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public final String toString() {
        return "CompletedContinuation(result=" + this.f12886a + ", cancelHandler=" + this.f12887b + ", onCancellation=" + this.f12888c + ", idempotentResume=" + this.f12889d + ", cancelCause=" + this.f12890e + ')';
    }

    public /* synthetic */ m(Object obj, h0 h0Var, eh.c cVar, CancellationException cancellationException, int i10) {
        this(obj, (i10 & 2) != 0 ? null : h0Var, (i10 & 4) != 0 ? null : cVar, (Object) null, (i10 & 16) != 0 ? null : cancellationException);
    }
}
