class ThirdPartyMenuAdapter implements Menu {
    private ThirdPartyMenu thirdPartyMenu;
    
    public ThirdPartyMenuAdapter(ThirdPartyMenu thirdPartyMenu) {
        this.thirdPartyMenu = thirdPartyMenu;
    }
    
    public void displayItems() {
        thirdPartyMenu.showItems();
    }
}