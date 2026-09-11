package j4;

import androidx.fragment.app.r;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends RuntimeException {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f8775i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(r rVar, String str) {
        super(str);
        l.f("fragment", rVar);
        this.f8775i = rVar;
    }
}
