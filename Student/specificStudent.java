package Student;

public class specificStudent {
    int arr[] = new int[3]; //intializing an empty array of size 3 to store the total
    int i = 0;

    //this function is used to store the total inside the array which we declared earlier
    public void store(int total){
        arr[i] = total;
        i++;
    }
    int j = 0;

    //this function will display name and Marks
    // you can also edit it accoding to your prefrence of display
    public void display(String name, int one, int two, int three, int four, int five){
        System.out.println(name+"       "+one+"     "+two+"     "+three+"       "+four+"        "+five+"        "+arr[j]);
        j++;
    }

}
