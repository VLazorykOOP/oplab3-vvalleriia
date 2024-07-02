class ItalianRestaurantFactory implements RestaurantFactory {
    public Menu createMenu() {
        return new ItalianMenu();
    }
    
    public Chef createChef() {
        return new ItalianChef();
    }
}