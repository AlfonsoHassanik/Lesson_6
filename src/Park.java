public class Park {

    private String name;
    private Attraction[] attractions;

    public Park(String name, int numAttractions) {
        this.name = name;
        this.attractions = new Attraction[numAttractions];
    }

    public void setAttraction(int index, String name, String workingHours, double cost) {
        attractions[index] = new Attraction(name, workingHours, cost);
    }

    public void printAttractionsInfo() {
        System.out.println("Аттракционы в " + name + ":");
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }
    }

    public class Attraction {

        private String name;
        private String workingHours;
        private double cost;

        public Attraction(String name, String workingHours, double cost) {
            this.name = name;
            this.workingHours = workingHours;
            this.cost = cost;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Цена: " + cost);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Park park = new Park("Парк аттракционов", 3);

        park.setAttraction(0, "Веселые горки", "10:00 - 18:00", 25.0);
        park.setAttraction(1, "Качели", "12:00 - 20:00", 15.0);
        park.setAttraction(2, "Самокат", "11:00 - 19:00", 10.0);

        park.printAttractionsInfo();
    }
}
