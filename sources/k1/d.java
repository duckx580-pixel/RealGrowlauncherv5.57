package k1;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f8993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f8994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f8995d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f8996e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f8997f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f8998g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f8999h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f9000i;
    public final ArrayList j;

    public d(String str, float f9, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i10) {
        str = (i10 & 1) != 0 ? PredefinedUICustomizationFont.defaultFamily : str;
        f9 = (i10 & 2) != 0 ? 0.0f : f9;
        f10 = (i10 & 4) != 0 ? 0.0f : f10;
        f11 = (i10 & 8) != 0 ? 0.0f : f11;
        f12 = (i10 & 16) != 0 ? 1.0f : f12;
        f13 = (i10 & 32) != 0 ? 1.0f : f13;
        f14 = (i10 & 64) != 0 ? 0.0f : f14;
        f15 = (i10 & 128) != 0 ? 0.0f : f15;
        if ((i10 & 256) != 0) {
            int i11 = h0.f9067a;
            list = rg.s.f14664i;
        }
        ArrayList arrayList = new ArrayList();
        this.f8992a = str;
        this.f8993b = f9;
        this.f8994c = f10;
        this.f8995d = f11;
        this.f8996e = f12;
        this.f8997f = f13;
        this.f8998g = f14;
        this.f8999h = f15;
        this.f9000i = list;
        this.j = arrayList;
    }
}
