package p3;

import java.util.ArrayList;
import q.x;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d implements r3.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13299b;

    public /* synthetic */ d(int i10, Object obj) {
        this.f13298a = i10;
        this.f13299b = obj;
    }

    @Override // r3.a
    public final void accept(Object obj) {
        switch (this.f13298a) {
            case 0:
                e eVar = (e) obj;
                if (eVar == null) {
                    eVar = new e(-3);
                }
                ((x7.h) this.f13299b).F(eVar);
                return;
            default:
                e eVar2 = (e) obj;
                synchronized (f.f13304c) {
                    try {
                        x xVar = f.f13305d;
                        ArrayList arrayList = (ArrayList) xVar.get((String) this.f13299b);
                        if (arrayList == null) {
                            return;
                        }
                        xVar.remove((String) this.f13299b);
                        for (int i10 = 0; i10 < arrayList.size(); i10++) {
                            ((r3.a) arrayList.get(i10)).accept(eVar2);
                        }
                        return;
                    } finally {
                    }
                }
        }
    }
}
