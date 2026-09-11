package yc;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.webkit.WebView;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.appcompat.widget.v1;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import ka.a1;
import org.json.JSONArray;
import org.json.JSONObject;
import s3.z0;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f20290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f20291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20292c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f20293d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Object f20294e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Object f20295f;

    public f(WebView webView) {
        this.f20290a = true;
        this.f20291b = false;
        if (TextUtils.isEmpty("Tapjoy")) {
            throw new IllegalArgumentException("Name is null or empty");
        }
        if (TextUtils.isEmpty("12.10.0")) {
            throw new IllegalArgumentException("Version is null or empty");
        }
        this.f20293d = new ConcurrentLinkedQueue();
        c0.a(4, "TJAdUnitJSBridge", "creating AdUnit/JS Bridge");
        this.f20295f = this;
        if (webView == null) {
            c0.c("TJAdUnitJSBridge", new ec.c(2, 4, "Cannot create AdUnitJSBridge -- webview is NULL"));
            return;
        }
        b0 b0Var = new b0(webView, this);
        this.f20294e = b0Var;
        webView.addJavascriptInterface(b0Var, "AndroidJavascriptInterface");
        this.f20292c = true;
        while (true) {
            Pair pair = (Pair) ((ConcurrentLinkedQueue) this.f20293d).poll();
            if (pair == null) {
                return;
            } else {
                f((String) pair.first, (JSONObject) pair.second);
            }
        }
    }

    public void a() {
        CompoundButton compoundButton = (CompoundButton) this.f20293d;
        Drawable drawableA = v3.c.a(compoundButton);
        if (drawableA != null) {
            if (this.f20290a || this.f20291b) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.f20290a) {
                    l3.b.h(drawableMutate, (ColorStateList) this.f20294e);
                }
                if (this.f20291b) {
                    l3.b.i(drawableMutate, (PorterDuff.Mode) this.f20295f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public void b() {
        androidx.appcompat.widget.u uVar = (androidx.appcompat.widget.u) this.f20293d;
        Drawable checkMarkDrawable = uVar.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.f20290a || this.f20291b) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.f20290a) {
                    l3.b.h(drawableMutate, (ColorStateList) this.f20294e);
                }
                if (this.f20291b) {
                    l3.b.i(drawableMutate, (PorterDuff.Mode) this.f20295f);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(uVar.getDrawableState());
                }
                uVar.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public void c(String str, HashMap map) {
        b0 b0Var = (b0) this.f20294e;
        if (b0Var != null) {
            try {
                JSONArray jSONArray = new JSONArray();
                jSONArray.put(new JSONObject(map));
                b0Var.a(jSONArray, str, null);
            } catch (Exception e8) {
                c0.d("TJWebViewJSInterface", "Exception in callback to JS: " + e8.toString());
                e8.printStackTrace();
            }
        }
    }

    public void d(AttributeSet attributeSet, int i10) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = (CompoundButton) this.f20293d;
        Context context = compoundButton.getContext();
        int[] iArr = h.a.f7256m;
        mf.e eVarN = mf.e.N(context, attributeSet, iArr, i10);
        TypedArray typedArray = (TypedArray) eVarN.f11710s;
        z0.j(compoundButton, compoundButton.getContext(), iArr, attributeSet, (TypedArray) eVarN.f11710s, i10);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(a1.t(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(a1.t(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(a1.t(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                v3.b.c(compoundButton, eVarN.t(2));
            }
            if (typedArray.hasValue(3)) {
                v3.b.d(compoundButton, v1.c(typedArray.getInt(3, -1), null));
            }
            eVarN.Q();
        } catch (Throwable th2) {
            eVarN.Q();
            throw th2;
        }
    }

    public void e(int i10, int i11, String str) {
        HashMap map = new HashMap();
        map.put("orientation", str);
        map.put("width", Integer.valueOf(i10));
        map.put("height", Integer.valueOf(i11));
        c("orientationChanged", map);
    }

    public void f(String str, JSONObject jSONObject) {
        if (!this.f20292c) {
            c0.a(3, "TJAdUnitJSBridge", "Bridge currently disabled. Adding " + str + " to message queue");
            ((ConcurrentLinkedQueue) this.f20293d).add(new Pair(str, jSONObject));
            return;
        }
        String strOptString = null;
        try {
            strOptString = jSONObject.optString("callbackId", null);
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            Method method = f.class.getMethod(str, JSONObject.class, String.class);
            c0.a(3, "TJAdUnitJSBridge", "Dispatching method: " + method + " with data=" + jSONObject2 + "; callbackID=" + strOptString);
            if (((b0) this.f20294e) == null) {
                return;
            }
            method.invoke((f) this.f20295f, jSONObject2, strOptString);
        } catch (Exception e8) {
            e8.printStackTrace();
            Object[] objArr = {Boolean.FALSE};
            if (TextUtils.isEmpty(strOptString)) {
                c0.a(3, "TJAdUnitJSBridge", "invokeJSCallback -- no callbackID provided");
                return;
            }
            ArrayList arrayList = new ArrayList(Arrays.asList(objArr));
            b0 b0Var = (b0) this.f20294e;
            if (b0Var != null) {
                try {
                    b0Var.a(new JSONArray((Collection) arrayList), PredefinedUICustomizationFont.defaultFamily, strOptString);
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public void g(int i10, int i11, int i12) {
        HashMap map = new HashMap();
        map.put("videoEventName", "videoReady");
        map.put("videoDuration", Integer.valueOf(i10));
        map.put("videoWidth", Integer.valueOf(i11));
        map.put("videoHeight", Integer.valueOf(i12));
        c("videoEvent", map);
    }

    public /* synthetic */ f(TextView textView) {
        this.f20294e = null;
        this.f20295f = null;
        this.f20290a = false;
        this.f20291b = false;
        this.f20293d = textView;
    }
}
