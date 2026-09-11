package s8;

import android.content.SharedPreferences;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f15519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f15520b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15521c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15522d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r0 f15523e;

    public o0(r0 r0Var, String str, long j) {
        this.f15523e = r0Var;
        b8.a0.e(str);
        this.f15519a = str;
        this.f15520b = j;
    }

    public final long a() {
        if (!this.f15521c) {
            this.f15521c = true;
            this.f15522d = this.f15523e.x().getLong(this.f15519a, this.f15520b);
        }
        return this.f15522d;
    }

    public final void b(long j) {
        SharedPreferences.Editor editorEdit = this.f15523e.x().edit();
        editorEdit.putLong(this.f15519a, j);
        editorEdit.apply();
        this.f15522d = j;
    }
}
