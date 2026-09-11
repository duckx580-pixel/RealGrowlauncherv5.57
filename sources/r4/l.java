package r4;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new f.a(9);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f14525i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f14526r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Bundle f14527s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bundle f14528t;

    public l(k kVar) {
        kotlin.jvm.internal.l.f("entry", kVar);
        this.f14525i = kVar.f14521v;
        this.f14526r = kVar.f14517r.f14573v;
        this.f14527s = kVar.a();
        Bundle bundle = new Bundle();
        this.f14528t = bundle;
        kVar.f14523y.c(bundle);
    }

    public final k a(Context context, v vVar, androidx.lifecycle.o oVar, p pVar) {
        kotlin.jvm.internal.l.f("context", context);
        kotlin.jvm.internal.l.f("hostLifecycleState", oVar);
        Bundle bundle = this.f14527s;
        if (bundle != null) {
            bundle.setClassLoader(context.getClassLoader());
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        String str = this.f14525i;
        kotlin.jvm.internal.l.f("id", str);
        return new k(context, vVar, bundle2, oVar, pVar, str, this.f14528t);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        kotlin.jvm.internal.l.f("parcel", parcel);
        parcel.writeString(this.f14525i);
        parcel.writeInt(this.f14526r);
        parcel.writeBundle(this.f14527s);
        parcel.writeBundle(this.f14528t);
    }

    public l(Parcel parcel) {
        String string = parcel.readString();
        kotlin.jvm.internal.l.c(string);
        this.f14525i = string;
        this.f14526r = parcel.readInt();
        this.f14527s = parcel.readBundle(l.class.getClassLoader());
        Bundle bundle = parcel.readBundle(l.class.getClassLoader());
        kotlin.jvm.internal.l.c(bundle);
        this.f14528t = bundle;
    }
}
