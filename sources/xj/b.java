package xj;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19889b;

    public /* synthetic */ b(int i10, Object obj) {
        this.f19888a = i10;
        this.f19889b = obj;
    }

    @Override // xj.a
    public final boolean a(Object obj) {
        switch (this.f19888a) {
            case 0:
                Iterator it = ((ArrayList) this.f19889b).iterator();
                while (it.hasNext()) {
                    if (!((a) it.next()).a(obj)) {
                        break;
                    }
                }
                break;
            case 1:
                Iterator it2 = ((ArrayList) this.f19889b).iterator();
                while (it2.hasNext()) {
                    if (((a) it2.next()).a(obj)) {
                        break;
                    }
                }
                break;
            default:
                a aVar = (a) this.f19889b;
                if (aVar == null || aVar.a(obj)) {
                }
                break;
        }
        return false;
    }
}
