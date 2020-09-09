package br.com.bandtec.continuada01;

public abstract class DominadorController {

    private String nome;
    private String habilidade;
    private Integer vida;

    public DominadorController(String nome, String habilidade, Integer vida) {
        this.nome = nome;
        this.habilidade = habilidade;
        this.vida = vida;
    }

    public abstract Double aplicarPoder(DominadorController oponente);

    public String getNome() {
        return nome;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public Integer getVida() {
        return vida;
    }

    @Override
    public String toString() {
        return "Dominadores{" +
                "nome='" + nome + '\'' +
                ", habilidade='" + habilidade + '\'' +
                ", vida=" + vida +
                '}';
    }
}
