package s3;

import android.view.WindowInsets;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class v1 extends x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WindowInsets.Builder f15123c;

    public v1() {
        this.f15123c = g1.m.c();
    }

    @Override // s3.x1
    public f2 b() {
        a();
        f2 f2VarG = f2.g(null, this.f15123c.build());
        f2VarG.f15063a.q(this.f15126b);
        return f2VarG;
    }

    @Override // s3.x1
    public void d(k3.c cVar) {
        this.f15123c.setMandatorySystemGestureInsets(cVar.d());
    }

    @Override // s3.x1
    public void e(k3.c cVar) {
        this.f15123c.setStableInsets(cVar.d());
    }

    @Override // s3.x1
    public void f(k3.c cVar) {
        this.f15123c.setSystemGestureInsets(cVar.d());
    }

    @Override // s3.x1
    public void g(k3.c cVar) {
        this.f15123c.setSystemWindowInsets(cVar.d());
    }

    @Override // s3.x1
    public void h(k3.c cVar) {
        this.f15123c.setTappableElementInsets(cVar.d());
    }

    public v1(f2 f2Var) {
        WindowInsets.Builder builderC;
        super(f2Var);
        WindowInsets windowInsetsF = f2Var.f();
        if (windowInsetsF != null) {
            builderC = g1.m.d(windowInsetsF);
        } else {
            builderC = g1.m.c();
        }
        this.f15123c = builderC;
    }
}
