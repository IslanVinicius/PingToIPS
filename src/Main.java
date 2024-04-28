import javax.swing.*;
import java.awt.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.concurrent.*;

public class Main{


    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        IpList.GerarIPS();
        Frame.AbrirFrame();
        ArrayList<Labels> labels = new ArrayList<>();

        for (IpList ip : IpList.listaDeIps){
            for(String ips : ip.ips){
                labels.add(new Labels(ips, ip.loja));
            }
        }
        Pingar(labels);
    }

    public static void Pingar(ArrayList<Labels> label){
        ExecutorService executor = Executors.newCachedThreadPool();
        while (true){
            for(Labels box : label){
                executor.submit(new AtualizarCor(box));
            }
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}