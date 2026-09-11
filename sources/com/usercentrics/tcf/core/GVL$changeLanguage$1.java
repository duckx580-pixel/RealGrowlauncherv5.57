package com.usercentrics.tcf.core;

import com.rtsoft.growtopia.R;
import qg.i;
import vg.a;
import wg.c;
import wg.e;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "com.usercentrics.tcf.core.GVL", f = "GVL.kt", l = {R.styleable.AppCompatTheme_textAppearancePopupMenuHeader}, m = "changeLanguage-gIAlu-s")
public final class GVL$changeLanguage$1 extends c {
    Object L$0;
    Object L$1;
    int label;
    Object result;
    final GVL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GVL$changeLanguage$1(GVL gvl, ug.c<? super GVL$changeLanguage$1> cVar) {
        super(cVar);
        this.this$0 = gvl;
    }

    @Override // wg.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM109changeLanguagegIAlus = this.this$0.m109changeLanguagegIAlus(null, this);
        return objM109changeLanguagegIAlus == a.f18663i ? objM109changeLanguagegIAlus : new i(objM109changeLanguagegIAlus);
    }
}
