public class Main {
    public static void main(String[] args) {
        // Abstract Factory Example
        RestaurantFactory italianFactory = new ItalianRestaurantFactory();
        Menu italianMenu = italianFactory.createMenu();
        Chef italianChef = italianFactory.createChef();
        
        italianMenu.displayItems();
        italianChef.cook();
        
        RestaurantFactory chineseFactory = new ChineseRestaurantFactory();
        Menu chineseMenu = chineseFactory.createMenu();
        Chef chineseChef = chineseFactory.createChef();
        
        chineseMenu.displayItems();
        chineseChef.cook();
        
        // Adapter Example
        ThirdPartyMenu thirdPartyMenu = new ThirdPartyMenu();
        Menu adaptedMenu = new ThirdPartyMenuAdapter(thirdPartyMenu);
        
        adaptedMenu.displayItems();
        
        // State Example
        Restaurant restaurant = new Restaurant();
        
        restaurant.setState(new OpenState());
        restaurant.request();
        
        restaurant.setState(new ClosedState());
        restaurant.request();
    }
}