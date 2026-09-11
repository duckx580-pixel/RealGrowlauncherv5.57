package t6;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final t f16995i;

    public /* synthetic */ q(t tVar) {
        this.f16995i = tVar;
    }

    @Override // eh.a
    public final Object invoke() {
        Context context = (Context) this.f16995i.f17055y.f17063i;
        if (context == null) {
            throw new IllegalStateException("Context must be set via setContext method before calling this dependency.");
        }
        return (SharedPreferences) f.L(new Object[]{context}, 1916447333, -1916447320, (int) System.currentTimeMillis());
    }
}
