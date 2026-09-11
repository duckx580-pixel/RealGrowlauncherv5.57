package com.usercentrics.sdk.v2.file;

import android.content.Context;
import java.io.File;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class FileStorageResolver {
    public final IFileStorage buildFileStorage(Context context) {
        l.c(context);
        File cacheDir = context.getCacheDir();
        l.e("getCacheDir(...)", cacheDir);
        return new AndroidFileStorage(cacheDir);
    }
}
