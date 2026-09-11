package t6;

import android.content.SharedPreferences;
import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qg.k f16717a = android.support.v4.media.session.b.q(new p1.g(7, this));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb.c f16718b;

    public b0(kb.c cVar) {
        this.f16718b = cVar;
    }

    public final void a(long j, String str) {
        ((SharedPreferences) this.f16717a.getValue()).edit().putLong(str, j).apply();
    }

    public final void b(String str) {
        ((SharedPreferences) this.f16717a.getValue()).edit().remove(str).apply();
    }

    public final void c(String str, boolean z3) {
        ((SharedPreferences) this.f16717a.getValue()).edit().putBoolean(str, z3).apply();
    }

    public final void d(int i10, String str) {
        ((SharedPreferences) this.f16717a.getValue()).edit().putInt(str, i10).apply();
    }

    public final boolean e(String str, boolean z3) {
        try {
            return ((SharedPreferences) this.f16717a.getValue()).getBoolean(str, z3);
        } catch (ClassCastException e8) {
            m3.g(s6.h.f15212b, 8, "Unexpected data type found for key ".concat(str), e8, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            return z3;
        }
    }

    public final long f(long j, String str) {
        try {
            return ((SharedPreferences) this.f16717a.getValue()).getLong(str, j);
        } catch (ClassCastException e8) {
            m3.g(s6.h.f15212b, 8, "Unexpected data type found for key ".concat(str), e8, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            return j;
        }
    }

    public final String g(String str) {
        try {
            return ((SharedPreferences) this.f16717a.getValue()).getString(str, null);
        } catch (ClassCastException e8) {
            m3.g(s6.h.f15212b, 8, "Unexpected data type found for key ".concat(str), e8, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            return null;
        }
    }

    public final boolean h(String str) {
        return ((SharedPreferences) this.f16717a.getValue()).contains(str);
    }

    public final int i(int i10, String str) {
        try {
            return ((SharedPreferences) this.f16717a.getValue()).getInt(str, i10);
        } catch (ClassCastException e8) {
            m3.g(s6.h.f15212b, 8, "Unexpected data type found for key ".concat(str), e8, false, false, false, false, R.styleable.AppCompatTheme_windowNoTitle);
            return i10;
        }
    }

    public final void j(String str, String str2) {
        ((SharedPreferences) this.f16717a.getValue()).edit().putString(str, str2).apply();
    }
}
