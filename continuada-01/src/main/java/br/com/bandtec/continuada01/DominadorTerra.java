package br.com.bandtec.continuada01;

public class DominadorTerra extends Dominador {
    public DominadorTerra(String nome, String habilidade, Integer vida) {
        super(nome, habilidade, vida);
    }

    public Double aplicarPoder(Dominador oponente) {
        Double qtdDano = 0.0;
        if (oponente instanceof DominadorTerra){
            qtdDano = 50.0;
        }else if (oponente instanceof DominadorAgua){
            qtdDano = 80.0;
        }else if (oponente instanceof DominadorAr){
            qtdDano = 20.0;
        }else if (oponente instanceof DominadorFogo){
            qtdDano = 30.0;
        }
        return qtdDano;
    }
}
