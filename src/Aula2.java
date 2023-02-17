public class Aula2 {
    public static void main(String[] args) {
        

        //String nome = "Fellipe";
        //int anoNasci = 2000;
        //boolean hoje = true;

        //System.out.println(nome + anoNasci + hoje);
        
    int nasci = dataNascimento(19, 02, 2000);
    System.out.println(nasci);

    }

    public static int dataNascimento(int dia, int mes, int ano){
        return dia + mes + ano;

    }

    
    
}
