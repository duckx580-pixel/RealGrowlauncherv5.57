package com.usercentrics.sdk.core.application;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class NetworkStrategyImpl implements INetworkStrategy {
    private boolean isOfflineFlag;

    @Override // com.usercentrics.sdk.core.application.INetworkStrategy
    public boolean isOffline() {
        return this.isOfflineFlag;
    }

    @Override // com.usercentrics.sdk.core.application.INetworkStrategy
    public void set(boolean z3) {
        this.isOfflineFlag = z3;
    }
}
