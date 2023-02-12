public class Box {
    public int height;
    public int widht;
    public int lenght;
    static void calculater_area(int height,int widht,int lenght){
        System.out.println(height*widht*lenght);

    }
    static void calculater_area(int height,int widht){
        System.out.println(height*widht);

    }
    public void display(){
        System.out.println(height+""+widht+""+lenght);
    }
    public static void main (String[] args){
        Box b1=new Box();
        b1.height=3;
        b1.widht=4;
        b1.lenght=5;
        calculater_area(3,4,5);
        calculater_area(3,4);

    }

}