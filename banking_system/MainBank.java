/*Pacote adc. obs: o nome do pacote é o nome da pasta onde fica os projetos*/
package banking_system;

/*Importando a biblioteca Scanner para ler os dados digitado*/
//import java.util.Scanner;

 public class MainBank{
        public static void main(String args[]){
            /*Criando o objeto de leitura de dados digitados*/
            //Scanner input = new Scanner(System.in);

            /*Criando objeto para acessar e chamar as classes e os métodos*/
            Bank conta = new Bank();
            /*Atribuindo valores para os dados iniciais*/
            conta.nome = "Eduardo Machado";
            conta.idade = 33;
            conta.sexo = "Masculino";
            conta.saldo = 100.00f;
            conta.menu = 0;

            /*Chamando o método status_conta() e conta_menu() para imprimir na tela o status da conta*/
            conta.status_conta();
            conta.menu_conta();  
            
                       
        }
 }

