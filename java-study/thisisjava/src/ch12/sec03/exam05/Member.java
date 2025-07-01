package ch12.sec03.exam05;

import lombok.*;

@Data
@AllArgsConstructor
public class Member {
	private String id;
	@NonNull  // name은 null을 넣을 수 없음
	private String name;
	private int age;
}
