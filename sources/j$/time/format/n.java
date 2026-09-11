package j$.time.format;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j$.time.temporal.r f8558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f8559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f8560c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile h f8561d;

    public n(j$.time.temporal.r rVar, y yVar, a aVar) {
        this.f8558a = rVar;
        this.f8559b = yVar;
        this.f8560c = aVar;
    }

    @Override // j$.time.format.e
    public final boolean s(r rVar, StringBuilder sb2) {
        String strA;
        Long lA = rVar.a(this.f8558a);
        DateTimeFormatter dateTimeFormatter = rVar.f8577b;
        if (lA == null) {
            return false;
        }
        j$.time.chrono.m mVar = (j$.time.chrono.m) rVar.f8576a.b(j$.time.temporal.s.f8651b);
        if (mVar == null || mVar == j$.time.chrono.t.f8504c) {
            a aVar = this.f8560c;
            long jLongValue = lA.longValue();
            y yVar = this.f8559b;
            Locale locale = dateTimeFormatter.f8525b;
            strA = aVar.f8530a.a(jLongValue, yVar);
        } else {
            a aVar2 = this.f8560c;
            long jLongValue2 = lA.longValue();
            y yVar2 = this.f8559b;
            Locale locale2 = dateTimeFormatter.f8525b;
            strA = aVar2.f8530a.a(jLongValue2, yVar2);
        }
        if (strA != null) {
            sb2.append(strA);
            return true;
        }
        if (this.f8561d == null) {
            this.f8561d = new h(this.f8558a, 1, 19, x.NORMAL);
        }
        return this.f8561d.s(rVar, sb2);
    }

    @Override // j$.time.format.e
    public final int A(p pVar, CharSequence charSequence, int i10) {
        a aVar = this.f8560c;
        j$.time.temporal.r rVar = this.f8558a;
        int length = charSequence.length();
        if (i10 >= 0 && i10 <= length) {
            boolean z3 = pVar.f8570c;
            DateTimeFormatter dateTimeFormatter = pVar.f8568a;
            Iterator it = null;
            y yVar = z3 ? this.f8559b : null;
            j$.time.chrono.m mVar = pVar.c().f8584c;
            if (mVar == null && (mVar = pVar.f8568a.f8528e) == null) {
                mVar = j$.time.chrono.t.f8504c;
            }
            if (mVar == null || mVar == j$.time.chrono.t.f8504c) {
                Locale locale = dateTimeFormatter.f8525b;
                List list = (List) ((HashMap) aVar.f8530a.f8580b).get(yVar);
                it = list != null ? list.iterator() : null;
            } else {
                Locale locale2 = dateTimeFormatter.f8525b;
                List list2 = (List) ((HashMap) aVar.f8530a.f8580b).get(yVar);
                if (list2 != null) {
                    it = list2.iterator();
                }
            }
            Iterator it2 = it;
            if (it2 != null) {
                while (it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it2.next();
                    String str = (String) entry.getKey();
                    if (pVar.g(str, 0, charSequence, i10, str.length())) {
                        return pVar.f(this.f8558a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                    }
                }
                if (rVar == j$.time.temporal.a.ERA && !pVar.f8570c) {
                    Iterator it3 = mVar.z().iterator();
                    while (it3.hasNext()) {
                        String string = ((j$.time.chrono.n) it3.next()).toString();
                        if (pVar.g(string, 0, charSequence, i10, string.length())) {
                            return pVar.f(this.f8558a, r7.getValue(), i10, string.length() + i10);
                        }
                    }
                }
                if (pVar.f8570c) {
                    return ~i10;
                }
            }
            if (this.f8561d == null) {
                this.f8561d = new h(this.f8558a, 1, 19, x.NORMAL);
            }
            return this.f8561d.A(pVar, charSequence, i10);
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        y yVar = y.FULL;
        j$.time.temporal.r rVar = this.f8558a;
        y yVar2 = this.f8559b;
        if (yVar2 == yVar) {
            return "Text(" + rVar + ")";
        }
        return "Text(" + rVar + "," + yVar2 + ")";
    }
}
