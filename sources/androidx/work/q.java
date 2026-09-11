package androidx.work;

import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.LinkedHashSet;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f2391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u5.p f2392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LinkedHashSet f2393c;

    public q(UUID uuid, u5.p pVar, LinkedHashSet linkedHashSet) {
        this.f2391a = uuid;
        this.f2392b = pVar;
        this.f2393c = linkedHashSet;
    }

    public static final q a() {
        UUID uuidRandomUUID = UUID.randomUUID();
        kotlin.jvm.internal.l.e("randomUUID()", uuidRandomUUID);
        String string = uuidRandomUUID.toString();
        kotlin.jvm.internal.l.e("id.toString()", string);
        String name = DiagnosticsWorker.class.getName();
        u5.p pVar = new u5.p(string, 0, name, null, null, null, 0L, 0L, 0L, null, 0, 0, 0L, 0L, 0L, 0L, false, 0, 0, 1048570, 0);
        String[] strArr = {DiagnosticsWorker.class.getName()};
        boolean z3 = true;
        LinkedHashSet linkedHashSet = new LinkedHashSet(rg.y.E(1));
        rg.k.K0(strArr, linkedHashSet);
        pVar.f17684d = OverwritingInputMerger.class.getName();
        q qVar = new q(uuidRandomUUID, pVar, linkedHashSet);
        d dVar = pVar.j;
        if (dVar.f2334h.isEmpty() && !dVar.f2330d && !dVar.f2328b && !dVar.f2329c) {
            z3 = false;
        }
        if (pVar.f17696q) {
            if (z3) {
                throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
            }
            if (pVar.f17687g > 0) {
                throw new IllegalArgumentException("Expedited jobs cannot be delayed");
            }
        }
        UUID uuidRandomUUID2 = UUID.randomUUID();
        kotlin.jvm.internal.l.e("randomUUID()", uuidRandomUUID2);
        String string2 = uuidRandomUUID2.toString();
        kotlin.jvm.internal.l.e("id.toString()", string2);
        int i10 = pVar.f17682b;
        String str = pVar.f17684d;
        g gVar = new g(pVar.f17685e);
        g gVar2 = new g(pVar.f17686f);
        d dVar2 = pVar.j;
        kotlin.jvm.internal.l.f("other", dVar2);
        boolean z10 = dVar2.f2328b;
        boolean z11 = dVar2.f2329c;
        new u5.p(string2, i10, name, str, gVar, gVar2, pVar.f17687g, pVar.f17688h, pVar.f17689i, new d(dVar2.f2327a, z10, z11, dVar2.f2330d, dVar2.f2331e, dVar2.f2332f, dVar2.f2333g, dVar2.f2334h), pVar.f17690k, pVar.f17691l, pVar.f17692m, pVar.f17693n, pVar.f17694o, pVar.f17695p, pVar.f17696q, pVar.f17697r, pVar.f17698s, 524288, 0);
        return qVar;
    }
}
