package ij;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends ej.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f8328e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8329f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ oj.g f8330g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f8331h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(String str, n nVar, int i10, oj.g gVar, int i11, boolean z3) {
        super(str, true);
        this.f8328e = nVar;
        this.f8329f = i10;
        this.f8330g = gVar;
        this.f8331h = i11;
    }

    @Override // ej.a
    public final long a() {
        try {
            y yVar = this.f8328e.A;
            oj.g gVar = this.f8330g;
            int i10 = this.f8331h;
            yVar.getClass();
            gVar.skip(i10);
            this.f8328e.M.i(this.f8329f, 9);
            synchronized (this.f8328e) {
                this.f8328e.O.remove(Integer.valueOf(this.f8329f));
            }
            return -1L;
        } catch (IOException unused) {
            return -1L;
        }
    }
}
