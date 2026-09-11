package zc;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o4 f20945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f20946b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f20949e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f20947c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f20948d = Long.MAX_VALUE;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f20950f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f20951g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f20952h = -1;

    public l0(o4 o4Var) {
        this.f20945a = o4Var;
    }

    public final long a() throws IOException {
        if (this.f20950f != 2) {
            throw new IllegalStateException("Unexpected call to beginMessage()");
        }
        int i10 = this.f20949e + 1;
        this.f20949e = i10;
        if (i10 > 65) {
            throw new IOException("Wire recursion limit exceeded");
        }
        long j = this.f20952h;
        this.f20952h = -1L;
        this.f20950f = 6;
        return j;
    }

    public final void b(int i10) throws IOException {
        while (this.f20947c < this.f20948d) {
            o4 o4Var = this.f20945a;
            if (o4Var.p()) {
                break;
            }
            int iK = k();
            if (iK == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iK >> 3;
            int i12 = iK & 7;
            if (i12 == 0) {
                this.f20950f = 0;
                g();
            } else if (i12 == 1) {
                this.f20950f = 1;
                i();
            } else if (i12 == 2) {
                long jK = k();
                this.f20947c += jK;
                o4Var.V(jK);
            } else if (i12 == 3) {
                b(i11);
            } else if (i12 == 4) {
                if (i11 != i10) {
                    throw new ProtocolException("Unexpected end group");
                }
                return;
            } else {
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i12)));
                }
                this.f20950f = 5;
                h();
            }
        }
        throw new EOFException();
    }

    public final void c(long j) throws IOException {
        if (this.f20950f != 6) {
            throw new IllegalStateException("Unexpected call to endMessage()");
        }
        int i10 = this.f20949e - 1;
        this.f20949e = i10;
        if (i10 < 0 || this.f20952h != -1) {
            throw new IllegalStateException("No corresponding call to beginMessage()");
        }
        if (this.f20947c == this.f20948d || i10 == 0) {
            this.f20948d = j;
            return;
        }
        throw new IOException("Expected to end at " + this.f20948d + " but was " + this.f20947c);
    }

    public final int d() throws IOException {
        int i10 = this.f20950f;
        if (i10 == 7) {
            this.f20950f = 2;
            return this.f20951g;
        }
        if (i10 != 6) {
            throw new IllegalStateException("Unexpected call to nextTag()");
        }
        while (this.f20947c < this.f20948d && !this.f20945a.p()) {
            int iK = k();
            if (iK == 0) {
                throw new ProtocolException("Unexpected tag 0");
            }
            int i11 = iK >> 3;
            this.f20951g = i11;
            int i12 = iK & 7;
            if (i12 == 0) {
                this.f20946b = 1;
                this.f20950f = 0;
                return i11;
            }
            if (i12 == 1) {
                this.f20946b = 2;
                this.f20950f = 1;
                return i11;
            }
            if (i12 == 2) {
                this.f20946b = 3;
                this.f20950f = 2;
                int iK2 = k();
                if (iK2 < 0) {
                    throw new ProtocolException("Negative length: ".concat(String.valueOf(iK2)));
                }
                if (this.f20952h != -1) {
                    throw new IllegalStateException();
                }
                long j = this.f20948d;
                this.f20952h = j;
                long j10 = this.f20947c + ((long) iK2);
                this.f20948d = j10;
                if (j10 <= j) {
                    return this.f20951g;
                }
                throw new EOFException();
            }
            if (i12 != 3) {
                if (i12 == 4) {
                    throw new ProtocolException("Unexpected end group");
                }
                if (i12 != 5) {
                    throw new ProtocolException("Unexpected field encoding: ".concat(String.valueOf(i12)));
                }
                this.f20946b = 4;
                this.f20950f = 5;
                return i11;
            }
            b(i11);
        }
        return -1;
    }

    public final void e(int i10) throws IOException {
        if (this.f20950f == i10) {
            this.f20950f = 6;
            return;
        }
        long j = this.f20947c;
        long j10 = this.f20948d;
        if (j > j10) {
            throw new IOException("Expected to end at " + this.f20948d + " but was " + this.f20947c);
        }
        if (j != j10) {
            this.f20950f = 7;
            return;
        }
        this.f20948d = this.f20952h;
        this.f20952h = -1L;
        this.f20950f = 6;
    }

    public final int f() throws IOException {
        int i10 = this.f20950f;
        if (i10 == 0 || i10 == 2) {
            int iK = k();
            e(0);
            return iK;
        }
        throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f20950f);
    }

    public final long g() throws IOException {
        int i10 = this.f20950f;
        if (i10 != 0 && i10 != 2) {
            throw new ProtocolException("Expected VARINT or LENGTH_DELIMITED but was " + this.f20950f);
        }
        long j = 0;
        for (int i11 = 0; i11 < 64; i11 += 7) {
            this.f20947c++;
            byte bY = this.f20945a.y();
            j |= ((long) (bY & 127)) << i11;
            if ((bY & 128) == 0) {
                e(0);
                return j;
            }
        }
        throw new ProtocolException("WireInput encountered a malformed varint");
    }

    public final int h() throws IOException {
        int i10 = this.f20950f;
        if (i10 != 5 && i10 != 2) {
            throw new ProtocolException("Expected FIXED32 or LENGTH_DELIMITED but was " + this.f20950f);
        }
        o4 o4Var = this.f20945a;
        o4Var.D(4L);
        this.f20947c += 4;
        int iF = o4Var.f();
        e(5);
        return iF;
    }

    public final long i() throws IOException {
        int i10 = this.f20950f;
        if (i10 != 1 && i10 != 2) {
            throw new ProtocolException("Expected FIXED64 or LENGTH_DELIMITED but was " + this.f20950f);
        }
        o4 o4Var = this.f20945a;
        o4Var.D(8L);
        this.f20947c += 8;
        long jT = o4Var.T();
        e(1);
        return jT;
    }

    public final long j() throws ProtocolException {
        if (this.f20950f != 2) {
            throw new ProtocolException("Expected LENGTH_DELIMITED but was " + this.f20950f);
        }
        long j = this.f20948d - this.f20947c;
        this.f20945a.D(j);
        this.f20950f = 6;
        this.f20947c = this.f20948d;
        this.f20948d = this.f20952h;
        this.f20952h = -1L;
        return j;
    }

    public final int k() throws ProtocolException {
        int i10;
        this.f20947c++;
        o4 o4Var = this.f20945a;
        byte bY = o4Var.y();
        if (bY >= 0) {
            return bY;
        }
        int i11 = bY & 127;
        this.f20947c++;
        byte bY2 = o4Var.y();
        if (bY2 >= 0) {
            i10 = bY2 << 7;
        } else {
            i11 |= (bY2 & 127) << 7;
            this.f20947c++;
            byte bY3 = o4Var.y();
            if (bY3 >= 0) {
                i10 = bY3 << 14;
            } else {
                i11 |= (bY3 & 127) << 14;
                this.f20947c++;
                byte bY4 = o4Var.y();
                if (bY4 < 0) {
                    this.f20947c++;
                    byte bY5 = o4Var.y();
                    int i12 = i11 | ((bY4 & 127) << 21) | (bY5 << 28);
                    if (bY5 < 0) {
                        for (int i13 = 0; i13 < 5; i13++) {
                            this.f20947c++;
                            if (o4Var.y() < 0) {
                            }
                        }
                        throw new ProtocolException("Malformed VARINT");
                    }
                    return i12;
                }
                i10 = bY4 << 21;
            }
        }
        return i10 | i11;
    }
}
