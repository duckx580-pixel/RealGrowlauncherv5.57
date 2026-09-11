package com.google.gson;

import com.google.gson.internal.bind.SerializationDelegatingTypeAdapter;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
class Gson$FutureTypeAdapter<T> extends SerializationDelegatingTypeAdapter<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public y f4328a = null;

    @Override // com.google.gson.y
    public final Object b(rb.a aVar) {
        y yVar = this.f4328a;
        if (yVar != null) {
            return yVar.b(aVar);
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }

    @Override // com.google.gson.y
    public final void c(rb.b bVar, Object obj) {
        y yVar = this.f4328a;
        if (yVar == null) {
            throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
        }
        yVar.c(bVar, obj);
    }

    @Override // com.google.gson.internal.bind.SerializationDelegatingTypeAdapter
    public final y d() {
        y yVar = this.f4328a;
        if (yVar != null) {
            return yVar;
        }
        throw new IllegalStateException("Adapter for type with cyclic dependency has been used before dependency has been resolved");
    }
}
