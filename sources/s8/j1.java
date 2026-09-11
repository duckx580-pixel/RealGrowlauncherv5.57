package s8;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j1 implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f15437i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final long f15438r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f15439s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Object f15440t;

    public /* synthetic */ j1(Object obj, Object obj2, long j, int i10) {
        this.f15437i = i10;
        this.f15439s = obj;
        this.f15440t = obj2;
        this.f15438r = j;
    }

    @Override // java.lang.Runnable
    public final void run() throws JSONException {
        switch (this.f15437i) {
            case 0:
                v1 v1Var = (v1) this.f15439s;
                Bundle bundle = (Bundle) this.f15440t;
                if (!TextUtils.isEmpty(((y0) v1Var.f3470r).o().y())) {
                    i0 i0Var = ((y0) v1Var.f3470r).f15665y;
                    y0.k(i0Var);
                    i0Var.B.b("Using developer consent only; google app id found");
                } else {
                    v1Var.F(bundle, 0, this.f15438r);
                }
                break;
            case 1:
                c2 c2Var = (c2) this.f15440t;
                c2Var.y((z1) this.f15439s, false, this.f15438r);
                c2Var.f15285v = null;
                l2 l2VarS = ((y0) c2Var.f3470r).s();
                l2VarS.t();
                l2VarS.u();
                l2VarS.F(new androidx.fragment.app.d(28, l2VarS, (Object) null));
                break;
            default:
                al.h hVar = (al.h) this.f15439s;
                try {
                    int iA = al.h.a(hVar, (JSONArray) this.f15440t, false);
                    if (iA >= 200 && iA < 300) {
                        ae.c cVar = (ae.c) hVar.f642f;
                        long j = this.f15438r;
                        SharedPreferences.Editor editorEdit = ((SharedPreferences) ((kb.c) cVar.f594i).f9562i).edit();
                        editorEdit.putLong("app_launch_last_sync_timestamp", j);
                        if (!editorEdit.commit()) {
                            editorEdit.commit();
                        }
                        break;
                    }
                } catch (fc.a e8) {
                    w9.a.m("analyticsMngr", "Failed to send the app launch events", e8);
                }
                break;
        }
    }

    public j1(c2 c2Var, z1 z1Var, long j) {
        this.f15437i = 1;
        this.f15440t = c2Var;
        this.f15439s = z1Var;
        this.f15438r = j;
    }
}
