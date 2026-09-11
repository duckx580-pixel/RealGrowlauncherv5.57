package sc;

import java.util.Arrays;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f15739a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final HashSet f15740b;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("is_child_directed", "is_deviceid_optout", "is_test_suite", "google_family_self_certified_sdks", "iiqf"));
        f15739a = hashSet;
        new HashSet(Arrays.asList("is_deviceid_optout", "google_family_self_certified_sdks", "is_test_suite", "iiqf"));
        HashSet hashSet2 = new HashSet(hashSet);
        f15740b = hashSet2;
        hashSet2.add("do_not_sell");
    }
}
