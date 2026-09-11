package s3;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements OnReceiveContentListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f15124a;

    public w0(z zVar) {
        this.f15124a = zVar;
    }

    public final ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
        i iVar = new i(new e(contentInfo));
        i iVarA = ((v3.t) this.f15124a).a(view, iVar);
        if (iVarA == null) {
            return null;
        }
        return iVarA == iVar ? contentInfo : iVarA.a();
    }
}
