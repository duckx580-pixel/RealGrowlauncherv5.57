package pf;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class x implements j, Parcelable {
    public static final Parcelable.Creator<x> CREATOR = new f.a(4);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13448r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13449s;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public q f13454y;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ArrayList f13447i = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13451u = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public t f13450t = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13452v = 0;
    public boolean w = false;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // pf.j
    public final void e(h hVar) {
        if (this.w) {
            return;
        }
        this.f13451u = true;
    }

    @Override // pf.j
    public final void i(h hVar, int i10, int i11, int i12, int i13, StringBuilder sb2) {
        if (this.w) {
            return;
        }
        t tVar = new t();
        this.f13450t = tVar;
        tVar.f13437u = i13;
        tVar.f13436t = i11;
        tVar.f13435s = i12;
        tVar.f13434r = i10;
        tVar.w = sb2;
        tVar.f13433i = this.f13454y;
        if (this.f13451u) {
            return;
        }
        u(hVar, tVar);
    }

    @Override // pf.j
    public final void k(h hVar) {
        if (!this.f13448r || hVar.f13399z == null) {
            return;
        }
        if (!this.f13451u || this.f13450t == null) {
            l lVarM = hVar.m();
            this.f13454y = new q(lVarM.f13407c.a(), lVarM.f13408d.a());
        }
    }

    @Override // pf.j
    public final void m(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        t tVar;
        if (this.w) {
            return;
        }
        u uVar = new u();
        uVar.f13439r = i10;
        uVar.f13441t = i11;
        uVar.f13440s = i12;
        uVar.f13442u = i13;
        uVar.w = charSequence;
        if (!this.f13451u || (tVar = this.f13450t) == null) {
            uVar.f13433i = this.f13454y;
            u(hVar, uVar);
        } else {
            w wVar = new w();
            wVar.f13446s = tVar;
            wVar.f13445r = uVar;
            wVar.f13433i = this.f13454y;
            u(hVar, wVar);
        }
        this.f13450t = null;
        this.f13451u = false;
    }

    public final void t() {
        boolean z3 = this.f13448r;
        ArrayList arrayList = this.f13447i;
        if (!z3) {
            arrayList.clear();
            this.f13452v = 0;
        } else {
            while (this.f13452v > 1 && arrayList.size() > this.f13449s) {
                arrayList.remove(0);
                this.f13452v--;
            }
        }
    }

    public final void u(h hVar, s sVar) {
        ArrayList arrayList;
        if (this.f13448r) {
            while (true) {
                int i10 = this.f13452v;
                arrayList = this.f13447i;
                if (i10 >= arrayList.size()) {
                    break;
                } else {
                    arrayList.remove(arrayList.size() - 1);
                }
            }
            if (hVar.f13395u > 0) {
                if (arrayList.isEmpty()) {
                    v vVar = new v();
                    vVar.e(sVar);
                    vVar.f13433i = sVar.f13433i;
                    arrayList.add(vVar);
                    this.f13452v++;
                } else {
                    s sVar2 = (s) k0.g.b(1, arrayList);
                    if (!(sVar2 instanceof v) || this.f13453x) {
                        v vVar2 = new v();
                        vVar2.e(sVar);
                        vVar2.f13433i = sVar.f13433i;
                        arrayList.add(vVar2);
                        this.f13452v++;
                    } else {
                        ((v) sVar2).e(sVar);
                    }
                }
            } else if (arrayList.isEmpty()) {
                arrayList.add(sVar);
                this.f13452v++;
            } else {
                s sVar3 = (s) k0.g.b(1, arrayList);
                if (sVar3.a(sVar)) {
                    sVar3.b(sVar);
                } else {
                    arrayList.add(sVar);
                    this.f13452v++;
                }
            }
            this.f13453x = false;
            t();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f13449s);
        parcel.writeInt(this.f13452v);
        parcel.writeInt(this.f13448r ? 1 : 0);
        ArrayList arrayList = this.f13447i;
        parcel.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable((s) it.next(), i10);
        }
    }
}
