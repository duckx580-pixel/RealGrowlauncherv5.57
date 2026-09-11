package l5;

import android.content.pm.PackageInfo;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Pattern f9811d;

    public p() {
        super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
        this.f9811d = Pattern.compile("\\A\\d+");
    }

    @Override // l5.c
    public final boolean a() {
        return Build.VERSION.SDK_INT >= 33;
    }

    @Override // l5.c
    public final boolean b() {
        int i10;
        PackageInfo packageInfoB;
        boolean zB = super.b();
        if (!zB || (i10 = Build.VERSION.SDK_INT) >= 29) {
            return zB;
        }
        int i11 = k5.f.f9254a;
        if (i10 >= 26) {
            packageInfoB = h.a();
        } else {
            try {
                packageInfoB = k5.f.b();
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                packageInfoB = null;
            }
        }
        if (packageInfoB == null) {
            return false;
        }
        Matcher matcher = this.f9811d.matcher(packageInfoB.versionName);
        return matcher.find() && Integer.parseInt(packageInfoB.versionName.substring(matcher.start(), matcher.end())) >= 105;
    }
}
