##  House Types Applications 

> Create 3 house types: House, Villa, Summer House.

> Create at least 3 House, Villa and Cottage objects in a class and write the methods that return these examples to you. (getEvList, getVillaList etc).
 
> Also write the following methods inside a service class:
 
> A method that returns the total prices of houses
 
> A method that returns the total prices of villas
 
> The method that returns the total prices of the cottages

> Method to return the total price of all types of houses

> A method that returns the average square meter of houses
 
> A method that returns the average square meter of villas

> The method that returns the average square meter of the summerHouse

> Method to return the average square meter of houses of all types

> A method that filters all types of houses according to the number of rooms and halls and returns
 
``Not:``
>  Make sure the nomenclature is in English.

> Design in accordance with object-oriented programming.
 
> Follow the clean code principles.
  
> Print all the methods in the main method to the console in a meaningful way.


## Steps:
1. We can create separate classes to represent different types of houses such as `House`, `Villa`, `SummerHouse`.
2. The House class should have attributes such as price, area, number of rooms, and number of halls. The `Villa` and `SummerHouse` classes should inherit from the `House` 
3. Create a class called `ServiceClass` that will contain the methods for calculating the total prices and average areas of the different types of houses, and for filtering the houses by number of rooms and halls.
4. In the `ServiceClass` class, create the following method called `getTotalPriceOfHouses()`,`getTotalPriceOfVillas()`,`getTotalPriceOfSummerHouses()`,`getTotalPriceOfAllHouses()`that iterate over the array of houses and calculate the total price of House,Villa,SummerHouse and AllTypesOfHouse
5. Create methods called `getAverageAreaOfHouses()`, `getAverageAreaOfVillas()`,`getAverageAreaOfSummerHouses()` and `getTotalAreaOfAllHouses()` that calculate the average area of the respective types of houses.
6. Create a method called `filterHousesByRoomsAndHalls(int minRooms, int minHalls)` that takes in a minimum number of rooms and halls as arguments and returns an array of houses that have at least that number of rooms and halls.
7. Create a `Run` class then in the  method, create some instances of the different types of houses, add them to an array, and pass that array to the `ServiceClass`.
8. Call the methods in the `ServiceClass`, passing in the appropriate arguments, and print the results to the console.

