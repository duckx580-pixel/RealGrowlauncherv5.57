package t;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends wg.i implements eh.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f16061i;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16062r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f16063s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Object f16064t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(int i10, Object obj, ug.c cVar) {
        super(2, cVar);
        this.f16061i = i10;
        this.f16064t = obj;
    }

    /* JADX WARN: Type inference failed for: r1v13, types: [eh.e, wg.i] */
    @Override // wg.a
    public final ug.c create(Object obj, ug.c cVar) {
        switch (this.f16061i) {
            case 0:
                d1 d1Var = new d1(0, (f1) this.f16064t, cVar);
                d1Var.f16063s = obj;
                return d1Var;
            case 1:
                d1 d1Var2 = new d1(1, (mf.c) this.f16064t, cVar);
                d1Var2.f16063s = obj;
                return d1Var2;
            case 2:
                return new d1((rh.h) this.f16063s, (mf.c) this.f16064t, cVar, 2);
            case 3:
                d1 d1Var3 = new d1(3, (t4.c0) this.f16064t, cVar);
                d1Var3.f16063s = obj;
                return d1Var3;
            case 4:
                return new d1((t4.p0) this.f16063s, (t4.h1) this.f16064t, cVar, 4);
            case 5:
                return new d1((t4.p0) this.f16063s, (qh.d) this.f16064t, cVar, 5);
            case 6:
                return new d1((qh.d) this.f16063s, (eh.e) this.f16064t, cVar);
            case 7:
                d1 d1Var4 = new d1(7, (u.d) this.f16064t, cVar);
                d1Var4.f16063s = obj;
                return d1Var4;
            case 8:
                d1 d1Var5 = new d1(8, (u.f) this.f16064t, cVar);
                d1Var5.f16063s = obj;
                return d1Var5;
            case 9:
                return new d1((x.l) this.f16063s, (x.j) this.f16064t, cVar, 9);
            case 10:
                d1 d1Var6 = new d1(10, (u2.s) this.f16064t, cVar);
                d1Var6.f16063s = obj;
                return d1Var6;
            case 11:
                d1 d1Var7 = new d1(11, (u4.b) this.f16064t, cVar);
                d1Var7.f16063s = obj;
                return d1Var7;
            case 12:
                d1 d1Var8 = new d1(12, (v.l0) this.f16064t, cVar);
                d1Var8.f16063s = obj;
                return d1Var8;
            case 13:
                d1 d1Var9 = new d1(13, (v.k) this.f16064t, cVar);
                d1Var9.f16063s = obj;
                return d1Var9;
            case 14:
                d1 d1Var10 = new d1(14, (v.s0) this.f16064t, cVar);
                d1Var10.f16063s = obj;
                return d1Var10;
            case 15:
                return new d1((o0.l1) this.f16063s, (View) this.f16064t, cVar, 15);
            case 16:
                return new d1((rh.f1) this.f16063s, (w1.o1) this.f16064t, cVar, 16);
            default:
                return new d1((z5.h) this.f16063s, (j6.i) this.f16064t, cVar, 17);
        }
    }

    @Override // eh.e
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f16061i) {
            case 0:
                ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
                return vg.a.f18663i;
            case 1:
                return ((d1) create((rh.i) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 2:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 3:
                return ((d1) create((t4.h1) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 4:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 5:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 6:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 7:
                return ((d1) create((q1.b0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 8:
                return ((d1) create((q1.b0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 9:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 10:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 11:
                return ((d1) create((t4.v0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 12:
                return ((d1) create((q1.b0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 13:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 14:
                return ((d1) create((q1.b0) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 15:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
            case 16:
                ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
                return vg.a.f18663i;
            default:
                return ((d1) create((oh.w) obj, (ug.c) obj2)).invokeSuspend(qg.o.f13926a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Path cross not found for [B:124:0x0217, B:126:0x021b], limit reached: 255 */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0225  */
    /* JADX WARN: Type inference failed for: r1v39, types: [ae.c] */
    /* JADX WARN: Type inference failed for: r2v15, types: [eh.e, wg.i] */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v6, types: [ug.c] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.concurrent.CancellationException] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0200 -> B:122:0x0203). Please report as a decompilation issue!!! */
    @Override // wg.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d1(Object obj, Object obj2, ug.c cVar, int i10) {
        super(2, cVar);
        this.f16061i = i10;
        this.f16063s = obj;
        this.f16064t = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public d1(qh.d dVar, eh.e eVar, ug.c cVar) {
        super(2, cVar);
        this.f16061i = 6;
        this.f16063s = dVar;
        this.f16064t = (wg.i) eVar;
    }
}
