package modelo.workingzone;

import java.util.ArrayList;
import java.util.List;
import modelo.archivo.Archivo;

public interface WorkingZoneInterface {
    List<Archivo> index = new ArrayList<Archivo>();
    void add(Archivo file);
    void add(List<Archivo> files);
    void clearZone();
}