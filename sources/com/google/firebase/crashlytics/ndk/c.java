package com.google.firebase.crashlytics.ndk;

import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements FilenameFilter {
    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        boolean z3 = JniNativeApi.f4319b;
        return str.toLowerCase().endsWith(".apk");
    }
}
