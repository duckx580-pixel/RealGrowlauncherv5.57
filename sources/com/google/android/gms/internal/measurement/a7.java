package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 implements z6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o3 f3692a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final o3 f3693b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final o3 f3694c;

    static {
        b9.b bVar = new b9.b(m3.a(), false, true);
        bVar.k("measurement.service.audience.fix_skip_audience_with_failed_filters", true);
        f3692a = bVar.k("measurement.audience.refresh_event_count_filters_timestamp", false);
        f3693b = bVar.k("measurement.audience.use_bundle_end_timestamp_for_non_sequence_property_filters", false);
        f3694c = bVar.k("measurement.audience.use_bundle_timestamp_for_event_count_filters", false);
    }
}
