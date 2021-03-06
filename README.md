# OCafe Kiosk 

This application simulates a virtual food ordering system for a cafe. It features an interactive menu comprised of my favourite 
items from brunch cafes I've visited around the world! Hopefully the OCafe Kiosk can inspire you to explore new cuisines, 
or to take notice of local cafes that artfully combine unique cultural flavours with the warm ambiance of a traditional 
cafe, and appreciate the style that influenced this project!

## Demo

https://user-images.githubusercontent.com/74160990/118728615-7d814000-b802-11eb-841c-e74ab9e0ad50.mp4

<img width="1097" alt="Screen Shot 2021-05-18 at 6 08 01 PM" src="https://user-images.githubusercontent.com/74160990/118729782-81ae5d00-b804-11eb-9002-51be4140e7bd.png">
<img width="1098" alt="Screen Shot 2021-05-18 at 6 08 18 PM" src="https://user-images.githubusercontent.com/74160990/118729786-83782080-b804-11eb-9afd-19ea7a535329.png">
<img width="1097" alt="Screen Shot 2021-05-18 at 6 10 43 PM" src="https://user-images.githubusercontent.com/74160990/118729798-896e0180-b804-11eb-8efc-e0bf53aee316.png">
<img width="1097" alt="Screen Shot 2021-05-18 at 6 11 08 PM" src="https://user-images.githubusercontent.com/74160990/118729807-8c68f200-b804-11eb-88aa-22dbc1c07ecf.png">
<img width="1098" alt="Screen Shot 2021-05-18 at 6 14 35 PM" src="https://user-images.githubusercontent.com/74160990/118730101-0b5e2a80-b805-11eb-9ad4-de70b6bb2579.png">
<img width="1098" alt="Screen Shot 2021-05-18 at 6 15 02 PM" src="https://user-images.githubusercontent.com/74160990/118730103-0c8f5780-b805-11eb-928e-d50d8df4e1b6.png">
<img width="1098" alt="Screen Shot 2021-05-18 at 6 15 28 PM" src="https://user-images.githubusercontent.com/74160990/118730111-0dc08480-b805-11eb-9d2c-0f1a896f16db.png">





## Set Up
A Java Runtime Environment (JRE) is required to run the application, available for download [here](https://www.oracle.com/ca-en/java/technologies/javase-jre8-downloads.html).


1. Clone repository using any method. To clone using git, enter the following in the Terminal/Command Prompt:
```bash
git clone https://github.com/vanessaip/OCafeProject.git
```
alternatively, the zip file can be found at the green **Code** button   
    
2. Navigate to the project file:
```bash
cd OCafeProject
```
    
3. Run the application:
```bash
java -jar out/artifacts/OCafe_jar/OCafe.jar
```


## Features
### Menu
- Browse menu items by category
- Select an item to view its image, details, and available customizations
- Customize menu items by selecting add-ons, size options etc. (unique to each item)
- Modify the quantity of an item
- View updated price dynamically

### Order
- Add items with desired customizations to the current order
- View summary of all the items added to the order
- Change the quantity of items in the order
- Remove items from the order
- Place the order

### Account
- Create an account (optional)
- Save the current order to the account
- View previous orders sorted by date 
- Clear order history
- Sign in to access data from an account after relaunching the app or signing out
- Sign out 

## Bugs
- "Invalid username" error pops up if "cancel" is selected at sign in
