package bean;

public class StringInfo {
	private int length;
	private String seq;
	private int index;

	public StringInfo() {
	}

	public StringInfo(int length, String seq, int index) {
		this.length = length;
		this.seq = seq;
		this.index = index;
	}

	public int getlength() {
		return length;
	}

	public void setlength(int length) {
		this.length = length;
	}

	public String getseq() {
		return seq;
	}

	public void setseq(String seq) {
		this.seq = seq;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "StringInfo [length=" + length + ", seq=" + seq + ", index=" + index + "]";
	}

}
