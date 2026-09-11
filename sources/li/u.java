package li;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import launcher.powerkuy.growlauncher.manager.ThemeVariable;
import oh.f0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f10058i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f10059r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ w f10060s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(w wVar, ug.c cVar, int i10) {
        super(2, cVar);
        this.f10058i = i10;
        this.f10060s = wVar;
    }

    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f10058i) {
            case 0:
                return new u(this.f10060s, cVar, 0);
            case 1:
                return new u(this.f10060s, cVar, 1);
            case 2:
                return new u(this.f10060s, cVar, 2);
            default:
                return new u(this.f10060s, cVar, 3);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        oh.w wVar = (oh.w) obj;
        ug.c cVar = (ug.c) obj2;
        switch (this.f10058i) {
        }
        return ((u) create(wVar, cVar)).invokeSuspend(qg.o.f13926a);
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws IOException {
        Object jSONObject;
        switch (this.f10058i) {
            case 0:
                vg.a aVar = vg.a.f18663i;
                int i10 = this.f10059r;
                if (i10 == 0) {
                    androidx.work.v.B(obj);
                    this.f10059r = 1;
                    if (this.f10060s.g(this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            case 1:
                vg.a aVar2 = vg.a.f18663i;
                int i11 = this.f10059r;
                qg.o oVar = qg.o.f13926a;
                if (i11 == 0) {
                    androidx.work.v.B(obj);
                    w wVar = this.f10060s;
                    wVar.getClass();
                    FileInputStream fileInputStream = new FileInputStream(w.f());
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream, 8192);
                    try {
                        String str = new String(xd.c.v(fileInputStream), nh.a.f12288a);
                        bufferedInputStream.close();
                        this.f10059r = 1;
                        wVar.h(str);
                        if (oVar == aVar2) {
                            return aVar2;
                        }
                    } catch (Throwable th2) {
                        try {
                            throw th2;
                        } catch (Throwable th3) {
                            a.a.m(bufferedInputStream, th2);
                            throw th3;
                        }
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return oVar;
            case 2:
                vg.a aVar3 = vg.a.f18663i;
                int i12 = this.f10059r;
                if (i12 == 0) {
                    androidx.work.v.B(obj);
                    vh.c cVar = f0.f12870b;
                    u uVar = new u(this.f10060s, null, 1);
                    this.f10059r = 1;
                    if (oh.x.B(cVar, uVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
            default:
                w wVar2 = this.f10060s;
                vg.a aVar4 = vg.a.f18663i;
                int i13 = this.f10059r;
                if (i13 == 0) {
                    androidx.work.v.B(obj);
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("selectedColor", ((Number) x.f10068b.f14808i.getValue()).longValue());
                        JSONArray jSONArray = new JSONArray();
                        for (ThemeVariable themeVariable : (Iterable) wVar2.f10065c.getValue()) {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("name", themeVariable.getName());
                            jSONObject3.put("hex", themeVariable.getHex());
                            jSONArray.put(jSONObject3);
                        }
                        jSONObject2.put("list_color", jSONArray);
                        jSONObject = jSONObject2;
                    } catch (JSONException unused) {
                        jSONObject = new JSONObject();
                    }
                    vh.c cVar2 = f0.f12870b;
                    a4.s sVar = new a4.s(wVar2, jSONObject, null, 7);
                    this.f10059r = 1;
                    if (oh.x.B(cVar2, sVar, this) == aVar4) {
                        return aVar4;
                    }
                    break;
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    androidx.work.v.B(obj);
                }
                return qg.o.f13926a;
        }
    }
}
