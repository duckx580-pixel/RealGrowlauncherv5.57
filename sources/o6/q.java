package o6;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12740i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f12741r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f12742s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f12743t;

    public /* synthetic */ q(b bVar, Object obj, Object obj2, int i10) {
        this.f12740i = i10;
        this.f12741r = bVar;
        this.f12742s = obj;
        this.f12743t = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f12740i) {
            case 0:
                return this.f12741r.j((String) this.f12742s, (String) this.f12743t);
            default:
                this.f12741r.l((o) this.f12742s, (i) this.f12743t);
                return null;
        }
    }
}
