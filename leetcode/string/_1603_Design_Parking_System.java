public class _1603_Design_Parking_System {
    public static void main(String[] args) {

    }

    static class ParkingSystem {
        int big;
        int medium;
        int small;

        public ParkingSystem(int big, int medium, int small) {
            this.big = big;
            this.medium = medium;
            this.small = small;
        }

        public boolean addCar(int carType) {
            if(carType == 1 && this.big > 0) {
                this.big -= 1;
                return true;
            } else if (carType == 2 && this.medium > 0) {
                this.medium -= 1;
                return true;
            } else if (carType == 3 && this.small > 0) {
                this.small -= 1;
                return true;
            }
            return false;
        }
    }
}
