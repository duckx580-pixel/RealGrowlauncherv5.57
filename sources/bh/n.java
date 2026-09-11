package bh;

import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final n f2928i = new n();

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) throws IOException {
        IOException iOException = (IOException) obj2;
        kotlin.jvm.internal.l.f("<unused var>", (File) obj);
        kotlin.jvm.internal.l.f("exception", iOException);
        throw iOException;
    }
}
