package v5;

import android.app.Application;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f18577a = new a();

    public final String a() {
        String processName = Application.getProcessName();
        kotlin.jvm.internal.l.e("getProcessName()", processName);
        return processName;
    }
}
