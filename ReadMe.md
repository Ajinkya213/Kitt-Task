# Junior Engineer Challenge Kitt

**Situation**: 
We are looking to add a pricing function to our meeting room bookings feature, as we’ve noticed that this is being requested more and more by companies.

**The Task**: Create a function that takes a booking length in minutes and returns a price.
Please take into account readability, performance, tests and safety when implementing your solution.

**Context**: The intended functionality of the service is to calculate the price of a meeting room based upon the given meeting duration and following [min|hour|day|week] tariff:
Price per minute: £2 Price per hour: £22 Price per day: £60 Price per week: £105
Pseudocode interface:

GetPrice(duration_minutes as Integer) returns price as Integer
- The pricing function should use the cheapest rate for given duration.
  - For example if the duration is 3 hours it should use the daily price of £60 as this is cheaper than using the price per hour (£66).
    Example test Cases below:

    1440 minutes = £60 

    2880 minutes = £105
  
  - 20160 minutes = £210

## How to run solution

**1. Using Terminal**
- Download and Uncompress the "Kitt.zip"
- Goto to the ```cd Kitt/Prices/src ```
- Make sure the Java is installed on the machine to check run ``` java -version ```
- Run the command ``` javac *.java``` which will compile all the java files to class files
- Finally, to run the project run ``` java Main.java```

**2. Using InteliJ**
- Download and Uncompress the "Kitt.zip"
- Open "InteliJ" and find the "Kit" folder.
- Simply run the project 

## Developer Logs

- For the input of the program it takes a positive integer of 32-bit signed two's complement integer, which has a minimum value of -2 <sup>31</sup> and a maximum value of 2 <sup>31</sup> -1
- As minutes cannot be a string, decimal or negative number, all the checks are in place which gives a prompt to the user.
- I am sorry I was not able to write JUnit test for the code for random positive numbers. I wish I could have if I have a time.
- Although, I have tested with 15 random value manually and re-checked with the code output.
- It was a great exercise. I liked how Kitt interview process works and as per the challenge it was great as the answers are not available directly one has to build the answers by themselves with concepts.

Thanks 👍