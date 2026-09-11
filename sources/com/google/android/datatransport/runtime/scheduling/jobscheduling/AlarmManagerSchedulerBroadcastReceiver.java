package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import h7.i;
import h7.p;
import java.util.concurrent.Executor;
import ka.e0;
import mf.e;
import s7.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f3630a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i10 = intent.getExtras().getInt("attemptNumber");
        p.b(context);
        e eVarA = i.a();
        eVarA.S(queryParameter);
        eVarA.f11711t = a.b(iIntValue);
        if (queryParameter2 != null) {
            eVarA.f11710s = Base64.decode(queryParameter2, 0);
        }
        e0 e0Var = p.a().f7648d;
        ((Executor) e0Var.f9360e).execute(new o7.e(e0Var, eVarA.j(), i10, new o7.a(0)));
    }
}
