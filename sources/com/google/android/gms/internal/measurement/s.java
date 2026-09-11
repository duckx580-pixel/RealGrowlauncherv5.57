package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements o {
    @Override // com.google.android.gms.internal.measurement.o
    public final Double a() {
        return Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o b() {
        return o.f3887c;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final String d() {
        return "undefined";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj instanceof s;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Boolean l() {
        return Boolean.FALSE;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final Iterator n() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.o
    public final o q(String str, u5.n nVar, ArrayList arrayList) {
        throw new IllegalStateException("Undefined has no function ".concat(str));
    }
}
