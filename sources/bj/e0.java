package bj;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends f0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f3101r = 1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final long f3102s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f3103t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Object f3104u;

    public e0(String str, long j, oj.z zVar) {
        this.f3103t = str;
        this.f3102s = j;
        this.f3104u = zVar;
    }

    @Override // bj.f0
    public final long c() {
        switch (this.f3101r) {
        }
        return this.f3102s;
    }

    @Override // bj.f0
    public final s e() {
        switch (this.f3101r) {
            case 0:
                return (s) this.f3104u;
            default:
                String str = (String) this.f3103t;
                if (str == null) {
                    return null;
                }
                Pattern pattern = s.f3186d;
                return o1.c.B(str);
        }
    }

    @Override // bj.f0
    public final oj.i g() {
        switch (this.f3101r) {
            case 0:
                return (oj.g) this.f3103t;
            default:
                return (oj.z) this.f3104u;
        }
    }

    public e0(oj.g gVar, s sVar, long j) {
        this.f3103t = gVar;
        this.f3104u = sVar;
        this.f3102s = j;
    }
}
