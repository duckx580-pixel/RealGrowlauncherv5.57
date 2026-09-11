package r5;

import android.os.Build;
import kotlin.jvm.internal.l;
import s5.e;
import u5.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f14588f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(e eVar, int i10) {
        super(eVar);
        this.f14588f = i10;
    }

    @Override // r5.b
    public final boolean a(p pVar) {
        switch (this.f14588f) {
            case 0:
                l.f("workSpec", pVar);
                return pVar.j.f2328b;
            case 1:
                l.f("workSpec", pVar);
                return pVar.j.f2330d;
            case 2:
                l.f("workSpec", pVar);
                return pVar.j.f2327a == 2;
            case 3:
                l.f("workSpec", pVar);
                int i10 = pVar.j.f2327a;
                return i10 == 3 || (Build.VERSION.SDK_INT >= 30 && i10 == 6);
            default:
                l.f("workSpec", pVar);
                return pVar.j.f2331e;
        }
    }

    @Override // r5.b
    public final boolean b(Object obj) {
        boolean zBooleanValue;
        switch (this.f14588f) {
            case 0:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 1:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
            case 2:
                q5.a aVar = (q5.a) obj;
                l.f("value", aVar);
                boolean z3 = aVar.f13795a;
                return Build.VERSION.SDK_INT < 26 ? !z3 : !(z3 && aVar.f13796b);
            case 3:
                q5.a aVar2 = (q5.a) obj;
                l.f("value", aVar2);
                return !aVar2.f13795a || aVar2.f13797c;
            default:
                zBooleanValue = ((Boolean) obj).booleanValue();
                break;
        }
        return !zBooleanValue;
    }
}
