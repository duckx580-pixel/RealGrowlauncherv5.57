package com.google.android.material.textview;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.h1;
import r9.a;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class MaterialTextView extends h1 {
    public MaterialTextView(Context context, AttributeSet attributeSet) {
        super(a.a(context, attributeSet, R.attr.textViewStyle, 0), attributeSet, R.attr.textViewStyle);
        Context context2 = getContext();
        TypedValue typedValueE = vd.a.E(context2, launcher.powerkuy.growlauncher.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueE != null && typedValueE.type == 18 && typedValueE.data == 0) {
            return;
        }
        Resources.Theme theme = context2.getTheme();
        int[] iArr = w8.a.f19124s;
        TypedArray typedArrayObtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int iD = d(context2, typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iD != -1) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes2 = theme.obtainStyledAttributes(attributeSet, iArr, R.attr.textViewStyle, 0);
        int resourceId = typedArrayObtainStyledAttributes2.getResourceId(0, -1);
        typedArrayObtainStyledAttributes2.recycle();
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes3 = theme.obtainStyledAttributes(resourceId, w8.a.f19123r);
            int iD2 = d(getContext(), typedArrayObtainStyledAttributes3, 1, 2);
            typedArrayObtainStyledAttributes3.recycle();
            if (iD2 >= 0) {
                setLineHeight(iD2);
            }
        }
    }

    public static int d(Context context, TypedArray typedArray, int... iArr) {
        int dimensionPixelSize = -1;
        for (int i10 = 0; i10 < iArr.length && dimensionPixelSize < 0; i10++) {
            int i11 = iArr[i10];
            TypedValue typedValue = new TypedValue();
            if (typedArray.getValue(i11, typedValue) && typedValue.type == 2) {
                TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
                int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, -1);
                typedArrayObtainStyledAttributes.recycle();
                dimensionPixelSize = dimensionPixelSize2;
            } else {
                dimensionPixelSize = typedArray.getDimensionPixelSize(i11, -1);
            }
        }
        return dimensionPixelSize;
    }

    @Override // androidx.appcompat.widget.h1, android.widget.TextView
    public final void setTextAppearance(Context context, int i10) {
        super.setTextAppearance(context, i10);
        TypedValue typedValueE = vd.a.E(context, launcher.powerkuy.growlauncher.R.attr.textAppearanceLineHeightEnabled);
        if (typedValueE != null && typedValueE.type == 18 && typedValueE.data == 0) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(i10, w8.a.f19123r);
        int iD = d(getContext(), typedArrayObtainStyledAttributes, 1, 2);
        typedArrayObtainStyledAttributes.recycle();
        if (iD >= 0) {
            setLineHeight(iD);
        }
    }
}
