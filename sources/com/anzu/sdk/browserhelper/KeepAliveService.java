package com.anzu.sdk.browserhelper;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class KeepAliveService extends Service {
    private static final Binder sBinder = new Binder();

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return sBinder;
    }
}
