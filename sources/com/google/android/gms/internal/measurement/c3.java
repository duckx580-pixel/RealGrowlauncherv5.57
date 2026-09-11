package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.os.Handler;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3721a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c3(Handler handler, int i10) {
        super(handler);
        this.f3721a = i10;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z3) {
        switch (this.f3721a) {
            case 0:
                d3.f3739d.set(true);
                break;
            default:
                o3.f3896i.incrementAndGet();
                break;
        }
    }
}
