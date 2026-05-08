public class usingInterface {
    public static void main(String[] args) {

                C obj = new C();
                obj.show();
            }
        }

    interface A {
        default void show() {
            System.out.println("Interface A");
        }
    }

    interface B {
        default void show() {
            System.out.println("Interface B");
        }
    }

    class C implements A, B {

        public void show() {
            A.super.show();   // choose explicitly
            B.super.show();
        }
    }

