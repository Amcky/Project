package lty.clubServices.user.entity;



public class User {

		private int uid;
		private String userName;
		private String password;
		private String trueName;
		private String sex;
		private String createtime;
		private String phone;
		private int power;
		private String descp;
		public String squestion;
		private String sresult;
		private String image;
		private String sno;
		private int cid;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}
		public String getUserName() {
			return userName;
		}
		public void setUserName(String userName) {
			this.userName = userName;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getTrueName() {
			return trueName;
		}
		public void setTrueName(String trueName) {
			this.trueName = trueName;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getCreatetime() {
			return createtime;
		}
		public void setCreatetime(String createTime) {
			this.createtime = createTime;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}
		public int getPower() {
			return power;
		}
		public void setPower(int power) {
			this.power = power;
		}
		public String getDescp() {
			return descp;
		}
		public void setDescp(String descp) {
			this.descp = descp;
		}
		public String getsquestion() {
			return squestion;
		}
		public void setsquestion(String squestion) {
			this.squestion = squestion;
		}
		public String getsresult() {
			return sresult;
		}
		public void setSresult(String sresult) {
			this.sresult = sresult;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getSno() {
			return sno;
		}
		public void setSno(String sno) {
			this.sno = sno;
		}
		public int getCid() {
			return cid;
		}
		public void setCid(int cid) {
			this.cid = cid;
		}
		@Override
		public String toString() {
			return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", trueName=" + trueName
					+ ", sex=" + sex + ", createtime=" + createtime + ", phone=" + phone + ", power=" + power
					+ ", descp=" + descp + ", squestion=" + squestion + ", sresult=" + sresult + ", image=" + image
					+ ", sno=" + sno + ", cid=" + cid + "]";
		}
		
		
	}
