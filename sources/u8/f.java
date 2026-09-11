package u8;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.List;
import z7.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends c8.a implements n {
    public static final Parcelable.Creator<f> CREATOR = new f.a(12);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f17731i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final String f17732r;

    public f(String str, ArrayList arrayList) {
        this.f17731i = arrayList;
        this.f17732r = str;
    }

    @Override // z7.n
    public final Status b() {
        return this.f17732r != null ? Status.f3665v : Status.f3668z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iJ = w9.a.J(parcel, 20293);
        List<String> list = this.f17731i;
        if (list != null) {
            int iJ2 = w9.a.J(parcel, 1);
            parcel.writeStringList(list);
            w9.a.K(parcel, iJ2);
        }
        w9.a.G(parcel, 2, this.f17732r);
        w9.a.K(parcel, iJ);
    }
}
