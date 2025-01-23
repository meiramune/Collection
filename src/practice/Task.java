package practice;

import java.time.LocalDate;

public class Task implements Comparable<Task> {
	// タスクの日付とタスク名を管理するためのフィールド
	public LocalDate taskDate;
	public String taskName;

	// コンストラクタ
	public Task(LocalDate taskDate, String taskName) {
		this.taskDate = taskDate;
		this.taskName = taskName;

	}

	@Override
	public int compareTo(Task otherTask) {
		// taskDateが早いほうが前に来るように比較するための書き方
		return this.taskDate.compareTo(otherTask.taskDate);
	}

	@Override
	public String toString() {
		return this.taskDate + ":" + this.taskName;
	}
}