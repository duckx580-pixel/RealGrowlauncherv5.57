package com.usercentrics.sdk.v2.file;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface IFileStorage {
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final String baseDirectoryName = "usercentrics";

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        static final Companion $$INSTANCE = new Companion();
        public static final String baseDirectoryName = "usercentrics";

        private Companion() {
        }
    }

    void copy(String str, String str2);

    String getFile(String str);

    List<String> ls(String str);

    void mkdir(String str);

    void rm(String str);

    void rmAll();

    void rmdir(String str);

    void storeFile(String str, String str2);
}
