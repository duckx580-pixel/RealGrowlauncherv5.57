package we;

import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class j extends com.google.protobuf.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f19173c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final KeyEvent f19174d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f19175e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f19176f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f19177g;

    public j(uf.c cVar, KeyEvent keyEvent, int i10) {
        super(cVar);
        this.f19174d = keyEvent;
        this.f19175e = i10;
        this.f19176f = ((uf.c) this.f4612b).getKeyMetaStates().b();
        this.f19177g = ((uf.c) this.f4612b).getKeyMetaStates().a();
    }

    public final boolean B(boolean z3) {
        Boolean bool = this.f19173c;
        boolean z10 = bool != null && bool.booleanValue();
        return this.f4611a != 0 ? z10 : z10 || z3;
    }
}
