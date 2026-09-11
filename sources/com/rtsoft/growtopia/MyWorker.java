package com.rtsoft.growtopia;

import android.content.Context;
import android.util.Log;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.g;
import androidx.work.m;
import androidx.work.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MyWorker extends Worker {
    private static final String TAG = "MyWorker";

    public MyWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    @Override // androidx.work.Worker
    public n doWork() {
        Log.d(TAG, "Performing long running task in scheduled job");
        return new m(g.f2342c);
    }
}
