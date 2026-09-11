package se;

import android.webkit.JavascriptInterface;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import k8.g;
import kotlin.jvm.internal.l;
import org.json.JSONArray;
import org.json.JSONException;
import t6.u;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    @JavascriptInterface
    public final void handleCallback(String str, String str2, String str3) {
        l.f("callbackId", str);
        l.f("callbackStatus", str2);
        l.f("rawParameters", str3);
        ie.c.a("handleCallback " + str + ' ' + str2 + ' ' + str3);
        Object[] objArrA = g.A(new JSONArray(str3));
        u.f17062r.getClass();
        re.e eVar = re.e.f14644d;
        synchronized (eVar.f14648a) {
            if (eVar.f14648a.get(str) != null) {
                throw new ClassCastException();
            }
        }
        l.e("getCurrentApp().getCallback(callbackId)", null);
        try {
            u.G(objArrA, null);
            throw null;
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e8) {
            ie.c.b("Error while invoking method");
            throw e8;
        }
    }

    @JavascriptInterface
    public final void handleInvocation(String str) {
        l.f("data", str);
        ie.c.a("handleInvocation ".concat(str));
        JSONArray jSONArray = new JSONArray(str);
        b bVar = new b();
        int andIncrement = b.f15746d.getAndIncrement();
        bVar.f15748a = andIncrement;
        if (b.f15747e == null) {
            b.f15747e = new HashMap();
        }
        b.f15747e.put(Integer.valueOf(andIncrement), bVar);
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            l.d("null cannot be cast to non-null type org.json.JSONArray", obj);
            JSONArray jSONArray2 = (JSONArray) obj;
            Object obj2 = jSONArray2.get(0);
            l.d("null cannot be cast to non-null type kotlin.String", obj2);
            String str2 = (String) obj2;
            Object obj3 = jSONArray2.get(1);
            l.d("null cannot be cast to non-null type kotlin.String", obj3);
            String str3 = (String) obj3;
            Object obj4 = jSONArray2.get(2);
            l.d("null cannot be cast to non-null type org.json.JSONArray", obj4);
            Object obj5 = jSONArray2.get(3);
            l.d("null cannot be cast to non-null type kotlin.String", obj5);
            Object[] objArrA = g.A((JSONArray) obj4);
            int i11 = bVar.f15748a;
            e eVar = new e();
            eVar.f15754i = (String) obj5;
            eVar.f15755r = i11;
            if (bVar.f15749b == null) {
                bVar.f15749b = new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(str2);
            arrayList.add(str3);
            arrayList.add(objArrA);
            arrayList.add(eVar);
            bVar.f15749b.add(arrayList);
            ArrayList arrayList2 = bVar.f15749b;
            if (arrayList2 != null && arrayList2.size() > 0) {
                ArrayList arrayList3 = (ArrayList) bVar.f15749b.remove(0);
                String str4 = (String) arrayList3.get(0);
                String str5 = (String) arrayList3.get(1);
                Object[] objArr = (Object[]) arrayList3.get(2);
                e eVar2 = (e) arrayList3.get(3);
                try {
                    u uVar = u.f17062r;
                    uVar.getClass();
                    try {
                        try {
                            uVar.D(str4, str5, objArr).invoke(null, u.G(objArr, eVar2));
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException | JSONException e8) {
                            if (eVar2 != null) {
                                eVar2.a(c.f15752r, str4, str5, objArr, e8.getMessage());
                            }
                            throw e8;
                        }
                    } catch (NoSuchMethodException e10) {
                        e = e10;
                        eVar2.a(c.f15753s, str4, str5, objArr);
                        throw e;
                    } catch (JSONException e11) {
                        e = e11;
                        eVar2.a(c.f15753s, str4, str5, objArr);
                        throw e;
                    }
                } catch (Exception e12) {
                    String string = Arrays.toString(objArr);
                    StringBuilder sbO = k0.g.o("Error handling invocation ", str4, ".", str5, "(");
                    sbO.append(string);
                    sbO.append(")");
                    ie.c.c(sbO.toString(), e12);
                }
            }
        }
        b.f15747e.remove(Integer.valueOf(bVar.f15748a));
        re.e.f14644d.getClass();
        ie.c.a("invokeBatchCallback ignored because web app is not loaded");
    }
}
