package j$.time.zone;

import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import j$.time.temporal.p;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final long[] f8691i = new long[0];
    public static final e[] j = new e[0];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final LocalDateTime[] f8692k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final b[] f8693l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f8694a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ZoneOffset[] f8695b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long[] f8696c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final LocalDateTime[] f8697d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ZoneOffset[] f8698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final e[] f8699f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TimeZone f8700g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentMap f8701h = new ConcurrentHashMap();

    public static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTime2 = bVar.f8677b;
        if (bVar.s()) {
            if (localDateTime.F(localDateTime2)) {
                return bVar.f8678c;
            }
            if (!localDateTime.F(bVar.f8677b.X(bVar.f8679d.f8453b - bVar.f8678c.f8453b))) {
                return bVar.f8679d;
            }
        } else {
            if (!localDateTime.F(localDateTime2)) {
                return bVar.f8679d;
            }
            if (localDateTime.F(bVar.f8677b.X(bVar.f8679d.f8453b - bVar.f8678c.f8453b))) {
                return bVar.f8678c;
            }
        }
        return bVar;
    }

    public f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f8694a = jArr;
        this.f8695b = zoneOffsetArr;
        this.f8696c = jArr2;
        this.f8698e = zoneOffsetArr2;
        this.f8699f = eVarArr;
        if (jArr2.length == 0) {
            this.f8697d = f8692k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (i10 < jArr2.length) {
                int i11 = i10 + 1;
                b bVar = new b(jArr2[i10], zoneOffsetArr2[i10], zoneOffsetArr2[i11]);
                if (bVar.s()) {
                    arrayList.add(bVar.f8677b);
                    arrayList.add(bVar.f8677b.X(bVar.f8679d.f8453b - bVar.f8678c.f8453b));
                } else {
                    arrayList.add(bVar.f8677b.X(bVar.f8679d.f8453b - bVar.f8678c.f8453b));
                    arrayList.add(bVar.f8677b);
                }
                i10 = i11;
            }
            this.f8697d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.f8700g = null;
    }

    public f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f8695b = zoneOffsetArr;
        long[] jArr = f8691i;
        this.f8694a = jArr;
        this.f8696c = jArr;
        this.f8697d = f8692k;
        this.f8698e = zoneOffsetArr;
        this.f8699f = j;
        this.f8700g = null;
    }

    public f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {g(timeZone.getRawOffset())};
        this.f8695b = zoneOffsetArr;
        long[] jArr = f8691i;
        this.f8694a = jArr;
        this.f8696c = jArr;
        this.f8697d = f8692k;
        this.f8698e = zoneOffsetArr;
        this.f8699f = j;
        this.f8700g = timeZone;
    }

    public static ZoneOffset g(int i10) {
        return ZoneOffset.Z(i10 / TimeExtensionsKt.MILLIS_PER_SECOND);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.f8700g != null ? (byte) 100 : (byte) 1, this);
    }

    public static int c(long j10, ZoneOffset zoneOffset) {
        return j$.time.h.c0(Math.floorDiv(j10 + ((long) zoneOffset.f8453b), 86400)).f8597a;
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.f8700g;
        if (timeZone != null) {
            long j10 = instant.f8440a;
            return g(timeZone.getOffset((j10 >= 0 || instant.f8441b <= 0) ? Math.addExact(Math.multiplyExact(j10, TimeExtensionsKt.MILLIS_PER_SECOND), instant.f8441b / 1000000) : Math.addExact(Math.multiplyExact(j10 + 1, TimeExtensionsKt.MILLIS_PER_SECOND), (instant.f8441b / 1000000) - TimeExtensionsKt.MILLIS_PER_SECOND)));
        }
        long[] jArr = this.f8696c;
        if (jArr.length == 0) {
            return this.f8695b[0];
        }
        long j11 = instant.f8440a;
        if (this.f8699f.length <= 0 || j11 <= jArr[jArr.length - 1]) {
            int iBinarySearch = Arrays.binarySearch(jArr, j11);
            if (iBinarySearch < 0) {
                iBinarySearch = (-iBinarySearch) - 2;
            }
            return this.f8698e[iBinarySearch + 1];
        }
        b[] bVarArrB = b(c(j11, this.f8698e[r9.length - 1]));
        b bVar = null;
        for (int i10 = 0; i10 < bVarArrB.length; i10++) {
            bVar = bVarArrB[i10];
            if (j11 < bVar.f8676a) {
                return bVar.f8678c;
            }
        }
        return bVar.f8679d;
    }

    public final List f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (!(objE instanceof b)) {
            return Collections.singletonList((ZoneOffset) objE);
        }
        b bVar = (b) objE;
        return bVar.s() ? Collections.EMPTY_LIST : j$.time.b.a(new Object[]{bVar.f8678c, bVar.f8679d});
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0062, code lost:
    
        if (r8.s(r0) > 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        if (r8.f8445b.d0() <= r0.f8445b.d0()) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(j$.time.LocalDateTime r8) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.zone.f.e(j$.time.LocalDateTime):java.lang.Object");
    }

    public final b[] b(int i10) {
        j$.time.h hVarA;
        b[] bVarArr = f8693l;
        Integer numValueOf = Integer.valueOf(i10);
        b[] bVarArr2 = (b[]) ((ConcurrentHashMap) this.f8701h).get(numValueOf);
        if (bVarArr2 != null) {
            return bVarArr2;
        }
        long j10 = 1;
        int i11 = 0;
        int i12 = 1;
        if (this.f8700g != null) {
            if (i10 < 1800) {
                return bVarArr;
            }
            LocalDateTime localDateTime = LocalDateTime.f8442c;
            j$.time.h hVarB0 = j$.time.h.b0(i10 - 1, 12, 31);
            j$.time.temporal.a.HOUR_OF_DAY.X(0);
            long jW = new LocalDateTime(hVarB0, k.f8606h[0]).w(this.f8695b[0]);
            long j11 = 1000;
            int offset = this.f8700g.getOffset(jW * 1000);
            long j12 = 31968000 + jW;
            while (jW < j12) {
                long j13 = jW + 7776000;
                long j14 = j11;
                if (offset != this.f8700g.getOffset(j13 * j14)) {
                    while (j13 - jW > j10) {
                        long jFloorDiv = Math.floorDiv(j13 + jW, 2L);
                        if (this.f8700g.getOffset(jFloorDiv * j14) == offset) {
                            jW = jFloorDiv;
                        } else {
                            j13 = jFloorDiv;
                        }
                        j10 = 1;
                    }
                    if (this.f8700g.getOffset(jW * j14) == offset) {
                        jW = j13;
                    }
                    ZoneOffset zoneOffsetG = g(offset);
                    int offset2 = this.f8700g.getOffset(jW * j14);
                    ZoneOffset zoneOffsetG2 = g(offset2);
                    if (c(jW, zoneOffsetG2) == i10) {
                        bVarArr = (b[]) Arrays.copyOf(bVarArr, bVarArr.length + 1);
                        bVarArr[bVarArr.length - 1] = new b(jW, zoneOffsetG, zoneOffsetG2);
                    }
                    offset = offset2;
                } else {
                    jW = j13;
                }
                j11 = j14;
                j10 = 1;
            }
            if (1916 <= i10 && i10 < 2100) {
                ((ConcurrentHashMap) this.f8701h).putIfAbsent(numValueOf, bVarArr);
            }
            return bVarArr;
        }
        e[] eVarArr = this.f8699f;
        b[] bVarArr3 = new b[eVarArr.length];
        int i13 = 0;
        while (i13 < eVarArr.length) {
            e eVar = eVarArr[i13];
            byte b4 = eVar.f8683b;
            if (b4 < 0) {
                m mVar = eVar.f8682a;
                long j15 = i10;
                t.f8504c.getClass();
                int iA = mVar.A(t.X(j15)) + 1 + eVar.f8683b;
                j$.time.h hVar = j$.time.h.f8595d;
                j$.time.temporal.a.YEAR.X(j15);
                j$.time.temporal.a.DAY_OF_MONTH.X(iA);
                hVarA = j$.time.h.A(i10, mVar.getValue(), iA);
                j$.time.e eVar2 = eVar.f8684c;
                if (eVar2 != null) {
                    hVarA = hVarA.j(new p(eVar2.getValue(), i12));
                }
            } else {
                m mVar2 = eVar.f8682a;
                j$.time.h hVar2 = j$.time.h.f8595d;
                j$.time.temporal.a.YEAR.X(i10);
                j$.time.temporal.a.DAY_OF_MONTH.X(b4);
                hVarA = j$.time.h.A(i10, mVar2.getValue(), b4);
                j$.time.e eVar3 = eVar.f8684c;
                if (eVar3 != null) {
                    hVarA = hVarA.j(new p(eVar3.getValue(), i11));
                }
            }
            if (eVar.f8686e) {
                hVarA = hVarA.f0(1L);
            }
            LocalDateTime localDateTimeI = LocalDateTime.I(hVarA, eVar.f8685d);
            d dVar = eVar.f8687f;
            ZoneOffset zoneOffset = eVar.f8688g;
            ZoneOffset zoneOffset2 = eVar.f8689h;
            int i14 = c.f8680a[dVar.ordinal()];
            if (i14 == 1) {
                localDateTimeI = localDateTimeI.X(zoneOffset2.f8453b - ZoneOffset.UTC.f8453b);
            } else if (i14 == 2) {
                localDateTimeI = localDateTimeI.X(zoneOffset2.f8453b - zoneOffset.f8453b);
            }
            bVarArr3[i13] = new b(localDateTimeI, eVar.f8689h, eVar.f8690i);
            i13++;
            i11 = 0;
        }
        if (i10 < 2100) {
            ((ConcurrentHashMap) this.f8701h).putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.f8700g, fVar.f8700g) && Arrays.equals(this.f8694a, fVar.f8694a) && Arrays.equals(this.f8695b, fVar.f8695b) && Arrays.equals(this.f8696c, fVar.f8696c) && Arrays.equals(this.f8698e, fVar.f8698e) && Arrays.equals(this.f8699f, fVar.f8699f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.f8700g) ^ Arrays.hashCode(this.f8694a)) ^ Arrays.hashCode(this.f8695b)) ^ Arrays.hashCode(this.f8696c)) ^ Arrays.hashCode(this.f8698e)) ^ Arrays.hashCode(this.f8699f);
    }

    public final String toString() {
        TimeZone timeZone = this.f8700g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + "]";
        }
        return "ZoneRules[currentStandardOffset=" + this.f8695b[r0.length - 1] + "]";
    }
}
