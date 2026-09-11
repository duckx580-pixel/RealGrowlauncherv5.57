package s3;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements f, h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15057a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15058b;

    public e(ContentInfo contentInfo) {
        contentInfo.getClass();
        this.f15058b = contentInfo;
    }

    @Override // s3.h
    public ClipData a() {
        return ((ContentInfo) this.f15058b).getClip();
    }

    @Override // s3.f
    public void b(Uri uri) {
        ((ContentInfo.Builder) this.f15058b).setLinkUri(uri);
    }

    @Override // s3.f
    public i build() {
        return new i(new e(((ContentInfo.Builder) this.f15058b).build()));
    }

    @Override // s3.f
    public void c(int i10) {
        ((ContentInfo.Builder) this.f15058b).setFlags(i10);
    }

    @Override // s3.h
    public int d() {
        return ((ContentInfo) this.f15058b).getFlags();
    }

    @Override // s3.h
    public ContentInfo e() {
        return (ContentInfo) this.f15058b;
    }

    @Override // s3.h
    public int f() {
        return ((ContentInfo) this.f15058b).getSource();
    }

    @Override // s3.f
    public void setExtras(Bundle bundle) {
        ((ContentInfo.Builder) this.f15058b).setExtras(bundle);
    }

    public String toString() {
        switch (this.f15057a) {
            case 1:
                return "ContentInfoCompat{" + ((ContentInfo) this.f15058b) + "}";
            default:
                return super.toString();
        }
    }

    public e(ClipData clipData, int i10) {
        this.f15058b = d.a(clipData, i10);
    }
}
