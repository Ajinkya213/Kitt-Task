/**
 * Author: Ajinkya Bhushan
 * Language: Java
 * Platform: Java 14
*/

/**   Pricing class provides pricing function to the meeting room bookings feature */
public class Pricing {
    private int consumedMinutes; //division of minutes of the service is used.
    private int consumedHours; //division of hours of the service is used.
    private int consumedDays; //division of days of the service is used.
    private int consumedWeeks; //division of weeks of the service is used.
    private int price; //amount to be charged to when a service is used.
    public int getPrice(int consumedMinutes) {   //provides the amount which has to be paid by the user based on the minutes consumed while using the service.

            this.consumedMinutes = consumedMinutes % 60; //extraction of minutes from consumedMinutes

            this.consumedHours = consumedMinutes / 60;
            this.consumedHours = this.consumedHours % 24; //extraction of hours from consumedMinutes out of 24 hours in a day

            this.consumedDays = consumedMinutes / (60 * 24);
            this.consumedDays = this.consumedDays % 7; //extraction of days from consumedMinutes out of 7 days in a week

            this.consumedWeeks = consumedMinutes / (60 * 24 * 7); // extraction of weeks from consumedMinutes

            System.out.println(consumedMinutes+" mins translate to "+"Weeks: "+this.consumedWeeks+"| Days: "+this.consumedDays+"| Hours: "+this.consumedHours+"| Minutes :"+this.consumedMinutes);

            // Conditions for getting the cheapest price based on the condition; This is using the tresh
            if (this.consumedMinutes > 11) {
                this.price += Tariff.hour;
            } else {
                this.price += Tariff.minute * this.consumedMinutes;
            }

            if (this.consumedHours > 2) {
                this.price += Tariff.day;
            } else {
                this.price += Tariff.hour * this.consumedHours;
            }

            if (this.consumedDays > 1) {
                this.price += Tariff.week;
            } else {
                this.price += Tariff.day * this.consumedDays;
            }

            if (this.consumedWeeks > 0) {
                this.price += Tariff.week * consumedWeeks;
            }
            return this.price; // return of the final price
        }

   public boolean checkInput(int consumedMinutes){
        return consumedMinutes < 0 ? true : false;
   }

}