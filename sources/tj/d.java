package tj;

import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Consumer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Consumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f17344c;

    public /* synthetic */ d(int i10, Object obj, Object obj2) {
        this.f17342a = i10;
        this.f17343b = obj;
        this.f17344c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        switch (this.f17342a) {
            case 0:
                e eVar = (e) this.f17343b;
                ArrayList arrayList = (ArrayList) this.f17344c;
                vj.b bVarB = eVar.b((String) obj, null);
                if (bVarB != null) {
                    vj.g gVar = (vj.g) bVarB;
                    String str = (String) gVar.get("injectionSelector");
                    if (str != null) {
                        eVar.a(arrayList, str, new vj.f(gVar), eVar);
                    }
                }
                break;
            case 1:
                zk.c cVar = (zk.c) this.f17343b;
                el.e eVar2 = (el.e) this.f17344c;
                yk.a aVar = (yk.a) obj;
                cVar.f21379s.put(aVar, eVar2);
                eVar2.f5562d = Optional.of(aVar);
                break;
            case 2:
                zk.c cVar2 = (zk.c) this.f17343b;
                el.b bVar = (el.b) this.f17344c;
                yk.a aVar2 = (yk.a) obj;
                cVar2.f21379s.put(aVar2, bVar);
                bVar.f5562d = Optional.of(aVar2);
                break;
            default:
                zk.c cVar3 = (zk.c) this.f17343b;
                el.f fVar = (el.f) this.f17344c;
                yk.a aVar3 = (yk.a) obj;
                cVar3.f21379s.put(aVar3, fVar);
                fVar.f5562d = Optional.of(aVar3);
                break;
        }
    }
}
