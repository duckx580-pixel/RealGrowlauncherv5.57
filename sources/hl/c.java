package hl;

import gb.e;
import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f7732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f7733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f7735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f7736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Optional f7737f;

    public c(int i10, boolean z3, int i11, int i12, int i13, Optional optional) {
        this.f7732a = i10;
        this.f7733b = z3;
        this.f7734c = i11;
        this.f7735d = i12;
        this.f7736e = i13;
        this.f7737f = optional;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SimpleKey - tokenNumber=");
        sb2.append(this.f7732a);
        sb2.append(" required=");
        sb2.append(this.f7733b);
        sb2.append(" index=");
        e.j(sb2, this.f7734c, " line=", this.f7735d, " column=");
        sb2.append(this.f7736e);
        return sb2.toString();
    }
}
