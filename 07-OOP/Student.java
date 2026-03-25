public class Student {
    // Normal her objeye ozel 
    // Static herkes icin ortak
    public String name;
    public int id,point;
    private static int counter;

    Student(String name , int id , int point )
    {
        this.name = name ;
        this.id = id;
        this.point = point;
        Student.counter++;
    }

    public void exit()
    {
        Student.counter--;
    }

    public static int howStudent()
    {
        return Student.counter;
    }

    public static double calcOverall(int[] arr)
    {
        double overall = 0;
        for(int i=0; i<arr.length;i++)
        {
            overall += arr[i];
        }
        return overall / arr.length;
    }
}
