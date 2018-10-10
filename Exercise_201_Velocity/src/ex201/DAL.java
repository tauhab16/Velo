package ex201;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class DAL {

   public void save(ArrayList<Measurement> listi, File fili) throws FileNotFoundException, IOException {
        ObjectOutputStream osi = new ObjectOutputStream(new FileOutputStream(fili));
        
        osi.writeObject(listi);
        osi.flush();
        osi.close();
    }

   
   
   
    ArrayList<Measurement> load(File fili) throws IOException, ClassNotFoundException {
       
        ObjectInputStream wesi = new ObjectInputStream(new FileInputStream(fili));
        
        ArrayList<Measurement> listi2 = (ArrayList<Measurement>) wesi.readObject();
        
        wesi.close();
        return listi2;
    }

}
