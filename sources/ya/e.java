package ya;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements va.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Charset f20227f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final va.c f20228g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final va.c f20229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final xa.a f20230i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public OutputStream f20231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f20233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final va.d f20234d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f20235e = new g(this);

    static {
        a aVar = new a(1);
        HashMap map = new HashMap();
        map.put(d.class, aVar);
        f20228g = new va.c("key", Collections.unmodifiableMap(new HashMap(map)));
        a aVar2 = new a(2);
        HashMap map2 = new HashMap();
        map2.put(d.class, aVar2);
        f20229h = new va.c("value", Collections.unmodifiableMap(new HashMap(map2)));
        f20230i = new xa.a(1);
    }

    public e(ByteArrayOutputStream byteArrayOutputStream, HashMap map, HashMap map2, va.d dVar) {
        this.f20231a = byteArrayOutputStream;
        this.f20232b = map;
        this.f20233c = map2;
        this.f20234d = dVar;
    }

    public static int h(va.c cVar) {
        d dVar = (d) ((Annotation) cVar.f18643b.get(d.class));
        if (dVar != null) {
            return ((a) dVar).f20223a;
        }
        throw new va.b("Field has no @Protobuf config");
    }

    @Override // va.e
    public final va.e a(va.c cVar, boolean z3) {
        d(cVar, z3 ? 1 : 0, true);
        return this;
    }

    @Override // va.e
    public final va.e b(va.c cVar, long j) throws IOException {
        if (j == 0) {
            return this;
        }
        d dVar = (d) ((Annotation) cVar.f18643b.get(d.class));
        if (dVar == null) {
            throw new va.b("Field has no @Protobuf config");
        }
        i(((a) dVar).f20223a << 3);
        j(j);
        return this;
    }

    @Override // va.e
    public final va.e c(va.c cVar, int i10) {
        d(cVar, i10, true);
        return this;
    }

    public final void d(va.c cVar, int i10, boolean z3) {
        if (z3 && i10 == 0) {
            return;
        }
        d dVar = (d) ((Annotation) cVar.f18643b.get(d.class));
        if (dVar == null) {
            throw new va.b("Field has no @Protobuf config");
        }
        i(((a) dVar).f20223a << 3);
        i(i10);
    }

    public final void e(va.c cVar, Object obj, boolean z3) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z3 && charSequence.length() == 0) {
                return;
            }
            i((h(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f20227f);
            i(bytes.length);
            this.f20231a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                e(cVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                g(f20230i, cVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            double dDoubleValue = ((Double) obj).doubleValue();
            if (z3 && dDoubleValue == 0.0d) {
                return;
            }
            i((h(cVar) << 3) | 1);
            this.f20231a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(dDoubleValue).array());
            return;
        }
        if (obj instanceof Float) {
            float fFloatValue = ((Float) obj).floatValue();
            if (z3 && fFloatValue == 0.0f) {
                return;
            }
            i((h(cVar) << 3) | 5);
            this.f20231a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(fFloatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long jLongValue = ((Number) obj).longValue();
            if (z3 && jLongValue == 0) {
                return;
            }
            d dVar = (d) ((Annotation) cVar.f18643b.get(d.class));
            if (dVar == null) {
                throw new va.b("Field has no @Protobuf config");
            }
            i(((a) dVar).f20223a << 3);
            j(jLongValue);
            return;
        }
        if (obj instanceof Boolean) {
            d(cVar, ((Boolean) obj).booleanValue() ? 1 : 0, z3);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z3 && bArr.length == 0) {
                return;
            }
            i((h(cVar) << 3) | 2);
            i(bArr.length);
            this.f20231a.write(bArr);
            return;
        }
        va.d dVar2 = (va.d) this.f20232b.get(obj.getClass());
        if (dVar2 != null) {
            g(dVar2, cVar, obj, z3);
            return;
        }
        va.f fVar = (va.f) this.f20233c.get(obj.getClass());
        if (fVar != null) {
            g gVar = this.f20235e;
            gVar.f20237a = false;
            gVar.f20239c = cVar;
            gVar.f20238b = z3;
            fVar.a(obj, gVar);
            return;
        }
        if (obj instanceof l7.c) {
            d(cVar, ((l7.c) obj).f9833i, true);
        } else if (obj instanceof Enum) {
            d(cVar, ((Enum) obj).ordinal(), true);
        } else {
            g(this.f20234d, cVar, obj, z3);
        }
    }

    @Override // va.e
    public final va.e f(va.c cVar, Object obj) {
        e(cVar, obj, true);
        return this;
    }

    public final void g(va.d dVar, va.c cVar, Object obj, boolean z3) throws IOException {
        b bVar = new b();
        bVar.f20224i = 0L;
        try {
            OutputStream outputStream = this.f20231a;
            this.f20231a = bVar;
            try {
                dVar.a(obj, this);
                this.f20231a = outputStream;
                long j = bVar.f20224i;
                bVar.close();
                if (z3 && j == 0) {
                    return;
                }
                i((h(cVar) << 3) | 2);
                j(j);
                dVar.a(obj, this);
            } catch (Throwable th2) {
                this.f20231a = outputStream;
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                bVar.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public final void i(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            this.f20231a.write((i10 & 127) | 128);
            i10 >>>= 7;
        }
        this.f20231a.write(i10 & 127);
    }

    public final void j(long j) throws IOException {
        while (((-128) & j) != 0) {
            this.f20231a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f20231a.write(((int) j) & 127);
    }
}
