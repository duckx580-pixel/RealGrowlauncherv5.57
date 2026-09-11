package a1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.jvm.internal.m implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f189i = new e(2);

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        String str = (String) obj;
        l lVar = (l) obj2;
        if (str.length() == 0) {
            return lVar.toString();
        }
        return str + ", " + lVar;
    }
}
