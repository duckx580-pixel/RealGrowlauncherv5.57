package n9;

/* JADX INFO: compiled from: r8-map-id-cf66f36031e302b9a7b5a76da57d208ae1b6ba4a38bba3bee1d4ed6983c54df3 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends qj.b {
    @Override // qj.b
    public final void m(u uVar, float f9, float f10) {
        uVar.d(f10 * f9, 180.0f, 90.0f);
        float f11 = f10 * 2.0f * f9;
        q qVar = new q(0.0f, 0.0f, f11, f11);
        qVar.f12255f = 180.0f;
        qVar.f12256g = 90.0f;
        uVar.f12266f.add(qVar);
        o oVar = new o(qVar);
        uVar.a(180.0f);
        uVar.f12267g.add(oVar);
        uVar.f12264d = 270.0f;
        float f12 = (0.0f + f11) * 0.5f;
        float f13 = (f11 - 0.0f) / 2.0f;
        double d10 = 270.0f;
        uVar.f12262b = (((float) Math.cos(Math.toRadians(d10))) * f13) + f12;
        uVar.f12263c = (f13 * ((float) Math.sin(Math.toRadians(d10)))) + f12;
    }
}
