package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g5 {
    public static final void a(Object obj, Object obj2) {
        f5 f5Var = (f5) obj;
        if (obj2 != null) {
            throw new ClassCastException();
        }
        if (f5Var.isEmpty()) {
            return;
        }
        Iterator it = f5Var.entrySet().iterator();
        if (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            entry.getKey();
            entry.getValue();
            throw null;
        }
    }

    public static final f5 b(Object obj, Object obj2) {
        f5 f5Var = (f5) obj;
        f5 f5Var2 = (f5) obj2;
        if (!f5Var2.isEmpty()) {
            if (!f5Var.f3779i) {
                if (f5Var.isEmpty()) {
                    f5Var = new f5();
                } else {
                    f5 f5Var3 = new f5(f5Var);
                    f5Var3.f3779i = true;
                    f5Var = f5Var3;
                }
            }
            f5Var.a();
            if (!f5Var2.isEmpty()) {
                f5Var.putAll(f5Var2);
            }
        }
        return f5Var;
    }
}
