package com.google.gson.internal;

import a8.w0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f4489b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f4490c;

    public q(int i10, Method method) {
        this.f4489b = method;
        this.f4490c = i10;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String strC = w0.c(cls);
        if (strC != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
        }
        return this.f4489b.invoke(null, cls, Integer.valueOf(this.f4490c));
    }
}
