public class Pract_Constructor {
    private int item_no;
    private String name;
    private double price;
    private int qty;

    public int getItem_no(){
        return item_no;
    }

    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQty(){
        return qty;
    }

    public void setQty(int q)
    {
        qty = q;
    }
    public void setPrice(double p)
    {
        price = p;
    }

    Pract_Constructor(int i,double price,String n,int qty){
        item_no = i;
        name = n;
        setPrice(price);
        setQty(qty);
        System.out.println("Parameterised Constructor is called");
    }
    Pract_Constructor(int i,String n){
        item_no = i;
        name = n;
    }


    public static void main(String[] args) {
        Pract_Constructor pc = new Pract_Constructor(1,"Charger");
        pc.setPrice(1000);
        pc.setQty(2);
        System.out.println(pc.item_no);
        System.out.println(pc.qty);
        System.out.println(pc.price);
        System.out.println(pc.name);
        Pract_Constructor pc1 = new Pract_Constructor(3,3000,"Wire",3);
        System.out.println(pc1.item_no);
        System.out.println(pc1.qty);
        System.out.println(pc1.price);
        System.out.println(pc1.name);
    }
}
