package com.google.gson;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {
    public final y a() {
        return !(this instanceof TypeAdapter$NullSafeTypeAdapter) ? new y() { // from class: com.google.gson.TypeAdapter$NullSafeTypeAdapter
            @Override // com.google.gson.y
            public final Object b(rb.a aVar) throws IOException {
                if (aVar.i0() != 9) {
                    return this.f4329a.b(aVar);
                }
                aVar.e0();
                return null;
            }

            @Override // com.google.gson.y
            public final void c(rb.b bVar, Object obj) throws IOException {
                if (obj == null) {
                    bVar.n();
                } else {
                    this.f4329a.c(bVar, obj);
                }
            }

            public final String toString() {
                return "NullSafeTypeAdapter[" + this.f4329a + "]";
            }
        } : this;
    }

    public abstract Object b(rb.a aVar);

    public abstract void c(rb.b bVar, Object obj);
}
