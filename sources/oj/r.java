package oj;

import io.mychips.nativesdk.domain.MCCampaignStatus;
import java.io.Closeable;
import java.io.RandomAccessFile;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class r implements Closeable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13107i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ReentrantLock f13109s = new ReentrantLock();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final RandomAccessFile f13110t;

    public r(RandomAccessFile randomAccessFile) {
        this.f13110t = randomAccessFile;
    }

    public final k a(long j) {
        ReentrantLock reentrantLock = this.f13109s;
        reentrantLock.lock();
        try {
            if (this.f13107i) {
                throw new IllegalStateException(MCCampaignStatus.CLOSED);
            }
            this.f13108r++;
            reentrantLock.unlock();
            return new k(this, j);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ReentrantLock reentrantLock = this.f13109s;
        reentrantLock.lock();
        try {
            if (this.f13107i) {
                return;
            }
            this.f13107i = true;
            if (this.f13108r != 0) {
                return;
            }
            synchronized (this) {
                this.f13110t.close();
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final long size() {
        long length;
        ReentrantLock reentrantLock = this.f13109s;
        reentrantLock.lock();
        try {
            if (this.f13107i) {
                throw new IllegalStateException(MCCampaignStatus.CLOSED);
            }
            synchronized (this) {
                length = this.f13110t.length();
            }
            return length;
        } finally {
            reentrantLock.unlock();
        }
    }
}
