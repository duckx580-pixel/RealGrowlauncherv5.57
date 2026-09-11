package i6;

import bj.s;
import java.util.regex.Pattern;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f8079i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f8080r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(b bVar, int i10) {
        super(0);
        this.f8079i = i10;
        this.f8080r = bVar;
    }

    @Override // eh.a
    public final Object invoke() {
        int i10 = this.f8079i;
        b bVar = this.f8080r;
        switch (i10) {
            case 0:
                bj.c cVar = bj.c.f3074n;
                return gh.a.u(bVar.f8086f);
            default:
                String strB = bVar.f8086f.b("Content-Type");
                if (strB == null) {
                    return null;
                }
                Pattern pattern = s.f3186d;
                return o1.c.B(strB);
        }
    }
}
