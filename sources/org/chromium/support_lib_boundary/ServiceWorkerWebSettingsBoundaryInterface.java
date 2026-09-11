package org.chromium.support_lib_boundary;

import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface ServiceWorkerWebSettingsBoundaryInterface {
    boolean getAllowContentAccess();

    boolean getAllowFileAccess();

    boolean getBlockNetworkLoads();

    int getCacheMode();

    Set<String> getRequestedWithHeaderOriginAllowList();

    void setAllowContentAccess(boolean z3);

    void setAllowFileAccess(boolean z3);

    void setBlockNetworkLoads(boolean z3);

    void setCacheMode(int i10);

    void setRequestedWithHeaderOriginAllowList(Set<String> set);
}
