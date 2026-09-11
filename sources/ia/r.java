package ia;

import android.content.Context;
import androidx.appcompat.widget.w3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import ka.j0;
import ka.k0;
import ka.m0;
import ka.r1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HashMap f8237e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f8238f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8239a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f8240b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w3 f8241c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u5.s f8242d;

    static {
        HashMap map = new HashMap();
        f8237e = map;
        map.put("armeabi", 5);
        map.put("armeabi-v7a", 6);
        map.put("arm64-v8a", 9);
        map.put("x86", 0);
        map.put("x86_64", 1);
        Locale locale = Locale.US;
        f8238f = "Crashlytics Android SDK/18.2.13";
    }

    public r(Context context, x xVar, w3 w3Var, u5.s sVar) {
        this.f8239a = context;
        this.f8240b = xVar;
        this.f8241c = w3Var;
        this.f8242d = sVar;
    }

    public static k0 c(t6.b bVar, int i10) {
        String str = (String) bVar.f16714r;
        String str2 = (String) bVar.f16713i;
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) bVar.f16715s;
        int i11 = 0;
        if (stackTraceElementArr == null) {
            stackTraceElementArr = new StackTraceElement[0];
        }
        t6.b bVar2 = (t6.b) bVar.f16716t;
        if (i10 >= 8) {
            t6.b bVar3 = bVar2;
            while (bVar3 != null) {
                bVar3 = (t6.b) bVar3.f16716t;
                i11++;
            }
        }
        int i12 = i11;
        if (str == null) {
            throw new NullPointerException("Null type");
        }
        r1 r1Var = new r1(d(stackTraceElementArr, 4));
        k0 k0VarC = null;
        if (bVar2 != null && i12 == 0) {
            k0VarC = c(bVar2, i10 + 1);
        }
        return new k0(str, str2, r1Var, k0VarC, i12);
    }

    public static r1 d(StackTraceElement[] stackTraceElementArr, int i10) {
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            mf.c cVar = new mf.c();
            cVar.f11705u = Integer.valueOf(i10);
            long lineNumber = 0;
            long jMax = stackTraceElement.isNativeMethod() ? Math.max(stackTraceElement.getLineNumber(), 0L) : 0L;
            String str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            String fileName = stackTraceElement.getFileName();
            if (!stackTraceElement.isNativeMethod() && stackTraceElement.getLineNumber() > 0) {
                lineNumber = stackTraceElement.getLineNumber();
            }
            cVar.f11702r = Long.valueOf(jMax);
            if (str == null) {
                throw new NullPointerException("Null symbol");
            }
            cVar.f11701i = str;
            cVar.f11703s = fileName;
            cVar.f11704t = Long.valueOf(lineNumber);
            arrayList.add(cVar.i());
        }
        return new r1(arrayList);
    }

    public static m0 e(Thread thread, StackTraceElement[] stackTraceElementArr, int i10) {
        String name = thread.getName();
        if (name != null) {
            return new m0(name, i10, new r1(d(stackTraceElementArr, i10)));
        }
        throw new NullPointerException("Null name");
    }

    public final r1 a() {
        w3 w3Var = this.f8241c;
        String str = (String) w3Var.f1066t;
        if (str != null) {
            return new r1(Arrays.asList(new j0(0L, 0L, str, (String) w3Var.f1064r)));
        }
        throw new NullPointerException("Null name");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final ka.o0 b(int r14) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ia.r.b(int):ka.o0");
    }
}
