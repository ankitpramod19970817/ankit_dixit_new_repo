package Practice_Codeing;

public interface Interf4 {
    public void m1();
}
class Withinnerclass{
    int x=100;
    public void m2() {
        Interf4 i = new Interf4() {
            int x = 200;

            @Override
            public void m1() {
                System.out.println(this.x);
            }
        };
        i.m1();
    }
    public static void main(String[] args) {
        Withinnerclass w=new Withinnerclass();
        w.m2();
    }
}
