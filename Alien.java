package practice;


public class Alien {
	String aname;
	int aid;
	int arating;
	public Alien(String aname, int aid, int arating) {
		super();
		this.aname = aname;
		this.aid = aid;
		this.arating = arating;
	}

	public String getAname() {
		return aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public int getArating() {
		return arating;
	}

	public void setArating(int arating) {
		this.arating = arating;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Alien [aname=" + aname + ", aid=" + aid + ", arating=" + arating + "]";
	}

	public String updatedName(String updateName){
		aname=updateName;
		return aname;
	}
}

