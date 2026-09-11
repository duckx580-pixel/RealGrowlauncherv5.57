package com.google.gson.internal;

import a8.w0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Method f4487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4488c;

    public p(Method method, Object obj) {
        this.f4487b = method;
        this.f4488c = obj;
    }

    @Override // com.google.gson.internal.t
    public final Object a(Class cls) {
        String strC = w0.c(cls);
        if (strC != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strC));
        }
        return this.f4487b.invoke(this.f4488c, cls);
    }
}
