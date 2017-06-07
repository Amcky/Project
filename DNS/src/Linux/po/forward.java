package Linux.po;

public class forward {
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "//\n" +
        "// named.conf\n" +
        "//\n" +
        "// Provided by Red Hat bind package to configure the ISC BIND named(8) DNS\n" +
        "// server as a caching only nameserver (as a localhost DNS resolver only).\n" +
        "//\n" +
        "// See /usr/share/doc/bind*/sample/ for example named configuration files.\n" +
        "//\n" +
        "\n" +
        "options {\n" +
        "        listen-on port 53 { any; };\n" +
        "        listen-on-v6 port 53 { ::1; };\n" +
        "        directory       \"/var/named\";\n" +
        "        dump-file       \"/var/named/data/cache_dump.db\";\n" +
        "        statistics-file \"/var/named/data/named_stats.txt\";\n" +
        "        memstatistics-file \"/var/named/data/named_mem_stats.txt\";\n" +
        "        allow-query     { any; };\n" +
        "        allow-query-cache     { any; };\n" +
        "        recursion yes;\n" +
        "\n" +
        "        forward "+this.type+";\n"+
        "forwarders{ ";
	}
	public String tostring(){
		return "};\n" +
        "dnssec-enable no;\n" +
        "        dnssec-validation no;\n" +
        "        dnssec-lookaside auto;\n" +
        "\n" +
        "        /* Path to ISC DLV key */\n" +
        "        bindkeys-file \"/etc/named.iscdlv.key\";\n" +
        "\n" +
        "        managed-keys-directory \"/var/named/dynamic\";\n" +
        "};\n" +
        "logging {\n" +
        "        channel default_debug {\n" +
        "                file \"data/named.run\";\n" +
        "                severity dynamic;\n" +
        "        };\n" +
        "};\n" +
        "\n" +
        "zone \".\" IN {\n" +
        "        type hint;\n" +
        "        file \"named.ca\";\n" +
        "};\n" +
        "\n" +
        "\n" +
        "include \"/etc/named.rfc1912.zones\";\n" +
        "\n" +
        "include \"/etc/named.root.key\";\n" +
        "include \"/etc/named.namedmanager.conf\";";
	}
	
	
}
