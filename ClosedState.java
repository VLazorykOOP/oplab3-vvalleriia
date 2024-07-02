class ClosedState implements RestaurantState {
    public void handleRequest() {
        System.out.println("The restaurant is closed.");
    }
}