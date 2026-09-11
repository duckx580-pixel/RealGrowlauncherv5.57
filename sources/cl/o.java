package cl;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f3618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(Optional optional, Optional optional2, int i10) {
        super(optional, optional2);
        this.f3618c = i10;
    }

    @Override // cl.g
    public final int a() {
        switch (this.f3618c) {
            case 0:
                return 10;
            default:
                return 11;
        }
    }

    public final String toString() {
        switch (this.f3618c) {
            case 0:
                return "-STR";
            default:
                return "+STR";
        }
    }
}
