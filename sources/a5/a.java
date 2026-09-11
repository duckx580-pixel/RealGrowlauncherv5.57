package a5;

import android.os.Bundle;
import i.j;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f354a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f355b;

    public a(f fVar) {
        this.f354a = 0;
        this.f355b = new LinkedHashSet();
        fVar.c("androidx.savedstate.Restarter", this);
    }

    @Override // a5.e
    public final Bundle a() {
        switch (this.f354a) {
            case 0:
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("classes_to_restore", new ArrayList<>((LinkedHashSet) this.f355b));
                return bundle;
            default:
                Bundle bundle2 = new Bundle();
                ((j) this.f355b).getDelegate().getClass();
                return bundle2;
        }
    }

    public a(j jVar) {
        this.f354a = 1;
        this.f355b = jVar;
    }
}
