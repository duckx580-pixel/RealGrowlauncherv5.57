package com.google.firebase.crashlytics.ndk;

import a0.x;
import android.content.Context;
import com.google.firebase.components.ComponentRegistrar;
import da.i;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsNdkRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        x xVarA = da.a.a(fa.a.class);
        xVarA.a(new i(1, 0, Context.class));
        xVarA.f164e = new a();
        xVarA.f();
        return Arrays.asList(xVarA.c(), a.a.n("fire-cls-ndk", "18.2.13"));
    }
}
