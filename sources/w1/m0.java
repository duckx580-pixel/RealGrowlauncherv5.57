package w1;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements ComponentCallbacks2 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Configuration f18850i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ a2.c f18851r;

    public m0(Configuration configuration, a2.c cVar) {
        this.f18850i = configuration;
        this.f18851r = cVar;
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Configuration configuration2 = this.f18850i;
        int iUpdateFrom = configuration2.updateFrom(configuration);
        Iterator it = this.f18851r.f211a.entrySet().iterator();
        while (it.hasNext()) {
            a2.a aVar = (a2.a) ((WeakReference) ((Map.Entry) it.next()).getValue()).get();
            if (aVar == null || Configuration.needNewResources(iUpdateFrom, aVar.f208b)) {
                it.remove();
            }
        }
        configuration2.setTo(configuration);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.f18851r.f211a.clear();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i10) {
        this.f18851r.f211a.clear();
    }
}
