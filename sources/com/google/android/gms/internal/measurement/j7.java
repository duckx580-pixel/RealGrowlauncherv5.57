package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 implements i7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f3854a;

    static {
        b9.b bVar = new b9.b(m3.a(), true, true);
        bVar.k("measurement.client.global_params", true);
        bVar.k("measurement.service.global_params_in_payload", true);
        f3854a = bVar.k("measurement.service.clear_global_params_on_uninstall", true);
        bVar.k("measurement.service.global_params", true);
        bVar.h(0L, "measurement.id.service.global_params");
    }
}
