package jl;

import java.util.Optional;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f8952c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Optional optional, Optional optional2, int i10) {
        super(optional, optional2);
        this.f8952c = i10;
    }

    @Override // jl.k
    public final int a() {
        switch (this.f8952c) {
            case 0:
                return 3;
            case 1:
                return 5;
            case 2:
                return 6;
            case 3:
                return 8;
            case 4:
                return 9;
            case 5:
                return 10;
            case 6:
                return 11;
            case 7:
                return 12;
            case 8:
                return 13;
            case 9:
                return 14;
            case 10:
                return 15;
            default:
                return 21;
        }
    }
}
