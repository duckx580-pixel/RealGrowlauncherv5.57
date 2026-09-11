package j6;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import androidx.lifecycle.v;
import java.util.LinkedHashMap;
import java.util.List;
import rg.s;
import rg.y;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f8803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f8804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f8805c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public l6.a f8806d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public k6.d f8807e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8808f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bj.n f8809g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final LinkedHashMap f8810h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f8811i;
    public final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final lc.n f8812k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public k6.g f8813l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k6.e f8814m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.lifecycle.p f8815n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k6.g f8816o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public k6.e f8817p;

    public h(Context context) {
        this.f8803a = context;
        this.f8804b = n6.d.f12133a;
        this.f8805c = null;
        this.f8806d = null;
        this.f8807e = null;
        this.f8808f = s.f14664i;
        this.f8809g = null;
        this.f8810h = null;
        this.f8811i = true;
        this.j = true;
        this.f8812k = null;
        this.f8813l = null;
        this.f8814m = null;
        this.f8815n = null;
        this.f8816o = null;
        this.f8817p = null;
    }

    public final i a() {
        k6.g gVar;
        Object obj = this.f8805c;
        if (obj == null) {
            obj = k.f8842a;
        }
        Object obj2 = obj;
        l6.a aVar = this.f8806d;
        c cVar = this.f8804b;
        Bitmap.Config config = cVar.f8791g;
        k6.d dVar = this.f8807e;
        if (dVar == null) {
            dVar = cVar.f8790f;
        }
        k6.d dVar2 = dVar;
        m6.a aVar2 = cVar.f8789e;
        bj.n nVar = this.f8809g;
        bj.o oVarF = nVar != null ? nVar.f() : null;
        if (oVarF == null) {
            oVarF = n6.e.f12136c;
        } else {
            Bitmap.Config[] configArr = n6.e.f12134a;
        }
        bj.o oVar = oVarF;
        LinkedHashMap linkedHashMap = this.f8810h;
        p pVar = linkedHashMap != null ? new p(k8.g.z(linkedHashMap)) : null;
        if (pVar == null) {
            pVar = p.f8866b;
        }
        p pVar2 = pVar;
        c cVar2 = this.f8804b;
        boolean z3 = cVar2.f8792h;
        cVar2.getClass();
        c cVar3 = this.f8804b;
        b bVar = cVar3.f8793i;
        b bVar2 = cVar3.j;
        b bVar3 = cVar3.f8794k;
        oh.s sVar = cVar3.f8785a;
        oh.s sVar2 = cVar3.f8786b;
        oh.s sVar3 = cVar3.f8787c;
        oh.s sVar4 = cVar3.f8788d;
        androidx.lifecycle.p lifecycle = this.f8815n;
        Context context = this.f8803a;
        if (lifecycle == null) {
            Object baseContext = context;
            while (true) {
                if (baseContext instanceof v) {
                    lifecycle = ((v) baseContext).getLifecycle();
                    break;
                }
                if (!(baseContext instanceof ContextWrapper)) {
                    lifecycle = null;
                    break;
                }
                baseContext = ((ContextWrapper) baseContext).getBaseContext();
            }
            if (lifecycle == null) {
                lifecycle = g.f8801b;
            }
        }
        androidx.lifecycle.p pVar3 = lifecycle;
        k6.g gVar2 = this.f8813l;
        if (gVar2 == null) {
            k6.g cVar4 = this.f8816o;
            if (cVar4 == null) {
                cVar4 = new k6.c(context);
            }
            gVar = cVar4;
        } else {
            gVar = gVar2;
        }
        k6.e eVar = this.f8814m;
        if (eVar == null && (eVar = this.f8817p) == null) {
            if ((gVar2 instanceof k6.h ? (k6.h) gVar2 : null) != null) {
                throw null;
            }
            eVar = k6.e.f9263r;
        }
        k6.e eVar2 = eVar;
        lc.n nVar2 = this.f8812k;
        n nVar3 = nVar2 != null ? new n(k8.g.z((LinkedHashMap) nVar2.f9915r)) : null;
        if (nVar3 == null) {
            nVar3 = n.f8857r;
        }
        return new i(context, obj2, aVar, config, dVar2, this.f8808f, aVar2, oVar, pVar2, this.f8811i, z3, false, this.j, bVar, bVar2, bVar3, sVar, sVar2, sVar3, sVar4, pVar3, gVar, eVar2, nVar3, new d(this.f8813l, this.f8814m, this.f8807e), this.f8804b);
    }

    public h(i iVar, Context context) {
        this.f8803a = context;
        this.f8804b = iVar.f8841z;
        this.f8805c = iVar.f8819b;
        this.f8806d = iVar.f8820c;
        d dVar = iVar.f8840y;
        this.f8807e = dVar.f8797c;
        this.f8808f = iVar.f8823f;
        this.f8809g = iVar.f8825h.k();
        this.f8810h = y.M(iVar.f8826i.f8867a);
        this.f8811i = iVar.j;
        this.j = iVar.f8829m;
        this.f8812k = new lc.n(iVar.f8839x);
        this.f8813l = dVar.f8795a;
        this.f8814m = dVar.f8796b;
        if (iVar.f8818a == context) {
            this.f8815n = iVar.f8837u;
            this.f8816o = iVar.f8838v;
            this.f8817p = iVar.w;
        } else {
            this.f8815n = null;
            this.f8816o = null;
            this.f8817p = null;
        }
    }
}
