class GenericDemo<T>{
    private T obj;
    public void setData(T v)
    {
        obj=v;
    }
    public T getData(){
        return this.obj;
    }
    

    public static void main(String[] args) {
        GenericDemo<String> gd = new GenericDemo<>();
        gd.setData("Hi");
        gd.setData("Wow");
        System.out.println(gd.getData());
    }
}