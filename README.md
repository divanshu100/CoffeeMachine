# CoffeeMachine
CoffeeMachine Assignment

To run coffee machine application, clone this repo in your local.

This is a maven project, to build it from terminal you can use -   mvn compile 

To run the main method and see the results after processing test.json present at /coffeemachine/src/main/resources/test.json  use command-  mvn spring-boot:run
test.json is - 

{
  "machine": {
    "outlets": {
      "count_n": 3
    },
    "total_items_quantity": {
      "hot_water": 500,
      "hot_milk": 500,
      "ginger_syrup": 100,
      "sugar_syrup": 100,
      "tea_leaves_syrup": 100
    },
    "beverages": {
      "hot_tea": {
        "hot_water": 200,
        "hot_milk": 100,
        "ginger_syrup": 10,
        "sugar_syrup": 10,
        "tea_leaves_syrup": 30
      },
      "hot_coffee": {
        "hot_water": 100,
        "ginger_syrup": 30,
        "hot_milk": 400,
        "sugar_syrup": 50,
        "tea_leaves_syrup": 30
      },
      "black_tea": {
        "hot_water": 300,
        "ginger_syrup": 30,
        "sugar_syrup": 50,
        "tea_leaves_syrup": 30
      },
      "green_tea": {
        "hot_water": 100,
        "ginger_syrup": 30,
        "sugar_syrup": 50,
        "green_mixture": 30
      }
    }
  }
}

Output generated by code is 
hot_tea is prepared
black_tea is prepared
green_tea cannot be prepared because green_mixture is not available
hot_coffee cannot be prepared because item hot_water is not sufficient
