package com.jsp.Ipl2;

import java.util.Set;

public class Ipl2team {
	private String teamname;
	private String teamcaptain;
    private Set<String> RCBplayer;
    private Set<Integer> Rcbjno;
	public Ipl2team(String teamname, String teamcaptain, Set<String> rCBplayer, Set<Integer> rcbjno) {
		super();
		this.teamname = teamname;
		this.teamcaptain = teamcaptain;
		RCBplayer = rCBplayer;
		Rcbjno = rcbjno;
	}
	public String getTeamname() {
		return teamname;
	}
	public void setTeamname(String teamname) {
		this.teamname = teamname;
	}
	public String getTeamcaptain() {
		return teamcaptain;
	}
	public void setTeamcaptain(String teamcaptain) {
		this.teamcaptain = teamcaptain;
	}
	public Set<String> getRCBplayer() {
		return RCBplayer;
	}
	public void setRCBplayer(Set<String> rCBplayer) {
		RCBplayer = rCBplayer;
	}
	public Set<Integer> getRcbjno() {
		return Rcbjno;
	}
	public void setRcbjno(Set<Integer> rcbjno) {
		Rcbjno = rcbjno;
	}
	@Override
	public String toString() {
		return "Ipl2team [teamname=" + teamname + ", teamcaptain=" + teamcaptain + ", RCBplayer=" + RCBplayer
				+ ", Rcbjno=" + Rcbjno + "]";
	}
    

}
