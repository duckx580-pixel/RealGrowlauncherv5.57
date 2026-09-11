package t6;

import com.usercentrics.sdk.models.settings.PredefinedUICustomizationFont;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public abstract class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f16923b = sb.c.D("af_achievement_unlocked", "af_ad_click", "af_ad_view", "af_add_payment_info", "af_add_to_cart", "af_add_to_wishlist", "af_complete_registration", "af_content_view", "af_initiated_checkout", "af_invite", "af_level_achieved", "af_list_view", "af_login", "af_opened_from_push_notification", "af_purchase", "af_rate", "af_re_engage", "af_search", "af_share", "af_spent_credits", "af_start_trial", "af_subscribe", "af_travel_booking", "af_tutorial_completion", "af_update");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16924a;

    public m1(String str) {
        kotlin.jvm.internal.l.f(PredefinedUICustomizationFont.defaultFamily, str);
        this.f16924a = str;
    }
}
