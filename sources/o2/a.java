package o2;

import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import i1.e;
import i1.g;
import i1.h;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends CharacterStyle implements UpdateAppearance {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final e f12645i;

    public a(e eVar) {
        this.f12645i = eVar;
    }

    @Override // android.text.style.CharacterStyle
    public final void updateDrawState(TextPaint textPaint) {
        if (textPaint != null) {
            g gVar = g.f7990a;
            e eVar = this.f12645i;
            if (l.a(eVar, gVar)) {
                textPaint.setStyle(Paint.Style.FILL);
                return;
            }
            if (eVar instanceof h) {
                textPaint.setStyle(Paint.Style.STROKE);
                textPaint.setStrokeWidth(((h) eVar).f7991a);
                textPaint.setStrokeMiter(((h) eVar).f7992b);
                int i10 = ((h) eVar).f7994d;
                textPaint.setStrokeJoin(i10 == 0 ? Paint.Join.MITER : i10 == 1 ? Paint.Join.ROUND : i10 == 2 ? Paint.Join.BEVEL : Paint.Join.MITER);
                int i11 = ((h) eVar).f7993c;
                textPaint.setStrokeCap(i11 == 0 ? Paint.Cap.BUTT : i11 == 1 ? Paint.Cap.ROUND : i11 == 2 ? Paint.Cap.SQUARE : Paint.Cap.BUTT);
                ((h) eVar).getClass();
                textPaint.setPathEffect(null);
            }
        }
    }
}
