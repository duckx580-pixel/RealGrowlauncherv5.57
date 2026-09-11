package q9;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.appcompat.widget.o3;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends x3.b {
    public static final Parcelable.Creator<y> CREATOR = new o3(6);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f13886s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13887t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public CharSequence f13888u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public CharSequence f13889v;
    public CharSequence w;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f13886s = (CharSequence) creator.createFromParcel(parcel);
        this.f13887t = parcel.readInt() == 1;
        this.f13888u = (CharSequence) creator.createFromParcel(parcel);
        this.f13889v = (CharSequence) creator.createFromParcel(parcel);
        this.w = (CharSequence) creator.createFromParcel(parcel);
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f13886s) + " hint=" + ((Object) this.f13888u) + " helperText=" + ((Object) this.f13889v) + " placeholderText=" + ((Object) this.w) + "}";
    }

    @Override // x3.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        TextUtils.writeToParcel(this.f13886s, parcel, i10);
        parcel.writeInt(this.f13887t ? 1 : 0);
        TextUtils.writeToParcel(this.f13888u, parcel, i10);
        TextUtils.writeToParcel(this.f13889v, parcel, i10);
        TextUtils.writeToParcel(this.w, parcel, i10);
    }
}
