package jp.co.syxh.common;

public class DemoEnum {
	
	public enum DemoStatus {
		
		ONE("1"),
		
		TWO("2");
		
		private String code;
		
		DemoStatus(String code){
			this.code = code;
		}
		
		public String getCode() {
			return this.code;
		}
	}

}
