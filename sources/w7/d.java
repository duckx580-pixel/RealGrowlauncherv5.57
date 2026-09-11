package w7;

import com.google.android.gms.common.api.Scope;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements Comparator {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ d f19103b = new d(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19104a;

    public /* synthetic */ d(int i10) {
        this.f19104a = i10;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f19104a) {
        }
        return ((Scope) obj).f3664r.compareTo(((Scope) obj2).f3664r);
    }
}
