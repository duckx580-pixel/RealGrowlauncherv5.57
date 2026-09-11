package ff;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public u5.c f6226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ArrayList f6227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f6228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f6229d;

    public final void a() {
        if (this.f6227b != null) {
            int i10 = -1;
            int i11 = 0;
            while (true) {
                if (i11 >= this.f6227b.size() - 1) {
                    break;
                }
                i11++;
                int i12 = ((a) this.f6227b.get(i11)).f6221c;
                if (i10 > i12) {
                    Collections.sort(this.f6227b, a.f6217f);
                    break;
                }
                i10 = i12;
            }
            Collections.sort(new ArrayList(this.f6227b), a.f6218g);
        }
    }
}
