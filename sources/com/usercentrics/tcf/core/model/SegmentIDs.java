package com.usercentrics.tcf.core.model;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g;
import rg.y;
import sb.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentIDs {
    public static final Companion Companion = new Companion(null);
    private static final List<Segment> ID_TO_KEY;
    private static final Map<Segment, Integer> KEY_TO_ID;

    /* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
    public static final class Companion {
        private Companion() {
        }

        public final List<Segment> getID_TO_KEY() {
            return SegmentIDs.ID_TO_KEY;
        }

        public final Map<Segment, Integer> getKEY_TO_ID() {
            return SegmentIDs.KEY_TO_ID;
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    static {
        Segment segment = Segment.CORE;
        Segment segment2 = Segment.VENDORS_DISCLOSED;
        Segment segment3 = Segment.VENDORS_ALLOWED;
        Segment segment4 = Segment.PUBLISHER_TC;
        ID_TO_KEY = c.D(segment, segment2, segment3, segment4);
        KEY_TO_ID = y.G(new qg.g(segment, 0), new qg.g(segment2, 1), new qg.g(segment3, 2), new qg.g(segment4, 3));
    }
}
