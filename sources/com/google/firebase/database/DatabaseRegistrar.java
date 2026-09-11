package com.google.firebase.database;

import a0.x;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import da.b;
import da.i;
import da.p;
import i.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kb.c;
import sa.a;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class DatabaseRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(b bVar) {
        p pVarF = bVar.f(ca.a.class);
        p pVarF2 = bVar.f(ba.a.class);
        a aVar = new a();
        new HashMap();
        c cVar = new c();
        cVar.f9562i = new AtomicReference();
        pVarF.a(new com.google.gson.internal.b(13, cVar));
        ae.c cVar2 = new ae.c();
        cVar2.f594i = new AtomicReference();
        pVarF2.a(new com.google.gson.internal.b(12, cVar2));
        return aVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<da.a> getComponents() {
        x xVarA = da.a.a(a.class);
        xVarA.a(new i(1, 0, f.class));
        xVarA.a(new i(0, 2, ca.a.class));
        xVarA.a(new i(0, 2, ba.a.class));
        xVarA.f164e = new u(19);
        return Arrays.asList(xVarA.c(), a.a.n("fire-rtdb", "20.0.6"));
    }
}
