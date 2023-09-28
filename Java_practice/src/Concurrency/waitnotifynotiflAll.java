// class Message {
// private String message;
// private boolean empty = true;

// public synchronized String read() {
// while (empty) {
// try {
// wait();
// } catch (InterruptedException ex) {

// }
// }
// empty = true;
// notifyAll();
// return message;
// }

// public synchronized void write(String message) {
// while (!empty) {
// try {
// wait();
// } catch (InterruptedException ex) {

// }
// }
// empty = false;
// this.message = message;
// notifyAll();

// }
// }

// class Writer implements Runnable {

// private Message message;

// public Writer(Message message) {
// this.message = message;
// }

// @Override
// public void run() {
// String messages[] = { "Message 1", "Message 2", "Message 3", "Finish" };
// for (int i = 0; i < messages.length; i++) {
// message.write(messages[i]);
// try {
// Random random = new Random();
// Thread.sleep(random.nextInt(2000));
// } catch (InterruptedException ex) {

// }
// }
// }

// }

// class Reader implements Runnable {
// private Message message;

// public Reader(Message message) {
// this.message = message;
// }

// @Override
// public void run() {
// Random random = new Random();

// // TODO Auto-generated method stub
// for (String msg = message.read(); !msg.equals("Finish"); msg =
// message.read()) {
// System.out.println(msg);
// try {
// Thread.sleep(random.nextInt(2000));
// } catch (InterruptedException ex) {

// }
// }
// }

// }

// public class ConcurrencyLauncher implements Launcher {

// @Override
// public void launch() throws CloneNotSupportedException {
// Message message = new Message();
// (new Thread(new Writer(message))).start();
// (new Thread(new Reader(message))).start();
// }

// }
