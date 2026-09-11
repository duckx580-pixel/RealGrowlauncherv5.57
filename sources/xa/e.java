package xa;

import java.util.Date;
import java.util.HashMap;
import va.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements wa.a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f19514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f19515g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f19517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f19518b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f19519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f19520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f19513e = new a(0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f19516h = new d();

    /* JADX WARN: Type inference failed for: r0v1, types: [xa.b] */
    /* JADX WARN: Type inference failed for: r0v2, types: [xa.b] */
    static {
        final int i10 = 0;
        f19514f = new va.f() { // from class: xa.b
            @Override // va.a
            public final void a(Object obj, Object obj2) {
                switch (i10) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
        final int i11 = 1;
        f19515g = new va.f() { // from class: xa.b
            @Override // va.a
            public final void a(Object obj, Object obj2) {
                switch (i11) {
                    case 0:
                        ((g) obj2).d((String) obj);
                        break;
                    default:
                        ((g) obj2).e(((Boolean) obj).booleanValue());
                        break;
                }
            }
        };
    }

    public e() {
        HashMap map = new HashMap();
        this.f19517a = map;
        HashMap map2 = new HashMap();
        this.f19518b = map2;
        this.f19519c = f19513e;
        this.f19520d = false;
        map2.put(String.class, f19514f);
        map.remove(String.class);
        map2.put(Boolean.class, f19515g);
        map.remove(Boolean.class);
        map2.put(Date.class, f19516h);
        map.remove(Date.class);
    }

    public final wa.a a(Class cls, va.d dVar) {
        this.f19517a.put(cls, dVar);
        this.f19518b.remove(cls);
        return this;
    }
}
