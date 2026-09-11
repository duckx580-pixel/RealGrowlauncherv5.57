package zc;

/* JADX INFO: loaded from: classes.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f21313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f21314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object[] f21315c;

    static {
        new z4(null, null, null);
    }

    public z4(String str, Object[] objArr, Throwable th2) {
        this.f21313a = str;
        this.f21314b = th2;
        if (th2 == null) {
            this.f21315c = objArr;
            return;
        }
        if (objArr == null || objArr.length == 0) {
            throw new IllegalStateException("non-sensical empty or null argument array");
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        System.arraycopy(objArr, 0, objArr2, 0, length);
        this.f21315c = objArr2;
    }
}
