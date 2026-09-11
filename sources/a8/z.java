package a8;

import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements z7.j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ k f576d;

    public z(k kVar) {
        this.f576d = kVar;
    }

    @Override // z7.j
    public final void onConnectionFailed(y7.a aVar) {
        this.f576d.y(new Status(8, null));
    }
}
