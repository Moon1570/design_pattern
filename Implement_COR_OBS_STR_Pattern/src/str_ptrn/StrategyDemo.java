package str_ptrn;

import java.io.ObjectInputStream.GetField;

import osb_ptrn.Channel;
import osb_ptrn.Subscriber;

public class StrategyDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//Initializing Observer Pattern
		Channel ch1=new Channel();
 //       Channel ch2=new Channel();
 //       Channel ch3=new Channel();
        
        Subscriber s1=new Subscriber("tanni");
        Subscriber s2=new Subscriber("moon");
        Subscriber s3=new Subscriber("tanvir");
        ch1.subscribe(s1);
        ch1.subscribe(s2);
        ch1.subscribe(s3);
//        ch2.subscribe(s2);
//        ch3.subscribe(s3);
        s1.SubscribeChannel(ch1);
        s2.SubscribeChannel(ch1);
        s3.SubscribeChannel(ch1);
  //      s2.SubscribeChannel(ch2);
   //     s3.SubscribeChannel(ch3);
        
        
    //    System.out.println(ch2.subs);
        
        
		
        
        //Strategy Pattern
		System.out.println("----------> Strategy Pattern<---------");
		
		Context context = new Context(new Guns());
		String result = context.executeStrategy("Gun", 40);
		
		//Publishing result
		
		System.out.println("\n\n ----------> Observer Pattern <---------");
		
		ch1.upload(result);

		
		//    ch2.upload("how to sleep well");
    //    ch3.upload("how to run well");
	
		
		//	System.out.println(context.executeStrategy("Guns", 50));
//		System.out.println();
		
//		Context context2 = new Context(new AKEFourySeven_Strategy());
//		System.out.println(context2.executeStrategy("AK-47"));
//		
//		System.out.println("----------> Strategy End <---------");
		
		
		
//		System.out.println();
//		String value = MyBonduks.getStrategy("AK-47");
//		System.out.println(value);
	}

}
