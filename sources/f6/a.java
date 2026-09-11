package f6;

import j6.m;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f6027a;

    public a(boolean z3) {
        this.f6027a = z3;
    }

    @Override // f6.b
    public final String a(Object obj, m mVar) {
        File file = (File) obj;
        if (!this.f6027a) {
            return file.getPath();
        }
        return file.getPath() + ':' + file.lastModified();
    }
}
