package a0;

import androidx.appcompat.widget.w3;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Comparator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f92a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ w3 f93b;

    public /* synthetic */ l(w3 w3Var, int i10) {
        this.f92a = i10;
        this.f93b = w3Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f92a) {
            case 0:
                w3 w3Var = this.f93b;
                return o1.c.m(Integer.valueOf(((b0.v) w3Var.f1064r).a(((b0) obj).f18b)), Integer.valueOf(((b0.v) w3Var.f1064r).a(((b0) obj2).f18b)));
            default:
                w3 w3Var2 = this.f93b;
                return o1.c.m(Integer.valueOf(((b0.v) w3Var2.f1064r).a(((b0) obj2).f18b)), Integer.valueOf(((b0.v) w3Var2.f1064r).a(((b0) obj).f18b)));
        }
    }
}
