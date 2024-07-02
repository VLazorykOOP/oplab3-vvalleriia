class ChineseRestaurantFactory implements RestaurantFactory {
    public Menu createMenu() {
        return new ChineseMenu();
    }
    
    public Chef createChef() {
        return new ChineseChef();
    }
}