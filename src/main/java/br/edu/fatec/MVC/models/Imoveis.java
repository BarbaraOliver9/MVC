package br.edu.fatec.MVC.models;

public class Imoveis {
    private int cod;
    private String bairro;
    private int metroQuadrado;
    private int valorAluguel;

    public Imoveis(int cod, String bairro, int metroQuadrado, int valorAluguel) {
        this.cod = cod;
        this.bairro = bairro;
        this.metroQuadrado = metroQuadrado;
        this.valorAluguel = valorAluguel;
    }

    // Métodos getters e setters

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public int getMetroQuadrado() {
        return metroQuadrado;
    }

    public void setMetroQuadrado(int metroQuadrado) {
        this.metroQuadrado = metroQuadrado;
    }

    public int getValorAluguel() {
        return valorAluguel;
    }

    public void setValorAluguel(int valorAluguel) {
        this.valorAluguel = valorAluguel;
    }
}
