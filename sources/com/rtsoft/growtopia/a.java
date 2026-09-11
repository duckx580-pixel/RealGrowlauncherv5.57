package com.rtsoft.growtopia;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f4713i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ UsercentricsManager f4714r;

    public /* synthetic */ a(UsercentricsManager usercentricsManager, int i10) {
        this.f4713i = i10;
        this.f4714r = usercentricsManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f4713i) {
            case 0:
                this.f4714r.lambda$CheckConsentState$5();
                break;
            case 1:
                this.f4714r.lambda$RequestConsentSettings$7();
                break;
            case 2:
                this.f4714r.lambda$ShowConsentSettings$9();
                break;
            default:
                this.f4714r.lambda$initUsercentrics$2();
                break;
        }
    }
}
