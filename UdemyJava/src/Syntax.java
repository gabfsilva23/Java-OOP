import java.util.Locale;


public class Syntax {
    public static void main(String[] args) {
        
    //data examples:	
    	double x = 10.12345;             
        String nome = "Gabriel";
        int idade = 31;
        double renda = 4000.0;
        
    //output data examples:
        System.out.println(x);
        System.out.printf("%.2f%n",x); //attention to .printF****
        System.out.printf("%.4f%n",x);
        System.out.println("Resultado = "+ x +" metros");
        System.out.printf("Resultado = %.2f metros%n", x);
     // North America dot system trouble:
        Locale.setDefault(Locale.US);
        System.out.printf("%.4f%n",x);
        
        
        //concatenate %s --> nome, %d --> idade, %.2f --> renda;
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade,renda);
    }
}