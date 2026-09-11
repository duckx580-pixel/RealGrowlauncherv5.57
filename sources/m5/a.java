package m5;

import android.content.Context;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11569a = new a();

    public final File a(Context context) {
        kotlin.jvm.internal.l.f("context", context);
        File noBackupFilesDir = context.getNoBackupFilesDir();
        kotlin.jvm.internal.l.e("context.noBackupFilesDir", noBackupFilesDir);
        return noBackupFilesDir;
    }
}
