package Chapter8.day16;

public class DVD {
	private int dvdId;//--���
	private String dvdName; //--����
	private String dvdlendTime;//--���ʱ��
	private String dvdReturnTime;//--�黹ʱ��
	private boolean dvdStatus;//--״̬
	private int lendCount;//--�������
	
	public DVD() {
		super();
	}
	
	public int getDvdId() {
		return dvdId;
	}
	public void setDvdId(int dvdId) {
		this.dvdId = dvdId;
	}
	public String getDvdName() {
		return dvdName;
	}
	public void setDvdName(String dvdName) {
		this.dvdName = dvdName;
	}
	public String getDvdlendTime() {
		return dvdlendTime;
	}
	public void setDvdlendTime(String dvdlendTime) {
		this.dvdlendTime = dvdlendTime;
	}
	public String getDvdReturnTime() {
		return dvdReturnTime;
	}
	public void setDvdReturnTime(String dvdReturnTime) {
		this.dvdReturnTime = dvdReturnTime;
	}
	public boolean isDvdStatus() {
		return dvdStatus;
	}
	public void setDvdStatus(boolean dvdStatus) {
		this.dvdStatus = dvdStatus;
	}
	public int getLendCount() {
		return lendCount;
	}
	public void setLendCount(int lendCount) {
		this.lendCount = lendCount;
	}
	public DVD(int dvdId, String dvdName, String dvdlendTime, String dvdReturnTime, boolean dvdStatus, int lendCount) {
		super();
		this.dvdId = dvdId;
		this.dvdName = dvdName;
		this.dvdlendTime = dvdlendTime;
		this.dvdReturnTime = dvdReturnTime;
		this.dvdStatus = dvdStatus;
		this.lendCount = lendCount;
	}
	@Override
	public String toString() {
		return "DVD [dvdId=" + dvdId + ", dvdName=" + dvdName + ", dvdlendTime=" + dvdlendTime + ", dvdReturnTime="
				+ dvdReturnTime + ", dvdStatus=" + dvdStatus + ", lendCount=" + lendCount + "]";
	}
}
