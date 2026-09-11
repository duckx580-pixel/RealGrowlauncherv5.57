package zc;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Point;
import java.util.Hashtable;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final class b3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final cb.f f20727d = new cb.f(19);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f20728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f20729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f20730c;

    public b3(Context context, String str, Hashtable hashtable) {
        Context applicationContext = context != null ? context instanceof Application ? context : context.getApplicationContext() : null;
        this.f20728a = applicationContext != null ? applicationContext : context;
        this.f20729b = str;
        this.f20730c = hashtable;
    }

    public b3(k1.a aVar) {
        this.f20729b = new AtomicBoolean();
        this.f20730c = new wb.a(10, this);
        this.f20728a = aVar;
    }

    public b3(e3 e3Var, z2 z2Var, a2 a2Var) {
        this.f20730c = e3Var;
        this.f20728a = z2Var;
        this.f20729b = a2Var;
    }

    public /* synthetic */ b3(g3 g3Var, Activity activity, z2 z2Var) {
        this.f20730c = g3Var;
        this.f20729b = activity;
        this.f20728a = z2Var;
    }

    public b3(s3 s3Var, Point point, Point point2) {
        this.f20728a = s3Var;
        this.f20729b = point;
        this.f20730c = point2;
    }
}
