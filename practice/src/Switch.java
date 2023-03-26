public class Switch {
    public static void main(String[] args) {
//        int value = 0;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }else if (value == 2){
//            System.out.println("Value was 2");
//        }else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 4;
        //int switchValue2 = 4; //never use switchValue2

        switch (switchValue){
            case 1:
                System.out.println("The value is 1");
                break;
            case 2:
                System.out.println("The value is 2");
                break;
            case 3: case 4: case 5:
                System.out.println("The value is a " + switchValue);
                break;
            default:
                System.out.println("Was not a 1, 2, 3, 4, or 5");
                break;
        }
    }
}