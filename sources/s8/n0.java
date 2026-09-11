package s8;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f15493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15494c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15495d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f15496e;

    public n0(r0 r0Var, String str, boolean z3) {
        this.f15496e = r0Var;
        b8.a0.e(str);
        this.f15492a = str;
        this.f15493b = z3;
    }

    public final void a(boolean z3) {
        SharedPreferences.Editor editorEdit = this.f15496e.x().edit();
        editorEdit.putBoolean(this.f15492a, z3);
        editorEdit.apply();
        this.f15495d = z3;
    }

    public final boolean b() {
        if (!this.f15494c) {
            this.f15494c = true;
            this.f15495d = this.f15496e.x().getBoolean(this.f15492a, this.f15493b);
        }
        return this.f15495d;
    }
}
