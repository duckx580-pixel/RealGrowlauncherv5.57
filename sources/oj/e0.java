package oj;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends d {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Socket f13074m;

    public e0(Socket socket) {
        this.f13074m = socket;
    }

    @Override // oj.d
    public final void j() {
        Socket socket = this.f13074m;
        try {
            socket.close();
        } catch (AssertionError e8) {
            if (!jj.d.v(e8)) {
                throw e8;
            }
            u.f13111a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e8);
        } catch (Exception e10) {
            u.f13111a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e10);
        }
    }

    public final IOException k(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
