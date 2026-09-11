package androidx.activity;

import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ n f687i;

    public f(n nVar) {
        this.f687i = nVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            super/*android.app.Activity*/.onBackPressed();
        } catch (IllegalStateException e8) {
            if (!TextUtils.equals(e8.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e8;
            }
        }
    }
}
