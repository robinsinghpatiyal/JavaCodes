package StudentData;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //creating array of objects of size 5
        Student obj[] = new Student[5];
        obj[0] = new Student("doe5j","SR",95.2,91.2,90.2);
        obj[1] = new Student("johnson1d", "JR",87.1,78.4,66.9);
        obj[2] = new Student("jones2a","SR",66.8,75.1,88.2);
        obj[3] = new Student("brady3t","FM",55.3,68.7,77.4);
        obj[4] = new Student("mahom1d","SM",75.4,77.0,82.3);

        //finding the average score of each student and storing it in array
        double score[] = new double[5];
        for(int i =0;i<5;i++){
            double total = obj[i].one + obj[i].two + obj[i].three;
            score[i] = total/3;
        }
        int loop = 1;
        while(loop ==1) {
            System.out.println("a) Update class standing \nb) Assignments passed \n" +
                    "c) Best/Worst student \nd) Display roster \ne) Exit");
            System.out.print("\nSelect one of the above options: ");

            String inp = sc.next();

            //using switch statement to iterate through inputs
            switch (inp) {
                case "a":
                    System.out.print("\nGlobal ID: ");
                    String id = sc.next();

                    System.out.print("Class Standing: ");
                    String std = sc.next();

                    int req = -1;
                    //finding which array of object had that student id
                    for (int i = 0; i < 5; i++) {
                        if (id.equals(obj[i].GlobalID)) {
                            req = i;
                            break;
                        }
                    }
                    if (req == -1) {
                        System.out.println(id + " does not exists!"); // if the id does not exist
                    } else {
                        //updating the class standing if id exists
                        obj[req].ClsStd = std;
                        System.out.println(id + " has been updated to " + std);
                    }

                    break;
                case "b":
                    System.out.print("Global ID: ");
                    id = sc.next();
                    int count = 0;
                    req = -1;
                    //finding which array of object had that student id
                    for (int i = 0; i < 5; i++) {
                        if (id.equals(obj[i].GlobalID)) {
                            req = i;
                            break;
                        }
                    }
                    if (req == -1) {
                        System.out.println(id + " does not exists!"); // if the id does not exist
                    } else {
                        //updating the class standing if id exists
                        if (obj[req].one > 70) {
                            count++;
                        }
                        if (obj[req].two > 70) {
                            count++;
                        }
                        if (obj[req].three > 70) {
                            count++;
                        }
                        System.out.println(id + " has passed " + count + " assignments");
                    }

                    break;
                case "c":
                    //finding the best student
                    double max = score[0];
                    req = 0;
                    for (int i = 0; i < 4; i++) {
                        if (score[i]>max) {
                            max = score[i];
                            req = i;
                        }
                    }
                    //String.format("%.2f", score[req] is used to set precision to 2 decimal places
                    System.out.println("The best student is " + obj[req].GlobalID + " with overall grade " + String.format("%.2f", score[req]));

                    //finding the worst student
                    req = 0;
                    double min = score[0];
                    for (int i = 0; i < 4; i++) {
                        if (score[i] < min) {
                            min = score[i];
                            req = i;
                        }
                    }
                    System.out.println("The worst student is " + obj[req].GlobalID + " with overall grade " + String.format("%.2f", score[req]));
                    break;
                case "d":
                    for (int i = 0; i < 5; i++) {
                        System.out.print(obj[i].GlobalID + " ");
                        if (score[i] >= 90) {
                            System.out.println("A");
                        } else if (score[i] > 80 && score[i] < 90) {
                            System.out.println("B");
                        } else if (score[i] > 70 && score[i] < 80) {
                            System.out.println("C");
                        } else if (score[i] > 60 && score[i] < 70) {
                            System.out.println("D");
                        } else {
                            System.out.println("E");
                        }
                    }

                    break;
                case "e":
                    loop = -1;

                    break;
            }
            System.out.println("-----------------------------------");
        }
    }
}
