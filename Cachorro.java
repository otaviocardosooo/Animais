import java.util.Scanner;

public class Cachorro extends Animal{
    String Raca;
    String Pelo;

    // SET 
    public void setRaca(String raca){
        Raca = raca;
    }

    public void setPelo(String pelo){
        Pelo = pelo;
    }

    // GET

    public String getRaca(){
        return Raca;
    }

    public String getPelo(){
        return Pelo;
    }

    // SALVAR DADOS

    public void salvar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a raça do seu cachorro:");
        Raca = ler.next();
        this.setRaca(Raca);

        System.out.println("Digite o tipo de pelo do seu cachorro:");
        Pelo = ler.next();
        this.setPelo(Pelo);
    }

    // EXIBIR DADOS

    public String exibirDados(){
        return "Nome: "+Nome+
                "\nIdade: "+Idade+
                "\nGênero: "+Genero+
                "\nPeso: "+Peso+
                "\nCor: "+Cor+
                "\nTutor: "+Tutor+
                "\nRaça: "+Raca+
                "\nPelo: "+Pelo;
    }
}
