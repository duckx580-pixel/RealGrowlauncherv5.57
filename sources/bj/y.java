package bj;

import java.io.File;
import java.io.FileInputStream;
import java.util.logging.Logger;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f3243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f3244c;

    public /* synthetic */ y(Object obj, s sVar, int i10) {
        this.f3242a = i10;
        this.f3244c = obj;
        this.f3243b = sVar;
    }

    @Override // bj.a0
    public final long a() {
        switch (this.f3242a) {
            case 0:
                return ((File) this.f3244c).length();
            case 1:
                return ((oj.j) this.f3244c).c();
            default:
                return ((a0) this.f3244c).a();
        }
    }

    @Override // bj.a0
    public final s b() {
        switch (this.f3242a) {
        }
        return this.f3243b;
    }

    @Override // bj.a0
    public final void c(oj.h hVar) {
        int i10 = this.f3242a;
        Object obj = this.f3244c;
        switch (i10) {
            case 0:
                Logger logger = oj.u.f13111a;
                oj.c cVar = new oj.c(new FileInputStream((File) obj), oj.h0.f13079d);
                try {
                    hVar.Q(cVar);
                    cVar.close();
                    return;
                } finally {
                }
            case 1:
                hVar.J((oj.j) obj);
                return;
            default:
                ((a0) obj).c(hVar);
                return;
        }
    }
}
