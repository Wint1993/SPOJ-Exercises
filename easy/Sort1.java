package łatwe;

import java.util.*;

/**
 * Created by Błażej on 2017-07-12.
 */
class Sort1 {

    public String name;
    public int x;
    public int y;
    public double distance;
    public static List<Sort1> list = new ArrayList<>();

    public Sort1(String name, int x, int y){
        this.name = name;
        this.x = x;
        this.y = y;
        this.distance = Math.sqrt((Math.pow(x,2))+(Math.pow(y,2)));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());

        while(t-->0){

            int n = sc.nextInt();
            while(n-->0){
                String name = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();
                Sort1 sort1 = new Sort1(name,x,y);
                list.add(sort1);
            }
            sorted(list);
            list.clear();
        }
    }

    public static void sorted(List<Sort1> list){
      list.sort(Comparator.comparing(Sort1::getDistance));
      for(int i=0;i<list.size();i++){
          System.out.println(list.get(i).toString());
      }
        System.out.println();
    }

    @Override
    public String toString() {
        return name + " " + x + " " + y;
    }
    public double getDistance() {
        return distance;
    }
}
