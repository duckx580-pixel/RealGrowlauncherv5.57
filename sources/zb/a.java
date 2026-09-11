package zb;

import ae.c;
import al.h;
import android.app.Application;
import android.content.Context;
import android.util.Log;
import cb.f;
import com.google.android.gms.internal.measurement.j3;
import hd.c0;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import l5.o;
import t6.b;
import u5.e;
import u5.l;
import u5.n;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final AtomicBoolean f20682q = new AtomicBoolean(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static a f20683r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public h f20684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f20685b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public yb.a f20686c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Context f20687d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f20688e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j3 f20689f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public l f20690g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f20691h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public o f20692i;
    public final n j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public c0 f20693k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final cc.b f20694l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public gc.a f20695m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c f20696n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ScheduledThreadPoolExecutor f20697o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public mf.e f20698p;

    public a(Application application) {
        this.f20687d = application;
        kb.c cVar = new kb.c();
        cVar.f9562i = application.getSharedPreferences("__hs_lite_sdk_store", 0);
        c cVar2 = new c();
        cVar2.f594i = cVar;
        this.f20696n = cVar2;
        o oVar = new o(Executors.newFixedThreadPool(2));
        o oVar2 = new o(Executors.newSingleThreadExecutor());
        f fVar = new f(17);
        n nVar = new n();
        nVar.f17678d = new Object();
        nVar.f17676b = oVar;
        nVar.f17677c = oVar2;
        nVar.f17675a = fVar;
        this.j = nVar;
        this.f20694l = new cc.b(application, cVar2);
    }

    public static boolean a() {
        if (f20682q.get()) {
            return true;
        }
        Log.d("HSContext", "Helpshift install() call failed.");
        return false;
    }
}
