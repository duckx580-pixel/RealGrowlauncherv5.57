package o6;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f12750i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f12751r;

    public /* synthetic */ v(int i10, Object obj) {
        this.f12750i = i10;
        this.f12751r = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f12750i) {
            case 0:
                w wVar = (w) this.f12751r;
                wVar.f12752i.f12698a = 0;
                wVar.f12752i.f12703f = null;
                wVar.b(x.f12763i);
                break;
            default:
                ((i) this.f12751r).onProductDetailsResponse(x.f12763i, new ArrayList());
                break;
        }
    }
}
