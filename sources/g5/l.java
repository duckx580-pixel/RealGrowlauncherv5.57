package g5;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends u5.f {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f7018g;

    public /* synthetic */ l(int i10) {
        this.f7018g = i10;
    }

    @Override // g5.m
    public final float a(ViewGroup viewGroup, View view) {
        switch (this.f7018g) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
