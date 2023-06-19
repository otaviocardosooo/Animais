import java.util.Scanner;

public class Animal{
    String Nome;
    int Idade;
    String Genero;
    double Peso;
    String Cor;
    String Tutor;

    // GET
    public void setNome(String nome){
        Nome = nome;
    }

    public void setIdade(int idade){
        Idade = idade;
    }

    public void setGenero(String genero){
        Genero = genero;
    }

    public void setPeso(double peso){
        Peso = peso;
    }

    public void setCor(String cor){
        Cor = cor;
    }

    public void setTutor(String tutor){
        Tutor = tutor;
    }

    // GET

    public String getNome(){
        return Nome;
    }

    public int getIdade(){
        return Idade;
    }

    public String getGenero(){
        return Genero;
    }

    public double getPeso(){
        return Peso;
    }

    public String getCor(){
        return Cor;
    }

    public String getTutor(){
        return Tutor;
    }

    // SALVAR DADOS

    public void salvar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite nome do seu animal:");
        Nome = ler.next();
        this.setNome(Nome);

        System.out.println("Digite a idade do seu animal:");
        Idade = ler.nextInt();
        this.setIdade(Idade);

        System.out.println("Digite o gênero do seu animal:");
        Genero = ler.next();
        this.setGenero(Genero);

        System.out.println("Digite o peso do seu animal:");
        Peso = ler.nextDouble();
        this.setPeso(Peso);

        System.out.println("Digite a cor do seu animal:")
        Cor = ler.next();
        this.setCor(Cor);

        System.out.println("Digite o nome do tutor:");
        Tutor = ler.next();
        this.setTutor(Tutor);
    }

    // EXIBIR DADOS

    public String exibirDados(){
        return "Nome: "+Nome+
                "\nIdade: "+Idade+
                "\nGênero: "+Genero+
                "\nPeso: "+Peso+
                "\nCor: "+Cor+
                "\nTutor: "+Tutor;
    }
}