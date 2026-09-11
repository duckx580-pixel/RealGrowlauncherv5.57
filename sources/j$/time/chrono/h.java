package j$.time.chrono;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8474e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f8476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8477c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f8478d;

    static {
        j$.time.b.a(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public h(m mVar, int i10, int i11, int i12) {
        this.f8475a = mVar;
        this.f8476b = i10;
        this.f8477c = i11;
        this.f8478d = i12;
    }

    public final String toString() {
        if (this.f8476b == 0 && this.f8477c == 0 && this.f8478d == 0) {
            return this.f8475a.toString() + " P0D";
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f8475a.toString());
        sb2.append(" P");
        int i10 = this.f8476b;
        if (i10 != 0) {
            sb2.append(i10);
            sb2.append('Y');
        }
        int i11 = this.f8477c;
        if (i11 != 0) {
            sb2.append(i11);
            sb2.append('M');
        }
        int i12 = this.f8478d;
        if (i12 != 0) {
            sb2.append(i12);
            sb2.append('D');
        }
        return sb2.toString();
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m s(j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar.b(j$.time.temporal.s.f8651b);
        if (mVar2 == null || this.f8475a.equals(mVar2)) {
            if (this.f8477c != 0) {
                j$.time.temporal.v vVarY = this.f8475a.y(j$.time.temporal.a.MONTH_OF_YEAR);
                long j = (vVarY.f8657a == vVarY.f8658b && vVarY.f8659c == vVarY.f8660d && vVarY.d()) ? (vVarY.f8660d - vVarY.f8657a) + 1 : -1L;
                if (j > 0) {
                    mVar = mVar.l((((long) this.f8476b) * j) + ((long) this.f8477c), j$.time.temporal.b.MONTHS);
                } else {
                    int i10 = this.f8476b;
                    if (i10 != 0) {
                        mVar = mVar.l(i10, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.l(this.f8477c, j$.time.temporal.b.MONTHS);
                }
            } else {
                int i11 = this.f8476b;
                if (i11 != 0) {
                    mVar = mVar.l(i11, j$.time.temporal.b.YEARS);
                }
            }
            int i12 = this.f8478d;
            return i12 != 0 ? mVar.l(i12, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + this.f8475a.q() + ", actual: " + mVar2.q());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (this.f8476b == hVar.f8476b && this.f8477c == hVar.f8477c && this.f8478d == hVar.f8478d && this.f8475a.equals(hVar.f8475a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Integer.rotateLeft(this.f8478d, 16) + (Integer.rotateLeft(this.f8477c, 8) + this.f8476b)) ^ this.f8475a.hashCode();
    }

    public Object writeReplace() {
        return new f0((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
