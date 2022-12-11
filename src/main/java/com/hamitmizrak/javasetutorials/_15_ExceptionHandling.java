package com.hamitmizrak.javasetutorials;


public class _15_ExceptionHandling {

    public static void main(String[] args) throws ArithmeticException, MySpecialException {
        System.out.println("ilk satır");
        //throw  new ArithmeticException("Sıfıra böldün");
        throw new MySpecialException("Sıfıra böldün");
       /* try {
            int x = 4 / 0;
        } catch (ArithmeticException ai) {
            System.out.println("Sıfıra bölme istisnası");
            ai.printStackTrace();
        } catch (Exception e) {
            System.out.println("Genel bölme hatası");
            e.printStackTrace();
        } finally {
            System.out.println("Db.closed");
            System.out.println("port.closed");
        }*/



        //System.out.println("son satır");
    }


}
