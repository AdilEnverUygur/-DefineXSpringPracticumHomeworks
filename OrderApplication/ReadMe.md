## Second Homework: Order Application

Write an application where a customer can create orders, save and view their invoices.
Requirements
> 1.The concepts of Final, static, overload, override, constructor, inheritance, polymorphism, encapsulation, List, Set, Map should be used.
>
> 2.You can add to the system.
>
> 3.It is enough to work on the main method.
>
> 4.Try to write in accordance with SOLID principles
>
### Requirements :
>1.Listing operations should be done using stream.
>
>2.Create a Maven project.
>
>3.Run the maven commands and add the output
>
>4.List all customers
>
>5.Able to create new customers 
> 
>6.List customers with the letter 'C' in them
>
>7.List the total amount of invoices of customers who registered in June
>
>8.List all invoices in the system
>
>9.List invoices over 1500TL in the system
>
>10.Calculate the average of invoices over 1500TL in the system
>
>11.List the names of the customers with invoices under 500TL in the system
>
>12.Write the code that lists the companies with an average of less than 750 invoices for the month of June 12.

### Solutions Step By Step:
>1.--> Create super class named `MainCustomer`.it includes `name`,`sector` fields, Constructor and getter
>
>2.--> Create Interface named `CustomerInterface`. it includes `addInvoice` method.
> 
>3.--> Create class named `Customer`.it extends `MainCustomer` and implements `CustomerInterface`.
> 
>4.--> Create class name `Invoice`. it includes `month`,`amont` fields and related getter method.
> 
>5.-->Create runner class named `OrderApplication`. it includes main method, we create customer object and Display results as requirement.

### Result:
![My Image1](https://github.com/AdilEnverUygur/-DefineXSpringPracticumHomeworks/blob/main/OrderApplication/ScreenShot/1.png)
![My Image2](https://github.com/AdilEnverUygur/-DefineXSpringPracticumHomeworks/blob/main/OrderApplication/ScreenShot/2.png)
