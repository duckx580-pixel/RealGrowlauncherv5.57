package qi;

import g1.t;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.l;
import m0.e1;
import m0.g1;
import m0.l7;
import m0.n7;
import m0.o7;
import o0.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13994i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ File f13995r;

    public /* synthetic */ f(File file, int i10) {
        this.f13994i = i10;
        this.f13995r = file;
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f13994i) {
            case 0:
                o oVar = (o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && oVar.D()) {
                    oVar.P();
                } else {
                    String name = this.f13995r.getName();
                    l.e("getName(...)", name);
                    l7.b(name, null, ((e1) oVar.k(g1.f10686a)).k(), 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, oVar, 0, 0, 131066);
                }
                break;
            default:
                o oVar2 = (o) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && oVar2.D()) {
                    oVar2.P();
                } else {
                    String str = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date(this.f13995r.lastModified()));
                    l.e("format(...)", str);
                    l7.b("Last Modified: ".concat(str), null, t.f6907d, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, ((n7) oVar2.k(o7.f11096a)).f11044h, oVar2, 384, 0, 65530);
                }
                break;
        }
        return qg.o.f13926a;
    }
}
