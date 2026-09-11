package zc;

import android.content.Context;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes.dex */
public final class d4 extends i3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f20780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x2 f20781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Context f20782g;

    public d4(x2 x2Var, e1 e1Var, u0 u0Var, m1 m1Var, String str, Context context) {
        this.f20781f = x2Var;
        this.f20780e = str;
        this.f20782g = context;
    }

    @Override // zc.i3
    public final Object e(u uVar) {
        s3 s3Var;
        uVar.e(3);
        q3 q3Var = null;
        n3 n3Var = null;
        while (uVar.u()) {
            String strF = uVar.F();
            if ("interstitial".equals(strF)) {
                q3Var = uVar.h0() ? null : new q3(uVar);
            } else if ("contextual_button".equals(strF)) {
                n3Var = (n3) (uVar.h0() ? null : n3.f21023f.m(uVar));
            } else if ("enabled_placements".equals(strF)) {
                LinkedList linkedList = new LinkedList();
                uVar.e(1);
                while (uVar.u()) {
                    linkedList.add(uVar.i0());
                }
                uVar.e(2);
            } else {
                uVar.f0();
            }
        }
        uVar.e(4);
        Context context = this.f20782g;
        String str = this.f20780e;
        x2 x2Var = this.f20781f;
        if (q3Var != null && (((s3Var = q3Var.f21078e) != null && q3Var.f21076c != null && q3Var.f21080g != null) || (s3Var != null && q3Var.f21077d != null && q3Var.f21081h != null))) {
            return new xa.c(new e3(x2Var, str, q3Var, context));
        }
        if (n3Var != null) {
            return new xa.c(new w2(x2Var, str, n3Var, context));
        }
        f3 f3Var = new f3();
        System.currentTimeMillis();
        return new xa.c(f3Var);
    }
}
