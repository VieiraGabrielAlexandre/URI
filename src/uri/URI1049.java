/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri;

/**
 *
 * @author internet
 */
import java.util.*;
public class URI1049 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String tipo = input.nextLine();
        String definicao = input.nextLine();
        String oque = input.nextLine();
        if ("vertebrado".equals(tipo) && "ave".equals(definicao) && "carnivoro".equals(oque)){
            System.out.printf("aguia\n");
        }
        if ("vertebrado".equals(tipo) && "ave".equals(definicao) && "onivoro".equals(oque)){
            System.out.printf("pomba\n");
        }
        if ("vertebrado".equals(tipo) && "mamifero".equals(definicao) && "onivoro".equals(oque)){
            System.out.printf("homem\n");
        }
        if ("vertebrado".equals(tipo) && "mamifero".equals(definicao) && "herbivoro".equals(oque)){
            System.out.printf("vaca\n");
        }
        if ("invertebrado".equals(tipo) && "inseto".equals(definicao) && "hematofago".equals(oque)){
            System.out.printf("pulga\n");
        }
        if ("invertebrado".equals(tipo) && "inseto".equals(definicao) && "herbivoro".equals(oque)){
            System.out.printf("lagarta\n");
        }
        if ("invertebrado".equals(tipo) && "anelideo".equals(definicao) && "hematofago".equals(oque)){
            System.out.printf("sanguessuga\n");
        }
        if ("invertebrado".equals(tipo) && "anelideo".equals(definicao) && "onivoro".equals(oque)){
            System.out.printf("minhoca\n");
        }
    }
}
