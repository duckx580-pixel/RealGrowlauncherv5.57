package com.google.android.gms.internal.measurement;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 extends ContentObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3788a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3789b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(h3 h3Var) {
        super(null);
        this.f3789b = h3Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3) {
        switch (this.f3788a) {
            case 0:
                h3 h3Var = (h3) this.f3789b;
                synchronized (h3Var.f3805e) {
                    h3Var.f3806f = null;
                    h3Var.f3803c.run();
                    break;
                }
                synchronized (h3Var) {
                    try {
                        Iterator it = h3Var.f3807g.iterator();
                        if (it.hasNext()) {
                            if (it.next() != null) {
                                throw new ClassCastException();
                            }
                            throw null;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return;
            default:
                super.onChange(z3);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(qh.d dVar, Handler handler) {
        super(handler);
        this.f3789b = dVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z3, Uri uri) {
        switch (this.f3788a) {
            case 1:
                ((qh.d) this.f3789b).l(qg.o.f13926a);
                break;
            default:
                super.onChange(z3, uri);
                break;
        }
    }
}
