package m;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, v {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public c0 f10294i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public i.h f10295r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f10296s;

    @Override // m.v
    public final void a(j jVar, boolean z3) {
        i.h hVar;
        if ((z3 || jVar == this.f10294i) && (hVar = this.f10295r) != null) {
            hVar.dismiss();
        }
    }

    @Override // m.v
    public final boolean j(j jVar) {
        return false;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        c0 c0Var = this.f10294i;
        f fVar = this.f10296s;
        if (fVar.f10264v == null) {
            fVar.f10264v = new e(fVar);
        }
        c0Var.q(fVar.f10264v.getItem(i10), null, 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        this.f10296s.a(this.f10294i, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public final boolean onKey(DialogInterface dialogInterface, int i10, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        c0 c0Var = this.f10294i;
        if (i10 == 82 || i10 == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f10295r.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f10295r.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                c0Var.c(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return c0Var.performShortcut(i10, keyEvent, 0);
    }
}
