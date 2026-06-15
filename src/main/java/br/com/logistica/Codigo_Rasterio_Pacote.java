package br.com.logistica;

public class Codigo_Rasterio_Pacote implements Comparable<Codigo_Rasterio_Pacote> {
    private String codigoRastrio;

    public Codigo_Rasterio_Pacote(String codigoRastrio) {
        this.codigoRastrio = codigoRastrio;
    }

    @Override
    public int compareTo(Codigo_Rasterio_Pacote codigoRasterioPacote) {
        return codigoRastrio.compareTo(codigoRasterioPacote.codigoRastrio);
    }

    @Override
    public String toString() {
        return "Codigo de rastreio= " + this.codigoRastrio;
    }
}
