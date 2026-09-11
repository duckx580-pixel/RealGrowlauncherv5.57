package tg;

import java.util.Comparator;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f17188b = new a(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17189c = new a(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17190a;

    public /* synthetic */ a(int i10) {
        this.f17190a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f17190a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                l.f("a", comparable);
                l.f("b", comparable2);
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                l.f("a", comparable3);
                l.f("b", comparable4);
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f17190a) {
            case 0:
                return f17189c;
            default:
                return f17188b;
        }
    }
}
