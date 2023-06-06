class ParkingSystem {
    // These 3 variables work as a counter of the current vacant parking spots
    private int numBig;
    private int numMed;
    private int numSmall;

    public ParkingSystem(int big, int medium, int small) {
        this.numBig = big;
        this.numMed = medium;
        this.numSmall = small;
    }
    
    public boolean addCar(int carType) {
        if(carType == 1 && this.numBig > 0){
            this.numBig--;
        }else if(carType == 2 && this.numMed > 0){
            this.numMed--;
        }else if(carType == 3 && this.numSmall > 0){
            this.numSmall--;
        }else{
            return false;
        }

        return true;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */
