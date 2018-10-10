package ex201;
import java.io.File;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import javax.swing.table.AbstractTableModel;

public class Tablemodel extends AbstractTableModel {
    
 Compari comp = new Compari();

    private ArrayList<Measurement> list1;
    private static final DateTimeFormatter datetimefm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
    private String[] spalt = {"Datum", "Uhrzeit", "Kennzeichen", "Gemessen", "Erlaubt", "Überdrüber"};

    
    
    
    public ArrayList<Measurement> getList() {
        return list1;
    }
    
    public Tablemodel() {
        this.list1 = new ArrayList();
    }

    
    
      public void save(File f) throws Exception {
        DAL dal = new DAL();
        dal.save(list1, f);
    }

    public void load(File f) throws Exception, ClassNotFoundException {
        DAL dal = new DAL();
        list1 = dal.load(f);
        this.fireTableDataChanged();
    }
    
    
    
    public void add(Measurement measure) {
        list1.add(measure);
        list1.sort(comp);
        
        this.fireTableDataChanged();
    }

    
    
    public void remove(int index[]) {
        for (int i = 0; i < index.length; i++) {
            list1.remove(0);
            this.fireTableDataChanged();
            index[0] = i;
        }
    }

    
    
    
    
    
    public int average() {
        int average = 0;
        for (int i = 0; i < list1.size(); ++i) {
            average += list1.get(i).getUeberschreitung();
        }
        average /= list1.size();
        return average;
    }


   
    public int getRowCount() {
        return list1.size();
    }
    public int getColumnCount() {
        return spalt.length;
    }

    
    
    
    
    public Object getValueAt(int rowi, int coli) {
        Measurement measure = list1.get(rowi);

        switch (coli) {
            case 0:
                return measure.getDatum().format(datetimefm);
            case 1:
                return measure.getUhrzeit();
            case 2:
                return measure.getKennzeichen();
            case 3:
                return measure.getsGem();
            case 4:
                return measure.getsErl();
            case 5:
                return measure.getUeberschreitung();
            default:
                return "uhhh...da ist was schief gegangen > <";
        }
    }

  
    
    
    public String getColumnName(int column) {
        return spalt[column];
    }

  

}
