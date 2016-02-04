/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paintProjeto;

/**
 *
 * @author DULCI
 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
 
public class Serializador {
 
    public Serializador() {}    
     
    public void serializar(String nomeArquivo, Object obj) throws Exception {
            FileOutputStream outFile = new FileOutputStream(nomeArquivo);
        try (ObjectOutputStream s = new ObjectOutputStream(outFile)) {
            s.writeObject(obj);
        }
    }
}