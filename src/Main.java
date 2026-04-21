//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            int tamanho = 9;
            int[][] vetor = new int[tamanho][tamanho];
            StringBuilder row = new StringBuilder();
            String[] t = new String[tamanho];
            for(int i = 0;i < vetor[0].length-1;i++){
                vetor[i][0] = 1;
                row.append(vetor[i][0]).append(" ");
                //System.out.print(vetor[i][0]+" ");
                for(int j = 0; j < i ;j++) {
                    vetor[i + 1][j + 1] = vetor[i][j] + vetor[i][j + 1];
                    row.append(vetor[i + 1][j + 1]).append(" ");
                }
                t[i] = row.toString();
                row = new StringBuilder();
                System.out.println(t[i]);
                //System.out.print("-> "+multiply+"\n");
                //multiply = 1;
        }

    }
}