public class IpList {
    public String loja;
    public String[] ips;
    public static IpList listaDeIps[];
    public IpList(String loja, String ... ips){
        this.loja = loja;
        this.ips = ips;
    }

    public static void GerarIPS(){
        IpList[] listaIPS = new IpList[]{
                new IpList("Loja 1" , "10.10.1.1" , "10.10.1.2" , "10.10.1.3" , "10.10.1.10" , "10.10.1.11" , "10.10.1.12" , "10.10.1.13" , "10.10.1.250" , "10.10.1.254" , "10.10.1.70"),

                new IpList("Loja 2" , "10.10.2.1" , "10.10.2.2"  , "10.10.2.10" , "10.10.2.11" , "10.10.2.12" , "10.10.2.13" , "10.10.2.250" , "10.10.2.254" , "10.10.2.70"),

        };
        listaDeIps = listaIPS;
    }

}
