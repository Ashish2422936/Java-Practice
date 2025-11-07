class WebsiteExtract{
    public static void main(String args[])
    {
        String str = "http://www.google.com";

        String protoc = str.substring(0,str.indexOf(":"));
        if(protoc.equals("http"))
        {
            System.out.println("HyperText Transfer Protocol");
        }
        else if(protoc.equals("ftp")){
            System.out.println("File Transfer protocol");
        }
        String dom = str.substring(str.lastIndexOf(".")+1);
        if(dom.equals("com"))
        {
            System.out.println("Commercial");
        }
        else if(dom.equals("org"))
        {
            System.out.println("organisation");
        }
        else if(dom.equals("net"))
        {
            System.out.println("Network");
        }

    }
}