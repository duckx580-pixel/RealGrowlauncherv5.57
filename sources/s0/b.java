package s0;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15014i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Collection f15015r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(int i10, Collection collection) {
        super(1);
        this.f15014i = i10;
        this.f15015r = collection;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f15014i) {
            case 0:
                return Boolean.valueOf(this.f15015r.contains(obj));
            case 1:
                return Boolean.valueOf(this.f15015r.contains(obj));
            default:
                return Boolean.valueOf(((List) obj).retainAll(this.f15015r));
        }
    }
}
