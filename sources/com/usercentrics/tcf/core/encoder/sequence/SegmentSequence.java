package com.usercentrics.tcf.core.encoder.sequence;

import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType;
import com.usercentrics.tcf.core.model.Segment;
import java.util.ArrayList;
import kotlin.jvm.internal.l;
import sb.c;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class SegmentSequence extends SequenceVersionMap {
    private SequenceVersionMapType two;

    public SegmentSequence(TCModel tCModel) {
        l.f("tcModel", tCModel);
        this.two = new SequenceVersionMapType.List(c.C(Segment.CORE));
        SequenceVersionMapType two = getTwo();
        l.d("null cannot be cast to non-null type com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMapType.List", two);
        ArrayList arrayListY0 = rg.l.y0(((SequenceVersionMapType.List) two).getValue());
        arrayListY0.add(Segment.VENDORS_DISCLOSED);
        if (tCModel.getIsServiceSpecific()) {
            arrayListY0.add(Segment.PUBLISHER_TC);
        }
        setTwo(new SequenceVersionMapType.List(rg.l.x0(arrayListY0)));
    }

    @Override // com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMap
    public SequenceVersionMapType getTwo() {
        return this.two;
    }

    @Override // com.usercentrics.tcf.core.encoder.sequence.SequenceVersionMap
    public void setTwo(SequenceVersionMapType sequenceVersionMapType) {
        l.f("<set-?>", sequenceVersionMapType);
        this.two = sequenceVersionMapType;
    }
}
