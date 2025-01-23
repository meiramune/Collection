
package practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chapter5 {

	public static void main(String[] args) {

		// プログラムを作成
		//LocalDate.of()で書くことで日付の意味を持つ数字として認識される
		Task task1 = new Task(LocalDate.of(2021, 10, 21), "牛乳を買う。");
		Task task2 = new Task(LocalDate.of(2021, 9, 15), "○○社面談。");
		Task task3 = new Task(LocalDate.of(2021, 12, 4), "手帳を買う。");
		Task task4 = new Task(LocalDate.of(2021, 8, 10), "散髪に行く。");
		Task task5 = new Task(LocalDate.of(2021, 11, 9), "スクールの課題を解く。");

		List<Task> taskList = new ArrayList<Task>();
		taskList.add(task1);
		taskList.add(task2);
		taskList.add(task3);
		taskList.add(task4);
		taskList.add(task5);

		// compraeable、compareToを実装することでソートが使える
		Collections.sort(taskList);

        //1行ずつに改行されて表示される
		for (Task task : taskList) {
			System.out.println(task);
		}

	}
}