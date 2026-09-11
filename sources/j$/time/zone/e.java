package j$.time.zone;

import j$.time.ZoneOffset;
import j$.time.k;
import j$.time.m;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f8682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f8683b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j$.time.e f8684c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k f8685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f8686e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f8687f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ZoneOffset f8688g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ZoneOffset f8689h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ZoneOffset f8690i;

    public e(m mVar, int i10, j$.time.e eVar, k kVar, boolean z3, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f8682a = mVar;
        this.f8683b = (byte) i10;
        this.f8684c = eVar;
        this.f8685d = kVar;
        this.f8686e = z3;
        this.f8687f = dVar;
        this.f8688g = zoneOffset;
        this.f8689h = zoneOffset2;
        this.f8690i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int iE0 = this.f8686e ? 86400 : this.f8685d.e0();
        int i10 = this.f8688g.f8453b;
        int i11 = this.f8689h.f8453b - i10;
        int i12 = this.f8690i.f8453b - i10;
        byte b4 = iE0 % 3600 == 0 ? this.f8686e ? (byte) 24 : this.f8685d.f8607a : (byte) 31;
        int i13 = i10 % 900 == 0 ? (i10 / 900) + 128 : 255;
        int i14 = (i11 == 0 || i11 == 1800 || i11 == 3600) ? i11 / 1800 : 3;
        int i15 = (i12 == 0 || i12 == 1800 || i12 == 3600) ? i12 / 1800 : 3;
        j$.time.e eVar = this.f8684c;
        dataOutput.writeInt((this.f8682a.getValue() << 28) + ((this.f8683b + 32) << 22) + ((eVar == null ? 0 : eVar.getValue()) << 19) + (b4 << 14) + (this.f8687f.ordinal() << 12) + (i13 << 4) + (i14 << 2) + i15);
        if (b4 == 31) {
            dataOutput.writeInt(iE0);
        }
        if (i13 == 255) {
            dataOutput.writeInt(i10);
        }
        if (i14 == 3) {
            dataOutput.writeInt(this.f8689h.f8453b);
        }
        if (i15 == 3) {
            dataOutput.writeInt(this.f8690i.f8453b);
        }
    }

    public static e a(DataInput dataInput) {
        d dVar;
        k kVarA;
        int i10;
        int i11;
        int i12 = dataInput.readInt();
        m mVarI = m.I(i12 >>> 28);
        int i13 = ((264241152 & i12) >>> 22) - 32;
        int i14 = (3670016 & i12) >>> 19;
        j$.time.e eVarS = i14 == 0 ? null : j$.time.e.s(i14);
        int i15 = (507904 & i12) >>> 14;
        d dVar2 = d.values()[(i12 & 12288) >>> 12];
        int i16 = (i12 & 4080) >>> 4;
        int i17 = (i12 & 12) >>> 2;
        int i18 = i12 & 3;
        if (i15 == 31) {
            long j = dataInput.readInt();
            k kVar = k.f8603e;
            j$.time.temporal.a.SECOND_OF_DAY.X(j);
            int i19 = (int) (j / 3600);
            long j10 = j - ((long) (i19 * 3600));
            int i20 = (int) (j10 / 60);
            dVar = dVar2;
            kVarA = k.A(i19, i20, (int) (j10 - ((long) (i20 * 60))), 0);
        } else {
            dVar = dVar2;
            int i21 = i15 % 24;
            k kVar2 = k.f8603e;
            j$.time.temporal.a.HOUR_OF_DAY.X(i21);
            kVarA = k.f8606h[i21];
        }
        ZoneOffset zoneOffsetZ = ZoneOffset.Z(i16 == 255 ? dataInput.readInt() : (i16 - 128) * 900);
        if (i17 == 3) {
            i10 = dataInput.readInt();
        } else {
            i10 = (i17 * 1800) + zoneOffsetZ.f8453b;
        }
        ZoneOffset zoneOffsetZ2 = ZoneOffset.Z(i10);
        if (i18 == 3) {
            i11 = dataInput.readInt();
        } else {
            i11 = (i18 * 1800) + zoneOffsetZ.f8453b;
        }
        ZoneOffset zoneOffsetZ3 = ZoneOffset.Z(i11);
        boolean z3 = i15 == 24;
        Objects.requireNonNull(mVarI, "month");
        Objects.requireNonNull(kVarA, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        if (i13 < -28 || i13 > 31 || i13 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z3 && !kVarA.equals(k.f8605g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarA.f8610d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(mVarI, i13, eVarS, kVarA, z3, dVar3, zoneOffsetZ, zoneOffsetZ2, zoneOffsetZ3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f8682a == eVar.f8682a && this.f8683b == eVar.f8683b && this.f8684c == eVar.f8684c && this.f8687f == eVar.f8687f && this.f8685d.equals(eVar.f8685d) && this.f8686e == eVar.f8686e && this.f8688g.equals(eVar.f8688g) && this.f8689h.equals(eVar.f8689h) && this.f8690i.equals(eVar.f8690i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iE0 = ((this.f8685d.e0() + (this.f8686e ? 1 : 0)) << 15) + (this.f8682a.ordinal() << 11) + ((this.f8683b + 32) << 5);
        j$.time.e eVar = this.f8684c;
        return ((this.f8688g.f8453b ^ (this.f8687f.ordinal() + (iE0 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f8689h.f8453b) ^ this.f8690i.f8453b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransitionRule[");
        sb2.append(this.f8690i.f8453b - this.f8689h.f8453b > 0 ? "Gap " : "Overlap ");
        sb2.append(this.f8689h);
        sb2.append(" to ");
        sb2.append(this.f8690i);
        sb2.append(", ");
        j$.time.e eVar = this.f8684c;
        if (eVar != null) {
            byte b4 = this.f8683b;
            if (b4 == -1) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day of ");
                sb2.append(this.f8682a.name());
            } else if (b4 < 0) {
                sb2.append(eVar.name());
                sb2.append(" on or before last day minus ");
                sb2.append((-this.f8683b) - 1);
                sb2.append(" of ");
                sb2.append(this.f8682a.name());
            } else {
                sb2.append(eVar.name());
                sb2.append(" on or after ");
                sb2.append(this.f8682a.name());
                sb2.append(' ');
                sb2.append((int) this.f8683b);
            }
        } else {
            sb2.append(this.f8682a.name());
            sb2.append(' ');
            sb2.append((int) this.f8683b);
        }
        sb2.append(" at ");
        sb2.append(this.f8686e ? "24:00" : this.f8685d.toString());
        sb2.append(" ");
        sb2.append(this.f8687f);
        sb2.append(", standard offset ");
        sb2.append(this.f8688g);
        sb2.append(']');
        return sb2.toString();
    }
}
