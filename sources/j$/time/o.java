package j$.time;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements j$.time.temporal.n, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8615c = 0;
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f8616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8617b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i10 = this.f8616a - oVar.f8616a;
        return i10 == 0 ? this.f8617b - oVar.f8617b : i10;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.d("--");
        oVar.g(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        oVar.c('-');
        oVar.g(j$.time.temporal.a.DAY_OF_MONTH, 2);
        oVar.l(Locale.getDefault(), j$.time.format.w.SMART, null);
    }

    public o(int i10, int i11) {
        this.f8616a = i10;
        this.f8617b = i11;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH : rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.I();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.k(rVar);
        }
        m mVarI = m.I(this.f8616a);
        mVarI.getClass();
        int i10 = l.f8611a[mVarI.ordinal()];
        return j$.time.temporal.v.g(i10 != 1 ? (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5) ? 30 : 31 : 28, m.I(this.f8616a).F());
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.r rVar) {
        return k(rVar).a(g(rVar), rVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.r rVar) {
        int i10;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.P(this);
        }
        int i11 = n.f8614a[((j$.time.temporal.a) rVar).ordinal()];
        if (i11 == 1) {
            i10 = this.f8617b;
        } else {
            if (i11 != 2) {
                throw new j$.time.temporal.u(d.a("Unsupported field: ", rVar));
            }
            i10 = this.f8616a;
        }
        return i10;
    }

    @Override // j$.time.temporal.n
    public final Object b(z zVar) {
        if (zVar == j$.time.temporal.s.f8651b) {
            return j$.time.chrono.t.f8504c;
        }
        return super.b(zVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.r(mVar).equals(j$.time.chrono.t.f8504c)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarI = mVar.i(this.f8616a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarI.i(Math.min(mVarI.k(aVar).f8660d, this.f8617b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f8616a == oVar.f8616a && this.f8617b == oVar.f8617b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8616a << 6) + this.f8617b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(10);
        sb2.append("--");
        sb2.append(this.f8616a < 10 ? "0" : PredefinedUICustomizationFont.defaultFamily);
        sb2.append(this.f8616a);
        sb2.append(this.f8617b < 10 ? "-0" : "-");
        sb2.append(this.f8617b);
        return sb2.toString();
    }

    private Object writeReplace() {
        return new s((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
