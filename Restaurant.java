class Restaurant {
    private RestaurantState state;
    
    public void setState(RestaurantState state) {
        this.state = state;
    }
    
    public void request() {
        state.handleRequest();
    }
}