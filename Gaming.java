import java.io.*;
 class video{
String videoname;
boolean checkout;
int rating;
video(String name){
videoname = name;
System.out.println("video "+videoname+" added successfully");
}
String getname() {
return"videoname";
//System.out.println("video "+videoname+" ")

}
void docheckout() {
checkout=true;
System.out.println("video "+videoname+" checkout successfully");
}
void doreturn() {
checkout=false;
System.out.println("viedo "+videoname+" returned Successfully");
}
void recevingrating(int rating) {
this.rating=rating;
System.out.println("rating +"+rating+" mapped to "+videoname+" successfully");
}
int getrating() {
return rating;
}
boolean getcheckout() {
return checkout;
}
void inventary() {
System.out.println("video name : "+videoname);
System.out.println("checkout status : "+checkout);
System.out.println("Rating : "+rating);
}

}
class videostore{
video[] store=new video[4];

void addvideo(String name ) {
String n=name;
store[0]=new video(n);
}
void docheckout(String name) {
store[0].docheckout();
//System.out.println("video matrix checkout Successfully");
}
void doreturn(String name) {
store[0].doreturn();
System.out.println("");
}
void receiverating(int rating) {
store[0].recevingrating( rating);
}
void listinventary() {
store[0].inventary();
}
}
public class Gaming {
public static void main(String args[])throws Exception {
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
int x2;
System.out.println("Hello world");
 videostore x =new videostore();
 
 

do {
System.out.println("1.Add Videos.\n 2.check out video.\n 3.Return viedo.\n 4.Receive Rating.\n 5.List Inventory.\n 6.Exit");
int a =Integer.parseInt(br.readLine());
switch(a) {
case 1 : System.out.println("Enter a video name ");
          String n1 =br.readLine();
   x.addvideo(n1);
          break;
case 2 : System.out.println("Enter a video name ");
          String n2 =br.readLine();
     x.docheckout(n2);
   //  System.out.println("video "+n2+" checkout Successfully");
     break;
case 3 : System.out.println("Enter a video name of viedo return  ");
           String n3 =br.readLine();
           x.doreturn(n3);
         //System.out.println("video "+n3+" returned successfully");
           break;
case 4 : System.out.println("Enter rating : ");
          int i =Integer.parseInt(br.readLine());
          x.receiverating(i);
        //  System.out.println("video rating mapped to matrix  successfully");
          break;
case 5 : x.listinventary();
          break;
case 6 :  return;
         
}
System.out.println("Enter your choice 6 for exit  ");
 x2 =Integer.parseInt(br.readLine());
}while(x2!=6);
}
}

