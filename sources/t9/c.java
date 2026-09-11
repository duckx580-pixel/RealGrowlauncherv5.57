package t9;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public c(String str, String str2) {
        this(new a(str, str2.toCharArray()), (Character) '=');
    }

    public c(a aVar, Character ch2) {
        super(aVar, ch2);
        if (aVar.f17152b.length != 64) {
            throw new IllegalArgumentException();
        }
    }
}
