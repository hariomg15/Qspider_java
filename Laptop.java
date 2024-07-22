public class Laptop {

    String model;
    int Price;
    int RAM;
    int ROM;
    String Processor;

    public void showData(){
        System.out.println(model+" "+Price+" "+RAM+" "+ ROM+" "+Processor);
    }
      

   Laptop(String model,int Price,int RAM,String PROCESSOR,int ROM){
    this.model=model;
    this.Price=Price;
    RAM=;
    Processor=d;
    ROM=e;
   }


   // Laptop(){
        // String MODEL="Ideapad 3 ";
        // int PRICE=40000;
        // int ram=8;
        // int rom=512;
        // String PROCESSOR="i5 12th gen";
        // System.out.println(MODEL+" "+PRICE+" "+ram+" "+ rom+" "+PRICE);
        // }
    public static void main(String args[]){
        Laptop l=new Laptop("asus",123333,8,"i6",256);

        l.showData();
        Laptop l2=new Laptop("lenevo",50000,16,"i9",512);
        l2.showData();
    }
}
