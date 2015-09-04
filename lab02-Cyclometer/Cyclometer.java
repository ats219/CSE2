// CSE2
// Athicha Srivirote
// ats219
// 09/04/15
// Cyclometer
// purpose of the program : 1.calculate the distance trveled by the bicycle for each Trip 1 and Trip2 in miles
//                          2.calculate total distance of Trip 1 and Trip 2 in miles                           


// Declare class
     public class Cyclometer{
         
// write a main method
     public static void main(String[] args){
         
         // Store input data in variables 
         int secsTrip1 = 480; // secsTrip1 is a time completed by the bicycle for the first trip
         
         int secsTrip2 = 3220; // secsTrips is a time completed by the bicycle for the second trip
         
         int countsTrip1 = 1561; // countsTrip1 represents count of the front wheel rotation for the first trip
         
         int countsTrip2 = 9037; // countsTrip2 represents count of the front wheel rotaion for the second trip
         
         //Store constant data and other useful variables for calculation
         double wheelDiameter = 27.0; // diameter of the bycycle's wheel in inches
        
         double PI = 3.14159; // PI constant 
         
         int feetPerMile = 5280;// feetPerMile represents ratio 1 mile = 5280 feet 
         
         int inchesPerFoot = 12;// inchesPerfoot represents ratio 1 feet = 12 inches
         
         int secondsPerMinute = 60;// secondsPerMinute represents ration 1 minute = 60 seconds
         
         double distanceTrip1;// distance of the first trip
         
         double distanceTrip2;// distance of the second trip
         
         double totalDistance;// total distance = distanceTrip1 + distanceTrip2 
         
         //Print out the number of stored number of seconds and counts
         System.out.println(" Trip1 took "+(secsTrip1/secondsPerMinute)+ " minutes and had "+(countsTrip1)+" counts. ");
         
         System.out.println(" Trip2 took "+(secsTrip2/secondsPerMinute)+ " minutes and had "+(countsTrip2)+" counts. ");
         
         //calculate distance for the first trip
         
         distanceTrip1 = countsTrip1*wheelDiameter*PI; //this give a distance1 in inches
         
         distanceTrip1 = (distanceTrip1)/(inchesPerFoot*feetPerMile);//this give distane1 in miles
         
         distanceTrip2 = countsTrip2*wheelDiameter*PI; //this give a distance2 in inches
         
         distanceTrip2 = (distanceTrip2)/(inchesPerFoot*feetPerMile);//this give distane1 in miles
         
         totalDistance = distanceTrip1 + distanceTrip2;//calculate total distance
         
         //Print out the distance(output data)
         System.out.println(" Trip1 was "+distanceTrip1+" miles ");
         
         System.out.println(" Trip2 was "+distanceTrip2+" miles ");
         
         System.out.println(" The total distance was "+totalDistance+" miles ");
         
         
        }
     }