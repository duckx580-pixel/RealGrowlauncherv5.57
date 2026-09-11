package s3;

import android.view.ContentInfo;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f15073a;

    public i(h hVar) {
        this.f15073a = hVar;
    }

    public final ContentInfo a() {
        ContentInfo contentInfoE = this.f15073a.e();
        Objects.requireNonNull(contentInfoE);
        return contentInfoE;
    }

    public final String toString() {
        return this.f15073a.toString();
    }
}
