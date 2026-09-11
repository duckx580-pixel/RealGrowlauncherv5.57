package android.support.v4.media;

import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new a(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f646i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final CharSequence f647r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CharSequence f648s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final CharSequence f649t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Bitmap f650u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Uri f651v;
    public final Bundle w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Uri f652x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f653y;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f646i = str;
        this.f647r = charSequence;
        this.f648s = charSequence2;
        this.f649t = charSequence3;
        this.f650u = bitmap;
        this.f651v = uri;
        this.w = bundle;
        this.f652x = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f647r) + ", " + ((Object) this.f648s) + ", " + ((Object) this.f649t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        Object objBuild = this.f653y;
        if (objBuild == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f646i);
            builder.setTitle(this.f647r);
            builder.setSubtitle(this.f648s);
            builder.setDescription(this.f649t);
            builder.setIconBitmap(this.f650u);
            builder.setIconUri(this.f651v);
            builder.setExtras(this.w);
            builder.setMediaUri(this.f652x);
            objBuild = builder.build();
            this.f653y = objBuild;
        }
        ((MediaDescription) objBuild).writeToParcel(parcel, i10);
    }
}
