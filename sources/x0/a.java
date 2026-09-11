package x0;

import com.google.android.gms.internal.measurement.j3;
import qg.o;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b f19336i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ j3 f19337r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ j f19338s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f19339t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f19340u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Object[] f19341v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, j3 j3Var, j jVar, String str, Object obj, Object[] objArr) {
        super(0);
        this.f19336i = bVar;
        this.f19337r = j3Var;
        this.f19338s = jVar;
        this.f19339t = str;
        this.f19340u = obj;
        this.f19341v = objArr;
    }

    @Override // eh.a
    public final Object invoke() {
        boolean z3;
        b bVar = this.f19336i;
        j jVar = bVar.f19343r;
        j jVar2 = this.f19338s;
        boolean z10 = true;
        if (jVar != jVar2) {
            bVar.f19343r = jVar2;
            z3 = true;
        } else {
            z3 = false;
        }
        String str = bVar.f19344s;
        String str2 = this.f19339t;
        if (kotlin.jvm.internal.l.a(str, str2)) {
            z10 = z3;
        } else {
            bVar.f19344s = str2;
        }
        bVar.f19342i = this.f19337r;
        bVar.f19345t = this.f19340u;
        bVar.f19346u = this.f19341v;
        i iVar = bVar.f19347v;
        if (iVar != null && z10) {
            ((n7.e) iVar).J();
            bVar.f19347v = null;
            bVar.b();
        }
        return o.f13926a;
    }
}
