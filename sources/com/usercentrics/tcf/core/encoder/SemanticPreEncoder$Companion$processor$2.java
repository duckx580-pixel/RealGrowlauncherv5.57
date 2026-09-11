package com.usercentrics.tcf.core.encoder;

import com.usercentrics.tcf.core.GVL;
import com.usercentrics.tcf.core.TCModel;
import com.usercentrics.tcf.core.encoder.SemanticPreEncoder;
import eh.e;
import kotlin.jvm.internal.j;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SemanticPreEncoder$Companion$processor$2 extends j implements e {
    public SemanticPreEncoder$Companion$processor$2(Object obj) {
        super(2, 0, SemanticPreEncoder.Companion.class, obj, "secondProcessorFunction", "secondProcessorFunction(Lcom/usercentrics/tcf/core/TCModel;Lcom/usercentrics/tcf/core/GVL;)Lcom/usercentrics/tcf/core/TCModel;");
    }

    @Override // eh.e
    public final TCModel invoke(TCModel tCModel, GVL gvl) {
        l.f("p0", tCModel);
        l.f("p1", gvl);
        return ((SemanticPreEncoder.Companion) this.receiver).secondProcessorFunction(tCModel, gvl);
    }
}
