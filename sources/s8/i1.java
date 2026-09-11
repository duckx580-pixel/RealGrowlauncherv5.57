package s8;

import android.content.Context;
import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f15414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f15415b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f15416c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f15417d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Boolean f15418e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f15419f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.google.android.gms.internal.measurement.r0 f15420g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f15421h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Long f15422i;
    public final String j;

    public i1(Context context, com.google.android.gms.internal.measurement.r0 r0Var, Long l10) {
        this.f15421h = true;
        b8.a0.h(context);
        Context applicationContext = context.getApplicationContext();
        b8.a0.h(applicationContext);
        this.f15414a = applicationContext;
        this.f15422i = l10;
        if (r0Var != null) {
            this.f15420g = r0Var;
            this.f15415b = r0Var.f3969v;
            this.f15416c = r0Var.f3968u;
            this.f15417d = r0Var.f3967t;
            this.f15421h = r0Var.f3966s;
            this.f15419f = r0Var.f3965r;
            this.j = r0Var.f3970x;
            Bundle bundle = r0Var.w;
            if (bundle != null) {
                this.f15418e = Boolean.valueOf(bundle.getBoolean("dataCollectionDefaultEnabled", true));
            }
        }
    }
}
