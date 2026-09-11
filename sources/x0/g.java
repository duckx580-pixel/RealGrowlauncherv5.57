package x0;

import b0.m0;
import b0.q0;
import com.google.android.gms.internal.measurement.j3;
import com.rtsoft.growtopia.R;
import java.util.LinkedHashMap;
import java.util.Map;
import o0.h1;
import o0.o;
import o0.p;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g implements c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final j3 f19357d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f19358a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f19359b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public j f19360c;

    static {
        d dVar = d.f19348r;
        e eVar = e.f19351r;
        j3 j3Var = m.f19368a;
        f19357d = new j3(22, dVar, eVar);
    }

    public g(Map map) {
        this.f19358a = map;
    }

    @Override // x0.c
    public final void c(Object obj, w0.a aVar, o oVar, int i10) {
        oVar.V(-1198538093);
        oVar.U(444418301);
        oVar.W(obj);
        oVar.U(-492369756);
        Object objL = oVar.L();
        if (objL == o0.k.f12458a) {
            j jVar = this.f19360c;
            if (!(jVar != null ? jVar.a(obj) : true)) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            objL = new f(this, obj);
            oVar.g0(objL);
        }
        oVar.r(false);
        f fVar = (f) objL;
        p.a(l.f19367a.a(fVar.f19356c), aVar, oVar, i10 & R.styleable.AppCompatTheme_windowActionBarOverlay);
        p.c(qg.o.f13926a, new m0(this, obj, fVar, 19), oVar);
        oVar.w();
        oVar.r(false);
        h1 h1VarV = oVar.v();
        if (h1VarV != null) {
            h1VarV.f12435d = new q0(this, obj, aVar, i10, 6);
        }
    }

    @Override // x0.c
    public final void e(Object obj) {
        f fVar = (f) this.f19359b.get(obj);
        if (fVar != null) {
            fVar.f19355b = false;
        } else {
            this.f19358a.remove(obj);
        }
    }
}
