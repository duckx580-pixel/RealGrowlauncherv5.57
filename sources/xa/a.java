package xa;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements va.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19509a;

    @Override // va.a
    public final void a(Object obj, Object obj2) {
        switch (this.f19509a) {
            case 0:
                throw new va.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
            case 1:
                Map.Entry entry = (Map.Entry) obj;
                va.e eVar = (va.e) obj2;
                eVar.f(ya.e.f20228g, entry.getKey());
                eVar.f(ya.e.f20229h, entry.getValue());
                return;
            default:
                throw new va.b("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
