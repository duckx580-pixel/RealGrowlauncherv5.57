package t4;

import android.util.Log;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 extends kotlin.jvm.internal.m implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u4.a f16662i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ t0 f16663r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.s f16664s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ u5.l f16665t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ t f16666u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ List f16667v;
    public final /* synthetic */ int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f16668x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ t f16669y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(u4.a aVar, t0 t0Var, kotlin.jvm.internal.s sVar, u5.l lVar, t tVar, List list, int i10, int i11, t tVar2) {
        super(0);
        this.f16662i = aVar;
        this.f16663r = t0Var;
        this.f16664s = sVar;
        this.f16665t = lVar;
        this.f16666u = tVar;
        this.f16667v = list;
        this.w = i10;
        this.f16668x = i11;
        this.f16669y = tVar2;
    }

    @Override // eh.a
    public final Object invoke() {
        List list;
        List list2;
        t0 t0Var = this.f16663r;
        u4.a aVar = this.f16662i;
        aVar.f17622c = t0Var;
        this.f16664s.f9662i = true;
        u5.l lVar = this.f16665t;
        aVar.f17623d = lVar;
        if (l.f16562b != null && Log.isLoggable("Paging", 3)) {
            StringBuilder sb2 = new StringBuilder("Presenting data:\n                            |   first item: ");
            List list3 = this.f16667v;
            m1 m1Var = (m1) rg.l.e0(list3);
            Object objL0 = null;
            sb2.append((m1Var == null || (list2 = m1Var.f16581b) == null) ? null : rg.l.e0(list2));
            sb2.append("\n                            |   last item: ");
            m1 m1Var2 = (m1) rg.l.l0(list3);
            if (m1Var2 != null && (list = m1Var2.f16581b) != null) {
                objL0 = rg.l.l0(list);
            }
            sb2.append(objL0);
            sb2.append("\n                            |   placeholdersBefore: ");
            sb2.append(this.w);
            sb2.append("\n                            |   placeholdersAfter: ");
            sb2.append(this.f16668x);
            sb2.append("\n                            |   hintReceiver: ");
            sb2.append(lVar);
            sb2.append("\n                            |   sourceLoadStates: ");
            sb2.append(this.f16669y);
            sb2.append("\n                        ");
            String string = sb2.toString();
            t tVar = this.f16666u;
            if (tVar != null) {
                string = string + "|   mediatorLoadStates: " + tVar + '\n';
            }
            hd.b0.e(3, nh.i.B(string + "|)"));
        }
        return qg.o.f13926a;
    }
}
