package j$.time.chrono;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8483a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f8483a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8483a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
