package q9;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextInputLayout f13840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CheckableImageButton f13842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13843d;

    public p(TextInputLayout textInputLayout, int i10) {
        this.f13840a = textInputLayout;
        this.f13841b = textInputLayout.getContext();
        this.f13842c = textInputLayout.getEndIconView();
        this.f13843d = i10;
    }

    public abstract void a();

    public boolean b(int i10) {
        return true;
    }

    public void c(boolean z3) {
    }
}
