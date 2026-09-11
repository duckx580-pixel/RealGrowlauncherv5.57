package wf;

import android.content.Context;
import android.content.res.Configuration;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.TypedValue;
import android.widget.ListView;
import android.widget.ProgressBar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f19219i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ k f19220r;

    public /* synthetic */ h(k kVar, int i10) {
        this.f19219i = i10;
        this.f19220r = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context;
        switch (this.f19219i) {
            case 0:
                final k kVar = this.f19220r;
                a aVar = kVar.M;
                uf.c cVar = kVar.E;
                ArrayList<cf.l> arrayList = kVar.J.f3490a;
                if (kVar.U) {
                    zf.a colorScheme = cVar.getColorScheme();
                    kotlin.jvm.internal.l.f("<this>", arrayList);
                    if (colorScheme == null) {
                        colorScheme = zf.a.f21333c;
                        kotlin.jvm.internal.l.e("getDefault(...)", colorScheme);
                    }
                    int iE = colorScheme.e(67);
                    for (cf.l lVar : arrayList) {
                        cf.m mVar = lVar.f3513e;
                        if (mVar != null && !(lVar.f3510b instanceof Spannable)) {
                            cf.i iVar = mVar.f3516b;
                            SpannableString spannableString = new SpannableString(lVar.f3510b);
                            int size = iVar.f3501b.size() - 1;
                            if (size >= 0) {
                                while (true) {
                                    int i10 = size - 1;
                                    int iIntValue = ((Number) iVar.f3501b.get(size)).intValue();
                                    if (iIntValue >= 0 && iIntValue < spannableString.length()) {
                                        int i11 = iIntValue + 1;
                                        int length = spannableString.length();
                                        if (i11 > length) {
                                            i11 = length;
                                        }
                                        if (i11 > iIntValue) {
                                            try {
                                                spannableString.setSpan(new ForegroundColorSpan(iE), iIntValue, i11, 33);
                                            } catch (Exception e8) {
                                                e8.printStackTrace();
                                            }
                                        }
                                    }
                                    if (i10 >= 0) {
                                        size = i10;
                                    }
                                }
                            }
                            lVar.f3510b = spannableString;
                            break;
                        }
                    }
                }
                WeakReference weakReference = kVar.K;
                if (weakReference == null || weakReference.get() != arrayList) {
                    aVar.f19198a = kVar;
                    aVar.f19199b = arrayList;
                    aVar.notifyDataSetInvalidated();
                    kVar.K = new WeakReference(arrayList);
                } else {
                    aVar.notifyDataSetChanged();
                }
                if (cVar.getProps().Y && (context = cVar.getContext()) != null) {
                    Configuration configuration = context.getResources().getConfiguration();
                    if ((configuration.keyboard != 1 || configuration.hardKeyboardHidden == 1) && kVar.L == -1) {
                        kVar.g();
                    }
                }
                float count = aVar.getCount() * ((int) TypedValue.applyDimension(1, 45.0f, aVar.f19198a.E.getContext().getResources().getDisplayMetrics()));
                if (count == 0.0f) {
                    kVar.f();
                }
                kVar.l(true);
                int i12 = kVar.C;
                int iMin = (int) Math.min(count, kVar.H);
                kVar.C = i12;
                kVar.D = iMin;
                kVar.a(false);
                cVar.a0(new h(kVar, 1), 10L);
                if (!kVar.f18654i.isShowing() && !kVar.F && kVar.S) {
                    kVar.Q = System.currentTimeMillis();
                    final long j = kVar.G;
                    cVar.a0(new Runnable() { // from class: wf.g
                        @Override // java.lang.Runnable
                        public final void run() {
                            k kVar2 = kVar;
                            if (kVar2.R >= kVar2.Q || kVar2.G != j || kVar2.f18654i.isShowing()) {
                                return;
                            }
                            kVar2.a(true);
                        }
                    }, 70L);
                    break;
                }
                break;
            case 1:
                u5.i iVar2 = this.f19220r.N;
                int i13 = 0;
                ((ListView) iVar2.f17666i).post(new b(iVar2, i13, i13));
                break;
            case 2:
                k kVar2 = this.f19220r;
                if (kVar2.T) {
                    ((ProgressBar) kVar2.N.f17667r).setVisibility(0);
                }
                break;
            default:
                this.f19220r.f();
                break;
        }
    }
}
