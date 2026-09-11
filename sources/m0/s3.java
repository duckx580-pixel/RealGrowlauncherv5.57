package m0;

import com.rtsoft.growtopia.R;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class s3 extends kotlin.jvm.internal.m implements eh.f {
    public final /* synthetic */ n6 A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public final /* synthetic */ g1.k0 E;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ String f11235i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f11236r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f11237s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ k2.d0 f11238t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ x.l f11239u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ boolean f11240v;
    public final /* synthetic */ eh.e w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ eh.e f11241x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ eh.e f11242y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ eh.e f11243z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(String str, boolean z3, boolean z10, k2.d0 d0Var, x.l lVar, boolean z11, eh.e eVar, eh.e eVar2, eh.e eVar3, eh.e eVar4, n6 n6Var, int i10, int i11, int i12, g1.k0 k0Var) {
        super(3);
        this.f11235i = str;
        this.f11236r = z3;
        this.f11237s = z10;
        this.f11238t = d0Var;
        this.f11239u = lVar;
        this.f11240v = z11;
        this.w = eVar;
        this.f11241x = eVar2;
        this.f11242y = eVar3;
        this.f11243z = eVar4;
        this.A = n6Var;
        this.B = i10;
        this.C = i11;
        this.D = i12;
        this.E = k0Var;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // eh.f
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        eh.e eVar = (eh.e) obj;
        o0.o oVar = (o0.o) obj2;
        int iIntValue = ((Number) obj3).intValue();
        kotlin.jvm.internal.l.f("innerTextField", eVar);
        if ((iIntValue & 14) == 0) {
            iIntValue |= oVar.h(eVar) ? 4 : 2;
        }
        if ((iIntValue & 91) == 18 && oVar.D()) {
            oVar.P();
        } else {
            q3 q3Var = q3.f11161a;
            int i10 = this.C;
            int i11 = this.D;
            boolean z3 = this.f11236r;
            boolean z10 = this.f11240v;
            x.l lVar = this.f11239u;
            n6 n6Var = this.A;
            w0.a aVarB = w0.f.b(oVar, 2108828640, new r3(z3, z10, lVar, n6Var, this.E, this.B, i10, i11));
            int i12 = this.B;
            int i13 = ((iIntValue << 3) & R.styleable.AppCompatTheme_windowActionBarOverlay) | (i12 & 14) | ((i12 >> 3) & 896);
            int i14 = this.C;
            int i15 = this.D;
            int i16 = i12 << 3;
            int i17 = i13 | ((i14 >> 12) & 7168) | (i14 & 57344) | ((i15 << 15) & 458752) | ((i14 << 9) & 3670016) | (29360128 & i16) | (234881024 & i16) | (i16 & 1879048192);
            int i18 = ((i12 >> 27) & 14) | 14155776;
            int i19 = i14 << 3;
            q3Var.b(this.f11235i, eVar, z3, this.f11237s, this.f11238t, lVar, z10, this.w, this.f11241x, this.f11242y, this.f11243z, n6Var, null, aVarB, oVar, i17, i18 | (i19 & R.styleable.AppCompatTheme_windowActionBarOverlay) | (i19 & 896) | (i19 & 7168) | ((i15 << 6) & 57344));
        }
        return qg.o.f13926a;
    }
}
