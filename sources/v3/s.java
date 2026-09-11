package v3;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s implements ActionMode.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActionMode.Callback f18539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextView f18540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Class f18541c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Method f18542d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f18543e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f18544f = false;

    public s(ActionMode.Callback callback, TextView textView) {
        this.f18539a = callback;
        this.f18540b = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.f18539a.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.f18539a.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.f18539a.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        String str;
        TextView textView = this.f18540b;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        boolean z3 = this.f18544f;
        Class cls = Integer.TYPE;
        if (!z3) {
            this.f18544f = true;
            try {
                Class<?> cls2 = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.f18541c = cls2;
                this.f18542d = cls2.getDeclaredMethod("removeItemAt", cls);
                this.f18543e = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.f18541c = null;
                this.f18542d = null;
                this.f18543e = false;
            }
        }
        try {
            Method declaredMethod = (this.f18543e && this.f18541c.isInstance(menu)) ? this.f18542d : menu.getClass().getDeclaredMethod("removeItemAt", cls);
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported && ((str = activityInfo.permission) == null || context.checkSelfPermission(str) == 0)) {
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i10);
                MenuItem menuItemAdd = menu.add(0, 0, i10 + 100, resolveInfo2.loadLabel(packageManager));
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()));
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                menuItemAdd.setIntent(intentPutExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.f18539a.onPrepareActionMode(actionMode, menu);
    }
}
