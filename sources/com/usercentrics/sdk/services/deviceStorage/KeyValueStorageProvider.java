package com.usercentrics.sdk.services.deviceStorage;

import android.content.Context;
import android.content.SharedPreferences;
import kotlin.jvm.internal.l;
import s.h0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class KeyValueStorageProvider {
    private final Context context;

    public KeyValueStorageProvider(Context context) {
        this.context = context;
    }

    private final SharedPreferences customSharedPreferences(String str) {
        Context context = this.context;
        l.c(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        l.e("getSharedPreferences(...)", sharedPreferences);
        return sharedPreferences;
    }

    private final SharedPreferences defaultSharedPreferences() {
        Context context = this.context;
        l.c(context);
        SharedPreferences sharedPreferences = context.getSharedPreferences(getDefaultSharedPreferencesName(), 0);
        l.e("getSharedPreferences(...)", sharedPreferences);
        return sharedPreferences;
    }

    private final String getDefaultSharedPreferencesName() {
        Context context = this.context;
        l.c(context);
        return h0.e(context.getPackageName(), "_preferences");
    }

    public final KeyValueStorage provideCustom(String str) {
        l.f("name", str);
        return new SharedPreferencesKeyValueStorage(customSharedPreferences(str));
    }

    public final KeyValueStorage provideDefault() {
        return new SharedPreferencesKeyValueStorage(defaultSharedPreferences());
    }
}
