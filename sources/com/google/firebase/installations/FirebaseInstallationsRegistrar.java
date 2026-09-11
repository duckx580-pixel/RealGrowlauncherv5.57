package com.google.firebase.installations;

import a0.x;
import androidx.annotation.Keep;
import cb.g;
import com.google.firebase.components.ComponentRegistrar;
import da.a;
import da.b;
import da.i;
import eb.c;
import eb.d;
import java.util.Arrays;
import java.util.List;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ d lambda$getComponents$0(b bVar) {
        return new c((f) bVar.a(f.class), bVar.b(g.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<a> getComponents() {
        x xVarA = a.a(d.class);
        xVarA.a(new i(1, 0, f.class));
        xVarA.a(new i(0, 1, g.class));
        xVarA.f164e = new ab.b(23);
        a aVarC = xVarA.c();
        cb.f fVar = new cb.f(0);
        x xVarA2 = a.a(cb.f.class);
        xVarA2.f161b = 1;
        xVarA2.f164e = new com.google.gson.internal.b(2, fVar);
        return Arrays.asList(aVarC, xVarA2.c(), a.a.n("fire-installations", "17.0.2"));
    }
}
