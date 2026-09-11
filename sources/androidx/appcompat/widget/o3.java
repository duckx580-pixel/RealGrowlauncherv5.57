package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class o3 implements Parcelable.ClassLoaderCreator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f965a;

    public /* synthetic */ o3(int i10) {
        this.f965a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.f965a) {
            case 0:
                return new p3(parcel, null);
            case 1:
                return new androidx.recyclerview.widget.z0(parcel, null);
            case 2:
                return new b9.d(parcel, null);
            case 3:
                return new c9.b(parcel, null);
            case 4:
                return new f3.f(parcel, null);
            case 5:
                return new i9.a(parcel, null);
            case 6:
                return new q9.y(parcel, null);
            default:
                if (parcel.readParcelable(null) == null) {
                    return x3.b.f19412r;
                }
                throw new IllegalStateException("superState must be null");
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f965a) {
            case 0:
                return new p3[i10];
            case 1:
                return new androidx.recyclerview.widget.z0[i10];
            case 2:
                return new b9.d[i10];
            case 3:
                return new c9.b[i10];
            case 4:
                return new f3.f[i10];
            case 5:
                return new i9.a[i10];
            case 6:
                return new q9.y[i10];
            default:
                return new x3.b[i10];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.f965a) {
            case 0:
                return new p3(parcel, classLoader);
            case 1:
                return new androidx.recyclerview.widget.z0(parcel, classLoader);
            case 2:
                return new b9.d(parcel, classLoader);
            case 3:
                return new c9.b(parcel, classLoader);
            case 4:
                return new f3.f(parcel, classLoader);
            case 5:
                return new i9.a(parcel, classLoader);
            case 6:
                return new q9.y(parcel, classLoader);
            default:
                if (parcel.readParcelable(classLoader) == null) {
                    return x3.b.f19412r;
                }
                throw new IllegalStateException("superState must be null");
        }
    }
}
