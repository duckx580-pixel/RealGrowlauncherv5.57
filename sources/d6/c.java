package d6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import b6.q;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j6.m f4945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f4946c;

    public /* synthetic */ c(Object obj, j6.m mVar, int i10) {
        this.f4944a = i10;
        this.f4946c = obj;
        this.f4945b = mVar;
    }

    @Override // d6.h
    public final Object a(ug.c cVar) {
        int i10 = this.f4944a;
        Object obj = this.f4946c;
        j6.m mVar = this.f4945b;
        switch (i10) {
            case 0:
                return new e(new BitmapDrawable(mVar.f8843a.getResources(), (Bitmap) obj), false, b6.f.f2728r);
            case 1:
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                try {
                    oj.g gVar = new oj.g();
                    gVar.write(byteBuffer);
                    byteBuffer.position(0);
                    Context context = mVar.f8843a;
                    return new n(new q(gVar, null), null, b6.f.f2728r);
                } catch (Throwable th2) {
                    byteBuffer.position(0);
                    throw th2;
                }
            default:
                Drawable bitmapDrawable = (Drawable) obj;
                Bitmap.Config[] configArr = n6.e.f12134a;
                boolean z3 = (bitmapDrawable instanceof VectorDrawable) || (bitmapDrawable instanceof h5.a);
                if (z3) {
                    bitmapDrawable = new BitmapDrawable(mVar.f8843a.getResources(), qd.a.f(bitmapDrawable, mVar.f8844b, mVar.f8846d, mVar.f8847e, mVar.f8848f));
                }
                return new e(bitmapDrawable, z3, b6.f.f2728r);
        }
    }
}
