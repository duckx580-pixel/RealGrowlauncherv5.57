package ik;

import fk.f;
import hd.c0;
import java.util.HashMap;
import java.util.Map;
import tf.e;
import vj.g;
import vj.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c0 f8405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t6.b f8406b;

    static {
        e.a(c.class.getName());
    }

    public c() {
        c0 c0Var = new c0(8);
        new HashMap();
        this.f8405a = c0Var;
        f fVarA = f.a(null, null);
        t6.b bVar = new t6.b();
        bVar.f16713i = new HashMap();
        bVar.f16714r = new HashMap();
        bVar.f16715s = new HashMap();
        bVar.f16716t = fVarA;
        this.f8406b = bVar;
    }

    public final sj.a a(String str, Integer num, Map map) {
        String str2;
        int iIntValue = num == null ? 0 : num.intValue();
        t6.b bVar = this.f8406b;
        HashMap map2 = (HashMap) bVar.f16713i;
        if (map2.containsKey(str)) {
            str2 = str;
        } else {
            vj.b bVarL = bVar.l(str);
            if (bVarL == null) {
                return null;
            }
            str2 = str;
            map2.put(str2, new tj.e(str2, bVarL, iIntValue, map, bVar, bVar));
        }
        return (sj.a) map2.get(str2);
    }

    public final sj.a b(a aVar, Integer num, HashMap map) {
        try {
            g gVarA = h.a(aVar);
            t6.b bVar = this.f8406b;
            c0 c0Var = this.f8405a;
            gVarA.c();
            c0Var.getClass();
            ((HashMap) bVar.f16714r).put(gVarA.c(), gVarA);
            return a(gVarA.c(), num, map);
        } catch (Exception e8) {
            throw new rj.a("Loading grammar from [" + ((String) ((af.a) aVar).f597c) + "] failed: " + e8.getMessage(), e8);
        }
    }

    public final void c(f fVar) {
        try {
            this.f8406b.f16716t = fVar;
        } catch (Exception e8) {
            throw new rj.a("Loading theme from '" + fVar.toString() + "' failed: " + e8.getMessage(), e8);
        }
    }
}
