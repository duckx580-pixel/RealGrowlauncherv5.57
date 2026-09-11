package s8;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15714i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f15715r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f15716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f15717t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ c1 f15718u;

    public /* synthetic */ z0(c1 c1Var, String str, String str2, String str3, int i10) {
        this.f15714i = i10;
        this.f15718u = c1Var;
        this.f15715r = str;
        this.f15716s = str2;
        this.f15717t = str3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f15714i) {
            case 0:
                a3 a3Var = this.f15718u.f15280d;
                a3Var.a();
                k kVar = a3Var.f15240s;
                a3.I(kVar);
                return kVar.W(this.f15715r, this.f15716s, this.f15717t);
            case 1:
                a3 a3Var2 = this.f15718u.f15280d;
                a3Var2.a();
                k kVar2 = a3Var2.f15240s;
                a3.I(kVar2);
                return kVar2.W(this.f15715r, this.f15716s, this.f15717t);
            case 2:
                a3 a3Var3 = this.f15718u.f15280d;
                a3Var3.a();
                k kVar3 = a3Var3.f15240s;
                a3.I(kVar3);
                return kVar3.T(this.f15715r, this.f15716s, this.f15717t);
            default:
                a3 a3Var4 = this.f15718u.f15280d;
                a3Var4.a();
                k kVar4 = a3Var4.f15240s;
                a3.I(kVar4);
                return kVar4.T(this.f15715r, this.f15716s, this.f15717t);
        }
    }
}
