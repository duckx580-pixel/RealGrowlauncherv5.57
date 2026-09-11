package com.google.firebase.crashlytics;

import a0.x;
import ab.b;
import com.google.firebase.components.ComponentRegistrar;
import da.a;
import da.i;
import eb.d;
import java.util.Arrays;
import java.util.List;
import w9.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        x xVarA = a.a(FirebaseCrashlytics.class);
        xVarA.a(new i(1, 0, f.class));
        xVarA.a(new i(1, 0, d.class));
        xVarA.a(new i(0, 2, fa.a.class));
        xVarA.a(new i(0, 2, y9.a.class));
        xVarA.f164e = new b(22, this);
        xVarA.f();
        return Arrays.asList(xVarA.c(), a.a.n("fire-cls", "18.2.13"));
    }
}
