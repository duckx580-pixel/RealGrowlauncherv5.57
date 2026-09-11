package launcher.powerkuy.growlauncher;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public class LuaBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String stringExtra;
        if (!"com.growlauncher.RUN_LUA".equals(intent.getAction()) || (stringExtra = intent.getStringExtra("script")) == null) {
            return;
        }
        launcher.powerkuy.growlauncher.luamanager.LuaManager.Execute(stringExtra);
    }
}
