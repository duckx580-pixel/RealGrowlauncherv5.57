package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeParseException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.m, j$.time.chrono.j, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LocalDateTime f8455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f8456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f8457c;

    public static ZonedDateTime A(LocalDateTime localDateTime, x xVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(xVar, "zone");
        if (xVar instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, xVar, (ZoneOffset) xVar);
        }
        j$.time.zone.f fVarA = xVar.A();
        List listF = fVarA.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
                Objects.requireNonNull(zoneOffset, "offset");
            }
        } else {
            Object objE = fVarA.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.X(Duration.ofSeconds(bVar.f8679d.f8453b - bVar.f8678c.f8453b).f8437a);
            zoneOffset = bVar.f8679d;
        }
        return new ZonedDateTime(localDateTime, xVar, zoneOffset);
    }

    public static ZonedDateTime s(long j, int i10, x xVar) {
        ZoneOffset zoneOffsetD = xVar.A().d(Instant.A(j, i10));
        return new ZonedDateTime(LocalDateTime.P(j, i10, zoneOffsetD), xVar, zoneOffsetD);
    }

    public static ZonedDateTime parse(CharSequence charSequence) {
        String string;
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f8522f;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        z zVar = new z(0);
        Objects.requireNonNull(charSequence, "text");
        try {
            return (ZonedDateTime) dateTimeFormatter.b(charSequence).b(zVar);
        } catch (DateTimeParseException e8) {
            throw e8;
        } catch (RuntimeException e10) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            DateTimeParseException dateTimeParseException = new DateTimeParseException("Text '" + string + "' could not be parsed: " + e10.getMessage(), e10);
            charSequence.toString();
            throw dateTimeParseException;
        }
    }

    public ZonedDateTime(LocalDateTime localDateTime, x xVar, ZoneOffset zoneOffset) {
        this.f8455a = localDateTime;
        this.f8456b = zoneOffset;
        this.f8457c = xVar;
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).f8632b;
            }
            return this.f8455a.k(rVar);
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final int e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = a0.f8459a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.u("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 == 2) {
                return this.f8456b.f8453b;
            }
            return this.f8455a.e(rVar);
        }
        return super.e(rVar);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i10 = a0.f8459a[((j$.time.temporal.a) rVar).ordinal()];
            if (i10 == 1) {
                return W();
            }
            if (i10 == 2) {
                return this.f8456b.f8453b;
            }
            return this.f8455a.g(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.chrono.j
    public final ZoneOffset o() {
        return this.f8456b;
    }

    @Override // j$.time.chrono.j
    public final x J() {
        return this.f8457c;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.j D(x xVar) {
        Objects.requireNonNull(xVar, "zone");
        return this.f8457c.equals(xVar) ? this : A(this.f8455a, xVar, this.f8456b);
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.e x() {
        return this.f8455a;
    }

    @Override // j$.time.chrono.j
    public final j$.time.chrono.b n() {
        return this.f8455a.f8444a;
    }

    @Override // j$.time.chrono.j
    public final k h() {
        return this.f8455a.f8445b;
    }

    @Override // j$.time.chrono.j
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime m(h hVar) {
        return A(LocalDateTime.I(hVar, this.f8455a.f8445b), this.f8457c, this.f8456b);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i10 = a0.f8459a[aVar.ordinal()];
            if (i10 == 1) {
                return s(j, this.f8455a.f8445b.f8610d, this.f8457c);
            }
            if (i10 != 2) {
                return A(this.f8455a.i(j, rVar), this.f8457c, this.f8456b);
            }
            ZoneOffset zoneOffsetZ = ZoneOffset.Z(aVar.f8632b.a(j, aVar));
            return (zoneOffsetZ.equals(this.f8456b) || !this.f8457c.A().f(this.f8455a).contains(zoneOffsetZ)) ? this : new ZonedDateTime(this.f8455a, this.f8457c, zoneOffsetZ);
        }
        return (ZonedDateTime) rVar.V(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public final ZonedDateTime l(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            j$.time.temporal.b bVar = (j$.time.temporal.b) tVar;
            if (bVar.compareTo(j$.time.temporal.b.DAYS) >= 0 && bVar != j$.time.temporal.b.FOREVER) {
                return A(this.f8455a.l(j, tVar), this.f8457c, this.f8456b);
            }
            LocalDateTime localDateTimeL = this.f8455a.l(j, tVar);
            ZoneOffset zoneOffset = this.f8456b;
            x xVar = this.f8457c;
            Objects.requireNonNull(localDateTimeL, "localDateTime");
            Objects.requireNonNull(zoneOffset, "offset");
            Objects.requireNonNull(xVar, "zone");
            if (xVar.A().f(localDateTimeL).contains(zoneOffset)) {
                return new ZonedDateTime(localDateTimeL, xVar, zoneOffset);
            }
            return s(localDateTimeL.w(zoneOffset), localDateTimeL.f8445b.f8610d, xVar);
        }
        return (ZonedDateTime) tVar.s(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.chrono.j a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, tVar).l(1L, tVar) : l(-j, tVar);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, tVar).l(1L, tVar) : l(-j, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(z zVar) {
        if (zVar == j$.time.temporal.s.f8655f) {
            return this.f8455a.f8444a;
        }
        return super.b(zVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.f8455a.equals(zonedDateTime.f8455a) && this.f8456b.equals(zonedDateTime.f8456b) && this.f8457c.equals(zonedDateTime.f8457c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8455a.hashCode() ^ this.f8456b.f8453b) ^ Integer.rotateLeft(this.f8457c.hashCode(), 3);
    }

    public final String toString() {
        String str = this.f8455a.toString() + this.f8456b.f8454c;
        ZoneOffset zoneOffset = this.f8456b;
        x xVar = this.f8457c;
        if (zoneOffset == xVar) {
            return str;
        }
        return str + "[" + xVar.toString() + "]";
    }

    private Object writeReplace() {
        return new s((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
