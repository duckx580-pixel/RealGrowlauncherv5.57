package t6;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y2 extends b3 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h1 f17130l;

    public y2(String str, byte[] bArr, String str2, h1 h1Var, Map map) {
        super(null, str, Boolean.FALSE);
        this.f16732e = str2;
        this.f16737k = bArr;
        this.f17130l = h1Var;
        if (map != null) {
            this.f16735h.putAll(map);
        }
    }

    @Override // t6.b3
    public final h1 a() {
        h1 h1Var = this.f17130l;
        return h1Var != null ? h1Var : h1.CACHED_EVENT;
    }
}
