package m0;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 implements u2.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f11154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q2.b f11155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.e f11156c;

    public q1(long j, q2.b bVar, eh.e eVar) {
        kotlin.jvm.internal.l.f("density", bVar);
        kotlin.jvm.internal.l.f("onPositionCalculated", eVar);
        this.f11154a = j;
        this.f11155b = bVar;
        this.f11156c = eVar;
    }

    @Override // u2.v
    public final long a(q2.j jVar, long j, q2.l lVar, long j10) {
        mh.i iVarN0;
        Object obj;
        Object next;
        kotlin.jvm.internal.l.f("anchorBounds", jVar);
        kotlin.jvm.internal.l.f("layoutDirection", lVar);
        float f9 = z2.f11522a;
        q2.b bVar = this.f11155b;
        int iE0 = bVar.e0(f9);
        long j11 = this.f11154a;
        int iE02 = bVar.e0(q2.f.a(j11));
        int iE03 = bVar.e0(q2.f.b(j11));
        int i10 = jVar.f13747a;
        int i11 = i10 + iE02;
        int i12 = jVar.f13749c;
        int i13 = (int) (j10 >> 32);
        int iIntValue = (i12 - iE02) - i13;
        int i14 = (int) (j >> 32);
        int i15 = i14 - i13;
        if (lVar == q2.l.f13752i) {
            Integer numValueOf = Integer.valueOf(i11);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (i10 < 0) {
                i15 = 0;
            }
            iVarN0 = rg.k.n0(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(i15)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i11);
            if (i12 <= i14) {
                i15 = 0;
            }
            iVarN0 = rg.k.n0(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(i15)});
        }
        Iterator it = iVarN0.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + i13 <= i14) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(jVar.f13750d + iE03, iE0);
        int i16 = jVar.f13748b;
        int i17 = (int) (j10 & 4294967295L);
        int iIntValue3 = (i16 - iE03) - i17;
        int i18 = (int) (4294967295L & j);
        Iterator it2 = rg.k.n0(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iIntValue3), Integer.valueOf(i16 - (i17 / 2)), Integer.valueOf((i18 - i17) - iE0)}).iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            int iIntValue4 = ((Number) next2).intValue();
            if (iIntValue4 >= iE0 && iIntValue4 + i17 <= i18 - iE0) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iIntValue3 = num2.intValue();
        }
        this.f11156c.invoke(jVar, new q2.j(iIntValue, iIntValue3, i13 + iIntValue, i17 + iIntValue3));
        return t6.k.b(iIntValue, iIntValue3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1)) {
            return false;
        }
        q1 q1Var = (q1) obj;
        long j = q1Var.f11154a;
        int i10 = q2.f.f13737c;
        return this.f11154a == j && kotlin.jvm.internal.l.a(this.f11155b, q1Var.f11155b) && kotlin.jvm.internal.l.a(this.f11156c, q1Var.f11156c);
    }

    public final int hashCode() {
        int i10 = q2.f.f13737c;
        return this.f11156c.hashCode() + ((this.f11155b.hashCode() + (Long.hashCode(this.f11154a) * 31)) * 31);
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) q2.f.c(this.f11154a)) + ", density=" + this.f11155b + ", onPositionCalculated=" + this.f11156c + ')';
    }
}
