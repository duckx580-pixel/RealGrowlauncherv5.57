package v4;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f18567a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f18568b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f18569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f18570d;

    public h(int i10, int i11, long j, long j10) {
        this.f18567a = i10;
        this.f18568b = i11;
        this.f18569c = j;
        this.f18570d = j10;
    }

    public static h a(File file) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            h hVar = new h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return hVar;
        } finally {
        }
    }

    public final void b(File file) throws IOException {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f18567a);
            dataOutputStream.writeInt(this.f18568b);
            dataOutputStream.writeLong(this.f18569c);
            dataOutputStream.writeLong(this.f18570d);
            dataOutputStream.close();
        } catch (Throwable th2) {
            try {
                dataOutputStream.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof h)) {
            h hVar = (h) obj;
            if (this.f18568b == hVar.f18568b && this.f18569c == hVar.f18569c && this.f18567a == hVar.f18567a && this.f18570d == hVar.f18570d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f18568b), Long.valueOf(this.f18569c), Integer.valueOf(this.f18567a), Long.valueOf(this.f18570d));
    }
}
