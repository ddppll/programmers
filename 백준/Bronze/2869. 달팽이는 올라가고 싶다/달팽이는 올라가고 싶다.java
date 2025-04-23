import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt(); // 낮에 올라가는 거리
		int B = sc.nextInt(); // 밤에 미끄러지는 거리
		int V = sc.nextInt(); // 나무 막대의 높이

		// 계산
		int days = (int) Math.ceil((double)(V - A) / (A - B)) + 1;

		// 출력
		System.out.println(days);

		sc.close();


	}

}