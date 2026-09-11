package j$.time;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f8459a;

    static {
        int[] iArr = new int[j$.time.temporal.a.values().length];
        f8459a = iArr;
        try {
            iArr[j$.time.temporal.a.INSTANT_SECONDS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f8459a[j$.time.temporal.a.OFFSET_SECONDS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
    }
}
