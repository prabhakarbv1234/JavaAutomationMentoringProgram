package hometask.eight;

import java.util.Date;

public class DirectoryDetails {
    
    private String name;
    private String type;
    private Date createdate;
    private long size;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Date getCreatedate() {
		return createdate;
	}
	public void setCreatedate(Date date) {
		this.createdate = date;
	}
	public long getSize() {
		return size;
	}
	public void setSize(long size) {
		this.size= size ;
		
	}

}