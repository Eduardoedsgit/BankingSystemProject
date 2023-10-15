package banking_system;
/*Biblioteca importada de leitura de dados*/
import java.util.Scanner;


public class Bank {
    /*Atributos da classe bank*/
    String nome;
    int idade;
    String sexo;
    float saldo;
    float deposito;
    float saque;
    int menu;
    boolean condicao = true;

    /*Método para mostrar na tela o status da conta atual*/
    void status_conta(){
        System.out.println("Status atual da sua conta");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Sexo: " + this.sexo);
        System.out.println("Saldo R$: " + this.saldo);
        System.out.println("--------------------------------");
    }

    void menu_conta(){
        /*Laço de repetição while(enquanto)*/
        while(condicao){
            Scanner input = new Scanner(System.in);
            System.out.println("1 --> Depósito");
            System.out.println("2 --> Saque");
            System.out.println("3 --> Sair do systema");
            System.out.print("Digite o menu desejado: ");
            this.menu = input.nextInt();
            System.out.println("--------------------");       

            switch (menu){
                case 1:
                    System.out.println("Depósito");
                    System.out.print("Depositar R$: ");
                    this.deposito = Float.parseFloat(input.next());
                    System.out.println("---------------------");
                    this.saldo += this.deposito;
                    this.status_conta();
                    /*Break é o comando para parar o sistema case*/                    
                    break;             
                case 2:
                    System.out.println("Saque!");
                    System.out.print("Sacar R$?: ");
                    this.saque = Float.parseFloat(input.next());               
                    
                    /*se o saque for maior que o saldo então não ser prossivel efeturar o saque*/
                    if(this.saldo < this.saque){
                        System.out.println("Saldo insuficiente para saque!");                        
                        break;
                    }else{
                        /*Decrementa do saldo o valor retirado no saque*/
                        this.saldo -= this.saque;
                        System.out.println("Saque efetuado com sucesso!");
                        /*Chama a o método status_conta() para mostrar o status atual da conta*/
                        this.status_conta();                    
                        break;
                    }  
                case 3:
                    System.out.print("Você fechou do sistema!!");
                    input.close();
                    /*Atribui false para avariável ondicao presente no looping while*/
                    condicao = false;
                    /*Break para sair fora do case*/
                    break;                          
                default:
                    System.out.print("Operador incorreto!!");                    
                    break;      
            }
        }       
    }
}

