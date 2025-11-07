public class P {

    static void showName(int ...id)
    {
        for(int x : id)
        {
            System.out.println(x);
        }

    }
    static void showName(String ...name)
    {
        for(String x: name)
        {
            System.out.println(x);
        }
        for(int i=0;i<name.length;i++)
        {
            System.out.println(name[i]);
        }
    }
    static void compare(int ...a)
    {
        if(a.length == 0)
        {
            System.out.println(Integer.MIN_VALUE);
        }
        else{
            int min= a[0];
        int max = a[0];
        
        for(int x: a)
        {
            if(x < min)
            {
                min = x;
            }
            if(max < x)
            {
                max = x;
            }
        }
        System.out.println("Max is :" +max);
        System.out.println("Min is : " +min);
        }
    }
    public static void main(String[] args) {
        // showName("Ashish","Hello");
        // showName(1,2,3,4);
        // showName("Ashish","Kumar","Anjali","Priya");
        compare();
        compare(1);
        compare(1,2);
        compare(1,2,3,4,5);
    }
}
