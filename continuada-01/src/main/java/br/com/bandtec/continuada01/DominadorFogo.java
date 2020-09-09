package br.com.bandtec.continuada01;

public class DominadorFogo extends Dominador {
    public DominadorFogo(String nome, String habilidade, Integer vida) {
        super(nome, habilidade, vida);
    }

    public Double aplicarPoder(Dominador oponente) {
        Double qtdDano = 0.0;
        if (oponente instanceof DominadorTerra){
            qtdDano = 60.0;
        }else if (oponente instanceof DominadorAgua){
            qtdDano = 30.0;
        }else if (oponente instanceof DominadorAr){
            qtdDano = 40.0;
        }else if (oponente instanceof DominadorFogo){
            qtdDano = 50.0;
        }
        return qtdDano;
    }
}
