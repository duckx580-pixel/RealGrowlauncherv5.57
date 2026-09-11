package com.usercentrics.sdk.v2.file;

import eh.a;
import java.io.File;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidFileStorage$baseDirectory$2 extends m implements a {
    final File $rootDirectory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidFileStorage$baseDirectory$2(File file) {
        super(0);
        this.$rootDirectory = file;
    }

    @Override // eh.a
    public final File invoke() {
        File file = new File(this.$rootDirectory, "usercentrics");
        file.mkdirs();
        return file;
    }
}
