
//C5 = 4, C7 = 2, C11 = 1

public class lab_2 {
    public static void main(String[] args) {
        short[][] A = new short[][] {{2,5,9,1},
                {1,3,3,0}};
        short[][] B = new short[][] {{45,2,6,7,1},
                {4,2,6,5,1},
                {2,1,3,3,4},
                {6,5,7,8,0}};

        int m = A.length;
        int n = A[0].length;
        int k = B.length;
        int l = B[0].length;
        if (n != k)
        {
            System.out.println("Матриці не можуть буті перемножені через свою розмірність");
        }
        short[][] C = new short[m][l];
        for (int i = 0; i < m; i++)
        {
            for (int j = 0; j < l; j++)
            {
                C[i][j] = 0;
                for (int q = 0; q < n; q++)
                {
                    C[i][j] += A[i][q] * B[q][j];
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.print("\n");
        }

        for (int q = 0; q < m; q++){
            for(int i = l-1 ; i > 0 ; i--){
                for(int j = 0 ; j < i ; j++) {
                    if (C[q][j] > C[q][j + 1]) {
                        short tmp = C[q][j];
                        C[q][j] = C[q][j + 1];
                        C[q][j + 1] = tmp;
                    }
                }
            }
        }
        int sum = C[0][0] + C[1][0];
        System.out.println("Сумма двох найменших чисел кожного рядка "+C[0][0]+" "+C[1][0]+" дорівнює "+sum);
    }
}
