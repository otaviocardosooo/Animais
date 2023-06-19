import java.util.Scanner;

public class Gato extends Animal{
    String Raca;
    String Pelo;
    String Porte;

    // SET 

    public void setRaca(String raca){
        Raca = raca;
    }

    public void setPelo(String pelo){
        Pelo = pelo;
    }

    public void setPorte(String porte){
        Porte = porte;
    }

    // GET

    public String getRaca(){
        return Raca;
    }

    public String getPelo(){
        return Pelo;
    }

    public String getPorte(){
        return Porte;
    }

    // SALVAR DADOS
    public void salvar(){
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite a raça do seu gato:");
        Raca = ler.next();
        this.setRaca(Raca);

        System.out.println("Digite o tipo de pelo do seu gato:");
        Pelo = ler.next();
        this.setPelo(Pelo);

        System.out.println("Digite o porte do seu gato:");
        Porte = ler.next();
        this.setPorte(Porte);
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
            "\nPelo: "+Pelo+
            "\nPorte: "+Porte;
    }

}
