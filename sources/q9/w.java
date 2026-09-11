package q9;

import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13883i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ TextInputLayout f13884r;

    public /* synthetic */ w(TextInputLayout textInputLayout, int i10) {
        this.f13883i = i10;
        this.f13884r = textInputLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13883i) {
            case 0:
                TextInputLayout textInputLayout = this.f13884r;
                textInputLayout.f4277u0.performClick();
                textInputLayout.f4277u0.jumpDrawablesToCurrentState();
                break;
            default:
                this.f13884r.f4276u.requestLayout();
                break;
        }
    }
}
