package g1;

import android.graphics.Paint;
import android.graphics.Shader;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i0 extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Shader f6886a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f6887b = f1.f.f5992c;

    @Override // g1.p
    public final void a(float f9, long j, di.h hVar) {
        Shader shaderB = this.f6886a;
        if (shaderB == null || !f1.f.a(this.f6887b, j)) {
            if (f1.f.e(j)) {
                shaderB = null;
                this.f6886a = null;
                this.f6887b = f1.f.f5992c;
            } else {
                shaderB = b(j);
                this.f6886a = shaderB;
                this.f6887b = j;
            }
        }
        long jB = f0.b(((Paint) hVar.f5124r).getColor());
        long j10 = t.f6905b;
        if (!t.c(jB, j10)) {
            hVar.K(j10);
        }
        if (!kotlin.jvm.internal.l.a((Shader) hVar.f5126t, shaderB)) {
            hVar.N(shaderB);
        }
        if (((Paint) hVar.f5124r).getAlpha() / 255.0f == f9) {
            return;
        }
        hVar.I(f9);
    }

    public abstract Shader b(long j);
}
