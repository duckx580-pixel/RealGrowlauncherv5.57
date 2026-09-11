package com.anzu.sdk;

import android.app.NotificationChannel;
import dalvik.system.InMemoryDexClassLoader;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ NotificationChannel a() {
        return new NotificationChannel("AnzuTestChannelID2", "Anzu Test 2", 3);
    }

    public static /* synthetic */ InMemoryDexClassLoader b(ByteBuffer byteBuffer, ClassLoader classLoader) {
        return new InMemoryDexClassLoader(byteBuffer, classLoader);
    }

    public static /* synthetic */ void c() {
    }
}
