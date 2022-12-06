package Java_DZ.JAVA_DZ_sem6;

public class NB {

        int ram;
        int ssd;
        String color;
    
        public NB( int ram, int ssd, String color){
           
            this.ram = ram;
            this.ssd = ssd;
            this.color = color;
        }
    
           public String toString() {
            return String.format("ram: %d ГБ, ssd: %d ГБ, color: %s", ram, ssd, color);
        }
    }

