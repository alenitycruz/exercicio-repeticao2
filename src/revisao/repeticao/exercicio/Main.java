package revisao.repeticao.exercicio;

/*
Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha
igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String usuario;
        String senha;

        System.out.println("Usuário: ");
        usuario = scan.next();
        System.out.println("Senha: ");
        senha = scan.next();

        while(senha.equals(usuario)) {
            System.out.println("Senha inválida! Ecolha outra senha: ");
            senha = scan.next();
        }
    }

}
