package j8;

import android.os.IBinder;
import android.os.IInterface;
import b8.a0;
import java.lang.reflect.Field;
import k0.g;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m8.a implements a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f8868e;

    public b(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", 2);
        this.f8868e = obj;
    }

    public static a B(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new c(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", 3);
    }

    public static Object C(a aVar) {
        if (aVar instanceof b) {
            return ((b) aVar).f8868e;
        }
        IBinder iBinderAsBinder = aVar.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i10 = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i10++;
                field = field2;
            }
        }
        if (i10 != 1) {
            throw new IllegalArgumentException(g.d(declaredFields.length, "Unexpected number of IObjectWrapper declared fields: "));
        }
        a0.h(field);
        if (field.isAccessible()) {
            throw new IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e8) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e8);
        } catch (NullPointerException e10) {
            throw new IllegalArgumentException("Binder object is null.", e10);
        }
    }
}
