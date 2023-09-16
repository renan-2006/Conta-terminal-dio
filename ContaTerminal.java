import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Bem vindo a central de conta no terminal!");

        System.out.println("O que você deseja fazer?");
        System.out.println("[1] Criar conta");
        System.out.println("[2] Entrar em uma conta");
        System.out.println("[3] Entrar como ADM");
        int numeroResposta = scanner.nextInt();

        if(numeroResposta == 1)
            System.out.println("Digite seu nome");
            String criandoContaNome = scanner.next();

            System.out.println("Digite sua idade");
            int criandoContaIdade = scanner.nextInt();

                if(criandoContaIdade < 18){
                    System.out.println("Você não tem 18 anos, quer prosseguir com uma conta menor de idade? [S/N]");
                    String criandoContaMenor = scanner.next().toUpperCase();
                        if(criandoContaMenor == "S")
                            System.out.println("Qual é o nome do seu responsável?");
                            String criandoContaMenorResponsavel = scanner.next();
                            int criandoContaMenorIdadeReponsavel = scanner.nextInt();
                                if(criandoContaMenorIdadeReponsavel >= 18){
                                    System.out.println("Responsável cadastrado!");

                                    System.out.println("Criando Conta!");

                                    System.out.println("Digite seu nome de usuário");
                                    String criandoContaMenorUsuario = scanner.next();

                                    System.out.println("Digite sua senha");
                                    String criandoContaMenorSenha = scanner.next();

                                }else{
                                    System.out.println("Seu responsável deve ter mais de 18 anos!");
                                }
                        
                        
                }
                    
                        
                        


        

    }
}
