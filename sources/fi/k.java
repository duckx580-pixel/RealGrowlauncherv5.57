package fi;

import android.content.Context;
import android.media.MediaPlayer;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class k implements eh.c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6428i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6429r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f6430s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f6431t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f6432u;

    public /* synthetic */ k(Object obj, androidx.lifecycle.v0 v0Var, Object obj2, Object obj3, int i10) {
        this.f6428i = i10;
        this.f6429r = obj;
        this.f6430s = v0Var;
        this.f6431t = obj2;
        this.f6432u = obj3;
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f6428i) {
            case 0:
                y0.q qVar = (y0.q) this.f6429r;
                o0.s0 s0Var = (o0.s0) this.f6430s;
                eh.c cVar = (eh.c) this.f6432u;
                o0.s0 s0Var2 = (o0.s0) this.f6431t;
                p pVar = (p) obj;
                kotlin.jvm.internal.l.f("fileItem", pVar);
                String str = pVar.f6506b;
                if (pVar.f6507c) {
                    qVar.add(str);
                    s0Var.setValue(str);
                } else {
                    MediaPlayer mediaPlayer = (MediaPlayer) s0Var2.getValue();
                    if (mediaPlayer != null) {
                        mediaPlayer.release();
                    }
                    cVar.invoke(pVar);
                }
                return qg.o.f13926a;
            case 1:
                o0.d2 d2Var = (o0.d2) this.f6429r;
                s0 s0Var3 = (s0) this.f6430s;
                Context context = (Context) this.f6431t;
                o0.d2 d2Var2 = (o0.d2) this.f6432u;
                z.e eVar = (z.e) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar);
                List list = (List) d2Var.getValue();
                eVar.K(list.size(), new a0.u(9, new d0(0), list), new f0.z1(1, list), new w0.a(-632812321, new o0(list, s0Var3, context, d2Var2), true));
                z.e.J(eVar, s.f6555p);
                break;
            default:
                List list2 = (List) this.f6429r;
                li.g gVar = (li.g) this.f6430s;
                o0.d2 d2Var3 = (o0.d2) this.f6431t;
                hi.a aVar = (hi.a) this.f6432u;
                z.e eVar2 = (z.e) obj;
                kotlin.jvm.internal.l.f("$this$LazyColumn", eVar2);
                z.e.J(eVar2, ri.a.f14868e);
                eVar2.K(list2.size(), new a0.u(24, new d0(10), list2), new f0.z1(7, list2), new w0.a(-632812321, new c5.b(2, list2), true));
                z.e.J(eVar2, new w0.a(360548201, new y(5, gVar), true));
                List list3 = (List) d2Var3.getValue();
                eVar2.K(list3.size(), new a0.u(25, new d0(11), list3), new f0.z1(8, list3), new w0.a(-632812321, new ni.m(list3, aVar, gVar, 1), true));
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ k(y0.q qVar, o0.s0 s0Var, eh.c cVar, o0.s0 s0Var2) {
        this.f6428i = 0;
        this.f6429r = qVar;
        this.f6430s = s0Var;
        this.f6432u = cVar;
        this.f6431t = s0Var2;
    }
}
