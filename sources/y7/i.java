package y7;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.internal.measurement.f0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends f0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ d f20193c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 1);
        this.f20193c = dVar;
        this.f20192b = context.getApplicationContext();
    }

    @Override // com.google.android.gms.internal.measurement.f0, android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            StringBuilder sb2 = new StringBuilder(50);
            sb2.append("Don't know how to handle this message: ");
            sb2.append(i10);
            Log.w("GoogleApiAvailability", sb2.toString());
            return;
        }
        int i11 = e.f20180a;
        d dVar = this.f20193c;
        Context context = this.f20192b;
        int iB = dVar.b(context, i11);
        int i12 = f.f20186e;
        if (iB == 1 || iB == 2 || iB == 3 || iB == 9) {
            Intent intentA = dVar.a(iB, context, "n");
            dVar.g(context, iB, intentA == null ? null : PendingIntent.getActivity(context, 0, intentA, 201326592));
        }
    }
}
