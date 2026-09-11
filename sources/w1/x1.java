package w1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x1 implements v1.z0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18990i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final List f18991r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Float f18992s = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Float f18993t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public b2.h f18994u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public b2.h f18995v = null;

    public x1(int i10, ArrayList arrayList) {
        this.f18990i = i10;
        this.f18991r = arrayList;
    }

    @Override // v1.z0
    public final boolean w() {
        return this.f18991r.contains(this);
    }
}
