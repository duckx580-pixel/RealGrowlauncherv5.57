package ij;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends ej.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n f8339e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f8340f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f8341g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, n nVar, int i10, long j) {
        super(str, true);
        this.f8339e = nVar;
        this.f8340f = i10;
        this.f8341g = j;
    }

    @Override // ej.a
    public final long a() {
        n nVar = this.f8339e;
        try {
            nVar.M.m(this.f8341g, this.f8340f);
            return -1L;
        } catch (IOException e8) {
            nVar.a(2, 2, e8);
            return -1L;
        }
    }
}
