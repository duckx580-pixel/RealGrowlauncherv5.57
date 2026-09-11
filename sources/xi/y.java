package xi;

import android.content.Context;
import android.widget.Toast;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import o0.s0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Context f19880i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ li.s f19881r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ s0 f19882s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ s0 f19883t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ s0 f19884u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ s0 f19885v;
    public final /* synthetic */ s0 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ s0 f19886x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ s0 f19887y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(Context context, li.s sVar, s0 s0Var, s0 s0Var2, s0 s0Var3, s0 s0Var4, s0 s0Var5, s0 s0Var6, s0 s0Var7, ug.c cVar) {
        super(2, cVar);
        this.f19880i = context;
        this.f19881r = sVar;
        this.f19882s = s0Var;
        this.f19883t = s0Var2;
        this.f19884u = s0Var3;
        this.f19885v = s0Var4;
        this.w = s0Var5;
        this.f19886x = s0Var6;
        this.f19887y = s0Var7;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        return new y(this.f19880i, this.f19881r, this.f19882s, this.f19883t, this.f19884u, this.f19885v, this.w, this.f19886x, this.f19887y, cVar);
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        y yVar = (y) create((oh.w) obj, (ug.c) obj2);
        qg.o oVar = qg.o.f13926a;
        yVar.invokeSuspend(oVar);
        return oVar;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) {
        vg.a aVar = vg.a.f18663i;
        androidx.work.v.B(obj);
        if (kotlin.jvm.internal.l.a((Boolean) this.f19882s.getValue(), Boolean.TRUE)) {
            Toast.makeText(this.f19880i, "Script uploaded successfully!", 1).show();
            this.f19883t.setValue(PredefinedUICustomizationFont.defaultFamily);
            this.f19884u.setValue(PredefinedUICustomizationFont.defaultFamily);
            this.f19885v.setValue(PredefinedUICustomizationFont.defaultFamily);
            this.w.setValue(Boolean.FALSE);
            this.f19886x.setValue(null);
            this.f19887y.setValue(PredefinedUICustomizationFont.defaultFamily);
            li.s sVar = this.f19881r;
            sVar.G.j(null);
            sVar.f10040i.j(null);
        }
        return qg.o.f13926a;
    }
}
