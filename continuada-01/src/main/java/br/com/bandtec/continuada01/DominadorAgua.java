package br.com.bandtec.continuada01;

public class DominadorAgua extends DominadorController {
    public DominadorAgua(String nome, String habilidade, Integer vida) {
        super(nome, habilidade, vida);
    }

    public Double aplicarPoder(DominadorController oponente) {
        Double qtdDano = 0.0;
        if (oponente instanceof DominadorTerra){
            qtdDano = 20.0;
        }else if (oponente instanceof DominadorAgua){
            qtdDano = 50.0;
        }else if (oponente instanceof DominadorAr){
            qtdDano = 50.0;
        }else if (oponente instanceof DominadorFogo){
            qtdDano = 80.0;
        }
        return qtdDano;
    }
}
