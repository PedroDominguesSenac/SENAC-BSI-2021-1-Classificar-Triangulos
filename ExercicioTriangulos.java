/*Pedro Domingues
* Escreva um algoritmo em Java que solicite ao usuário a entrada de 3 números. 
* Considere que estes números são os lados de um triângulo.
*
* Seu algoritmo deverá:
*
* Indicar se "realmente" são lados de um triângulo
* Se os lados compõem um triângulo, identifique qual sua classificação:
* Equilátero
* Isósceles
* Escaleno
*/
package heredia;

import java.util.Scanner;

public class ExercicioTriangulos {
    
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);
        
        float a, b, c;
        
        System.out.println("Digite o valor do primeiro lado do triangulo: ");
        a = tri.nextFloat();
        System.out.println("Digite o valor da base do triangulo:  ");
        b = tri.nextFloat();
        System.out.println("Digite o valor do segundo lado do triangulo: ");
        c = tri.nextFloat();
        
        if ((a == b) && (b == c)) {
            System.out.println("Triangulo Equilatero");
        } 
        else {
            if ((a == b) && (b != c) || (c == a) && (c != b) || (a != b) && (b == c)) {
                System.out.println("Triangulo Isóceles");
            }
            else {
                if ((a != b) && (b != c) && (a != c)) {
                    System.out.println("Triangulo Escaleno");
                }
            }
        
        }
    }
    
}
