package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements View.OnClickListener {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final View f7804i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f7805r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Method f7806s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Context f7807t;

    public d0(View view, String str) {
        this.f7804i = view;
        this.f7805r = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        Method method;
        if (this.f7806s == null) {
            View view2 = this.f7804i;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.f7805r;
                if (context == null) {
                    int id2 = view2.getId();
                    if (id2 == -1) {
                        str = PredefinedUICustomizationFont.defaultFamily;
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id2) + "'";
                    }
                    StringBuilder sbP = android.support.v4.media.session.a.p("Could not find method ", str2, "(View) in a parent or ancestor Context for android:onClick attribute defined on view ");
                    sbP.append(view2.getClass());
                    sbP.append(str);
                    throw new IllegalStateException(sbP.toString());
                }
                try {
                    if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                        this.f7806s = method;
                        this.f7807t = context;
                    }
                } catch (NoSuchMethodException unused) {
                }
                context = context instanceof ContextWrapper ? ((ContextWrapper) context).getBaseContext() : null;
            }
        }
        try {
            this.f7806s.invoke(this.f7807t, view);
        } catch (IllegalAccessException e8) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e8);
        } catch (InvocationTargetException e10) {
            throw new IllegalStateException("Could not execute method for android:onClick", e10);
        }
    }
}
