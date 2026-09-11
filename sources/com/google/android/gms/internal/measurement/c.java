package com.google.android.gms.internal.measurement;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f3717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f3718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f3719c;

    public c() {
        this.f3717a = new b(PredefinedUICustomizationFont.defaultFamily, 0L, null);
        this.f3718b = new b(PredefinedUICustomizationFont.defaultFamily, 0L, null);
        this.f3719c = new ArrayList();
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        c cVar = new c(this.f3717a.clone());
        Iterator it = this.f3719c.iterator();
        while (it.hasNext()) {
            cVar.f3719c.add(((b) it.next()).clone());
        }
        return cVar;
    }

    public c(b bVar) {
        this.f3717a = bVar;
        this.f3718b = bVar.clone();
        this.f3719c = new ArrayList();
    }
}
