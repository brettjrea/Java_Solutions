public class Widget {

    private int v1, v2;

    public Widget(int a, int b) {v1=a; v2=b;}
    public int getTot() {return v1+v2;}
    public void update(){v1=v1+v2;}
    public String toString() {return ""+v1+","+v2;}

    public static void main(String[] args) {
        Widget w = new Widget(2,3);
        int tot = w.getTot();
        w.update();
        System.out.println(w + " " + tot);
    }

    public class Widget2 {
        private int v1, v2;
        public Widget2(int a, int b) {v1=a; v2=b;}
        public int getTot() {return v1+v2;}
        public void update(){v1=v1+v2;}
        public String toString() {return ""+v1+","+v2;}
   
    }

}

