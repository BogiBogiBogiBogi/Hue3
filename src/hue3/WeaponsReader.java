package hue3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WeaponsReader {
    ArrayList<Weapons> list = new ArrayList<Weapons>();

    public WeaponsReader() {
        list = new ArrayList();
    }
    
    public void readFile()
    {
        
        try {
            File file = new File("weapons.csv");
            Scanner scan = new Scanner(file);
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(WeaponsReader.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}