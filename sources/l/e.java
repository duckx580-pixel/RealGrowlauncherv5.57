package l;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.LayoutInflater;
import launcher.powerkuy.growlauncher.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends ContextWrapper {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Configuration f9671f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f9672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Resources.Theme f9673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LayoutInflater f9674c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Configuration f9675d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Resources f9676e;

    public e(Context context, int i10) {
        super(context);
        this.f9672a = i10;
    }

    public final void a(Configuration configuration) {
        if (this.f9676e != null) {
            throw new IllegalStateException("getResources() or getAssets() has already been called");
        }
        if (this.f9675d != null) {
            throw new IllegalStateException("Override configuration has already been set");
        }
        this.f9675d = new Configuration(configuration);
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        super.attachBaseContext(context);
    }

    public final void b() {
        if (this.f9673b == null) {
            this.f9673b = getResources().newTheme();
            Resources.Theme theme = getBaseContext().getTheme();
            if (theme != null) {
                this.f9673b.setTo(theme);
            }
        }
        this.f9673b.applyStyle(this.f9672a, true);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        return getResources().getAssets();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    @Override // android.content.ContextWrapper, android.content.Context
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.content.res.Resources getResources() {
        /*
            r3 = this;
            android.content.res.Resources r0 = r3.f9676e
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.f9675d
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = l.e.f9671f
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            l.e.f9671f = r1
        L1c:
            android.content.res.Configuration r1 = l.e.f9671f
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.f9675d
            android.content.Context r0 = l.d.a(r3, r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.f9676e = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.f9676e = r0
        L38:
            android.content.res.Resources r0 = r3.f9676e
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: l.e.getResources():android.content.res.Resources");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f9674c == null) {
            this.f9674c = LayoutInflater.from(getBaseContext()).cloneInContext(this);
        }
        return this.f9674c;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        Resources.Theme theme = this.f9673b;
        if (theme != null) {
            return theme;
        }
        if (this.f9672a == 0) {
            this.f9672a = R.style.Theme_AppCompat_Light;
        }
        b();
        return this.f9673b;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i10) {
        if (this.f9672a != i10) {
            this.f9672a = i10;
            b();
        }
    }
}
