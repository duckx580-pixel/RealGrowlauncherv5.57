package ll;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w extends r0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f10210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f10211d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f10212e;

    public w(int i10, String str, boolean z3) {
        this.f10209b = i10;
        switch (i10) {
            case 1:
                a aVar = a.f10094r;
                Objects.requireNonNull(str, "name == null");
                this.f10210c = str;
                this.f10211d = aVar;
                this.f10212e = z3;
                break;
            default:
                a aVar2 = a.f10094r;
                Objects.requireNonNull(str, "name == null");
                this.f10210c = str;
                this.f10211d = aVar2;
                this.f10212e = z3;
                break;
        }
    }

    @Override // ll.r0
    public final void a(h0 h0Var, Object obj) {
        switch (this.f10209b) {
            case 0:
                if (obj != null) {
                    this.f10211d.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        h0Var.a(this.f10210c, string, this.f10212e);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f10211d.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        h0Var.d(this.f10210c, string2, this.f10212e);
                        break;
                    }
                }
                break;
        }
    }
}
