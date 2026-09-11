package re;

import s.h0;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f14640i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final xd.a f14641r;

    public /* synthetic */ b(xd.a aVar, int i10) {
        this.f14640i = i10;
        this.f14641r = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f14640i) {
            case 0:
                xd.a aVar = this.f14641r;
                try {
                    e eVar = new e(aVar, aVar.f19571c.i().z(), aVar.f19571c.i().A());
                    String str = "file://" + oe.c.d();
                    StringBuilder sbM = k0.g.m("?platform=android" + qd.a.e("origin", aVar.f19587t));
                    sbM.append(qd.a.e("version", aVar.f19588u));
                    StringBuilder sbM2 = k0.g.m(sbM.toString());
                    sbM2.append(qd.a.e("isNativeCollectingMetrics", String.valueOf(aVar.f19576h)));
                    eVar.f14649b.loadDataWithBaseURL(h0.e(str, sbM2.toString()), aVar.f19585r, "text/html", "UTF-8", null);
                    e.f14644d = eVar;
                } catch (Exception e8) {
                    ie.c.b("Unity Ads SDK unable to create WebViewApp " + e8.getMessage());
                    e.f14643c.open();
                    return;
                }
                break;
            default:
                xd.a aVar2 = this.f14641r;
                try {
                    e eVar2 = new e(aVar2, true, aVar2.f19571c.i().A());
                    String str2 = aVar2.f19587t;
                    StringBuilder sbM3 = k0.g.m("?platform=android" + qd.a.e("origin", aVar2.f19587t));
                    sbM3.append(qd.a.e("version", aVar2.f19588u));
                    StringBuilder sbM4 = k0.g.m(sbM3.toString());
                    sbM4.append(qd.a.e("isNativeCollectingMetrics", String.valueOf(aVar2.f19576h)));
                    eVar2.f14649b.loadUrl(h0.e(str2, sbM4.toString()));
                    e.f14644d = eVar2;
                } catch (Exception unused) {
                    ie.c.b("Unity Ads SDK unable to create WebViewApp");
                    e.f14643c.open();
                }
                break;
        }
    }
}
