/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package operation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/**
 *
 * @author User
 */
public class compressor {
     public static void method(File file) throws IOException{
        String filedirectory= file.getParent();
        String fileName = file.getName();
        FileInputStream fis = null;
        FileOutputStream fos = null;
        GZIPOutputStream gzipOS = null;
        try{
            fis = new FileInputStream(file);
            fos = new FileOutputStream(filedirectory+"//"+fileName+".gz");
            gzipOS = new GZIPOutputStream(fos);
            byte[] buffer =new byte[1024];
        int len;
        
        while((len=fis.read(buffer)) != -1){
            gzipOS.write(buffer,0,len);
        }
        }catch(IOException e){
            System.out.println(e.toString());
        }finally{
            gzipOS.close();
            fos.close();
            fis.close();
        }
        
        
        
        
        
    }
    public static void main(String[] args) throws IOException{
        File path=new File("Testfile.txt");
        
        method(path);
    }
    
}
