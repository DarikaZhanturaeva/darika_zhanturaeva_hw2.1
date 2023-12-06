public class Main {
    public static void main(String[] args){
    int a = (int) (Math.random()*(100));

    System.out.println(a);
//на сообразительность
            System.out.println(goForAWalk(35, 17));
            System.out.println(goForAWalk(18, 28));
            System.out.println(goForAWalk(50, 10));
            System.out.println(goForAWalk(5, -5));
            System.out.println(goForAWalk(35, 17));
        }
        public static String goForAWalk(int age, int temperature) {
            if ((age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) ||
                    (age < 20 && temperature >= 0 && temperature <= 28) ||
                    (age > 45 && temperature >= -10 && temperature <= 25)) {
                return "можно идти гулять";
            } else {
                return "Оставайтесь дома!";
            }
        }

    }
