package com.usercentrics.sdk.services.tcf;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class UsercentricsTCFSettings {
    public static final UsercentricsTCFSettings INSTANCE = new UsercentricsTCFSettings();
    private static final List<Integer> excludedVendors = new ArrayList();
    private static final List<Integer> purposesFlatlyNotAllowed = new ArrayList();

    private UsercentricsTCFSettings() {
    }

    public final List<Integer> getExcludedVendors$usercentrics_release() {
        return excludedVendors;
    }

    public final List<Integer> getPurposesFlatlyNotAllowed$usercentrics_release() {
        return purposesFlatlyNotAllowed;
    }

    public final void setExcludedVendors(List<Integer> list) {
        l.f("vendorIds", list);
        List<Integer> list2 = excludedVendors;
        list2.clear();
        list2.addAll(list);
    }
}
