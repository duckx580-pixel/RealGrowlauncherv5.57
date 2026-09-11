package i7;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u5.e f8107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mf.e f8108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f8109c;

    public d(Context context, mf.e eVar) {
        u5.e eVar2 = new u5.e(context);
        this.f8109c = new HashMap();
        this.f8107a = eVar2;
        this.f8108b = eVar;
    }

    public final synchronized e a(String str) {
        if (this.f8109c.containsKey(str)) {
            return (e) this.f8109c.get(str);
        }
        CctBackendFactory cctBackendFactoryK = this.f8107a.k(str);
        if (cctBackendFactoryK == null) {
            return null;
        }
        mf.e eVar = this.f8108b;
        e eVarCreate = cctBackendFactoryK.create(new b((Context) eVar.f11709r, (r7.a) eVar.f11710s, (r7.a) eVar.f11711t, str));
        this.f8109c.put(str, eVarCreate);
        return eVarCreate;
    }
}
