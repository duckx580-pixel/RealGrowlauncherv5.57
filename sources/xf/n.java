package xf;

import java.util.List;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f19738c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f19739d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f19740e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19741f;

    public n(int i10, int i11, int i12, List list, float f9, boolean z3) {
        this.f19739d = i10;
        this.f19736a = i11;
        this.f19737b = i12;
        this.f19738c = list;
        this.f19740e = f9;
        this.f19741f = z3;
    }

    public final float a(float f9) {
        if (!this.f19741f) {
            return 0.0f;
        }
        float f10 = this.f19740e;
        if (f9 > f10) {
            return f9 - f10;
        }
        return 0.0f;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RowRegion{startColumn=");
        sb2.append(this.f19736a);
        sb2.append(", endColumn=");
        sb2.append(this.f19737b);
        sb2.append(", line=");
        return h0.g(sb2, this.f19739d, '}');
    }
}
