package r4;

import android.content.Context;
import android.content.ContextWrapper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f14479r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f14480s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f14481t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f14482u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final b f14483v;
    public static final b w;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14484i;

    static {
        int i10 = 1;
        f14479r = new b(i10, 0);
        f14480s = new b(i10, 1);
        f14481t = new b(i10, 2);
        f14482u = new b(i10, 3);
        f14483v = new b(i10, 4);
        w = new b(i10, 5);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f14484i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f14484i) {
            case 0:
                Context context = (Context) obj;
                kotlin.jvm.internal.l.f("it", context);
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 1:
                Context context2 = (Context) obj;
                kotlin.jvm.internal.l.f("it", context2);
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 2:
                v vVar = (v) obj;
                kotlin.jvm.internal.l.f("destination", vVar);
                x xVar = vVar.f14569r;
                if (xVar == null || xVar.f14578z != vVar.f14573v) {
                    return null;
                }
                return xVar;
            case 3:
                v vVar2 = (v) obj;
                kotlin.jvm.internal.l.f("destination", vVar2);
                x xVar2 = vVar2.f14569r;
                if (xVar2 == null || xVar2.f14578z != vVar2.f14573v) {
                    return null;
                }
                return xVar2;
            case 4:
                v vVar3 = (v) obj;
                kotlin.jvm.internal.l.f("it", vVar3);
                return vVar3.f14569r;
            default:
                v vVar4 = (v) obj;
                kotlin.jvm.internal.l.f("it", vVar4);
                if (!(vVar4 instanceof x)) {
                    return null;
                }
                x xVar3 = (x) vVar4;
                return xVar3.l(xVar3.f14578z, true);
        }
    }
}
