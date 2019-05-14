package club.wearenobug;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SystemManageServiceApplicationTests {

	@Test
	public void contextLoads() {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		for (Integer i : list) {
			for (Integer j : list) {
				if (i == j) {
					if (i == 2) {
						System.out.println(i + "里层");
					}
					System.out.println(i + "外层");
					break;
				}
			}
		}
	}
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		for (Integer i : list) {
			for (Integer j : list) {
				if (i == j) {
					if (i == 2) {
						System.out.println(i + "里层");
					}
					System.out.println(i + "外层");
					break;
				}
			}
		}
	}
}
