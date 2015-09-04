// CSE2
// Athicha Srivirote
// ats219
// 09/04/15
// Program : to calculate the costs of items including PA sales tax

// create Arithmatic class

     public class Arithmetic{
         
         public static void main(String[] args){
             
             int nSocks = 3; // number of pairs of socks 
             
             double sockCost$ = 2.58; // cost per pair of socks
             
             int nGlasses = 6; // number of drinking glasses
             
             double glassCost$ = 2.29; // cost per glass
             
             int nEnvelopes = 1; // number of boxes of envelopes 
             
             double envelopeCost$ = 3.25; // cost per box of envelopes 
             
             double taxPercent = 0.06; // sales tax in PA
             
             
             
             
             
             //Calculate socks
             double totalSockCost$ = nSocks*sockCost$;
             double taxSock$ =  (double) ((int) ((taxPercent*sockCost$)*100))/100; // calculate sales tax for each pair of socks 
             double totalTaxSock$ = (double) ((int) ((totalSockCost$*taxPercent)*100))/100;
             double totalSockPurchase$ = (double) ((int) ((totalSockCost$ + totalTaxSock$)*100))/100;
             System.out.println("Your items are "+nSocks+" pairs of socks ");
             System.out.println("One pair of socks is "+sockCost$+" $ and sales tax per pair is "+taxSock$+" $ " );
             System.out.println("Total cost (before tax) is "+totalSockCost$+" $ ");
             System.out.println("Total sales tax is "+totalTaxSock$+" $ ");
             System.out.println("Total cost of socks purchase is "+totalSockPurchase$+" $ ");
             
             System.out.println("");
             
             //Calculate drinking glasses
             double totalGlassCost$ = nGlasses*glassCost$;
             double taxGlass$ = (double) ((int) ((taxPercent*glassCost$)*100))/100;
             double totalTaxGlass$ = (double) ((int) ((totalGlassCost$*taxPercent)*100))/100;
             double totalGlassPurchase$ = totalGlassCost$ + totalTaxGlass$;
             System.out.println("Your items are "+nGlasses+" glasses");
             System.out.println("One drinking glass is "+glassCost$+" $ and sales tax per glass is "+taxGlass$+" $ ");
             System.out.println("Total cost(before tax) is "+totalGlassCost$+" $ ");
             System.out.println("Total sales tax is "+totalTaxGlass$+" $ ");
             System.out.println("Total cost of drinking glass purchase is "+totalGlassPurchase$+" $ ");
             
             System.out.println("");
             
             //Calculate envelope
             double totalEnvelopeCost$ = nEnvelopes*envelopeCost$;
             double taxEnvelope$ = (double) ((int) ((taxPercent*envelopeCost$)*100))/100;
             double totalTaxEnvelope$ = (double) ((int) ((totalEnvelopeCost$*taxPercent)*100))/100;
             double totalEnvelopePurchase = totalEnvelopeCost$ + totalTaxEnvelope$;
             System.out.println("Your item is "+nEnvelopes+" envelope ");
             System.out.println("One envelope is "+envelopeCost$+" $ and salestax per envelope is "+taxEnvelope$+" $ ");
             System.out.println("Total cost(before tax) is "+totalEnvelopeCost$+" $ ");
             System.out.println("Total sales tax is "+totalTaxEnvelope$+" $ ");
             System.out.println("Total cost of envelope purchase is "+totalEnvelopePurchase+" $ ");
             
             System.out.println("");
             
             //Calculate total price
             double totalCost = totalSockCost$ + totalGlassCost$ + totalEnvelopeCost$; // total cost before tax
             double totalTax = totalTaxSock$ + totalTaxGlass$ + totalTaxEnvelope$;
             double totalCostWithTax = totalSockPurchase$ + totalGlassPurchase$ + totalEnvelopePurchase; // total cost including tax
             
             System.out.println("Total price(before tax) is "+totalCost+" $ ");
             System.out.println("Total sales tax is "+totalTax+" $ ");
             System.out.println("Total price(tax included) is "+totalCostWithTax+" $ ");
             
             
             
             
             
             
             
             
             
             
             
             
             
             
         }
     }