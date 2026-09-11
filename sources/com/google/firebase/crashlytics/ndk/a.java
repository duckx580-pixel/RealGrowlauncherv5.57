package com.google.firebase.crashlytics.ndk;

import android.content.Context;
import da.d;
import da.r;
import ia.f;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements d {
    @Override // da.d
    public final Object a(r rVar) {
        Context context = (Context) rVar.a(Context.class);
        return new ra.b(new ra.a(context, new JniNativeApi(context), new na.b(context)), !(f.f(context, "com.google.firebase.crashlytics.unity_version", "string") != 0));
    }
}
