package t2;

import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.jvm.internal.m implements eh.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final b f16360r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final b f16361s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final b f16362t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f16363u;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16364i;

    static {
        int i10 = 1;
        f16360r = new b(i10, 0);
        f16361s = new b(i10, 1);
        f16362t = new b(i10, 2);
        f16363u = new b(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, int i11) {
        super(i10);
        this.f16364i = i11;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f16364i) {
            case 0:
                h hVar = (h) obj;
                hVar.getHandler().post(new a(hVar.D, 1));
                break;
            case 1:
                break;
            case 2:
                break;
            default:
                break;
        }
        return o.f13926a;
    }
}
