import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class RanadomExample {
	public static void main (String[] args) {
		
		
	// random number with Math.random method
		int min = 200;
		int max = 400;
	int a = (int) (Math.random()*(max -min+1)+min);
	
	// random method with regular method
	Random random = new Random();
	int b = random.nextInt(500);
	
	
	//random number with ThreadLocalRandom.current() method
	int c = ThreadLocalRandom.current().nextInt(400,500);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	
	//random number with ints() method
	int streamSize = 10, randomNumberOrigin=20, randomNumberBound=50;
	Random random1 = new Random();
	IntStream ds =random1.ints(streamSize,randomNumberOrigin,randomNumberBound);
	ds.forEach(System.out::println);
	
	}
}
