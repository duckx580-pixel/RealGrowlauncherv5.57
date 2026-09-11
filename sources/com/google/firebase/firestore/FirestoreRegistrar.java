package com.google.firebase.firestore;

import a0.x;
import ab.a;
import android.content.Context;
import androidx.annotation.Keep;
import cb.h;
import com.google.firebase.components.ComponentRegistrar;
import da.b;
import da.i;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import w9.f;
import w9.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirestoreRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static a lambda$getComponents$0(b bVar) {
        f fVar = (f) bVar.a(f.class);
        bVar.f(ca.a.class);
        bVar.f(ba.a.class);
        bVar.b(kb.b.class);
        bVar.b(h.class);
        a aVar = new a();
        new HashMap();
        fVar.a();
        fVar.j.add(aVar);
        return aVar;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<da.a> getComponents() {
        x xVarA = da.a.a(a.class);
        xVarA.a(new i(1, 0, f.class));
        xVarA.a(new i(1, 0, Context.class));
        xVarA.a(new i(0, 1, h.class));
        xVarA.a(new i(0, 1, kb.b.class));
        xVarA.a(new i(0, 2, ca.a.class));
        xVarA.a(new i(0, 2, ba.a.class));
        xVarA.a(new i(0, 0, g.class));
        xVarA.f164e = new ab.b(0);
        return Arrays.asList(xVarA.c(), a.a.n("fire-fst", "24.3.0"));
    }
}
