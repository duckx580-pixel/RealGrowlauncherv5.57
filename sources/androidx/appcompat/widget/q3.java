package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m.a f981i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s3 f982r;

    public q3(s3 s3Var) {
        this.f982r = s3Var;
        Context context = s3Var.f1000a.getContext();
        CharSequence charSequence = s3Var.f1007h;
        m.a aVar = new m.a();
        aVar.f10226e = 4096;
        aVar.f10228g = 4096;
        aVar.f10232l = null;
        aVar.f10233m = null;
        aVar.f10234n = false;
        aVar.f10235o = false;
        aVar.f10236p = 16;
        aVar.f10230i = context;
        aVar.f10222a = charSequence;
        this.f981i = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        s3 s3Var = this.f982r;
        Window.Callback callback = s3Var.f1009k;
        if (callback == null || !s3Var.f1010l) {
            return;
        }
        callback.onMenuItemSelected(0, this.f981i);
    }
}
