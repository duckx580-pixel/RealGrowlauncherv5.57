package com.google.android.material.datepicker;

import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.f1;
import java.util.WeakHashMap;
import launcher.powerkuy.growlauncher.R;
import s3.f0;
import s3.z0;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f4231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MaterialCalendarGridView f4232b;

    public q(LinearLayout linearLayout, boolean z3) {
        super(linearLayout);
        TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
        this.f4231a = textView;
        WeakHashMap weakHashMap = z0.f15140a;
        new f0(R.id.tag_accessibility_heading, Boolean.class, 0, 28, 3).g(textView, Boolean.TRUE);
        this.f4232b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
        if (z3) {
            return;
        }
        textView.setVisibility(8);
    }
}
