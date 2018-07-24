package cn.itcast.crud.bean;

public class department {
    private Integer deptId;

    private String deptName;

    public Integer getDeptId() {
        return deptId;
    }
    
     
    public department() {
		super();
	}

	public department(Integer deptId, String deptName) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
	}



	public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName == null ? null : deptName.trim();
    }
}