package j3;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f8755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f8756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f8757c;

    public k(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f8755a = colorStateList;
        this.f8756b = configuration;
        this.f8757c = theme == null ? 0 : theme.hashCode();
    }
}
