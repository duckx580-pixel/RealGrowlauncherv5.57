package z9;

import android.os.Bundle;
import java.util.HashSet;
import s8.f1;
import s8.g1;
import u5.s;
import x7.h;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20680a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f20681b;

    public /* synthetic */ c(int i10, Object obj) {
        this.f20680a = i10;
        this.f20681b = obj;
    }

    @Override // s8.g1
    public final void a(long j, Bundle bundle, String str, String str2) {
        int i10 = this.f20680a;
        Object obj = this.f20681b;
        switch (i10) {
            case 0:
                h hVar = (h) obj;
                if (((HashSet) hVar.f19488r).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    HashSet hashSet = b.f20676a;
                    String strF = f1.f(str2, f1.f15329c, f1.f15327a);
                    if (strF != null) {
                        str2 = strF;
                    }
                    bundle2.putString("events", str2);
                    ((s) hVar.f19489s).l(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !str.equals("crash") && !b.f20676a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((s) ((xa.c) obj).f19511a).l(3, bundle3);
                    break;
                }
                break;
        }
    }
}
