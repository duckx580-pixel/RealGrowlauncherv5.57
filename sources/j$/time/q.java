package j$.time;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.m, j$.time.temporal.o, Comparable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f8619c = 0;
    private static final long serialVersionUID = 7264499704384272492L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f8620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset f8621b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        q qVar = (q) obj;
        if (this.f8621b.equals(qVar.f8621b)) {
            return this.f8620a.compareTo(qVar.f8620a);
        }
        int iCompare = Long.compare(this.f8620a.d0() - (((long) this.f8621b.f8453b) * 1000000000), qVar.f8620a.d0() - (((long) qVar.f8621b.f8453b) * 1000000000));
        return iCompare == 0 ? this.f8620a.compareTo(qVar.f8620a) : iCompare;
    }

    static {
        k kVar = k.f8603e;
        ZoneOffset zoneOffset = ZoneOffset.f8452g;
        kVar.getClass();
        new q(kVar, zoneOffset);
        k kVar2 = k.f8604f;
        ZoneOffset zoneOffset2 = ZoneOffset.f8451f;
        kVar2.getClass();
        new q(kVar2, zoneOffset2);
    }

    public q(k kVar, ZoneOffset zoneOffset) {
        Objects.requireNonNull(kVar, "time");
        this.f8620a = kVar;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f8621b = zoneOffset;
    }

    public final q A(k kVar, ZoneOffset zoneOffset) {
        return (this.f8620a == kVar && this.f8621b.equals(zoneOffset)) ? this : new q(kVar, zoneOffset);
    }

    @Override // j$.time.temporal.n
    public final boolean f(j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).Y() || rVar == j$.time.temporal.a.OFFSET_SECONDS : rVar != null && rVar.s(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.v k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar != j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f8620a.k(rVar);
            }
            return ((j$.time.temporal.a) rVar).f8632b;
        }
        return rVar.A(this);
    }

    @Override // j$.time.temporal.n
    public final long g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return this.f8621b.f8453b;
            }
            return this.f8620a.g(rVar);
        }
        return rVar.P(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j */
    public final j$.time.temporal.m m(h hVar) {
        return (q) hVar.c(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m i(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
                return A(this.f8620a, ZoneOffset.Z(aVar.f8632b.a(j, aVar)));
            }
            return A(this.f8620a.i(j, rVar), this.f8621b);
        }
        return (q) rVar.V(this, j);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public final q l(long j, j$.time.temporal.t tVar) {
        if (tVar instanceof j$.time.temporal.b) {
            return A(this.f8620a.l(j, tVar), this.f8621b);
        }
        return (q) tVar.s(this, j);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m a(long j, j$.time.temporal.t tVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, tVar).l(1L, tVar) : l(-j, tVar);
    }

    @Override // j$.time.temporal.n
    public final Object b(z zVar) {
        if (zVar == j$.time.temporal.s.f8653d || zVar == j$.time.temporal.s.f8654e) {
            return this.f8621b;
        }
        if (((zVar == j$.time.temporal.s.f8650a) || (zVar == j$.time.temporal.s.f8651b)) || zVar == j$.time.temporal.s.f8655f) {
            return null;
        }
        if (zVar == j$.time.temporal.s.f8656g) {
            return this.f8620a;
        }
        if (zVar == j$.time.temporal.s.f8652c) {
            return j$.time.temporal.b.NANOS;
        }
        return zVar.j(this);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.m c(j$.time.temporal.m mVar) {
        return mVar.i(this.f8620a.d0(), j$.time.temporal.a.NANO_OF_DAY).i(this.f8621b.f8453b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f8620a.equals(qVar.f8620a) && this.f8621b.equals(qVar.f8621b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f8620a.hashCode() ^ this.f8621b.f8453b;
    }

    public final String toString() {
        return this.f8620a.toString() + this.f8621b.f8454c;
    }

    private Object writeReplace() {
        return new s((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
