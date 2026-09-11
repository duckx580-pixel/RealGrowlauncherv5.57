package u3;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InputContentInfo f17619i;

    public e(Object obj) {
        this.f17619i = (InputContentInfo) obj;
    }

    @Override // u3.f
    public final Uri a() {
        return this.f17619i.getContentUri();
    }

    @Override // u3.f
    public final void b() {
        this.f17619i.requestPermission();
    }

    @Override // u3.f
    public final Uri c() {
        return this.f17619i.getLinkUri();
    }

    @Override // u3.f
    public final Object d() {
        return this.f17619i;
    }

    @Override // u3.f
    public final ClipDescription getDescription() {
        return this.f17619i.getDescription();
    }

    public e(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.f17619i = new InputContentInfo(uri, clipDescription, uri2);
    }
}
