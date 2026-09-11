package yc;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes.dex */
public final class b implements MediaPlayer.OnSeekCompleteListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f20247d;

    public b(d dVar, int i10, int i11, int i12) {
        this.f20247d = dVar;
        this.f20244a = i10;
        this.f20245b = i11;
        this.f20246c = i12;
    }

    @Override // android.media.MediaPlayer.OnSeekCompleteListener
    public final void onSeekComplete(MediaPlayer mediaPlayer) {
        this.f20247d.f20270n.g(this.f20244a, this.f20245b, this.f20246c);
    }
}
