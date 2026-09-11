package ti;

import java.io.File;
import k2.u;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements eh.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f17269i = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s0 f17270r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f17271s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f17272t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f17273u;

    public /* synthetic */ f(eh.a aVar, eh.a aVar2, s0 s0Var, s0 s0Var2) {
        this.f17272t = aVar;
        this.f17273u = aVar2;
        this.f17270r = s0Var;
        this.f17271s = s0Var2;
    }

    @Override // eh.a
    public final Object invoke() {
        switch (this.f17269i) {
            case 0:
                eh.a aVar = (eh.a) this.f17272t;
                eh.a aVar2 = (eh.a) this.f17273u;
                s0 s0Var = this.f17270r;
                if (!nh.h.W((String) s0Var.getValue())) {
                    try {
                        File file = new File((File) aVar.invoke(), ((String) s0Var.getValue()) + ".lua");
                        if (!file.exists()) {
                            file.createNewFile();
                            bh.l.H(file, "-- New Lua Script\n");
                            aVar2.invoke();
                        }
                        break;
                    } catch (Exception unused) {
                    }
                }
                this.f17271s.setValue(Boolean.FALSE);
                break;
            default:
                s0 s0Var2 = (s0) this.f17272t;
                s0 s0Var3 = (s0) this.f17273u;
                File file2 = (File) this.f17270r.getValue();
                if (file2 != null && !((Boolean) this.f17271s.getValue()).booleanValue()) {
                    try {
                        bh.l.H(file2, ((u) s0Var2.getValue()).f9196a.f4836i);
                        s0Var3.setValue(((u) s0Var2.getValue()).f9196a.f4836i);
                        break;
                    } catch (Exception unused2) {
                    }
                }
                break;
        }
        return qg.o.f13926a;
    }

    public /* synthetic */ f(s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4) {
        this.f17270r = s0Var;
        this.f17271s = s0Var2;
        this.f17272t = s0Var3;
        this.f17273u = s0Var4;
    }
}
