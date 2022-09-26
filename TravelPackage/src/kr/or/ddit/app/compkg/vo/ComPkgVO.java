package kr.or.ddit.app.compkg.vo;

public class ComPkgVO {
	private String comPkgDay;
	private String comPkgId;
	private String pkgId;
	private String comPkgRd;
	private String comPkgWrt;
	private String pkgCount;
	private String rsvStat;
	
	public String getPkgCount() {
		return pkgCount;
	}
	public void setPkgCount(String pkgCount) {
		this.pkgCount = pkgCount;
	}
	public String getComPkgDay() {
		return comPkgDay;
	}
	public void setComPkgDay(String comPkgDay) {
		this.comPkgDay = comPkgDay;
	}
	public String getComPkgId() {
		return comPkgId;
	}
	public void setComPkgId(String comPkgId) {
		this.comPkgId = comPkgId;
	}
	public String getPkgId() {
		return pkgId;
	}
	public void setPkgId(String pkgId) {
		this.pkgId = pkgId;
	}
	public String getComPkgRd() {
		return comPkgRd;
	}
	public void setComPkgRd(String comPkgRd) {
		this.comPkgRd = comPkgRd;
	}
	public String getComPkgWrt() {
		return comPkgWrt;
	}
	public void setComPkgWrt(String comPkgWrt) {
		this.comPkgWrt = comPkgWrt;
	}
	public String getRsvStat() {
		return rsvStat;
	}
	public void setRsvStat(String rsvStat) {
		this.rsvStat = rsvStat;
	}
	@Override
	public String toString() {
		return "ComPkgVO [comPkgDay=" + comPkgDay + ", comPkgId=" + comPkgId + ", pkgId=" + pkgId + ", comPkgRd="
				+ comPkgRd + ", comPkgWrt=" + comPkgWrt + ", pkgCount=" + pkgCount + ", rsvStat=" + rsvStat + "]";
	}
	
}
