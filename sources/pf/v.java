package pf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends s {
    public static final Parcelable.Creator<v> CREATOR = new f.a(7);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final ArrayList f13444r = new ArrayList();

    @Override // pf.s
    public final boolean a(s sVar) {
        return false;
    }

    @Override // pf.s
    public final void b(s sVar) {
        throw new UnsupportedOperationException();
    }

    @Override // pf.s
    public final void c(h hVar) {
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13444r;
            if (i10 >= arrayList.size()) {
                return;
            }
            ((s) arrayList.get(i10)).c(hVar);
            i10++;
        }
    }

    @Override // pf.s
    public final void d(h hVar) {
        ArrayList arrayList = this.f13444r;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((s) arrayList.get(size)).d(hVar);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final void e(s sVar) {
        ArrayList arrayList = this.f13444r;
        if (arrayList.isEmpty()) {
            arrayList.add(sVar);
            return;
        }
        s sVar2 = (s) k0.g.b(1, arrayList);
        if (sVar2.a(sVar)) {
            sVar2.b(sVar);
        } else {
            arrayList.add(sVar);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        ArrayList arrayList = this.f13444r;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((s) it.next(), i10);
        }
    }
}
