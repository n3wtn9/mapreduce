/**
 * Created with IntelliJ IDEA.
 * User: newton
 * Date: 7/29/14
 * Time: 6:57 PM
 * To change this template use File | Settings | File Templates.
 */
public class Client implements Runnable{
    public void run() {
        System.out.println("Hello from a thread.");
    }

    public static void main(String[] args) {
        (new Thread(new Client())).start();
    }
}
