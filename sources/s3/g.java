package s3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15064a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ClipData f15065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15066c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15067d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Uri f15068e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Bundle f15069f;

    public /* synthetic */ g() {
    }

    @Override // s3.h
    public ClipData a() {
        return this.f15065b;
    }

    @Override // s3.f
    public void b(Uri uri) {
        this.f15068e = uri;
    }

    @Override // s3.f
    public i build() {
        return new i(new g(this));
    }

    @Override // s3.f
    public void c(int i10) {
        this.f15067d = i10;
    }

    @Override // s3.h
    public int d() {
        return this.f15067d;
    }

    @Override // s3.h
    public ContentInfo e() {
        return null;
    }

    @Override // s3.h
    public int f() {
        return this.f15066c;
    }

    @Override // s3.f
    public void setExtras(Bundle bundle) {
        this.f15069f = bundle;
    }

    public String toString() {
        String str;
        switch (this.f15064a) {
            case 1:
                Uri uri = this.f15068e;
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.f15065b.getDescription());
                sb2.append(", source=");
                int i10 = this.f15066c;
                sb2.append(i10 != 0 ? i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? String.valueOf(i10) : "SOURCE_PROCESS_TEXT" : "SOURCE_AUTOFILL" : "SOURCE_DRAG_AND_DROP" : "SOURCE_INPUT_METHOD" : "SOURCE_CLIPBOARD" : "SOURCE_APP");
                sb2.append(", flags=");
                int i11 = this.f15067d;
                sb2.append((i11 & 1) != 0 ? "FLAG_CONVERT_TO_PLAIN_TEXT" : String.valueOf(i11));
                String str2 = PredefinedUICustomizationFont.defaultFamily;
                if (uri == null) {
                    str = PredefinedUICustomizationFont.defaultFamily;
                } else {
                    str = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str);
                if (this.f15069f != null) {
                    str2 = ", hasExtras";
                }
                return k0.g.l(sb2, str2, "}");
            default:
                return super.toString();
        }
    }

    public g(g gVar) {
        ClipData clipData = gVar.f15065b;
        clipData.getClass();
        this.f15065b = clipData;
        int i10 = gVar.f15066c;
        if (i10 < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        }
        if (i10 > 5) {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
        this.f15066c = i10;
        int i11 = gVar.f15067d;
        if ((i11 & 1) == i11) {
            this.f15067d = i11;
            this.f15068e = gVar.f15068e;
            this.f15069f = gVar.f15069f;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
