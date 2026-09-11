package rh;

import com.usercentrics.sdk.models.api.ApiConstants;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b1 f14862a = new b1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b1 f14863b = new b1(1);

    public static e1 a(int i10) {
        return new e1((i10 & 1) != 0 ? 0L : ApiConstants.MINIMUM_TIMEOUT_MILLIS);
    }
}
