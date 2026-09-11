package ui;

import java.util.ArrayList;
import launcher.powerkuy.growlauncher.manager.ThemeVariable;
import li.w;
import li.x;
import rh.h1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u implements eh.f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ w f18094i;

    public u(w wVar) {
        this.f18094i = wVar;
    }

    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str = (String) obj;
        String str2 = (String) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("name", str);
        kotlin.jvm.internal.l.f("hex", str2);
        w wVar = this.f18094i;
        if (iIntValue == 0) {
            try {
                h1 h1Var = x.f10067a;
                String strB0 = nh.h.b0(str2, "0x");
                te.a.j(16);
                long j = Long.parseLong(strB0, 16);
                h1 h1Var2 = x.f10067a;
                Long lValueOf = Long.valueOf(j);
                h1Var2.getClass();
                h1Var2.k(null, lValueOf);
            } catch (Exception unused) {
            }
        } else if (iIntValue == 1) {
            h1 h1Var3 = wVar.f10065c;
            Iterable iterable = (Iterable) h1Var3.getValue();
            ArrayList arrayList = new ArrayList();
            for (Object obj4 : iterable) {
                ThemeVariable themeVariable = (ThemeVariable) obj4;
                if (!kotlin.jvm.internal.l.a(themeVariable.getName(), str) || !kotlin.jvm.internal.l.a(themeVariable.getHex(), str2)) {
                    arrayList.add(obj4);
                }
            }
            h1Var3.k(null, arrayList);
        }
        wVar.i();
        return qg.o.f13926a;
    }
}
