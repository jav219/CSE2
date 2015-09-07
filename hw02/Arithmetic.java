////////////////////////////////////////////////////////////////////////////////
//Jacob Vikse
//September 7, 2015
//CSE 002 Section: 310
//hw02
//Arithmetic

//class
public class Arithmetic{
    
    //declare main method
    public static void main(String[] args) {
        
        //Pairs of socks
        int nSocks=3;
        //Cost per pair of socks in US dollars
        double sockCost$=2.58;
        
        //number of glasses
        int nGlasses=6;
        //Cost per glass in US dollars
        double glassCost$=2.29;
        
        //number of boxes of envelopes
        int nEnvelopes=1;
        //Cost per box in US dollars and PA sales tax rate as a decimal
        double envelopeCost$=3.25;
        double taxPercent=0.06;
        
        //Sock output variables
        double costSocks$ = nSocks * sockCost$;  //cost of socks w/o tax
        double taxSocks$ = costSocks$ * taxPercent;  //tax on socks
        double totalSocks$ = costSocks$ + taxSocks$;  //total cost of socks w/ tax
        
        //Glasses output variables
        double costGlasses$ = nGlasses * glassCost$;  //cost of glasses w/o tax
        double taxGlasses$ = costGlasses$ * taxPercent;  //tax on glasses
        double totalGlasses$=costGlasses$+taxGlasses$;  //total cost of glasses w/tax
        
        //Envelopes output variables
        double costEnvelopes$=nEnvelopes*envelopeCost$;  //cost of envelopes w/o tax
        double taxEnvelopes$ = costEnvelopes$ * taxPercent;  //tax on envelopes
        double totalEnvelopes$=costEnvelopes$+taxEnvelopes$;  //total cost of envelopes w/tax
        
        //Total output variables
        double Subtotal$ = costSocks$ + costGlasses$ + costEnvelopes$; //Subtotal
        double Tax$ = taxEnvelopes$ + taxSocks$ + taxGlasses$;  //Total Tax
        double Total$ = Subtotal$ + Tax$;  //Total cost of shopping trip w/tax
        
        //display all the variables for items, taxes, and totals
        System.out.println(nSocks+" Pairs of Socks");
        System.out.println(sockCost$ + " Per Pair");
        System.out.println("Socks= $" + costSocks$);
        System.out.println("Socks tax= $" + Math.round(taxSocks$*100)/100.0);
        System.out.println("Socks Total= $" + Math.round(totalSocks$*100)/100.0+"0");
        System.out.println("                         ");
        System.out.println(nGlasses+" Drinking Glasses");
        System.out.println(glassCost$ + " Per Glass");
        System.out.println("Glasses= $" + costGlasses$);
        System.out.println("Glasses tax= $" + Math.round(taxGlasses$*100)/100.0);
        System.out.println("Glasses Total= $" + Math.round(totalGlasses$*100)/100.0);
        System.out.println("                             ");
        System.out.println(nEnvelopes + " Box of Envelopes");
        System.out.println(costEnvelopes$ + " Per Box");
        System.out.println("Envelopes= $" + costEnvelopes$);
        System.out.println("Envelopes tax= $" + Math.round(taxEnvelopes$*100)/100.0+"0");
        System.out.println("Envelopes Total= $"+Math.round(totalEnvelopes$*100)/100.0);
        System.out.println("                                 ");
        System.out.println("Subtotal= $" + Subtotal$);
        System.out.println("Tax= $" + Math.round(Tax$*100)/100.0);
        System.out.println("Total= $" + Math.round(Total$*100)/100.0);
        
    }
}
 