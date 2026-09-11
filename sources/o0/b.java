package o0;

import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f12386a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f12387b = 0;

    static {
        long id2;
        android.support.v4.media.session.b.q(a.f12375i);
        try {
            id2 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            id2 = -1;
        }
        f12386a = id2;
    }
}
