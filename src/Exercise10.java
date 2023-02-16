// 8 student 2 group display in tabular format
public class Exercise10 {
    public static void main(String[] args){
        // initializing score[math , physic , chemistry]
        int[][][] score = {
                //group 1
                {{50, 30, 70}, {60, 40, 80}, {70, 50, 90}, {80, 60, 100}},
                //group 2
                {{55, 35, 75}, {65, 45, 85}, {75, 55, 95}, {85, 65, 90}},
        };
        int[] total_each_student = new int [8];
        int count = 0,  total_group1 = 0 , total_group2 = 0, num = 1 , line = 0;
        //loop through the whole array to calculate total each student (indicate row)
        for(int i = 0 ; i < score.length ; i++){
            //loop through second bracket of the array (indicate collum of row)
            for(int j = 0; j < 4 ; j++){
                int total_each = 0;
                //loop through inner bracket of the array (indicate collum of collum)
                for(int k = 0 ; k < 3 ; k++){
                    total_each += score[i][j][k];
                }
                total_each_student[count] = total_each;
                count++;
            }
        }
        // calculate total for group 1
        for(int i = 0 ; i < (total_each_student.length/2) ; i++){
            total_group1 += total_each_student[i];
        }
        // calculate total for group 2
        for(int i = (total_each_student.length/2) ; i < total_each_student.length ; i++){
            total_group2 += total_each_student[i];
        }
        //output
        System.out.println("Group 1 :");
        System.out.println("------------------------------------------------------------");
        System.out.println("Name\t\tMath\t Physic\t  Chemistry\tTotal");
        System.out.println("------------------------------------------------------------");
        for(int j = 0; j < 4 ; j++){
            System.out.print("Student "+num);
            for(int k = 0 ; k < 3 ; k++){
                System.out.printf("%10d" ,score[0][j][k]);
                line++;
                if(line == 3){
                    System.out.printf("%13d", total_each_student[j]);
                    System.out.println();
                    line= 0;
                }
            }
            num++;
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\t\t\t   Total score : "+total_group1);
        System.out.println("Group 2 :");
        System.out.println("------------------------------------------------------------");
        System.out.println("Name\t\tMath\t Physic\t  Chemistry\tTotal");
        System.out.println("------------------------------------------------------------");
        for(int j = 0 ; j < 4 ; j++){
            System.out.print("Student "+num);
            for(int k = 0 ; k < 3 ; k++){
                System.out.printf("%10d" ,score[1][j][k]);
                line++;
                if(line == 3){
                    System.out.printf("%13d", total_each_student[j+4]);
                    System.out.println();
                    line= 0;
                }
            }
            num++;
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("\t\t\t\t   Total score : "+total_group2);
        System.out.println("\t\t\t\t Overall score : "+(total_group1 +total_group2));
    }
}
