package helpTasksMath;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileCacheImageOutputStream;

public class Test {

	static Pi pi = new Pi();
	static Fibonacci fibo = new Fibonacci("123456789");
	static int task ;
	public static void main(String[] args) {
		/*try {
			testFibo();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		test();
	}

	public void testPi() {
		pi.getTask();
		pi.resault();

		pi.getTask();
		pi.resault();

		pi.getTask();
		pi.resault();

		pi.getTask();
		pi.resault();

		pi.getTask();
		pi.resault();
	}

	public static void testFibo() throws IOException {
		File file = new File("D:\\OneDrive\\Service\\NetServ\\src\\helpTasksMath\\resault.txt");
		file.createNewFile();
		FileWriter writer = new FileWriter(file);
		long time = System.nanoTime();

		fibo.getTask();
		System.out.println("1:" + fibo.resault());
		writer.write("1:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("12:" + fibo.resault());
		writer.write("12:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("123:" + fibo.resault());
		writer.write("123:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("1234:" + fibo.resault());
		writer.write("1234:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("12345:" + fibo.resault());
		writer.write("12345:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("123456:" + fibo.resault());
		writer.write("123456:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("1234567:" + fibo.resault());
		writer.write("1234567:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		System.out.println("12345678:" + fibo.resault());
		writer.write("12345678:" + fibo.resault() + "\n");
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		writer.write("123456789:" + fibo.resault() + "\n");
		System.out.println("123456789:" + fibo.resault());
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		fibo.getTask();
		writer.write("1234567890:" + fibo.resault() + "\n");
		System.out.println("1234567890:" + fibo.resault());
		System.out.println(TimeUnit.NANOSECONDS.toSeconds(System.nanoTime()));
		writer.flush();

		writer.close();

	}
	
	public static void test () {
		
		(new Thread(new Fibonacci("1235"))).start();
		
		(new Thread(new Fibonacci("12"))).start();
		
		(new Thread(new Fibonacci("123"))).start();
		
		
	}
}
