package p3;

import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f13293i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f13294r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f13295s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.recyclerview.widget.b f13296t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ int f13297u;

    public /* synthetic */ c(String str, Context context, androidx.recyclerview.widget.b bVar, int i10, int i11) {
        this.f13293i = i11;
        this.f13294r = str;
        this.f13295s = context;
        this.f13296t = bVar;
        this.f13297u = i10;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f13293i) {
            case 0:
                return f.a(this.f13294r, this.f13295s, this.f13296t, this.f13297u);
            default:
                try {
                    return f.a(this.f13294r, this.f13295s, this.f13296t, this.f13297u);
                } catch (Throwable unused) {
                    return new e(-3);
                }
        }
    }
}
