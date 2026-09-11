package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Window.Callback {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Window.Callback f7910i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public kb.c f7911r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f7912s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f7913t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f7914u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ b0 f7915v;

    public w(b0 b0Var, Window.Callback callback) {
        this.f7915v = b0Var;
        if (callback == null) {
            throw new IllegalArgumentException("Window callback may not be null");
        }
        this.f7910i = callback;
    }

    public final void a(Window.Callback callback) {
        try {
            this.f7912s = true;
            callback.onContentChanged();
        } finally {
            this.f7912s = false;
        }
    }

    public final boolean b(int i10, Menu menu) {
        return this.f7910i.onMenuOpened(i10, menu);
    }

    public final void c(int i10, Menu menu) {
        this.f7910i.onPanelClosed(i10, menu);
    }

    public final void d(List list, Menu menu, int i10) {
        l.m.a(this.f7910i, list, menu, i10);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        return this.f7910i.dispatchGenericMotionEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean z3 = this.f7913t;
        Window.Callback callback = this.f7910i;
        return z3 ? callback.dispatchKeyEvent(keyEvent) : this.f7915v.v(keyEvent) || callback.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        if (!this.f7910i.dispatchKeyShortcutEvent(keyEvent)) {
            int keyCode = keyEvent.getKeyCode();
            b0 b0Var = this.f7915v;
            b0Var.B();
            a aVar = b0Var.E;
            if (aVar == null || !aVar.i(keyCode, keyEvent)) {
                a0 a0Var = b0Var.f7767c0;
                if (a0Var == null || !b0Var.G(a0Var, keyEvent.getKeyCode(), keyEvent)) {
                    if (b0Var.f7767c0 == null) {
                        a0 a0VarA = b0Var.A(0);
                        b0Var.H(a0VarA, keyEvent);
                        boolean zG = b0Var.G(a0VarA, keyEvent.getKeyCode(), keyEvent);
                        a0VarA.f7756k = false;
                        if (zG) {
                        }
                    }
                    return false;
                }
                a0 a0Var2 = b0Var.f7767c0;
                if (a0Var2 != null) {
                    a0Var2.f7757l = true;
                    return true;
                }
            }
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return this.f7910i.dispatchPopulateAccessibilityEvent(accessibilityEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return this.f7910i.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTrackballEvent(MotionEvent motionEvent) {
        return this.f7910i.dispatchTrackballEvent(motionEvent);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeFinished(ActionMode actionMode) {
        this.f7910i.onActionModeFinished(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onActionModeStarted(ActionMode actionMode) {
        this.f7910i.onActionModeStarted(actionMode);
    }

    @Override // android.view.Window.Callback
    public final void onAttachedToWindow() {
        this.f7910i.onAttachedToWindow();
    }

    @Override // android.view.Window.Callback
    public final void onContentChanged() {
        if (this.f7912s) {
            this.f7910i.onContentChanged();
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i10, Menu menu) {
        if (i10 != 0 || (menu instanceof m.j)) {
            return this.f7910i.onCreatePanelMenu(i10, menu);
        }
        return false;
    }

    @Override // android.view.Window.Callback
    public final View onCreatePanelView(int i10) {
        kb.c cVar = this.f7911r;
        if (cVar != null) {
            View view = i10 == 0 ? new View(((k0) cVar.f9562i).f7851a.f1000a.getContext()) : null;
            if (view != null) {
                return view;
            }
        }
        return this.f7910i.onCreatePanelView(i10);
    }

    @Override // android.view.Window.Callback
    public final void onDetachedFromWindow() {
        this.f7910i.onDetachedFromWindow();
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        return this.f7910i.onMenuItemSelected(i10, menuItem);
    }

    @Override // android.view.Window.Callback
    public final boolean onMenuOpened(int i10, Menu menu) {
        b(i10, menu);
        b0 b0Var = this.f7915v;
        if (i10 == 108) {
            b0Var.B();
            a aVar = b0Var.E;
            if (aVar != null) {
                aVar.c(true);
            }
        } else {
            b0Var.getClass();
        }
        return true;
    }

    @Override // android.view.Window.Callback
    public final void onPanelClosed(int i10, Menu menu) {
        if (this.f7914u) {
            this.f7910i.onPanelClosed(i10, menu);
            return;
        }
        c(i10, menu);
        b0 b0Var = this.f7915v;
        if (i10 == 108) {
            b0Var.B();
            a aVar = b0Var.E;
            if (aVar != null) {
                aVar.c(false);
                return;
            }
            return;
        }
        if (i10 == 0) {
            a0 a0VarA = b0Var.A(i10);
            if (a0VarA.f7758m) {
                b0Var.t(a0VarA, false);
            }
        }
    }

    @Override // android.view.Window.Callback
    public final void onPointerCaptureChanged(boolean z3) {
        l.n.a(this.f7910i, z3);
    }

    @Override // android.view.Window.Callback
    public final boolean onPreparePanel(int i10, View view, Menu menu) {
        m.j jVar = menu instanceof m.j ? (m.j) menu : null;
        if (i10 == 0 && jVar == null) {
            return false;
        }
        if (jVar != null) {
            jVar.f10293x = true;
        }
        kb.c cVar = this.f7911r;
        if (cVar != null && i10 == 0) {
            k0 k0Var = (k0) cVar.f9562i;
            if (!k0Var.f7854d) {
                k0Var.f7851a.f1010l = true;
                k0Var.f7854d = true;
            }
        }
        boolean zOnPreparePanel = this.f7910i.onPreparePanel(i10, view, menu);
        if (jVar != null) {
            jVar.f10293x = false;
        }
        return zOnPreparePanel;
    }

    @Override // android.view.Window.Callback
    public final void onProvideKeyboardShortcuts(List list, Menu menu, int i10) {
        m.j jVar = this.f7915v.A(0).f7754h;
        if (jVar != null) {
            d(list, jVar, i10);
        } else {
            d(list, menu, i10);
        }
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested(SearchEvent searchEvent) {
        return l.l.a(this.f7910i, searchEvent);
    }

    @Override // android.view.Window.Callback
    public final void onWindowAttributesChanged(WindowManager.LayoutParams layoutParams) {
        this.f7910i.onWindowAttributesChanged(layoutParams);
    }

    @Override // android.view.Window.Callback
    public final void onWindowFocusChanged(boolean z3) {
        this.f7910i.onWindowFocusChanged(z3);
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return l.l.b(this.f7910i, callback, i10);
        }
        b0 b0Var = this.f7915v;
        Context context = b0Var.A;
        u5.i iVar = new u5.i();
        iVar.f17667r = context;
        iVar.f17666i = callback;
        iVar.f17668s = new ArrayList();
        iVar.f17669t = new q.x(0);
        l.b bVarN = b0Var.n(iVar);
        if (bVarN != null) {
            return iVar.e(bVarN);
        }
        return null;
    }

    @Override // android.view.Window.Callback
    public final boolean onSearchRequested() {
        return this.f7910i.onSearchRequested();
    }

    @Override // android.view.Window.Callback
    public final ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
        return null;
    }
}
