package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class Gson$2 extends y {
    @Override // com.google.gson.y
    public final Object b(rb.a aVar) throws IOException {
        if (aVar.i0() != 9) {
            return Float.valueOf((float) aVar.F());
        }
        aVar.e0();
        return null;
    }

    @Override // com.google.gson.y
    public final void c(rb.b bVar, Object obj) throws IOException {
        Number numberValueOf = (Number) obj;
        if (numberValueOf == null) {
            bVar.n();
            return;
        }
        float fFloatValue = numberValueOf.floatValue();
        j.a(fFloatValue);
        if (!(numberValueOf instanceof Float)) {
            numberValueOf = Float.valueOf(fFloatValue);
        }
        bVar.W(numberValueOf);
    }
}
