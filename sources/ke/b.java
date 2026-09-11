package ke;

import h7.o;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.l;
import oh.x;
import org.chromium.net.CronetEngine;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataProviders;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes.dex */
public final class b implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.a f9570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CronetEngine f9571b;

    public b(CronetEngine cronetEngine, ee.a aVar) {
        l.f("dispatchers", aVar);
        this.f9571b = cronetEngine;
        this.f9570a = aVar;
    }

    @Override // ke.c
    public final me.c a(me.b bVar) {
        return (me.c) x.w(this.f9570a.f5482b, new a4.e(this, bVar, null, 16));
    }

    @Override // ke.c
    public final Object b(me.b bVar, wg.c cVar) {
        Executor oVar;
        byte[] bytes;
        Executor oVar2;
        oh.f fVar = new oh.f(1, qd.a.j(cVar));
        fVar.r();
        CronetEngine cronetEngine = this.f9571b;
        StringBuilder sb2 = new StringBuilder();
        String str = bVar.f11662a;
        int i10 = bVar.f11668g;
        sb2.append(nh.h.s0(str, '/'));
        sb2.append('/');
        sb2.append(nh.h.s0(bVar.j, '/'));
        String strC0 = nh.h.c0(sb2.toString(), "/");
        a aVar = new a();
        ee.a aVar2 = this.f9570a;
        vh.c cVar2 = aVar2.f5482b;
        vh.c cVar3 = cVar2 != null ? cVar2 : null;
        if (cVar3 == null || (oVar = cVar3.c0()) == null) {
            oVar = new o(2, cVar2);
        }
        UrlRequest.Builder builderNewUrlRequestBuilder = cronetEngine.newUrlRequestBuilder(strC0, aVar, oVar);
        for (Map.Entry entry : bVar.f11666e.entrySet()) {
            String str2 = (String) entry.getKey();
            Iterator it = ((List) entry.getValue()).iterator();
            while (it.hasNext()) {
                builderNewUrlRequestBuilder.addHeader(str2, (String) it.next());
            }
        }
        if (i10 == 1) {
            Object obj = bVar.f11663b;
            if (obj instanceof byte[]) {
                bytes = (byte[]) obj;
            } else if (obj instanceof String) {
                bytes = ((String) obj).getBytes(nh.a.f12288a);
                l.e("this as java.lang.String).getBytes(charset)", bytes);
            } else {
                bytes = new byte[0];
            }
            UploadDataProvider uploadDataProviderCreate = UploadDataProviders.create(bytes);
            vh.c cVar4 = aVar2.f5482b;
            vh.c cVar5 = cVar4 != null ? cVar4 : null;
            if (cVar5 == null || (oVar2 = cVar5.c0()) == null) {
                oVar2 = new o(2, cVar4);
            }
            builderNewUrlRequestBuilder.setUploadDataProvider(uploadDataProviderCreate, oVar2);
        }
        builderNewUrlRequestBuilder.setHttpMethod(me.a.a(i10)).setPriority(4).build().start();
        Object objQ = fVar.q();
        vg.a aVar3 = vg.a.f18663i;
        return objQ;
    }
}
