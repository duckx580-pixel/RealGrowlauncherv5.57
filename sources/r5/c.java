package r5;

import android.os.Build;
import androidx.work.p;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f14594f;

    static {
        String strF = p.f("NetworkMeteredCtrlr");
        l.e("tagWithPrefix(\"NetworkMeteredCtrlr\")", strF);
        f14594f = strF;
    }

    @Override // r5.b
    public final boolean a(u5.p pVar) {
        l.f("workSpec", pVar);
        return pVar.j.f2327a == 5;
    }

    @Override // r5.b
    public final boolean b(Object obj) {
        q5.a aVar = (q5.a) obj;
        l.f("value", aVar);
        boolean z3 = aVar.f13795a;
        if (Build.VERSION.SDK_INT >= 26) {
            return (z3 && aVar.f13797c) ? false : true;
        }
        p.d().a(f14594f, "Metered network constraint is not supported before API 26, only checking for connected state.");
        return !z3;
    }
}
