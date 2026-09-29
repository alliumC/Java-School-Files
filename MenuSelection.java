import java.util.*;

public class MenuSelection {
    public static void main(String[] args) {
        start(args);
    }

    public static void start(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.print("""
        ===Your Local Filipino Dish Finder===

        1) Adobo
        2) Sinigang
        3) Pansit
        4) Sisig
        5) Lumpia

        =====================================
        
        """);
        System.out.print("Enter the Dish Number [1-5]: ");
        String dish=dataInput.nextLine();
        
        switch (dish){
            case "1":
                System.out.print("""
                \n===You Picked Adobo===
                    
                --Ingredients--
                    1) Pork Belly
                    2) Garlic
                    3) Dried Bay Leaves
                    4) White Vinegar
                    5) Soy Sauce
                    6) Whole Peppercorns
                    7) Water
                    8) Salt

                --Steps--
                    1) Marinate the Pork
                    2) Sear the Marinated Pork
                    3) Simmer with Aromatics
                    4) Finish with Vinegar

                =====================================
                
                """);
                break;
            case "2":
                System.out.print("""
                \n===You Picked Sinigang===
                    
                --Ingredients--
                    1) Pork Belly
                    2) Young Tamarind
                    3) Water Spinach
                    4) String Beans
                    5) Eggplant
                    6) Dalkon Radish (Labanos)
                    7) Okra
                    8) Tomatoes
                    9) Long Green Pepper (Siling Pansigang)
                    10) Onion
                    11) Fish Sauce

                --Steps--
                    1) Extract Flavours from the Tamarind
                    2) Boil the Tamarind Broth and Cool the Meat
                    3) Add the Vegetables Sequentially
                    4) Season it and then Add the Remaining Ingredients
                    5) Souring Agents for Pork Sinigang
                
                =====================================

                    """);
                break;
            case "3":
                System.out.print("""
                \n===You Picked Pansit===
                    
                --Ingredients--
                    1) Rice Noodles
                    2) Egg Noodles
                    3) Pork Belly
                    4) Carrots
                    5) Cabbage
                    6) Onion and Garlic
                    7) Parsley
                    8) Chicken Cube
                    9) Soy Sauce
                    10) Fish Sauce
                    11) Cooking Oil and Water

                --Steps--
                    1) Saute the Pork
                    2) Build the Sauce
                    3) Add the Vegetables
                    4) Cook the Noodles

                =====================================

                """);
                break;
            case "4":
                System.out.print("""
                \n===You Picked Sisig===
                    
                --Ingredients--
                    1) Pork Belly
                    2) Knorr Liquid Seasoning
                    3) Pig Face
                    4) Chicken Liver
                    5) Onion
                    6) Chicharon
                    7) Lady's Choice Mayonnaise
                    8) Onion Powder
                    9) Ground Black Pepper
                    10) Chili Flakes
                    11) Butter
                    12) Cooking Oil
                    13) Water

                --Steps--
                    1) Boil the Water in a Pot
                    2) Grill Boiled Meats
                    3) Heat Oil on a Pan
                    4) Add Chicken Liver
                    5) Add Minced Meat and Chicharonto the Pan
                    6) Add Chili Flakes, Onion Powder, and Ground Black Pepper
                    7) Pour Knorr Liquid Seasoning
                    8) Add Lady's Choice Mayonnaise
                    9) Heat a Metal Plate
                    10) Serve with Calamansi or Lime
                    
                =====================================
                
                """);
                break;
            case "5":
                System.out.print("""
                \n===You Picked Lumpia===
                    
                --Ingredients--
                    1) Ground Pork
                    2) Onion and Carrot
                    3) Garlic Powder'4) Eggs
                    4) Parsley
                    5) Sesame Oil
                    6) Salt and Pepper
                    7) Lumpia Wrappers
                    8) Cooking Oil

                --Steps--
                    1) Mix the Filling
                    2) Wrap the Lumpia
                    3) Fry until Crispy

                =====================================

                """);
                break;
            default:
                System.out.println("Invalid Input, Try Again\n");
                start(args);
                dataInput.close();
                break;
        }/*Switch */
        Loop(args);

    };
    public static void Loop(String[] args) {
        Scanner dataInput = new Scanner(System.in);
        System.out.print("Do You want to get Another Dish from the Menu? [Yes/No] ");
        String option=dataInput.nextLine();
        
        do {
            if (option.equalsIgnoreCase("no")){
                System.out.print("Menu is Now Closed");
                dataInput.close();
                break;
            }
            else if (option.equalsIgnoreCase("yes")){
                start(args);
            }
            else {
                System.out.print("Invalid Option, Try Again\n");
                Loop(args);
            }
        } while (option == "yes"); /*While */

        dataInput.close();
    }
}