package l5;

import android.webkit.WebMessage;
import android.webkit.WebMessagePort;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends WebMessagePort.WebMessageCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9806a;

    @Override // android.webkit.WebMessagePort.WebMessageCallback
    public final void onMessage(WebMessagePort webMessagePort, WebMessage webMessage) {
        switch (this.f9806a) {
            case 0:
                g.d(webMessage);
                throw null;
            default:
                g.d(webMessage);
                throw null;
        }
    }
}
