package yc;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f20252i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final d f20253r;

    public /* synthetic */ c(d dVar, int i10) {
        this.f20252i = i10;
        this.f20253r = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f20252i) {
            case 0:
                d dVar = this.f20253r;
                if (dVar.f20266i.getCurrentPosition() != 0) {
                    if (!dVar.f20276t) {
                        dVar.f20276t = true;
                    }
                    f fVar = dVar.f20270n;
                    int i10 = dVar.f20274r;
                    fVar.getClass();
                    HashMap map = new HashMap();
                    map.put("videoEventName", "videoStart");
                    map.put("currentTime", Integer.valueOf(i10));
                    fVar.c("videoEvent", map);
                    dVar.f20263f.run();
                } else if (!dVar.f20260c) {
                    dVar.j.postDelayed(dVar.f20262e, 200L);
                } else {
                    dVar.f20261d = true;
                }
                break;
            default:
                d dVar2 = this.f20253r;
                f fVar2 = dVar2.f20270n;
                int currentPosition = dVar2.f20266i.getCurrentPosition();
                fVar2.getClass();
                HashMap map2 = new HashMap();
                map2.put("videoEventName", "videoProgress");
                map2.put("currentTime", Integer.valueOf(currentPosition));
                fVar2.c("videoEvent", map2);
                dVar2.j.postDelayed(dVar2.f20263f, 500L);
                break;
        }
    }
}
