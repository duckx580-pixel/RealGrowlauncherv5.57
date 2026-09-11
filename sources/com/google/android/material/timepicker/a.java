package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import i9.l;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ChipTextInputComboView f4306i;

    public a(ChipTextInputComboView chipTextInputComboView) {
        this.f4306i = chipTextInputComboView;
    }

    @Override // i9.l, android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        ChipTextInputComboView chipTextInputComboView = this.f4306i;
        Chip chip = chipTextInputComboView.f4287i;
        if (TextUtils.isEmpty(editable)) {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt("00"))));
        } else {
            chip.setText(String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(editable)))));
        }
    }
}
