package zc;

import com.tapjoy.TJPlacement;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class l3 implements s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f20979a;

    static {
        String[] strArr = {"reward", "purchase", "custom_action"};
        f20979a = strArr;
        Arrays.sort(strArr);
    }

    public static l3 a(String str, u uVar) {
        if ("reward".equals(str)) {
            return (l3) (uVar.h0() ? null : t3.f21125d.m(uVar));
        }
        if (!"purchase".equals(str) || uVar.h0()) {
            return null;
        }
        uVar.e(3);
        String strK = PredefinedUICustomizationFont.defaultFamily;
        String strK2 = strK;
        while (uVar.u()) {
            String strF = uVar.F();
            if ("campaign_id".equals(strF)) {
                strK = uVar.h0() ? PredefinedUICustomizationFont.defaultFamily : uVar.K();
            } else if ("product_id".equals(strF)) {
                strK2 = uVar.h0() ? PredefinedUICustomizationFont.defaultFamily : uVar.K();
            } else {
                uVar.f0();
            }
        }
        uVar.e(4);
        return new r3(strK, strK2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(t6.q3 q3Var) {
        TJPlacement tJPlacement;
        yc.v vVar;
        TJPlacement tJPlacement2;
        yc.v vVar2;
        if (this instanceof t2) {
            String str = ((r3) ((t2) this)).f21099b;
            j jVar = yc.a.f20242a;
            synchronized (jVar) {
                tJPlacement2 = (TJPlacement) jVar.get(q3Var.f17003a);
            }
            if (tJPlacement2 == null || (vVar2 = tJPlacement2.f4727a) == null) {
                return;
            }
            vVar2.onPurchaseRequest(tJPlacement2, new mc.a(), str);
            return;
        }
        if (this instanceof u2) {
            t3 t3Var = (t3) ((u2) this);
            String str2 = t3Var.f21126b;
            int i10 = t3Var.f21127c;
            j jVar2 = yc.a.f20242a;
            synchronized (jVar2) {
                tJPlacement = (TJPlacement) jVar2.get(q3Var.f17003a);
            }
            if (tJPlacement == null || (vVar = tJPlacement.f4727a) == null) {
                return;
            }
            vVar.onRewardRequest(tJPlacement, new n9.e(17), str2, i10);
        }
    }
}
