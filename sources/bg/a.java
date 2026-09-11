package bg;

import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f2901i = new HashMap();

    public final void a(b bVar) {
        if (bVar instanceof a) {
            throw new IllegalArgumentException();
        }
        for (String str : bVar.l()) {
            this.f2901i.put(str, bVar);
        }
    }

    @Override // bg.b
    public final String[] l() {
        return new String[0];
    }
}
