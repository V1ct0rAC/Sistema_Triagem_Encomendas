package br.com.logistica;

public class Cliente {
    private String noma;
    private String endereco;

    public String getNoma() {
        return noma;
    }

    public String getEndereco() {
        return endereco;
    }

    public Cliente(String noma, String endereco) {
        this.noma = noma;
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Cliente: "+ noma + " Endereço: " + endereco;

    }
}
