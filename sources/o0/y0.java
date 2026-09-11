package o0;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements Parcelable.ClassLoaderCreator {
    public static z0 a(Parcel parcel, ClassLoader classLoader) {
        n0 n0Var;
        if (classLoader == null) {
            classLoader = y0.class.getClassLoader();
        }
        Object value = parcel.readValue(classLoader);
        int i10 = parcel.readInt();
        if (i10 == 0) {
            n0Var = n0.f12508s;
        } else if (i10 == 1) {
            n0Var = n0.f12510u;
        } else {
            if (i10 != 2) {
                throw new IllegalStateException(k0.g.e(i10, "Unsupported MutableState policy ", " was restored"));
            }
            n0Var = n0.f12509t;
        }
        return new z0(value, n0Var);
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        return a(parcel, classLoader);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        return new z0[i10];
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        return a(parcel, null);
    }
}
