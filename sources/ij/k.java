package ij;

import java.io.IOException;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends ej.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f8332e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n f8333f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f8334g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i10, List list) {
        super(str, true);
        this.f8333f = nVar;
        this.f8334g = i10;
    }

    @Override // ej.a
    public final long a() {
        switch (this.f8332e) {
            case 0:
                this.f8333f.A.getClass();
                try {
                    this.f8333f.M.i(this.f8334g, 9);
                    synchronized (this.f8333f) {
                        this.f8333f.O.remove(Integer.valueOf(this.f8334g));
                    }
                    return -1L;
                } catch (IOException unused) {
                    return -1L;
                }
            default:
                this.f8333f.A.getClass();
                try {
                    this.f8333f.M.i(this.f8334g, 9);
                    synchronized (this.f8333f) {
                        this.f8333f.O.remove(Integer.valueOf(this.f8334g));
                    }
                    return -1L;
                } catch (IOException unused2) {
                    return -1L;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, n nVar, int i10, List list, boolean z3) {
        super(str, true);
        this.f8333f = nVar;
        this.f8334g = i10;
    }
}
