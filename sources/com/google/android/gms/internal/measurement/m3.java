package com.google.android.gms.internal.measurement;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q.e f3872a = new q.e(0);

    public static synchronized Uri a() {
        q.e eVar = f3872a;
        Uri uri = (Uri) eVar.get("com.google.android.gms.measurement");
        if (uri != null) {
            return uri;
        }
        Uri uri2 = Uri.parse("content://com.google.android.gms.phenotype/".concat(String.valueOf(Uri.encode("com.google.android.gms.measurement"))));
        eVar.put("com.google.android.gms.measurement", uri2);
        return uri2;
    }
}
