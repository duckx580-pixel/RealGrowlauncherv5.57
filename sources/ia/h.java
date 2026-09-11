package ia;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements FilenameFilter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8184a;

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f8184a) {
            case 0:
                return str.startsWith(".ae");
            case 1:
                return str.startsWith("event");
            default:
                return str.startsWith("event") && !str.endsWith("_");
        }
    }
}
