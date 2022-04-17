import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Principal {
    public static void main(String[] args) {
        Turma p = new Turma("Matemática Básica", "Manhã", "MAT123");

        try {
            FileOutputStream arqOSer = new FileOutputStream("C:/Lucas/turma.txt");
            ObjectOutputStream oOSer = new ObjectOutputStream(arqOSer);
            oOSer.writeObject(p);
            oOSer.close();
            System.out.println("---------------Antes de alterar o turno-------------");
            System.out.println(p);
            p.setTurno("Tarde");
            System.out.println("---------------Depois de alterar o turno-------------");
            System.out.println(p);


            FileInputStream arqISer = new FileInputStream("C:/Lucas/turma.txt");
            ObjectInputStream iOSer = new ObjectInputStream(arqISer);
            p = (Turma) iOSer.readObject();
            iOSer.close();


            System.out.println("---------------Depois de recuperar os valores-------------");
            System.out.println(p);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}