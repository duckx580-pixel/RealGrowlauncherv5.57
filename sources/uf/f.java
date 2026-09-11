package uf;

import android.R;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.SurroundingText;
import android.view.inputmethod.TextAttribute;
import android.view.inputmethod.TextSnapshot;
import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends BaseInputConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final tf.e f17864d = tf.e.a("EditorInputConnection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f17865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pf.e f17866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f17867c;

    public f(c cVar) {
        super(cVar, true);
        this.f17866b = new pf.e();
        this.f17867c = false;
        this.f17865a = cVar;
        cVar.o0(we.d.class, new com.google.gson.internal.b(15, this));
    }

    public final void a(CharSequence charSequence) {
        pf.e eVar = this.f17866b;
        boolean zA = eVar.a();
        c cVar = this.f17865a;
        if (cVar.getProps().B) {
            if (eVar.a()) {
                String string = ((pf.h) cVar.getText().subSequence(eVar.f13388a, eVar.f13389b)).toString();
                String string2 = charSequence.toString();
                if (eVar.f13389b != cVar.getCursor().f13407c.f13383a || cVar.getCursor().a() || !string2.startsWith(string) || string2.length() <= string.length()) {
                    b();
                } else {
                    charSequence = string2.substring(string.length());
                    eVar.f13389b = -1;
                    eVar.f13388a = -1;
                    eVar.f13390c = false;
                }
            }
        } else if (eVar.a()) {
            b();
        }
        cVar.w(charSequence, true);
        if (zA) {
            endBatchEdit();
        }
    }

    public final void b() {
        pf.e eVar = this.f17866b;
        if (eVar.a()) {
            try {
                this.f17865a.getText().g(eVar.f13388a, eVar.f13389b);
            } catch (IndexOutOfBoundsException e8) {
                e8.printStackTrace();
            }
            eVar.f13389b = -1;
            eVar.f13388a = -1;
            eVar.f13390c = false;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized boolean beginBatchEdit() {
        this.f17865a.getProps().getClass();
        return this.f17865a.getText().b();
    }

    public final CharSequence c(int i10, int i11, int i12) {
        try {
            return d(i10, i11, i12, false);
        } catch (IndexOutOfBoundsException e8) {
            Log.w(f17864d.f17180a, "Failed to get text region for IME", e8);
            return PredefinedUICustomizationFont.defaultFamily;
        }
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i10) {
        sf.a keyMetaStates = this.f17865a.getKeyMetaStates();
        keyMetaStates.clearMetaKeyState(keyMetaStates.f15757a, keyMetaStates.f15758b, i10);
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized void closeConnection() {
        super.closeConnection();
        pf.h text = this.f17865a.getText();
        while (text.f13395u > 0) {
            text.k();
        }
        pf.e eVar = this.f17866b;
        eVar.f13389b = -1;
        eVar.f13388a = -1;
        eVar.f13390c = false;
        c cVar = this.f17865a;
        cVar.setExtracting(null);
        cVar.invalidate();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i10) {
        if (!this.f17865a.P() || charSequence == null) {
            return false;
        }
        if (!"\n".equals(charSequence.toString())) {
            a(charSequence);
            return true;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        sendKeyEvent(new KeyEvent(jUptimeMillis, jUptimeMillis, 0, 66, 0, 0, -1, 0, 6));
        sendKeyEvent(new KeyEvent(SystemClock.uptimeMillis(), jUptimeMillis, 1, 66, 0, 0, -1, 0, 6));
        return true;
    }

    public final CharSequence d(int i10, int i11, int i12, boolean z3) {
        c cVar = this.f17865a;
        pf.h text = cVar.getText();
        if (i10 > i11) {
            i11 = i10;
            i10 = i11;
        }
        int i13 = 0;
        if (i10 < 0) {
            i10 = 0;
        }
        int i14 = text.f13394t;
        if (i11 > i14) {
            i11 = i14;
        }
        if (i11 < i10) {
            i10 = 0;
            i11 = 0;
        }
        if (!z3 && i11 - i10 > cVar.getProps().w) {
            i11 = Math.max(0, cVar.getProps().w) + i10;
        }
        String string = ((pf.h) text.subSequence(i10, i11)).toString();
        if (i12 != 1) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        pf.e eVar = this.f17866b;
        if (eVar.a()) {
            try {
                int i15 = eVar.f13388a;
                int i16 = eVar.f13389b;
                int i17 = i15 - i10;
                if (i17 < spannableStringBuilder.length()) {
                    if (i17 >= 0) {
                        i13 = i17;
                    }
                    int length = i16 - i10;
                    if (length > 0) {
                        if (length >= spannableStringBuilder.length()) {
                            length = spannableStringBuilder.length();
                        }
                        spannableStringBuilder.setSpan(256, i13, length, 33);
                    }
                }
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        return spannableStringBuilder;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i10, int i11) {
        c cVar = this.f17865a;
        if (!cVar.P() || i10 < 0 || i11 < 0) {
            return false;
        }
        pf.e eVar = this.f17866b;
        if (i10 == 1 && i11 == 0 && !eVar.a()) {
            cVar.B();
            return true;
        }
        if (i10 > 0 && i11 > 0) {
            beginBatchEdit();
        }
        boolean zA = eVar.a();
        int i12 = zA ? eVar.f13388a : 0;
        int i13 = zA ? eVar.f13389b : 0;
        int i14 = cVar.getCursor().f13407c.f13383a;
        int i15 = i14 - i10;
        if (i15 < 0) {
            i15 = 0;
        }
        cVar.getText().g(i15, i14);
        if (zA) {
            int iMax = Math.max(i15, i12);
            int iMax2 = i13 - Math.max(0, Math.min(i14, i13) - iMax);
            int iMax3 = Math.max(0, iMax - i15);
            i13 = iMax2 - iMax3;
            i12 -= iMax3;
        }
        int i16 = cVar.getCursor().f13408d.f13383a;
        int i17 = i16 + i11;
        if (i17 > cVar.getText().f13394t) {
            i17 = cVar.getText().f13394t;
        }
        cVar.getText().g(i16, i17);
        if (zA) {
            int iMax4 = Math.max(i16, i12);
            Math.max(0, Math.min(i17, i13) - iMax4);
            Math.max(0, iMax4 - i16);
        }
        if (i10 > 0 && i11 > 0) {
            endBatchEdit();
        }
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i10, int i11) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final synchronized boolean endBatchEdit() {
        boolean zK;
        zK = this.f17865a.getText().k();
        if (!zK) {
            this.f17865a.s0();
        }
        return zK;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        c cVar = this.f17865a;
        if (!cVar.P()) {
            return false;
        }
        cVar.getProps().getClass();
        pf.e eVar = this.f17866b;
        eVar.f13389b = -1;
        eVar.f13388a = -1;
        eVar.f13390c = false;
        endBatchEdit();
        cVar.q0();
        cVar.invalidate();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i10) {
        c cVar = this.f17865a;
        return TextUtils.getCapsMode(cVar.getText(), cVar.getCursor().f13407c.f13383a, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i10) {
        c cVar = this.f17865a;
        cVar.getProps().getClass();
        cVar.getProps().getClass();
        if ((i10 & 1) != 0) {
            cVar.setExtracting(extractedTextRequest);
        } else {
            cVar.setExtracting(null);
        }
        return cVar.H(extractedTextRequest);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return this.f17865a.getHandler();
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i10) {
        c cVar = this.f17865a;
        cVar.getProps().getClass();
        int i11 = cVar.getCursor().f13407c.f13383a;
        int i12 = cVar.getCursor().f13408d.f13383a;
        if (i11 == i12) {
            return null;
        }
        return c(i11, i12, i10);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final SurroundingText getSurroundingText(int i10, int i11, int i12) {
        CharSequence charSequenceD;
        c cVar = this.f17865a;
        cVar.getProps().getClass();
        if ((i10 | i11) < 0) {
            throw new IllegalArgumentException("length < 0");
        }
        int iMin = Math.min(Math.max(0, cVar.getCursor().f13407c.f13383a - i10), cVar.getCursor().f13407c.f13383a);
        try {
            charSequenceD = d(iMin, Math.min(cVar.getText().f13394t, cVar.getCursor().f13408d.f13383a + i11), i12, true);
        } catch (IndexOutOfBoundsException e8) {
            Log.w(f17864d.f17180a, "Failed to get text region for IME", e8);
            charSequenceD = PredefinedUICustomizationFont.defaultFamily;
        }
        s3.d.c();
        return s3.d.b(cVar.getCursor().f13407c.f13383a - iMin, cVar.getCursor().f13408d.f13383a - iMin, iMin, charSequenceD);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i10, int i11) {
        c cVar = this.f17865a;
        cVar.getProps().getClass();
        int i12 = cVar.getCursor().f13408d.f13383a;
        return c(i12, i10 + i12, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i10, int i11) {
        c cVar = this.f17865a;
        cVar.getProps().getClass();
        int i12 = cVar.getCursor().f13407c.f13383a;
        return c(Math.max(i12 - i10, i12 - cVar.getProps().w), i12, i11);
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i10) {
        c cVar = this.f17865a;
        switch (i10) {
            case R.id.selectAll:
                cVar.g0();
                return true;
            case R.id.cut:
                cVar.x(true);
                if (cVar.getCursor().a()) {
                    cVar.B();
                }
                return true;
            case R.id.copy:
                cVar.x(true);
                return true;
            case R.id.paste:
                break;
            default:
                switch (i10) {
                    case R.id.undo:
                        cVar.p0();
                        break;
                    case R.id.redo:
                        cVar.c0();
                        break;
                }
                return true;
        }
        cVar.Z();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        c cVar = this.f17865a;
        kotlin.jvm.internal.l.f("editor", cVar);
        kotlin.jvm.internal.l.f("action", str);
        cVar.f17845y.a(new we.a(cVar));
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean replaceText(int i10, int i11, CharSequence charSequence, int i12, TextAttribute textAttribute) {
        int i13 = this.f17865a.getText().f13394t;
        if (i10 < 0 || i11 < 0 || i10 > i11 || i10 > i13 || i11 > i13) {
            return false;
        }
        beginBatchEdit();
        finishComposingText();
        setSelection(i10, i11);
        commitText(charSequence, i12);
        endBatchEdit();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z3) {
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i10) {
        this.f17865a.r0();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i10, int i11) {
        c cVar = this.f17865a;
        if (cVar.P() && cVar.f17812h0 == 0) {
            cVar.getProps().getClass();
            if (i10 == i11) {
                finishComposingText();
                return true;
            }
            if (i10 > i11) {
                i11 = i10;
                i10 = i11;
            }
            if (i10 < 0) {
                i10 = 0;
            }
            try {
                int i12 = cVar.getText().f13394t;
                if (i11 > i12) {
                    i11 = i12;
                }
                if (i10 < i11) {
                    pf.e eVar = this.f17866b;
                    eVar.f13388a = i10;
                    eVar.f13389b = i11;
                    cVar.invalidate();
                    beginBatchEdit();
                    return true;
                }
            } catch (IndexOutOfBoundsException e8) {
                Log.w(f17864d.f17180a, "set composing region for IME failed", e8);
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i10) throws Throwable {
        c cVar = this.f17865a;
        if (cVar.P() && cVar.f17812h0 == 0) {
            cVar.getProps().getClass();
            if (TextUtils.indexOf(charSequence, '\n') == -1) {
                pf.e eVar = this.f17866b;
                if (!eVar.a()) {
                    eVar.f13390c = true;
                    if (cVar.getCursor().a()) {
                        cVar.B();
                    }
                    beginBatchEdit();
                    cVar.w(charSequence, true);
                    eVar.f13390c = false;
                    int length = cVar.getCursor().f13407c.f13383a - charSequence.length();
                    int i11 = cVar.getCursor().f13407c.f13383a;
                    eVar.f13388a = length;
                    eVar.f13389b = i11;
                    cVar.q0();
                } else if (eVar.a()) {
                    if (cVar.getProps().C) {
                        String string = charSequence.toString();
                        pf.h text = cVar.getText();
                        String strC = text.C(eVar.f13388a, eVar.f13389b);
                        if (!strC.equals(string)) {
                            if (strC.length() < string.length() && string.startsWith(strC)) {
                                pf.c cVarA = text.n().A(eVar.f13389b);
                                text.r(cVarA.f13384b, cVarA.f13385c, string.substring(strC.length()));
                            } else if (strC.length() <= string.length() || !strC.startsWith(string)) {
                                int i12 = eVar.f13388a;
                                int i13 = eVar.f13389b;
                                pf.c cVarA2 = text.n().A(i12);
                                pf.c cVarA3 = text.n().A(i13);
                                text.w(cVarA2.f13384b, cVarA2.f13385c, string, cVarA3.f13384b, cVarA3.f13385c);
                            } else {
                                text.g(eVar.f13389b - (strC.length() - string.length()), eVar.f13389b);
                            }
                        }
                    } else {
                        pf.h text2 = cVar.getText();
                        int i14 = eVar.f13388a;
                        int i15 = eVar.f13389b;
                        pf.c cVarA4 = text2.n().A(i14);
                        pf.c cVarA5 = text2.n().A(i15);
                        text2.w(cVarA4.f13384b, cVarA4.f13385c, charSequence, cVarA5.f13384b, cVarA5.f13385c);
                    }
                    eVar.f13389b = eVar.f13388a + charSequence.length();
                }
                if (charSequence.length() == 0) {
                    finishComposingText();
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setImeConsumesInput(boolean z3) {
        this.f17867c = z3;
        this.f17865a.invalidate();
        return true;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final boolean setSelection(int i10, int i11) {
        c cVar = this.f17865a;
        boolean z3 = false;
        if (cVar.P()) {
            cVar.getProps().getClass();
            if (i10 < 0) {
                i10 = 0;
            } else if (i10 > cVar.getText().f13394t) {
                i10 = cVar.getText().f13394t;
            }
            if (i11 < 0) {
                i11 = 0;
            } else if (i11 > cVar.getText().f13394t) {
                i11 = cVar.getText().f13394t;
            }
            if (i10 > i11) {
                int i12 = i11;
                i11 = i10;
                i10 = i12;
            }
            z3 = true;
            if (i10 == cVar.getCursor().f13407c.f13383a && i11 == cVar.getCursor().f13408d.f13383a) {
                return true;
            }
            pf.h text = cVar.getText();
            pf.c cVarA = text.n().A(i10);
            pf.c cVarA2 = text.n().A(i11);
            this.f17865a.m0(cVarA.f13384b, cVarA.f13385c, cVarA2.f13384b, cVarA2.f13385c, 4, false);
        }
        return z3;
    }

    @Override // android.view.inputmethod.BaseInputConnection, android.view.inputmethod.InputConnection
    public final TextSnapshot takeSnapshot() {
        int i10;
        int i11;
        pf.e eVar = this.f17866b;
        if (eVar.a()) {
            i10 = eVar.f13388a;
            i11 = eVar.f13389b;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return e2.a.b(getSurroundingText(1024, 1024, 1), i10, i11, getCursorCapsMode(28672));
    }
}
