public class Exjample {
    private int var1,var2;
    public Exjample (){
        this.var1=45;
        this.var2=44;
    }
    public int getvalue1(){
        return var1;
    }
    public int getvalue2(){
        return var2;
    }
    public static void main(String []args){
        Exjample obj=new Exjample();
        System.out.println("var is"+obj.getvalue1());
        System.out.println("var is"+obj.getvalue2());

    }
}
