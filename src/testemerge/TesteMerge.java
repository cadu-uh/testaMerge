package testemerge;

/**
 *
 * @author Carlos
 */
public class TesteMerge {

    private static void populaVet(int[] vet) {
        for (int i = 0; i < vet.length; i++) {
            vet[i] = i;
        }

    }

    public static void main(String[] args) {
        /*Necessita-se fazer duas funcoes e tentar juntar elas*/
        int[] vet = new int[5];
        
        populaVet(vet);
        /*a,mnsbfdm,nasbfmasdbfadf
        asfasfasfasfasfasfasfasfasf
        asfasfasfasfasfasfasfasfasf
        asfasfasfasfasfasfasfasfas
        fasfasfasfasfasfasfasfasfasf
        asfasfasfasfasfasfasfasfasf
        asfasfasfasfasfasfasfasfasfas
        fasfasfasfasfasfasfasfasfasf*/
        
        for (int i = 0; i < vet.length; i++) {
           System.out.print(vet[i] + " ");
            System.out.print(vet[i] + 2 + "  ");
        }
    }

}
