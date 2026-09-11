package g5;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ q.e f7036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f7037b;

    public t(u uVar, q.e eVar) {
        this.f7037b = uVar;
        this.f7036a = eVar;
    }

    @Override // g5.q
    public final void onTransitionEnd(r rVar) {
        ((ArrayList) this.f7036a.get(this.f7037b.f7039r)).remove(rVar);
        rVar.w(this);
    }
}
