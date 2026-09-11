package zc;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class h4 implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c4 f20883i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RelativeLayout f20884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c4 f20885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u3 f20886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i4 f20887u;

    public h4(i4 i4Var, c4 c4Var, RelativeLayout relativeLayout, c4 c4Var2, u3 u3Var) {
        this.f20887u = i4Var;
        this.f20883i = c4Var;
        this.f20884r = relativeLayout;
        this.f20885s = c4Var2;
        this.f20886t = u3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q1 q1Var;
        RelativeLayout relativeLayout = this.f20884r;
        c4 c4Var = this.f20883i;
        if (c4Var != null) {
            c4Var.b();
            relativeLayout.removeView(c4Var);
        }
        c4 c4Var2 = this.f20885s;
        if (c4Var2 != null) {
            c4Var2.b();
            relativeLayout.removeView(c4Var2);
        }
        b3 b3Var = this.f20887u.f20901r;
        Activity activity = (Activity) b3Var.f20729b;
        w2 w2Var = (w2) b3Var.f20730c;
        androidx.fragment.app.h hVar = w2Var.f20845d;
        if ((hVar instanceof z1) && (q1Var = ((z1) hVar).f21307c) != null) {
            q1Var.h();
        }
        x2 x2Var = w2Var.f21223g;
        LinkedHashMap linkedHashMap = w2Var.f21222f.f21025d;
        u3 u3Var = this.f20886t;
        String str = u3Var.f21157k;
        String str2 = u3Var.f21154g;
        k1.a aVar = x2Var.f21254f;
        v0 v0VarA = aVar.a(b1.CAMPAIGN, "click");
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        linkedHashMap2.put("region", str);
        v0VarA.f21186s = n.b(linkedHashMap2);
        aVar.c(v0VarA);
        if (!TextUtils.isEmpty(u3Var.f21155h)) {
            u5.c cVar = w2Var.f20843b;
            String str3 = u3Var.f21155h;
            String str4 = u3Var.f21156i;
            if (str4 == null || str4.length() == 0) {
                str4 = null;
            }
            cVar.c(activity, str3, str4);
            w2Var.f20842a = true;
        } else if (!TextUtils.isEmpty(str2)) {
            g3.a(activity, str2);
        }
        ((z2) b3Var.f20728a).b(w2Var.f21221e, null);
        if (u3Var.j) {
            w2.f(w2Var);
        }
    }
}
