package s8;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import android.content.Context;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends d1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public long f15473t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f15474u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AccountManager f15475v;
    public Boolean w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public long f15476x;

    public final boolean A() {
        Account[] result;
        t();
        y0 y0Var = (y0) this.f3470r;
        g8.a aVar = y0Var.D;
        i0 i0Var = y0Var.f15665y;
        Context context = y0Var.f15658i;
        aVar.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.f15476x > 86400000) {
            this.w = null;
        }
        Boolean bool = this.w;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (i3.f.a(context, "android.permission.GET_ACCOUNTS") != 0) {
            y0.k(i0Var);
            i0Var.A.b("Permission error checking for dasher/unicorn accounts");
            this.f15476x = jCurrentTimeMillis;
            this.w = Boolean.FALSE;
            return false;
        }
        if (this.f15475v == null) {
            this.f15475v = AccountManager.get(context);
        }
        try {
            result = this.f15475v.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
        } catch (AuthenticatorException e8) {
            e = e8;
            y0.k(i0Var);
            i0Var.f15411x.c("Exception checking account types", e);
        } catch (OperationCanceledException e10) {
            e = e10;
            y0.k(i0Var);
            i0Var.f15411x.c("Exception checking account types", e);
        } catch (IOException e11) {
            e = e11;
            y0.k(i0Var);
            i0Var.f15411x.c("Exception checking account types", e);
        }
        if (result != null && result.length > 0) {
            this.w = Boolean.TRUE;
            this.f15476x = jCurrentTimeMillis;
            return true;
        }
        Account[] result2 = this.f15475v.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
        if (result2 != null && result2.length > 0) {
            this.w = Boolean.TRUE;
            this.f15476x = jCurrentTimeMillis;
            return true;
        }
        this.f15476x = jCurrentTimeMillis;
        this.w = Boolean.FALSE;
        return false;
    }

    @Override // s8.d1
    public final boolean u() {
        Calendar calendar = Calendar.getInstance();
        this.f15473t = TimeUnit.MINUTES.convert(calendar.get(16) + calendar.get(15), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f15474u = s.h0.k(language.toLowerCase(locale2), "-", locale.getCountry().toLowerCase(locale2));
        return false;
    }

    public final long x() {
        t();
        return this.f15476x;
    }

    public final long y() {
        v();
        return this.f15473t;
    }

    public final String z() {
        v();
        return this.f15474u;
    }
}
