package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h implements ServiceConnection {
    private Context mApplicationContext;

    public Context getApplicationContext() {
        return this.mApplicationContext;
    }

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, b bVar);

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        b.d dVar;
        if (this.mApplicationContext == null) {
            throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
        }
        int i10 = b.c.f2401d;
        if (iBinder == null) {
            dVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(b.d.f2402b);
            if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof b.d)) {
                b.b bVar = new b.b();
                bVar.f2400d = iBinder;
                dVar = bVar;
            } else {
                dVar = (b.d) iInterfaceQueryLocalInterface;
            }
        }
        onCustomTabsServiceConnected(componentName, new g(dVar, componentName));
    }

    public void setApplicationContext(Context context) {
        this.mApplicationContext = context;
    }
}
