package zc;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class l4 extends RelativeLayout implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f20980i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f20981r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f20982s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f20983t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public FrameLayout f20984u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ImageView f20985v;
    public f4 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public q3 f20986x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public b3 f20987y;

    public final int a(int i10) {
        return (int) (i10 * this.f20981r);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        q1 q1Var;
        f4 f4Var;
        b3 b3Var = this.f20987y;
        if (view == this.f20985v) {
            ((e3) b3Var.f20730c).f20800h.cancel();
            return;
        }
        if (view != null && view == (f4Var = this.w)) {
            boolean z3 = f4Var.f20828i;
            f4Var.f20828i = !z3;
            f4Var.f20832u = !z3 ? f4Var.f20830s : f4Var.f20831t;
            f4Var.invalidate();
            ((e3) b3Var.f20730c).f20803l = !r10.f20803l;
            return;
        }
        if (view.getTag() instanceof o3) {
            o3 o3Var = (o3) view.getTag();
            Activity activity = (Activity) b3Var.f20729b;
            e3 e3Var = (e3) b3Var.f20730c;
            androidx.fragment.app.h hVar = e3Var.f20845d;
            if ((hVar instanceof y1) && (q1Var = ((y1) hVar).f21290c) != null) {
                q1Var.h();
            }
            x2 x2Var = e3Var.f20799g;
            LinkedHashMap linkedHashMap = e3Var.f20798f.f21085m;
            String str = o3Var.f21040b;
            k1.a aVar = x2Var.f21254f;
            v0 v0VarA = aVar.a(b1.CAMPAIGN, "click");
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
            linkedHashMap2.put("region", str);
            v0VarA.f21186s = n.b(linkedHashMap2);
            aVar.c(v0VarA);
            g3.a(activity, o3Var.f21042d);
            if (!TextUtils.isEmpty(o3Var.f21043e)) {
                u5.c cVar = e3Var.f20843b;
                String str2 = o3Var.f21043e;
                String str3 = o3Var.f21044f;
                if (str3 == null || str3.length() == 0) {
                    str3 = null;
                }
                cVar.c(activity, str2, str3);
                e3Var.f20842a = true;
            }
            ((z2) b3Var.f20728a).b(e3Var.f20797e, o3Var.f21045g);
            if (o3Var.f21041c) {
                e3Var.f20800h.dismiss();
            }
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z3, int i10, int i11, int i12, int i13) {
        super.onLayout(z3, i10, i11, i12, i13);
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0141  */
    @Override // android.widget.RelativeLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onMeasure(int r11, int r12) {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zc.l4.onMeasure(int, int):void");
    }

    public final void setLandscape(boolean z3) {
        Bitmap bitmap;
        Bitmap bitmap2;
        ArrayList<o3> arrayList;
        q3 q3Var = this.f20986x;
        FrameLayout frameLayout = this.f20984u;
        this.f20980i = z3;
        if (z3) {
            bitmap = q3Var.f21077d.f21114b;
            bitmap2 = q3Var.f21081h.f21114b;
            arrayList = q3Var.f21084l;
        } else {
            bitmap = q3Var.f21076c.f21114b;
            bitmap2 = q3Var.f21080g.f21114b;
            arrayList = q3Var.f21083k;
        }
        this.f20982s.setBackground(new BitmapDrawable((Resources) null, bitmap));
        this.f20983t.setBackground(new BitmapDrawable((Resources) null, bitmap2));
        if (frameLayout.getChildCount() > 0) {
            frameLayout.removeAllViews();
        }
        Context context = getContext();
        for (o3 o3Var : arrayList) {
            View view = new View(context);
            view.setTag(o3Var);
            view.setOnClickListener(this);
            frameLayout.addView(view, new FrameLayout.LayoutParams(0, 0, 51));
        }
    }
}
