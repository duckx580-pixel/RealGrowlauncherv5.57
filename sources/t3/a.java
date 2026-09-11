package t3;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends ClickableSpan {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16409i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final j f16410r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f16411s;

    public a(int i10, j jVar, int i11) {
        this.f16409i = i10;
        this.f16410r = jVar;
        this.f16411s = i11;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f16409i);
        this.f16410r.f16430a.performAction(this.f16411s, bundle);
    }
}
