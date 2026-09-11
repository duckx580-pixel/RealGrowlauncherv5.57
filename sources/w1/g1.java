package w1;

import a1.m;
import android.view.DragEvent;
import android.view.View;
import androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class g1 implements View.OnDragListener, c1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c1.d f18818a = new c1.d();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q.f f18819b = new q.f(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener$modifier$1 f18820c = new v1.o0() { // from class: androidx.compose.ui.platform.DragAndDropModifierOnDragListener$modifier$1
        public final boolean equals(Object obj) {
            return obj == this;
        }

        @Override // v1.o0
        public final int hashCode() {
            return this.f1253a.f18818a.hashCode();
        }

        @Override // v1.o0
        public final m m() {
            return this.f1253a.f18818a;
        }

        @Override // v1.o0
        public final /* bridge */ /* synthetic */ void n(m mVar) {
        }
    };

    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        l5.o oVar = new l5.o(dragEvent);
        int action = dragEvent.getAction();
        c1.d dVar = this.f18818a;
        switch (action) {
            case 1:
                boolean zG0 = dVar.G0(oVar);
                q.f fVar = this.f18819b;
                fVar.getClass();
                q.a aVar = new q.a(fVar);
                while (aVar.hasNext()) {
                    ((c1.d) aVar.next()).M0(oVar);
                }
                break;
            case 2:
                dVar.L0(oVar);
                break;
            case 4:
                dVar.I0(oVar);
                break;
            case 5:
                dVar.J0(oVar);
                break;
            case 6:
                dVar.K0(oVar);
                break;
        }
        return false;
    }
}
