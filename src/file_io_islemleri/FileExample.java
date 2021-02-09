package file_io_islemleri;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

public class FileExample {
    public static void main(String[] args) {

        dosyayaYaz();
        dosyadanOku();

    }

    private static void dosyadanOku() {

        DataInputStream dataInputStream=null;
        boolean dosyasonu= false;
        ArrayList<Ogrenci> ogrencis = new ArrayList<>();


        try {

            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("ogrenciler.dat")));


            while (!dosyasonu) {
                try{
                    int id = dataInputStream.readInt();
                    String isim = dataInputStream.readUTF();
                    boolean aktif = dataInputStream.readBoolean();
                    Ogrenci okunacakOgrenci = new Ogrenci(id,isim,aktif);
                    ogrencis.add(okunacakOgrenci);
                    //System.out.println("okunacakOgrenci = " + okunacakOgrenci);

                } catch (EOFException eofException) {
                    //eofException.printStackTrace();
                    dosyasonu=true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dataInputStream!=null) {
                try {
                    dataInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("ogrencis.toString() = " + ogrencis.toString());
    }

    private static void dosyayaYaz() {

        Ogrenci ogr1= new Ogrenci(1,"Salih",true);
        Ogrenci ogr2= new Ogrenci(2,"Emre",false);

        DataOutputStream dataOutputStream = null;
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("ogrenciler.dat")));
            dataOutputStream.writeInt(ogr1.id);

            dataOutputStream.writeUTF(ogr1.isim);
            dataOutputStream.writeBoolean(ogr1.aktif);

            dataOutputStream.writeInt(ogr2.id);
            dataOutputStream.writeUTF(ogr2.isim);
            dataOutputStream.writeBoolean(ogr2.aktif);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(dataOutputStream!=null) {
                try {
                    dataOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }


}

class Ogrenci {
    int id;
    String isim;
    boolean aktif;

    public Ogrenci(int id, String isim, boolean aktif) {
        this.id = id;
        this.isim = isim;
        this.aktif = aktif;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "id=" + id +
                ", isim='" + isim + '\'' +
                ", aktif=" + aktif +
                '}';
    }
}
