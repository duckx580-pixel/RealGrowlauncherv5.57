package xd;

import android.os.ConditionVariable;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import s8.o2;

/* JADX INFO: loaded from: classes.dex */
public final class k extends k8.g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f19608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f19609d;

    public k() {
        a aVar = new a();
        this.f19608c = aVar;
        this.f19609d = aVar.f19578k;
    }

    @Override // k8.g
    public final k8.g k() {
        boolean zBlock;
        oe.c.f12838c.set(oe.b.f12835s);
        ie.c.a("Unity Ads init: starting init");
        ConditionVariable conditionVariable = new ConditionVariable();
        re.e eVar = re.e.f14644d;
        if (eVar != null) {
            re.e.f14646f.set(-1);
            re.e.f14647g.set(PredefinedUICustomizationFont.defaultFamily);
            re.e.f14645e.set(Boolean.FALSE);
            if (eVar.f14649b != null) {
                i8.a.k(new o2(24, eVar, conditionVariable));
                zBlock = conditionVariable.block(this.f19609d);
            } else {
                zBlock = true;
            }
            if (!zBlock) {
                new Exception("Reset failed on opening ConditionVariable");
                return null;
            }
        }
        oe.c.f12836a = null;
        if (oe.c.a() == null) {
            new Exception("Cache directory is NULL");
            return null;
        }
        a aVar = this.f19608c;
        for (Class cls : aVar.f19577i) {
            aVar.a(cls);
        }
        return null;
    }
}
