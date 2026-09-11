package e4;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import android.widget.ImageView;
import com.google.android.gms.internal.measurement.j3;
import io.mychips.nativesdk.domain.MCMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
import ll.k0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f5298i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f5299r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f5300s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f5301t;

    public /* synthetic */ l(Object obj, Object obj2, Object obj3, int i10) {
        this.f5298i = i10;
        this.f5299r = obj;
        this.f5300s = obj2;
        this.f5301t = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yf.e eVar;
        switch (this.f5298i) {
            case 0:
                n nVar = (n) this.f5299r;
                qd.a aVar = (qd.a) this.f5300s;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.f5301t;
                try {
                    t tVarO = o1.c.o(nVar.f5304a);
                    if (tVarO == null) {
                        throw new RuntimeException("EmojiCompat font provider not available on this device.");
                    }
                    s sVar = (s) ((i) tVarO.f2021b);
                    synchronized (sVar.f5318d) {
                        sVar.f5320f = threadPoolExecutor;
                        break;
                    }
                    ((i) tVarO.f2021b).a(new m(aVar, threadPoolExecutor));
                    return;
                } catch (Throwable th2) {
                    aVar.l(th2);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                try {
                    ((io.mychips.nativesdk.view.a) this.f5299r).onCampaignsLoaded((List) this.f5300s, (MCMeta) this.f5301t);
                    return;
                } catch (Exception e8) {
                    Log.w("MCOfferwallSDK", "Exception thrown in onCampaignsLoaded callback", e8);
                    return;
                }
            case 2:
                String str = (String) this.f5299r;
                ImageView imageView = (ImageView) this.f5300s;
                Bitmap bitmap = (Bitmap) this.f5301t;
                if (str.equals(imageView.getTag())) {
                    imageView.setImageBitmap(bitmap);
                    return;
                }
                return;
            case 3:
                j3 j3Var = (j3) this.f5299r;
                ll.f fVar = (ll.f) this.f5300s;
                k0 k0Var = (k0) this.f5301t;
                ll.k kVar = (ll.k) j3Var.f3837s;
                if (kVar.f10164r.F()) {
                    fVar.h(kVar, new IOException("Canceled"));
                    return;
                } else {
                    fVar.s(kVar, k0Var);
                    return;
                }
            case 4:
                ((ll.f) this.f5300s).h((ll.k) ((j3) this.f5299r).f3837s, (Throwable) this.f5301t);
                return;
            case 5:
                uf.c cVar = (uf.c) this.f5299r;
                ff.f fVar2 = (ff.f) this.f5300s;
                af.f fVar3 = (af.f) this.f5301t;
                if (cVar.f17809f1 != fVar2) {
                    cVar.setStyles(fVar2);
                    return;
                }
                if (cVar.f17823m0) {
                    cVar.B = cVar.I();
                }
                yf.c cVar2 = cVar.f17811g1;
                cVar2.getClass();
                if (Build.VERSION.SDK_INT >= 29 && (eVar = cVar2.f20435b) != null) {
                    eVar.c(fVar3);
                }
                cVar.f17813h1.G();
                cVar.invalidate();
                return;
            default:
                xf.q qVar = (xf.q) this.f5299r;
                uf.c cVar3 = (uf.c) this.f5300s;
                ArrayList arrayList = (ArrayList) this.f5301t;
                if (qVar.f19705i != cVar3) {
                    return;
                }
                List list = qVar.w;
                if (list != null) {
                    list.clear();
                } else {
                    qVar.w = new ArrayList();
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    qVar.w.addAll(((xf.p) it.next()).f19747r);
                }
                cVar3.setLayoutBusy(false);
                cVar3.getEventHandler().j(0.0f, 0.0f, false);
                return;
        }
    }
}
