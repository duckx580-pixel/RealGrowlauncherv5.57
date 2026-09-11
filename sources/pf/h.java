package pf;

import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements CharSequence {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13391i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f13392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReentrantReadWriteLock f13393s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13394t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13395u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AtomicLong f13396v = new AtomicLong(1);
    public final a w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final qf.a f13397x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f13398y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public l f13399z;

    public h(CharSequence charSequence, boolean z3) {
        charSequence = charSequence == null ? PredefinedUICustomizationFont.defaultFamily : charSequence;
        if (z3) {
            this.f13393s = new ReentrantReadWriteLock();
        } else {
            this.f13393s = null;
        }
        this.f13394t = 0;
        this.f13395u = 0;
        ArrayList arrayList = new ArrayList(TimeExtensionsKt.MILLIS_PER_SECOND);
        this.f13391i = arrayList;
        arrayList.add(new i((Object) null));
        this.f13392r = new ArrayList();
        this.f13397x = new qf.a(this);
        x xVar = new x();
        this.f13398y = xVar;
        xVar.f13449s = 500;
        xVar.t();
        this.w = new a(this);
        if (charSequence.length() == 0) {
            z(true);
            return;
        }
        z(false);
        r(0, 0, charSequence);
        z(true);
    }

    public final h A(int i10, int i11, int i12, int i13) {
        h hVar = new h(null, true);
        hVar.z(false);
        ArrayList arrayList = this.f13391i;
        ArrayList arrayList2 = hVar.f13391i;
        if (i10 == i12) {
            i iVar = (i) arrayList.get(i10);
            if (i13 != iVar.f13401r + 1 || iVar.d() != o.CRLF) {
                hVar.r(0, 0, iVar.subSequence(i11, i13));
            } else if (i11 < i13) {
                hVar.r(0, 0, iVar.subSequence(i11, iVar.f13401r));
                ((i) arrayList2.get(0)).f13403t = o.CR;
                hVar.f13394t++;
                arrayList2.add(new i((Object) null));
            }
        } else {
            if (i10 >= i12) {
                throw new StringIndexOutOfBoundsException("start > end");
            }
            i iVar2 = (i) arrayList.get(i10);
            if (iVar2.d() == o.CRLF) {
                int i14 = iVar2.f13401r;
                if (i11 <= i14) {
                    hVar.r(0, 0, iVar2.subSequence(i11, i14));
                    ((i) arrayList2.get(0)).f13403t = iVar2.d();
                    hVar.f13394t += iVar2.d().f13423r;
                } else {
                    if (i11 != i14 + 1) {
                        throw new IndexOutOfBoundsException();
                    }
                    i iVar3 = (i) arrayList2.get(0);
                    o oVar = o.LF;
                    iVar3.f13403t = oVar;
                    hVar.f13394t += oVar.f13423r;
                }
            } else {
                hVar.r(0, 0, iVar2.subSequence(i11, iVar2.f13401r));
                ((i) arrayList2.get(0)).f13403t = iVar2.d();
                hVar.f13394t += iVar2.d().f13423r;
            }
            for (int i15 = i10 + 1; i15 < i12; i15++) {
                i iVar4 = (i) arrayList.get(i15);
                arrayList2.add(new i(iVar4));
                hVar.f13394t = iVar4.f13401r + iVar4.d().f13423r + hVar.f13394t;
            }
            i iVar5 = (i) arrayList.get(i12);
            if (i13 == iVar5.f13401r + 1 && iVar5.d() == o.CRLF) {
                i iVar6 = new i((Object) null);
                iVar6.e(0, 0, i13 - 1, iVar5);
                arrayList2.add(iVar6);
                iVar6.f13403t = o.CR;
                hVar.f13394t = i13 + 1 + hVar.f13394t;
            } else {
                i iVar7 = new i((Object) null);
                iVar7.e(0, 0, i13, iVar5);
                arrayList2.add(iVar7);
                hVar.f13394t += i13;
            }
        }
        hVar.z(true);
        return hVar;
    }

    public final StringBuilder B(int i10, int i11, int i12, int i13, int i14) {
        StringBuilder sb2 = new StringBuilder(i14);
        ArrayList arrayList = this.f13391i;
        if (i10 == i12) {
            i iVar = (i) arrayList.get(i10);
            if (i13 != iVar.f13401r + 1 || iVar.d() != o.CRLF) {
                sb2.append((CharSequence) arrayList.get(i10), i11, i13);
                return sb2;
            }
            if (i11 < i13) {
                sb2.append((CharSequence) arrayList.get(i10), i11, iVar.f13401r);
                sb2.append(o.CR.f13422i);
            }
            return sb2;
        }
        if (i10 >= i12) {
            throw new StringIndexOutOfBoundsException("start > end");
        }
        i iVar2 = (i) arrayList.get(i10);
        if (iVar2.d() == o.CRLF) {
            int i15 = iVar2.f13401r;
            if (i11 <= i15) {
                sb2.append((CharSequence) iVar2, i11, i15);
                sb2.append(iVar2.d().f13422i);
            } else {
                if (i11 != i15 + 1) {
                    throw new IndexOutOfBoundsException();
                }
                sb2.append(o.LF.f13422i);
            }
        } else {
            sb2.append((CharSequence) iVar2, i11, iVar2.f13401r);
            sb2.append(iVar2.d().f13422i);
        }
        while (true) {
            i10++;
            if (i10 >= i12) {
                break;
            }
            i iVar3 = (i) arrayList.get(i10);
            sb2.append((CharSequence) iVar3);
            sb2.append(iVar3.d().f13422i);
        }
        i iVar4 = (i) arrayList.get(i12);
        if (i13 != iVar4.f13401r + 1 || iVar4.d() != o.CRLF) {
            sb2.append((CharSequence) iVar4, 0, i13);
            return sb2;
        }
        sb2.append((CharSequence) iVar4, 0, i13);
        sb2.append(o.CR.f13422i);
        return sb2;
    }

    public final String C(int i10, int i11) throws Throwable {
        c cVarA;
        c cVarA2;
        if (i10 > i11) {
            throw new StringIndexOutOfBoundsException("start > end");
        }
        u(false);
        try {
            cVarA = n().A(i10);
            cVarA2 = n().A(i11);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            String string = B(cVarA.f13384b, cVarA.f13385c, cVarA2.f13384b, cVarA2.f13385c, (i11 - i10) + 1).toString();
            E(false);
            return string;
        } catch (Throwable th3) {
            th = th3;
            Throwable th4 = th;
            E(false);
            throw th4;
        }
    }

    public final StringBuilder D() {
        StringBuilder sb2 = new StringBuilder();
        ArrayList arrayList = this.f13391i;
        sb2.ensureCapacity(sb2.length() + this.f13394t);
        u(false);
        try {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                i iVar = (i) arrayList.get(i10);
                sb2.append(iVar.f13400i, 0, iVar.f13401r);
                sb2.append(iVar.d().f13422i);
            }
            return sb2;
        } finally {
            E(false);
        }
    }

    public final void E(boolean z3) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f13393s;
        if (reentrantReadWriteLock == null) {
            return;
        }
        (z3 ? reentrantReadWriteLock.writeLock() : reentrantReadWriteLock.readLock()).unlock();
    }

    public final void a(j jVar) {
        if (jVar instanceof a) {
            throw new IllegalArgumentException("Permission denied");
        }
        ArrayList arrayList = this.f13392r;
        if (arrayList.contains(jVar)) {
            return;
        }
        arrayList.add(jVar);
    }

    public final boolean b() {
        int i10 = this.f13395u + 1;
        this.f13395u = i10;
        return i10 > 0;
    }

    public final char c(int i10, int i11) {
        u(false);
        try {
            f(i10, i11, 0);
            return ((i) this.f13391i.get(i10)).charAt(i11);
        } finally {
            E(false);
        }
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        d(i10, 0);
        u(false);
        try {
            c cVarA = n().A(i10);
            return ((i) this.f13391i.get(cVarA.f13384b)).charAt(cVarA.f13385c);
        } finally {
            E(false);
        }
    }

    public final void d(int i10, int i11) {
        if (i11 != 0 ? i10 <= this.f13394t : i10 < this.f13394t) {
            if (i10 >= 0) {
                return;
            }
        }
        StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Index ", " out of bounds. length:");
        sbN.append(this.f13394t);
        throw new StringIndexOutOfBoundsException(sbN.toString());
    }

    public final void e(int i10) {
        ArrayList arrayList = this.f13391i;
        if (i10 >= arrayList.size() || i10 < 0) {
            StringBuilder sbN = android.support.v4.media.session.a.n(i10, "Line ", " out of bounds. line count:");
            sbN.append(arrayList.size());
            throw new StringIndexOutOfBoundsException(sbN.toString());
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hVar.f13394t == this.f13394t) {
                int i10 = 0;
                loop0: while (true) {
                    ArrayList arrayList = this.f13391i;
                    if (i10 >= arrayList.size()) {
                        return true;
                    }
                    i iVar = (i) arrayList.get(i10);
                    i iVar2 = (i) hVar.f13391i.get(i10);
                    if (iVar.f13401r != iVar2.f13401r) {
                        break;
                    }
                    if (iVar != iVar2) {
                        for (int i11 = 0; i11 < iVar.f13401r; i11++) {
                            if (iVar.charAt(i11) != iVar2.charAt(i11)) {
                                break loop0;
                            }
                        }
                    }
                    i10++;
                }
            }
        }
        return false;
    }

    public final void f(int i10, int i11, int i12) {
        e(i10);
        ArrayList arrayList = this.f13391i;
        i iVar = (i) arrayList.get(i10);
        if (i12 == 0) {
            int i13 = iVar.f13401r + iVar.d().f13423r;
            if (i11 >= i13 || i11 < 0) {
                throw new StringIndexOutOfBoundsException(k0.g.i(android.support.v4.media.session.a.o("Column ", i11, " out of bounds for READ. line: ", i10, ", valid range: [0, "), i13, ")"));
            }
            return;
        }
        if (i12 == 1) {
            int i14 = iVar.f13401r;
            if (i11 > i14 || i11 < 0) {
                throw new StringIndexOutOfBoundsException(k0.g.i(android.support.v4.media.session.a.o("Column ", i11, " out of bounds for CURSOR. line: ", i10, ", valid range: [0, "), i14, "]"));
            }
            return;
        }
        if (i12 != 2) {
            return;
        }
        int i15 = iVar.f13401r + iVar.d().f13423r;
        if (i10 == arrayList.size() - 1) {
            if (i11 > i15 || i11 < 0) {
                throw new StringIndexOutOfBoundsException(k0.g.i(android.support.v4.media.session.a.o("Column ", i11, " out of bounds for INDEX. line: ", i10, ", valid range: [0, "), i15, "]"));
            }
        } else if (i11 >= i15 || i11 < 0) {
            throw new StringIndexOutOfBoundsException(k0.g.i(android.support.v4.media.session.a.o("Column ", i11, " out of bounds for INDEX. line: ", i10, ", valid range: [0, "), i15, ")"));
        }
    }

    public final void g(int i10, int i11) {
        u(true);
        d(i10, 1);
        d(i11, 1);
        this.f13396v.getAndIncrement();
        try {
            c cVarA = n().A(i10);
            c cVarA2 = n().A(i11);
            if (i10 != i11) {
                i(cVarA.f13384b, cVarA.f13385c, cVarA2.f13384b, cVarA2.f13385c);
            }
        } finally {
            E(true);
        }
    }

    public final void h(int i10, int i11, int i12, int i13) {
        u(true);
        this.f13396v.getAndIncrement();
        try {
            i(i10, i11, i12, i13);
        } finally {
            E(true);
        }
    }

    public final int hashCode() {
        return Objects.hash(this.f13391i, Integer.valueOf(this.f13394t));
    }

    public final void i(int i10, int i11, int i12, int i13) {
        int i14;
        f(i12, i13, 1);
        f(i10, i11, 1);
        if (i10 == i12 && i11 == i13) {
            return;
        }
        ArrayList arrayList = this.f13391i;
        if (i13 > ((i) arrayList.get(i12)).f13401r && (i14 = i12 + 1) < arrayList.size()) {
            i(i10, i11, i14, 0);
            return;
        }
        int i15 = ((i) arrayList.get(i10)).f13401r;
        if (i11 > i15) {
            i(i10, i15, i12, i13);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (i10 == i12) {
            i iVarV = v(i10);
            int i16 = iVarV.f13401r;
            if (i11 < 0 || i13 > i16 || i11 > i13) {
                throw new StringIndexOutOfBoundsException("invalid bounds");
            }
            l lVar = this.f13399z;
            if (lVar != null) {
                a aVar = lVar.f13406b;
                lVar.f13410f = aVar.B(i10, i11).a();
                lVar.f13411g = aVar.B(i12, i13).a();
            }
            j();
            sb2.append((CharSequence) iVarV, i11, i13);
            iVarV.b(i11, i13);
            this.f13394t -= i13 - i11;
        } else {
            if (i10 >= i12) {
                throw new IllegalArgumentException("start line > end line");
            }
            l lVar2 = this.f13399z;
            if (lVar2 != null) {
                a aVar2 = lVar2.f13406b;
                lVar2.f13410f = aVar2.B(i10, i11).a();
                lVar2.f13411g = aVar2.B(i12, i13).a();
            }
            j();
            int i17 = i10 + 1;
            for (int i18 = i17; i18 <= i12 - 1; i18++) {
                i iVar = (i) arrayList.get(i18);
                o oVarD = ((i) arrayList.get(i18)).d();
                int i19 = this.f13394t;
                int i20 = iVar.f13401r;
                this.f13394t = i19 - (oVarD.f13423r + i20);
                sb2.append(iVar.f13400i, 0, i20);
                sb2.append(oVarD.f13422i);
            }
            if (i12 > i17) {
                arrayList.subList(i17, i12).clear();
            }
            i iVarV2 = v(i10);
            i iVar2 = (i) arrayList.get(i17);
            int i21 = this.f13394t;
            int i22 = iVarV2.f13401r;
            this.f13394t = i21 - (i22 - i11);
            sb2.insert(0, iVarV2, i11, i22).insert(iVarV2.f13401r - i11, iVarV2.d().f13422i);
            iVarV2.b(i11, iVarV2.f13401r);
            this.f13394t -= i13;
            sb2.append((CharSequence) iVar2, 0, i13);
            this.f13394t -= iVarV2.d().f13423r;
            arrayList.remove(i17);
            r rVar = new r(i13, iVar2.f13401r, iVar2);
            iVarV2.e(iVarV2.f13401r, 0, rVar.length(), rVar);
            iVarV2.f13403t = iVar2.d();
        }
        this.f13398y.i(this, i10, i11, i12, i13, sb2);
        l lVar3 = this.f13399z;
        if (lVar3 != null) {
            a aVar3 = lVar3.f13406b;
            aVar3.i(lVar3.f13405a, i10, i11, i12, i13, sb2);
            int i23 = lVar3.f13410f.f13383a;
            int i24 = lVar3.f13411g.f13383a;
            int i25 = lVar3.f13407c.f13383a;
            int i26 = lVar3.f13408d.f13383a;
            if (i23 <= i26) {
                int i27 = i24 - i23;
                int iMax = i25 - Math.max(0, Math.min(i25 - i23, i27));
                int iMax2 = i26 - Math.max(0, Math.min(i26 - i23, i27));
                lVar3.f13407c = aVar3.A(iMax).a();
                lVar3.f13408d = aVar3.A(iMax2).a();
            }
        }
        a aVar4 = this.w;
        h hVar = this;
        if (aVar4 != null) {
            aVar4.i(hVar, i10, i11, i12, i13, sb2);
        }
        Iterator it = hVar.f13392r.iterator();
        while (it.hasNext()) {
            ((j) it.next()).i(hVar, i10, i11, i12, i13, sb2);
            hVar = this;
        }
    }

    public final void j() {
        this.f13398y.k(this);
        Iterator it = this.f13392r.iterator();
        while (it.hasNext()) {
            ((j) it.next()).k(this);
        }
    }

    public final boolean k() {
        int i10 = this.f13395u - 1;
        this.f13395u = i10;
        if (i10 == 0) {
            x xVar = this.f13398y;
            xVar.f13453x = true;
            ArrayList arrayList = xVar.f13447i;
            if (!arrayList.isEmpty() && (k0.g.b(1, arrayList) instanceof v)) {
                v vVar = (v) k0.g.b(1, arrayList);
                if (vVar.f13444r.size() == 1) {
                    arrayList.set(arrayList.size() - 1, (s) vVar.f13444r.get(0));
                }
            }
        }
        if (this.f13395u < 0) {
            this.f13395u = 0;
        }
        return this.f13395u > 0;
    }

    public final int l(int i10, int i11) {
        u(false);
        try {
            return n().B(i10, i11).f13383a;
        } finally {
            E(false);
        }
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13394t;
    }

    public final l m() {
        if (this.f13399z == null) {
            this.f13399z = new l(this);
        }
        return this.f13399z;
    }

    public final a n() {
        l lVar = this.f13399z;
        return lVar != null ? lVar.f13406b : this.w;
    }

    public final i o(int i10) {
        u(false);
        try {
            return (i) this.f13391i.get(i10);
        } finally {
            E(false);
        }
    }

    public final qf.b p(int i10) {
        u(false);
        try {
            return this.f13397x.t(i10, (i) this.f13391i.get(i10));
        } finally {
            E(false);
        }
    }

    public final String q(int i10) {
        u(false);
        try {
            e(i10);
            return ((i) this.f13391i.get(i10)).toString();
        } finally {
            E(false);
        }
    }

    public final void r(int i10, int i11, CharSequence charSequence) {
        u(true);
        this.f13396v.getAndIncrement();
        try {
            s(i10, i11, charSequence);
        } finally {
            E(true);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:82:0x01a3, code lost:
    
        throw new java.lang.IllegalArgumentException("unknown line separator type");
     */
    /* JADX WARN: Removed duplicated region for block: B:74:0x015b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void s(int r19, int r20, java.lang.CharSequence r21) {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pf.h.s(int, int, java.lang.CharSequence):void");
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        if (i10 > i11) {
            throw new StringIndexOutOfBoundsException("start > end");
        }
        u(false);
        try {
            c cVarA = n().A(i10);
            c cVarA2 = n().A(i11);
            return A(cVarA.f13384b, cVarA.f13385c, cVarA2.f13384b, cVarA2.f13385c);
        } finally {
            E(false);
        }
    }

    public final boolean t(int i10, int i11) {
        qf.b bVarP = p(i10);
        for (int i12 = 0; i12 < bVarP.f13902i.length; i12++) {
            if (i11 >= bVarP.g(i12) && i11 < bVarP.i(i12)) {
                return bVarP.m(i12);
            }
        }
        return false;
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return D().toString();
    }

    public final void u(boolean z3) {
        ReentrantReadWriteLock reentrantReadWriteLock = this.f13393s;
        if (reentrantReadWriteLock == null) {
            return;
        }
        (z3 ? reentrantReadWriteLock.writeLock() : reentrantReadWriteLock.readLock()).lock();
    }

    public final i v(int i10) {
        i iVar = (i) this.f13391i.get(i10);
        iVar.getClass();
        return iVar;
    }

    public final void w(int i10, int i11, CharSequence charSequence, int i12, int i13) {
        if (charSequence == null) {
            throw new IllegalArgumentException("text can not be null");
        }
        u(true);
        this.f13396v.getAndIncrement();
        try {
            this.f13398y.e(this);
            l lVar = this.f13399z;
            if (lVar != null) {
                lVar.f13406b.getClass();
            }
            Iterator it = this.f13392r.iterator();
            while (it.hasNext()) {
                ((j) it.next()).e(this);
            }
            i(i10, i11, i12, i13);
            s(i10, i11, charSequence);
        } finally {
            E(true);
        }
    }

    public final void x(int i10, int i11, f fVar) {
        u(false);
        try {
            n6.i iVar = new n6.i();
            iVar.f12147a = false;
            while (i10 <= i11) {
                if (iVar.f12147a) {
                    break;
                }
                fVar.b(i10, (i) this.f13391i.get(i10), iVar);
                i10++;
            }
        } finally {
            E(false);
        }
    }

    public final void y(int i10, g gVar) {
        u(false);
        for (int i11 = 0; i11 <= i10; i11++) {
            try {
                i iVar = (i) this.f13391i.get(i11);
                gVar.a(i11, iVar, this.f13397x.t(i11, iVar));
            } finally {
                E(false);
            }
        }
    }

    public final void z(boolean z3) {
        x xVar = this.f13398y;
        xVar.f13448r = z3;
        if (z3) {
            return;
        }
        xVar.t();
    }
}
