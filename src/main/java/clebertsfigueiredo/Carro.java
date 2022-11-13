package clebertsfigueiredo;

public class Carro {

    private String status;
    private String marca;
    private String modelo;
    private int velocidadeAtual;
    private int ano;


    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;

        this.descricao();
        System.out.println("----------------------------");
        System.out.println();
        this.parar();
    }


    public String pegaStatus() {
        return this.status;
    }


    public void descricao() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
    }

    public void acelerar() {
        this.velocidadeAtual += 2;
        this.status = "O carro está andando à " + this.velocidadeAtual + " Km/h";
        System.out.println("O carro acelerou a velocidade");
    }

    public void reduzir() {
        this.velocidadeAtual -= 2;
        this.status = "O carro está andando à " + this.velocidadeAtual + " Km/h";
        System.out.println("O carro reduziu a velocidade");
    }

    public void parar() {
        this.velocidadeAtual = 0;
        this.status = "O carro está parado";
        System.out.println("O carro parou");
    }

}
