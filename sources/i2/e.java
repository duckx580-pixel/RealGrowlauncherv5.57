package i2;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f8000i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f8001r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public j2.b f8002s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f8003t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f8004u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f8005v;
    public final /* synthetic */ h w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f8006x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(h hVar, wg.c cVar) {
        super(cVar);
        this.w = hVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f8005v = obj;
        this.f8006x |= Integer.MIN_VALUE;
        return this.w.b(this);
    }
}
