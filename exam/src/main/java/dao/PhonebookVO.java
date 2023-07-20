package dao;

import org.springframework.stereotype.Component;

@Component
public class PhonebookVO {
	int idx;
	String name, hp, memo;
	public PhonebookVO() {
		// TODO Auto-generated constructor stub
	}
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
	}
	public PhonebookVO(int idx, String name, String hp, String memo) {
		super();
		this.idx = idx;
		this.name = name;
		this.hp = hp;
		this.memo = memo;
	}
	@Override
	public String toString() {
		return "PhonebookVO [idx=" + idx + ", name=" + name + ", hp=" + hp + ", memo=" + memo + "]";
	}
	
}
