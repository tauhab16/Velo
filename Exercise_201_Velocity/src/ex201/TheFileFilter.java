package ex201;

import java.io.File;
import javax.swing.filechooser.FileFilter;

public class TheFileFilter extends FileFilter {

   
    public boolean accept(File file1) {
        
        
        if (file1.isDirectory()) {
            return true;
                                 } 
        
        
        
        else {
            
            
            String filename = file1.getAbsolutePath();
           
            
            if (filename.endsWith(".ser")) {
                return true;
                                           } 
            else    {
                return false;
                    }
               
        
            }
         }

    
    public String getDescription() {
        return ".ser";
    }

}
