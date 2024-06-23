
public class Park {

    public class InfoAboutAttractions{
        private String attractionType;
        private String workHours;
        private float price;

        public InfoAboutAttractions (String attractionType, String workHours, float price){
            this.attractionType = attractionType;
            this.workHours = workHours;
            this.price = price;
        }

        public void info() {
            System.out.println("\n" + attractionType + ":" + "\n" + "Время работы: " +
                    workHours + ", стоимость билета: " + price + " $.");
        }
    }
}