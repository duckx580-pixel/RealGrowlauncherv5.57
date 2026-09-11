package yc;

import android.media.MediaPlayer;
import android.os.Handler;
import android.os.Looper;
import android.widget.VideoView;
import com.tapjoy.TJAdUnitActivity;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import fi.e2;
import fi.f2;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class d implements MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnInfoListener, MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f20258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20260c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20261d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f2 f20264g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e2 f20265h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public VideoView f20266i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public l f20267k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public m f20268l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public TJAdUnitActivity f20269m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public f f20270n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public z f20271o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public z f20272p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MediaPlayer f20273q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f20274r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f20275s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f20276t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f20277u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f20278v;
    public boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f20279x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public volatile boolean f20280y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f20281z;
    public final Handler j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f20262e = new c(this, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f20263f = new c(this, 1);

    public d() {
        int i10 = 1;
        this.f20264g = new f2(i10, this);
        this.f20265h = new e2(i10, this);
    }

    public final void a() {
        c cVar = this.f20262e;
        Handler handler = this.j;
        handler.removeCallbacks(cVar);
        handler.removeCallbacks(this.f20263f);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String b() {
        /*
            r7 = this;
            com.tapjoy.TJAdUnitActivity r0 = r7.f20269m
            r1 = 8
            if (r0 == 0) goto L5b
            android.view.WindowManager r2 = r0.getWindowManager()
            android.view.Display r2 = r2.getDefaultDisplay()
            int r2 = r2.getRotation()
            android.util.DisplayMetrics r3 = new android.util.DisplayMetrics
            r3.<init>()
            android.view.WindowManager r0 = r0.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r3)
            int r0 = r3.widthPixels
            r7.f20258a = r0
            int r3 = r3.heightPixels
            r7.f20259b = r3
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L33
        L31:
            if (r3 > r0) goto L4b
        L33:
            if (r2 == r6) goto L37
            if (r2 != r4) goto L3a
        L37:
            if (r0 <= r3) goto L3a
            goto L4b
        L3a:
            if (r2 == 0) goto L59
            if (r2 == r6) goto L5c
            if (r2 == r5) goto L54
            if (r2 == r4) goto L56
            java.lang.String r0 = "Unknown screen orientation. Defaulting to landscape."
            r2 = 5
            java.lang.String r3 = "TJAdUnit"
            yc.c0.a(r2, r3, r0)
            goto L59
        L4b:
            if (r2 == 0) goto L5c
            if (r2 == r6) goto L59
            if (r2 == r5) goto L56
            if (r2 == r4) goto L54
            goto L5c
        L54:
            r6 = r1
            goto L5c
        L56:
            r6 = 9
            goto L5c
        L59:
            r6 = 0
            goto L5c
        L5b:
            r6 = -1
        L5c:
            if (r6 == 0) goto L66
            if (r6 == r1) goto L66
            r0 = 6
            if (r6 == r0) goto L66
            java.lang.String r0 = "portrait"
            return r0
        L66:
            java.lang.String r0 = "landscape"
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: yc.d.b():java.lang.String");
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        c0.a(4, "TJAdUnit", "video -- onCompletion");
        a();
        this.f20277u = true;
        if (!this.f20275s) {
            f fVar = this.f20270n;
            fVar.getClass();
            HashMap map = new HashMap();
            map.put("videoEventName", "videoComplete");
            fVar.c("videoEvent", map);
        }
        this.f20275s = false;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        c0.c("TJAdUnit", new ec.c(2, 4, android.support.v4.media.session.a.l("Error encountered when instantiating the VideoView: ", i10, i11, " - ")));
        this.f20275s = true;
        a();
        String strE = s.h0.e((i10 != 100 ? "MEDIA_ERROR_UNKNOWN" : "MEDIA_ERROR_SERVER_DIED").concat(" -- "), i11 != -1010 ? i11 != -1007 ? i11 != -1004 ? i11 != -110 ? "MEDIA_ERROR_EXTRA_UNKNOWN" : "MEDIA_ERROR_TIMED_OUT" : "MEDIA_ERROR_IO" : "MEDIA_ERROR_MALFORMED" : "MEDIA_ERROR_UNSUPPORTED");
        f fVar = this.f20270n;
        fVar.getClass();
        HashMap map = new HashMap();
        map.put("videoEventName", "videoError");
        map.put("error", strE);
        fVar.c("videoEvent", map);
        return i10 == 1 || i11 == -1004;
    }

    @Override // android.media.MediaPlayer.OnInfoListener
    public final boolean onInfo(MediaPlayer mediaPlayer, int i10, int i11) {
        String str;
        if (i10 == 3) {
            str = "MEDIA_INFO_VIDEO_RENDERING_START";
        } else if (i10 != 801) {
            switch (i10) {
                case 700:
                    str = "MEDIA_INFO_VIDEO_TRACK_LAGGING";
                    break;
                case 701:
                    str = "MEDIA_INFO_BUFFERING_START";
                    break;
                case 702:
                    str = "MEDIA_INFO_BUFFERING_END";
                    break;
                default:
                    str = PredefinedUICustomizationFont.defaultFamily;
                    break;
            }
        } else {
            str = "MEDIA_INFO_NOT_SEEKABLE";
        }
        f fVar = this.f20270n;
        fVar.getClass();
        HashMap map = new HashMap();
        map.put("videoEventName", "videoInfo");
        map.put("info", str);
        fVar.c("videoEvent", map);
        return false;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        c0.a(4, "TJAdUnit", "video -- onPrepared");
        int duration = this.f20266i.getDuration();
        int measuredWidth = this.f20266i.getMeasuredWidth();
        int measuredHeight = this.f20266i.getMeasuredHeight();
        this.f20273q = mediaPlayer;
        if (this.f20274r <= 0 || this.f20266i.getCurrentPosition() == this.f20274r) {
            f fVar = this.f20270n;
            if (fVar != null) {
                fVar.g(duration, measuredWidth, measuredHeight);
            }
        } else {
            this.f20273q.setOnSeekCompleteListener(new b(this, duration, measuredWidth, measuredHeight));
        }
        this.f20273q.setOnInfoListener(this);
    }
}
