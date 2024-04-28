import java.awt.*;

public class AtualizarCor implements Runnable{
    Labels ObjLabel;

    public AtualizarCor(Labels objLabel) {
        ObjLabel = objLabel;
    }

    @Override
    public void run() {
        IPadress ping = new IPadress(ObjLabel.ip);
        Color corDaBox;
        try {
            corDaBox = ping.isRecheable() ? Color.GREEN : Color.red;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        ObjLabel.box.setBackground(corDaBox);
    }
}
