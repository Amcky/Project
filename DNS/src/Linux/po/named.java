package Linux.po;

import Linux.Auxiliary.split;

public class named {
	private int id;
	private String name;
	private String type;
	private int pid;
	private String description;
	


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public named() {
		this.setType("master");
	}

	@Override
	public String toString() {
		return "zone \"" + name + "\" IN\n" + "{\n" + "type " + type + ";\n"
				+ "file \"" + name + ".zone\";\n" + " allow-update { none; };\n"+"};\n";
	}
	public String toStringReverse()
	{
		split a=new split();
		String b=a.split(this.name);
		return "zone \""+b+".in-addr.arpa\" IN {\n" +
        "type master;\n" +
        "file \""+this.name+".zone\";\n" +
        "};\n";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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


}
