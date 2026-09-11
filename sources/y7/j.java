package y7;

import b8.a0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements Callable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f20194i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ String f20195r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ m f20196s;

    public /* synthetic */ j(boolean z3, String str, m mVar) {
        this.f20194i = z3;
        this.f20195r = str;
        this.f20196s = mVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z3 = this.f20194i;
        String str = this.f20195r;
        m mVar = this.f20196s;
        String str2 = (z3 || !o.a(str, mVar, true, false).f20214a) ? "not allowed" : "debug cert rejected";
        int i10 = 0;
        while (true) {
            if (i10 >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                break;
            }
            i10++;
        }
        a0.h(messageDigest);
        byte[] bArrDigest = messageDigest.digest(mVar.f20201f);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i11 = 0;
        for (byte b4 : bArrDigest) {
            int i12 = i11 + 1;
            char[] cArr2 = g8.b.f7136b;
            cArr[i11] = cArr2[(b4 & 255) >>> 4];
            i11 += 2;
            cArr[i12] = cArr2[b4 & 15];
        }
        return str2 + ": pkg=" + str + ", sha256=" + new String(cArr) + ", atk=" + z3 + ", ver=12451000.false";
    }
}
