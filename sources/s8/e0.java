package s8;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReference f15313b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f15314c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AtomicReference f15315d = new AtomicReference();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lc.n f15316a;

    public e0(lc.n nVar) {
        this.f15316a = nVar;
    }

    public static final String g(String str, String[] strArr, String[] strArr2, AtomicReference atomicReference) {
        String str2;
        b8.a0.h(atomicReference);
        b8.a0.b(strArr.length == strArr2.length);
        for (int i10 = 0; i10 < strArr.length; i10++) {
            Object obj = strArr[i10];
            if (str == obj || str.equals(obj)) {
                synchronized (atomicReference) {
                    try {
                        String[] strArr3 = (String[]) atomicReference.get();
                        if (strArr3 == null) {
                            strArr3 = new String[strArr2.length];
                            atomicReference.set(strArr3);
                        }
                        str2 = strArr3[i10];
                        if (str2 == null) {
                            str2 = strArr2[i10] + "(" + strArr[i10] + ")";
                            strArr3[i10] = str2;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return str2;
            }
        }
        return str;
    }

    public final String a(Object[] objArr) {
        if (objArr == null) {
            return "[]";
        }
        StringBuilder sbM = k0.g.m("[");
        for (Object obj : objArr) {
            String strB = obj instanceof Bundle ? b((Bundle) obj) : String.valueOf(obj);
            if (strB != null) {
                if (sbM.length() != 1) {
                    sbM.append(", ");
                }
                sbM.append(strB);
            }
        }
        sbM.append("]");
        return sbM.toString();
    }

    public final String b(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        if (!this.f15316a.r()) {
            return bundle.toString();
        }
        StringBuilder sbM = k0.g.m("Bundle[{");
        for (String str : bundle.keySet()) {
            if (sbM.length() != 8) {
                sbM.append(", ");
            }
            sbM.append(e(str));
            sbM.append("=");
            Object obj = bundle.get(str);
            sbM.append(obj instanceof Bundle ? a(new Object[]{obj}) : obj instanceof Object[] ? a((Object[]) obj) : obj instanceof ArrayList ? a(((ArrayList) obj).toArray()) : String.valueOf(obj));
        }
        sbM.append("}]");
        return sbM.toString();
    }

    public final String c(q qVar) {
        lc.n nVar = this.f15316a;
        if (!nVar.r()) {
            return qVar.toString();
        }
        StringBuilder sb2 = new StringBuilder("origin=");
        sb2.append(qVar.f15540s);
        sb2.append(",name=");
        sb2.append(d(qVar.f15538i));
        sb2.append(",params=");
        p pVar = qVar.f15539r;
        sb2.append(pVar == null ? null : !nVar.r() ? pVar.f15530i.toString() : b(pVar.d()));
        return sb2.toString();
    }

    public final String d(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15316a.r() ? str : g(str, f1.f15329c, f1.f15327a, f15313b);
    }

    public final String e(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15316a.r() ? str : g(str, f1.f15332f, f1.f15331e, f15314c);
    }

    public final String f(String str) {
        if (str == null) {
            return null;
        }
        return !this.f15316a.r() ? str : str.startsWith("_exp_") ? s.h0.f("experiment_id(", str, ")") : g(str, f1.j, f1.f15335i, f15315d);
    }
}
