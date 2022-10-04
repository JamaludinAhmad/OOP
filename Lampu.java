public class Lampu {    
    boolean nyala;

    Lampu(){
        nyala = false;
    }

    public void dinyalakan(){
        if(nyala == true){
            System.out.println("lampu sudah menyala");
        }
        else{
            System.out.println("lampu berhasil menyala");
            nyala = true;
        }
    }

    public void dimatikan(){
        if(nyala == false){
            System.out.println("lampu sudah mati");
        }
        else{
            System.out.println("lampu berhasil dimatikan");
            nyala = false;
        }
    }

    

    public static void main(String[] args) {

    }
}
