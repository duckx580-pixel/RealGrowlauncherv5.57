package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c6 extends i {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f3726s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6(String str, int i10) {
        super(str);
        this.f3726s = i10;
    }

    @Override // com.google.android.gms.internal.measurement.i
    public final o c(u5.n nVar, List list) {
        switch (this.f3726s) {
            case 0:
                return o.f3887c;
            case 1:
            case 2:
                return this;
            case 3:
                return new h(Double.valueOf(0.0d));
            default:
                return o.f3887c;
        }
    }
}
