package ug;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g f17985i;

    public a(g gVar) {
        this.f17985i = gVar;
    }

    @Override // ug.h
    public final /* bridge */ h e(h hVar) {
        return android.support.v4.media.session.b.s(this, hVar);
    }

    @Override // ug.f
    public final g getKey() {
        return this.f17985i;
    }

    @Override // ug.h
    public /* bridge */ f i(g gVar) {
        return android.support.v4.media.session.b.i(this, gVar);
    }

    @Override // ug.h
    public final Object n(Object obj, eh.e eVar) {
        return eVar.invoke(obj, this);
    }

    @Override // ug.h
    public /* bridge */ h u(g gVar) {
        return android.support.v4.media.session.b.r(this, gVar);
    }
}
