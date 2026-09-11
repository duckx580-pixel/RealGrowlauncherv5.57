package com.google.firebase.storage;

import a0.x;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.b;
import da.i;
import i.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import lb.a;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class StorageRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(b bVar) {
        bVar.b(ca.a.class);
        bVar.b(ba.a.class);
        a aVar = new a();
        new HashMap();
        return aVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<da.a> getComponents() {
        x xVarA = da.a.a(a.class);
        xVarA.a(new i(1, 0, f.class));
        xVarA.a(new i(0, 1, ca.a.class));
        xVarA.a(new i(0, 1, ba.a.class));
        xVarA.f164e = new u(11);
        return Arrays.asList(xVarA.c(), a.a.n("fire-gcs", "20.0.2"));
    }
}
