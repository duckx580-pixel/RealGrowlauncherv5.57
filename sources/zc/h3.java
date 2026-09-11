package zc;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class h3 {
    public final c2 A;
    public final c2 B;
    public final c2 C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f20859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c2 f20860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c2 f20861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c2 f20862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f20863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SharedPreferences f20864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c2 f20865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final k4 f20866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final k4 f20867i;
    public final c2 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final k4 f20868k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final c2 f20869l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final c2 f20870m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final c2 f20871n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c2 f20872o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final k4 f20873p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final c2 f20874q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final c2 f20875r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final c2 f20876s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c2 f20877t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final c2 f20878u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final k4 f20879v;
    public final k4 w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final c2 f20880x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c2 f20881y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final c2 f20882z;

    public h3(Context context) {
        Context applicationContext = context.getApplicationContext();
        this.f20863e = applicationContext;
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("fiverocks", 0);
        this.f20864f = sharedPreferences;
        this.f20865g = new c2(sharedPreferences, "sdk");
        this.f20866h = new k4(sharedPreferences, "fql", 0);
        this.f20867i = new k4(sharedPreferences, "fq", 0);
        this.j = new c2(sharedPreferences, "push");
        this.f20868k = new k4(sharedPreferences, "ss", 0);
        this.f20869l = new c2(sharedPreferences, "std");
        this.f20870m = new c2(sharedPreferences, "slt");
        this.f20871n = new c2(sharedPreferences, "sld");
        this.f20872o = new c2(sharedPreferences, "ptc");
        this.f20873p = new k4(sharedPreferences, "pc", 0);
        this.f20874q = new c2(sharedPreferences, "ptp");
        this.f20875r = new c2(sharedPreferences, "lpt");
        this.f20876s = new c2(sharedPreferences, "plp");
        this.f20877t = new c2(sharedPreferences, "adv");
        this.f20878u = new c2(sharedPreferences, "ui");
        this.f20879v = new k4(sharedPreferences, "ul", -1);
        this.w = new k4(sharedPreferences, "uf", -1);
        this.f20880x = new c2(sharedPreferences, "uv1");
        this.f20881y = new c2(sharedPreferences, "uv2");
        this.f20882z = new c2(sharedPreferences, "uv3");
        this.A = new c2(sharedPreferences, "uv4");
        this.B = new c2(sharedPreferences, "uv5");
        this.C = new c2(sharedPreferences, "utags");
        this.f20859a = new c2(sharedPreferences, "idfa");
        this.f20860b = new c2(sharedPreferences, "idfa.optout");
        this.f20861c = new c2(sharedPreferences, "push.optout");
        this.f20862d = new c2(sharedPreferences, "appId");
    }
}
