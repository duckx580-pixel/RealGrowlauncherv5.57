package z5;

import android.graphics.Bitmap;
import j6.i;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends wg.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public h f20621i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public j6.a f20622r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public i f20623s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c f20624t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Bitmap f20625u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public /* synthetic */ Object f20626v;
    public final /* synthetic */ h w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f20627x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(h hVar, wg.c cVar) {
        super(cVar);
        this.w = hVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        this.f20626v = obj;
        this.f20627x |= Integer.MIN_VALUE;
        return h.a(this.w, null, 0, this);
    }
}
