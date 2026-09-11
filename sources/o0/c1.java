package o0;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f12396a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f12397b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f12398c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f12399d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f12400e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final qg.k f12401f;

    public c1(int i10, ArrayList arrayList) {
        this.f12396a = arrayList;
        this.f12397b = i10;
        if (i10 < 0) {
            throw new IllegalArgumentException("Invalid start index");
        }
        this.f12399d = new ArrayList();
        HashMap map = new HashMap();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            k0 k0Var = (k0) this.f12396a.get(i12);
            int i13 = k0Var.f12461c;
            int i14 = k0Var.f12462d;
            map.put(Integer.valueOf(i13), new f0(i12, i11, i14));
            i11 += i14;
        }
        this.f12400e = map;
        this.f12401f = android.support.v4.media.session.b.q(new a4.v(26, this));
    }

    public final int a(k0 k0Var) {
        f0 f0Var = (f0) this.f12400e.get(Integer.valueOf(k0Var.f12461c));
        if (f0Var != null) {
            return f0Var.f12415b;
        }
        return -1;
    }

    public final boolean b(int i10, int i11) {
        int i12;
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f12400e;
        f0 f0Var = (f0) map.get(numValueOf);
        if (f0Var == null) {
            return false;
        }
        int i13 = f0Var.f12415b;
        int i14 = i11 - f0Var.f12416c;
        f0Var.f12416c = i11;
        if (i14 == 0) {
            return true;
        }
        for (f0 f0Var2 : map.values()) {
            if (f0Var2.f12415b >= i13 && !f0Var2.equals(f0Var) && (i12 = f0Var2.f12415b + i14) >= 0) {
                f0Var2.f12415b = i12;
            }
        }
        return true;
    }
}
