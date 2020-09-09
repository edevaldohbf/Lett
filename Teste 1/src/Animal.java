import java.io.PrintStream;

public class Animal{
    void imprimir(String nome, String idade, String tamanho){
        String nomeL = nome.toLowerCase();
        if (nomeL.equals("pato") || nomeL.equals("galinha") || nomeL.equals("vaca") || nomeL.equals("morcego")){
            System.out.println("Nome: " + nomeL);
            System.out.println("Idade: " + idade);
            System.out.println("Tamanho: " + tamanho);
            if (nomeL.equals("pato")){
                System.out.println("Tipo: Aves");
                System.out.println("Som emitido é um grasnido");
                System.out.println("Esse animal pode voar, bota ovos e tem penas");
            }
            if (nomeL.equals("galinha")){
                System.out.println("Tipo: Aves");
                System.out.println("Som emitido é um cacarejo");
                System.out.println("Esse animal bota ovos e tem penas");
            }
            if (nomeL.equals("vaca")){
                System.out.println("Tipo: Mamífero");
                System.out.println("Som emitido é um mugido");
                System.out.println("Esse animal tem pelos");
            }
            if (nomeL.equals("morcego")){
                System.out.println("Tipo: Mamífero");
                System.out.println("Som emitido é um farfalho");
                System.out.println("Esse animal tem pelos e pode voar");
            }
            else{
                System.out.println("Este animal não faz parte desta fazenda.");
            }
        }
        else{
            System.out.println("Este tipo de animal não faz parte desta fazenda;");
        }

    }
}
