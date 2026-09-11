package com.usercentrics.sdk.core;

import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NativeClassLocator implements ClassLocator {
    @Override // com.usercentrics.sdk.core.ClassLocator
    public boolean locate(String str) {
        l.f("className", str);
        try {
            Class.forName(str);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
