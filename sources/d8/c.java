package d8;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import z7.n;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends a8.d {
    @Override // a8.d
    public final void C(z7.b bVar) {
        g gVar = (g) ((e) bVar).w();
        d dVar = new d(this);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(gVar.f4073f);
        int i10 = n8.a.f12175a;
        parcelObtain.writeStrongBinder(dVar);
        try {
            gVar.f4072e.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ n v(Status status) {
        return status;
    }
}
