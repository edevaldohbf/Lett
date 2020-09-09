public class Program {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cadastro cadastro1 = new Cadastro();
        Cadastro cadastro2 = new Cadastro();
        Cadastro cadastro3 = new Cadastro();
        Cadastro cadastro4 = new Cadastro();
        TratarDados tratarDados = new TratarDados();
        boolean A1, A2, A3, A4;

        System.out.println("Digite as informações dos 4 animais presentes na fazenda:");
        System.out.println("Animal 1.");
        cadastro1.solicitarCadastro();
        System.out.println("Animal 2.");
        cadastro2.solicitarCadastro();
        System.out.println("Animal 3.");
        cadastro3.solicitarCadastro();
        System.out.println("Animal 4.");
        cadastro4.solicitarCadastro();

        A1 = tratarDados.dados(cadastro1.nome, cadastro1.idade, cadastro1.tamanho);
        A2 = tratarDados.dados(cadastro2.nome, cadastro2.idade, cadastro2.tamanho);
        A3 = tratarDados.dados(cadastro3.nome, cadastro3.idade, cadastro3.tamanho);
        A4 = tratarDados.dados(cadastro4.nome, cadastro4.idade, cadastro4.tamanho);

        if (A1 == true) {
            System.out.println("Primeiro Animal.");
            animal.imprimir(cadastro1.nome, cadastro1.idade, cadastro1.tamanho);
        } else {
            System.out.println("O primeiro animal inserido pelo usuário não é válido.");
        }
        if (A2 == true) {
            System.out.println("\nSegundo Animal.");
            animal.imprimir(cadastro2.nome, cadastro2.idade, cadastro2.tamanho);
        } else {
            System.out.println("O segundo animal inserido pelo usuário não é válido.");
        }
        if (A3 == true) {
            System.out.println("\nTerceiro Animal.");
            animal.imprimir(cadastro3.nome, cadastro3.idade, cadastro3.tamanho);
        } else {
            System.out.println("O terceiro animal inserido pelo usuário não é válido.");
        }
        if (A4 == true) {
            System.out.println("\nQuarto Animal.");
            animal.imprimir(cadastro4.nome, cadastro4.idade, cadastro4.tamanho);
        } else {
            System.out.println("O quarto animal inserido pelo usuário não é válido.");
        }
    }
}