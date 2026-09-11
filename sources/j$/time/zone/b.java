package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f8675e = 0;
    private static final long serialVersionUID = -6946044323557704546L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f8676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDateTime f8677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ZoneOffset f8678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ZoneOffset f8679d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.f8676a, ((b) obj).f8676a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f8676a = localDateTime.w(zoneOffset);
        this.f8677b = localDateTime;
        this.f8678c = zoneOffset;
        this.f8679d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.f8676a = j;
        this.f8677b = LocalDateTime.P(j, 0, zoneOffset);
        this.f8678c = zoneOffset;
        this.f8679d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean s() {
        return this.f8679d.f8453b > this.f8678c.f8453b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.f8676a == bVar.f8676a && this.f8678c.equals(bVar.f8678c) && this.f8679d.equals(bVar.f8679d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f8677b.hashCode() ^ this.f8678c.f8453b) ^ Integer.rotateLeft(this.f8679d.f8453b, 16);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Transition[");
        sb2.append(s() ? "Gap" : "Overlap");
        sb2.append(" at ");
        sb2.append(this.f8677b);
        sb2.append(this.f8678c);
        sb2.append(" to ");
        sb2.append(this.f8679d);
        sb2.append(']');
        return sb2.toString();
    }
}
