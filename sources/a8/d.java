package a8;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends BasePendingResult {
    public final z7.c E;
    public final z7.d F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(z7.d dVar, z7.k kVar) {
        super(kVar);
        b8.a0.i("GoogleApiClient must not be null", kVar);
        b8.a0.i("Api must not be null", dVar);
        this.E = dVar.f20643b;
        this.F = dVar;
    }

    public abstract void C(z7.b bVar);

    public final void D(Status status) {
        b8.a0.a("Failed result must not be success", !(status.f3670r <= 0));
        y(v(status));
    }
}
