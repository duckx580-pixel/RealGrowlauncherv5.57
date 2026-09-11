package com.usercentrics.sdk.core.application;

import eh.a;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MainApplication$networkStrategy$1 extends m implements a {
    public static final MainApplication$networkStrategy$1 INSTANCE = new MainApplication$networkStrategy$1();

    public MainApplication$networkStrategy$1() {
        super(0);
    }

    @Override // eh.a
    public final NetworkStrategyImpl invoke() {
        return new NetworkStrategyImpl();
    }
}
