package ia;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f8174a;

    public c(byte[] bArr) {
        this.f8174a = bArr;
    }

    @Override // ia.y
    public final String a() {
        return "logs";
    }

    @Override // ia.y
    public final InputStream b() {
        byte[] bArr = this.f8174a;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        return new ByteArrayInputStream(bArr);
    }

    @Override // ia.y
    public final ka.a0 c() {
        byte[] byteArray;
        byte[] bArr = this.f8174a;
        if (bArr == null || bArr.length == 0) {
            byteArray = null;
        } else {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    try {
                        gZIPOutputStream.write(bArr);
                        gZIPOutputStream.finish();
                        byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                    } finally {
                    }
                } finally {
                }
            } catch (IOException unused) {
                byteArray = null;
            }
        }
        if (byteArray == null) {
            return null;
        }
        return new ka.a0("logs_file", byteArray);
    }
}
