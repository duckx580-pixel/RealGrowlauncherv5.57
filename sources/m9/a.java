package m9;

import android.graphics.Paint;
import android.graphics.Path;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f11630i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int[] f11631k = new int[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final float[] f11632l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Paint f11633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f11634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f11635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f11638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Path f11639g = new Path();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Paint f11640h;

    public a() {
        Paint paint = new Paint();
        this.f11640h = paint;
        Paint paint2 = new Paint();
        this.f11633a = paint2;
        this.f11636d = k3.a.g(-16777216, 68);
        this.f11637e = k3.a.g(-16777216, 20);
        this.f11638f = k3.a.g(-16777216, 0);
        paint2.setColor(this.f11636d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f11634b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f11635c = new Paint(paint3);
    }
}
