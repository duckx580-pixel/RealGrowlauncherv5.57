package com.usercentrics.sdk.ui.banner;

import kotlin.jvm.internal.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
abstract class BannerTransitionParameters {
    private final int fadingMode;
    private final int gravity;
    private final int visibility;

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class SlideDown extends BannerTransitionParameters {
        public static final SlideDown INSTANCE = new SlideDown();

        private SlideDown() {
            super(80, 2, 4, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class SlideUp extends BannerTransitionParameters {
        public static final SlideUp INSTANCE = new SlideUp();

        private SlideUp() {
            super(80, 1, 0, null);
        }
    }

    public /* synthetic */ BannerTransitionParameters(int i10, int i11, int i12, g gVar) {
        this(i10, i11, i12);
    }

    public final int getFadingMode() {
        return this.fadingMode;
    }

    public final int getGravity() {
        return this.gravity;
    }

    public final int getVisibility() {
        return this.visibility;
    }

    private BannerTransitionParameters(int i10, int i11, int i12) {
        this.gravity = i10;
        this.fadingMode = i11;
        this.visibility = i12;
    }
}
