package yc;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f20385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Map f20387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f20388e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f20389f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20390g;

    public final String a(String str) {
        List list;
        Map map = this.f20387d;
        return (map == null || (list = (List) map.get(str)) == null || list.get(0) == null) ? PredefinedUICustomizationFont.defaultFamily : (String) list.get(0);
    }
}
