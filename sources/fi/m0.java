package fi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import launcher.powerkuy.growlauncher.manager.SavedLuaActive;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 implements eh.c, bj.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f6468i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f6469r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f6470s;

    public /* synthetic */ m0(int i10, Object obj, Object obj2) {
        this.f6468i = i10;
        this.f6469r = obj;
        this.f6470s = obj2;
    }

    @Override // bj.e
    public void b(fj.j jVar, bj.c0 c0Var) {
        ((oh.f) this.f6470s).resumeWith(c0Var);
    }

    @Override // eh.c
    public final Object invoke(Object obj) {
        switch (this.f6468i) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                s0 s0Var = (s0) this.f6469r;
                File file = (File) this.f6470s;
                kotlin.jvm.internal.l.f("file", file);
                rh.h1 h1Var = s0Var.f6568f;
                ArrayList arrayListY0 = rg.l.y0((Collection) h1Var.getValue());
                int iHashCode = file.getAbsolutePath().hashCode();
                if (!zBooleanValue) {
                    arrayListY0.removeIf(new p0(new q0(iHashCode), 1));
                } else if (arrayListY0.isEmpty()) {
                    String absolutePath = file.getAbsolutePath();
                    kotlin.jvm.internal.l.e("getAbsolutePath(...)", absolutePath);
                    arrayListY0.add(new SavedLuaActive(absolutePath, iHashCode));
                } else {
                    Iterator it = arrayListY0.iterator();
                    while (it.hasNext()) {
                        if (((SavedLuaActive) it.next()).getHash() == iHashCode) {
                        }
                    }
                    String absolutePath2 = file.getAbsolutePath();
                    kotlin.jvm.internal.l.e("getAbsolutePath(...)", absolutePath2);
                    arrayListY0.add(new SavedLuaActive(absolutePath2, iHashCode));
                }
                h1Var.k(null, arrayListY0);
                oh.x.s(androidx.lifecycle.p0.j(s0Var), null, 0, new r0(s0Var, null, 1), 3);
                break;
            default:
                try {
                    ((fj.j) this.f6469r).cancel();
                    break;
                } catch (Throwable unused) {
                }
                break;
        }
        return qg.o.f13926a;
    }

    @Override // bj.e
    public void j(fj.j jVar, IOException iOException) {
        if (jVar.A) {
            return;
        }
        ((oh.f) this.f6470s).resumeWith(androidx.work.v.i(iOException));
    }
}
