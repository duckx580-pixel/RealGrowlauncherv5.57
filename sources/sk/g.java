package sk;

import com.usercentrics.sdk.extensions.TimeExtensionsKt;
import java.io.PrintStream;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public interface g {
    public static final int A;
    public static final boolean B;
    public static final boolean C;
    public static final int D;
    public static final int E;
    public static final int F;
    public static final PrintStream G;
    public static final boolean H;
    public static final boolean I;
    public static final boolean J;
    public static final boolean K;
    public static final boolean L;
    public static final boolean M;
    public static final boolean N;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f15867a = e.e(-1, "joni.regex_max_length");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f15868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f15869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f15870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f15871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f15872f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f15873g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final boolean f15874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f15875i;
    public static final boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final boolean f15876k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final boolean f15877l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final boolean f15878m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final boolean f15879n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final boolean f15880o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final boolean f15881p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final boolean f15882q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final boolean f15883r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final boolean f15884s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f15885t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f15886u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f15887v;
    public static final int w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f15888x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final boolean f15889y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final boolean f15890z;

    static {
        int iE = e.e(256, "joni.char_table_size");
        f15868b = iE;
        boolean z3 = true;
        f15869c = e.d("joni.use_no_invalid_quantifier", true);
        f15870d = e.e(8, "joni.scanenv_memnodes_size");
        f15871e = e.d("joni.use_named_group", true);
        f15872f = e.d("joni.use_subexp_call", true);
        f15873g = e.d("joni.use_perl_subexp_call", true);
        f15874h = e.d("joni.use_backref_with_level", true);
        f15875i = e.d("joni.use_monomaniac_check_captures_in_endless_repeat", true);
        j = e.d("joni.use_newline_at_end_of_string_has_empty_line", true);
        f15876k = e.d("joni.use_warning_redundant_nested_repeat_operator", true);
        f15877l = e.d("joni.case_fold_is_applied_inside_negative_cclass", true);
        f15878m = e.d("joni.use_match_range_must_be_inside_of_specified_range", false);
        f15879n = e.d("joni.use_capture_history", false);
        f15880o = e.d("joni.use_variable_meta_chars", true);
        f15881p = e.d("joni.use_word_begin_end", true);
        f15882q = e.d("joni.use_find_longest_search_all_of_range", true);
        f15883r = e.d("joni.use_sunday_quick_search", true);
        f15884s = e.d("joni.use_cec", false);
        e.d("joni.use_dynamic_option", false);
        f15885t = e.d("joni.use_byte_map", 24 <= iE);
        e.d("joni.use_int_map_backward", false);
        e.e(10, "joni.nregion");
        f15886u = e.e(TimeExtensionsKt.MILLIS_PER_SECOND, "joni.max_backref_num");
        f15887v = e.e(32767, "joni.max_capture_group_num");
        w = e.e(100000, "joni.max_multi_byte_ranges_num");
        f15888x = e.e(10000, "joni.max_multi_byte_ranges_num");
        f15889y = e.d("joni.use_op_push_or_jump_exact", true);
        f15890z = e.d("joni.use_qtfr_peek_next", true);
        A = e.e(64, "joni.init_match_stack_size");
        B = !e.d("joni.optimize", true);
        C = e.d("joni.use_string_templates", true);
        D = e.e(31, "joni.max_capture_history_group");
        E = e.e(7, "joni.check_string_threshold_len");
        F = e.e(16384, "joni.check_buff_max_size");
        G = System.out;
        boolean zD = e.d("joni.debug.all", false);
        H = e.d("joni.debug", false) || zD;
        I = e.d("joni.debug.parse.tree", false) || zD;
        J = e.d("joni.debug.parse.tree.raw", true) || zD;
        K = e.d("joni.debug.compile", false) || zD;
        L = e.d("joni.debug.compile.bytecode.info", false) || zD;
        M = e.d("joni.debug.search", false) || zD;
        if (!e.d("joni.debug.match", false) && !zD) {
            z3 = false;
        }
        N = z3;
    }
}
